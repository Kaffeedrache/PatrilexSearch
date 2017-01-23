// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class ThesaurusImport

This package provides the import of a thesaurus.
The thesaurus has to be in UNL and in the format of TesaurVAI.

This class is not thread-safe.

Before writing the entries to the DB the entries are analyzed with the
MultilingAnalyzer of the language and thus normalized.

*/


package patrilex;

import java.sql.SQLException;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.w3c.dom.Document;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import org.apache.xml.serialize.XMLSerializer;


/** Class providing import of a thesaurus.*/
public class ThesaurusImport {
   
   
   /** 
      Variable providing access to the database with the dictionary
   */
   private static DatabaseOperations database = new DatabaseOperations();
   
   
   /** 
      Variable for the analyzer with which the entries are analyzed before
      writing them to the DB.
   */
   private static MultilingAnalyzer analyzer = new MultilingAnalyzer(Language.UNL);


   /** 
      Method importThesaurus
   
      Imports the thesaurus in file 'inFilePath'.
      Create defines if the thesaurus is to be created new or not.
      If 'create' is true and a thesaurus is already existing, it is deleted.
      If 'create' is false and there is no thesaurus, it is created.
      
   */
   public void importThesaurus (String inFilePath, Boolean create) 
         throws FileNotFoundException, IOException {
      

      /*
         Open file and deal with a lot of exceptions
      */
      File thesaurusFile = new File(inFilePath);
      System.out.println("Importing file: " + inFilePath); // TEST
      if (thesaurusFile == null) { // File is null
         System.out.println("ERROR !!! File is null!"); // TEST
         throw new IllegalArgumentException ("File should not be null!");
      }
      if (!thesaurusFile.exists()) { // File doesn't exist
         System.out.println("ERROR !!! File does not exist!"); // TEST
         throw new FileNotFoundException ("File does not exist: " + thesaurusFile);
      }
      if (!thesaurusFile.isFile()) { // File is a directory
         System.out.println("ERROR !!! File is a directory!"); // TEST
         throw new IllegalArgumentException ("File is a directory: " + thesaurusFile);
      }
      
      
      /*
         Open the DB, connect to it and check if the 
         table we want to import the file contents to exists
      */

      try {
         database.connect();
      } catch (SQLException e) {
         System.out.println("ERROR !!! Something went wrong while connecting to the DB");
         System.out.println (e.getMessage());
         return;
      } catch (ClassNotFoundException e) {
         System.out.println("ERROR !!! Something wrong with the database driver");
         System.out.println (e.getMessage());
         return;
      }
      
      if (create || !database.thesaurusExists() ) {
         // this does delete a previously existing thesaurus
         database.createThesaurus();
      }
      

      /* 
         Now everything is ok and we can go on and start
         the translation of the thesaurus.
         In a first pass through the terms of the thesaurus, 
         every term is looked up in the dictionary.
         If there is no or more than one
         translation the user is required to either make an input or decide 
         that the word is not to be translated.
         Here the lexemes are translated.
         All translations are saved in a DB mapping table.
         In the second pass through the terms of the thesaurus,
         the terms are changed to their translation and also all the
         relations from it.
      */
      
      try {

         // Define a XML reader (should read UTF8)
         DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
         Document doc = docBuilder.parse (thesaurusFile);

         // Normalize text representation
         doc.getDocumentElement().normalize();
         
         // Get list of terms
         NodeList listOfTerms = doc.getElementsByTagName("termino");
         int totalTerms = listOfTerms.getLength();
         System.out.println("Total no of terms : " + totalTerms);    // TEST
         
         
         // Go through the list of terms and try to translate every term
         for (int s=0; s<totalTerms ; s++) {
            
            Node term = listOfTerms.item(s);
            
            if ( term.getNodeType() == Node.ELEMENT_NODE ) { // if we have an element
         
               Element termElement = (Element)term;
                     
               // Lexeme
               NodeList lexemesList = termElement.getElementsByTagName("lexema");
               Element lexemeElement = (Element)lexemesList.item(0);
               NodeList lexemeContentList = lexemeElement.getChildNodes();
               String lexeme = ((Node)lexemeContentList.item(0)).getNodeValue().trim();

               addRelations (lexeme, termElement, "relaciones__UP", 0);
               addRelations (lexeme, termElement, "relaciones__TG", 1);
               addRelations (lexeme, termElement, "relaciones__TTG", 1);
               addRelations (lexeme, termElement, "relaciones__TGP", 1);
               addRelations (lexeme, termElement, "relaciones__TE", 2);
               addRelations (lexeme, termElement, "relaciones__TEG", 2);
               addRelations (lexeme, termElement, "relaciones__TEP", 2);
               
            } // if ( term.getNodeType() == Node.ELEMENT_NODE )
               
         } // for (int s=0; s<totalTerms ; s++) {
         
      } catch (SAXParseException err) {
        System.out.println ("** Parsing error" + ", line " 
             + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());
      } catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();
      } catch (javax.xml.parsers.ParserConfigurationException e) {
         System.out.println("Parser Configuration Exception");
         System.out.println (e.getMessage());
         e.printStackTrace();
      } catch (IOException e) {
         System.out.println("Error in reading XML");
         System.out.println (e.getMessage());
         e.printStackTrace();
      }

   } //  ThesaurusImport (String inFilePath) {
   

   private void addRelations (String lexeme, Element termElement, String relationname, int kind) {
      NodeList relationsList = termElement.getElementsByTagName(relationname);
      Element relationElement = (Element)relationsList.item(0);
      if (relationElement != null) {
         NodeList relationsContentList = relationElement.getElementsByTagName("string");
         if (relationsContentList != null) {
            for (int i=0; i<relationsContentList.getLength(); i++) {
               Element relationNode = (Element)relationsContentList.item(i);
               if (relationNode != null) {
                  NodeList relationsStringList = relationNode.getChildNodes();
                  if ((relationsStringList != null) && (relationsStringList.item(0) != null)) {
                     String relation = ((Node)relationsStringList.item(0)).getNodeValue().trim();
                     // standardize representation
                     lexeme = analyzer.analyze (lexeme);
                     relation = analyzer.analyze (relation);  
                     //~ System.out.println ("   " + lexeme + " -> " + relation); // TEST
                     // Write to DB
                     switch (kind) {
                        case 0 : // Synonymes
                           database.addSynEntry(lexeme, relation);
                           break;
                        case 1 : // Hierarchy generalization
                           database.addHierEntry(relation, lexeme);
                           break;
                        case 2 : // Hierarchy specialization
                           database.addHierEntry(lexeme, relation);
                           break;
                        default : break;
                     }
                  }
               }
            }
         }
      }
   } // private void addRelation (String relationname, int kind) {
   
} // class
