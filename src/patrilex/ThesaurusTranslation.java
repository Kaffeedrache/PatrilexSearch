// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class ThesaurusTranslation

This package provides translation of a thesaurus from a TesaurVAI export.
Source language must be a language that has a dictionary.
Target language is UNL.

The translation is interactive, words that are not found in the Dictionary or 
are ambiguous are given to the user to revise.

This class is not thread-safe.

The input file should be in UTF-8.

*/

package patrilex;


import java.sql.SQLException;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.sql.ResultSet;

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


/** Class providing translation of a thesaurus to UNL.*/
public class ThesaurusTranslation {


   /** 
      Method translate
   
      Translates the thesaurus in file 'inFilePath' from language 'language'
      to UNL and writes the result to 'outFilePath'.
      'languagewidth' is used for the intermediate mapping table where
      translations are stored.
      
   */
   public void translate (String inFilePath, String outFilePath, Language language, int languagewidth) 
         throws FileNotFoundException, IOException {

      BufferedReader stdin = new BufferedReader( 
        new InputStreamReader( System.in ) );

      /*
         Open file and deal with a lot of exceptions
      */
      File thesaurusFile = new File(inFilePath);
      System.out.println("Checking file: " + inFilePath);
      if (thesaurusFile == null) { // File is null
         System.out.println("ERROR !!! File is null!");
         throw new IllegalArgumentException ("File should not be null!");
      }
      if (!thesaurusFile.exists()) { // File doesn't exist
         System.out.println("ERROR !!! File does not exist!");
         throw new FileNotFoundException ("File does not exist: " + thesaurusFile);
      }
      if (!thesaurusFile.isFile()) { // File is a directory
         System.out.println("ERROR !!! File is a directory!");
         throw new IllegalArgumentException ("File is a directory: " + thesaurusFile);
      }
      
      
      /*
         Open the DB, connect to it and check if a
         dictionary for the translation exists.
      */
      DatabaseOperations database = new DatabaseOperations();

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
      
      if (!database.dictTableExists (language)) {
         System.out.println("ERROR !!! Dictionary for language "+ language +" does not exist");
         return;
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
      
         // Initialize dictionary, analyzer and create mapping table
         Dictionary dictionary = new Dictionary(database);
         database.createMapping (language, languagewidth);
         MultilingAnalyzer analyzer = new MultilingAnalyzer (language);

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
            
               // Lexeme
               Element termElement = (Element)term;
               NodeList lexemesList = termElement.getElementsByTagName("lexema");
               Element lexemeElement = (Element)lexemesList.item(0);
               NodeList lexemeContentList = lexemeElement.getChildNodes();
               String lexeme = ((Node)lexemeContentList.item(0)).getNodeValue().trim();
               
               // Look up lexeme in dictionary 
               // (with tokenization, normalization and lemmatization before)
               String lexemeLemmatized = analyzer.analyze (lexeme);
               String[] translations = dictionary.translateToUNL (lexemeLemmatized, language);
               
               if (translations.length == 1) { // one translation found -> add it to the mapping
                  
                  database.addMapEntry (language, translations[0], lexeme);

               } else {  // if not found -> provide relations to help user
                  String synonyme = "";
                  String father = "";
                  String son = "";
                  
                  // Synonyme relations
                  NodeList synonymesList = termElement.getElementsByTagName("relaciones__UP");
                  Element synonymeElement = (Element)synonymesList.item(0);
                   if (synonymeElement != null) {
                        NodeList synonymesContentList = synonymeElement.getElementsByTagName("string");
                        if ((synonymesContentList != null) && (synonymesContentList.item(0) != null)) {
                           Element synonymeNode = (Element)synonymesContentList.item(0);
                           if (synonymeNode != null) {
                              NodeList synonymesStringList = synonymeNode.getChildNodes();
                              if ((synonymesStringList != null) && (synonymesStringList.item(0) != null)) {
                                 synonyme = ((Node)synonymesStringList.item(0)).getNodeValue().trim();
                              }
                           }
                        }
                     }

                     // Hierarchy relations - father
                     NodeList fathersList = termElement.getElementsByTagName("relaciones__TG");
                     Element fatherElement = (Element)fathersList.item(0);
                     if (fatherElement != null) {
                        NodeList fathersContentList = fatherElement.getElementsByTagName("string");
                        if ((fathersContentList != null) && (fathersContentList.item(0) != null)) {
                           Element fatherNode = (Element)fathersContentList.item(0);
                           if (fatherNode != null) {
                              NodeList fathersStringList = fatherNode.getChildNodes();
                              if ((fathersStringList != null) && (fathersStringList.item(0) != null)) {
                                 father = ((Node)fathersStringList.item(0)).getNodeValue().trim();
                              }
                           }
                        }
                     }
                     
                     // Hierarchy relations - son
                     NodeList sonsList = termElement.getElementsByTagName("relaciones__TE");
                     Element sonElement = (Element)sonsList.item(0);
                     if (sonElement != null) {
                        NodeList sonsContentList = sonElement.getElementsByTagName("string");
                        if ((sonsContentList != null) && (sonsContentList.item(0) != null)) {
                           Element sonNode = (Element)sonsContentList.item(0);
                           if (sonNode != null) {
                              NodeList sonsStringList = sonNode.getChildNodes();
                              if ((sonsStringList != null) && (sonsStringList.item(0) != null)) {
                                 son = ((Node)sonsStringList.item(0)).getNodeValue().trim();
                              }
                           }
                        }
                     }
                  
                     if (translations.length == 0) { // No translation
                        System.out.println(lexeme + " !! no translation found."); // TEST
                        System.out.println("   Synonyme: " + synonyme);
                        System.out.println("   More general term: " + father);
                        System.out.println("   More specific term: " + son);                     
                        
                        System.out.println("   New translation (ENTER for none):"); // TEST
                        
                        String Input = "";
                        try {
                           Input = stdin.readLine();
                        }
                        catch ( java.io.IOException e ){
                           System.out.println("Error during input.");
                        }
                        
                        if (!Input.trim().equals("")) {
                           database.addMapEntry (language, Input, lexeme);
                        }
                     
                  } else { // more than one translation
                     System.out.println(lexeme + " -> " + translations.length + " translations found:"); // TEST
                     System.out.println("   Synonyme: " + synonyme);
                     System.out.println("   More general term: " + father);
                     System.out.println("   More specific term: " + son);                     
                     
                     for (int k=0; k<translations.length; k++) {
                        System.out.println("       " + (k+2) + ". " + translations[k]);
                     }
                     
                     System.out.println("   Which one would you like to keep (0 for none, 1 for new)?");
                     String Input;
                     int Answer = 0;
                     try {
                        Input = stdin.readLine();
                        Answer = Integer.parseInt(Input.trim());
                     }
                     catch ( java.io.IOException e ){
                        System.out.println("Error during input.");
                        Answer = 0;
                     }
                     catch (NumberFormatException e) {
                        System.out.println("Please enter a number.");
                        Answer = 0;
                     }
                     System.out.println();
                     
                     if ((Answer == 0)  || (Answer > translations.length+2)) {
                        System.out.println("No translation.");  // TEST
                     } else if (Answer == 1) {

                        System.out.println("   New translation (ENTER for none):"); // TEST
                        
                        String newTranslation = "";
                        try {
                           newTranslation = stdin.readLine();
                        }
                        catch ( java.io.IOException e ){
                           System.out.println("Error during input.");
                        }
                        System.out.println();
                        
                        if (!newTranslation.trim().equals("")) {
                           database.addMapEntry (language, newTranslation, lexeme);
                        }
                        
                     } else {
                        database.addMapEntry (language, translations[Answer-2], lexeme);
                     }
                  } // if (translations.length == 0) {
                  
               } //  if (translations.length == 1) {  - else

               
            } // if ( term.getNodeType() == Node.ELEMENT_NODE ) {

         } // for (int s=0; s<totalTerms ; s++) {
      
      
         /* 
            Revision of the user
         */
         
         System.out.println("These are the translations to be made:");
         ResultSet one = database.getAllMapEntries (language);
         printResultSet (one);
         

         System.out.println("Do you want to continue? (y/n)");
         String Input = "";
         try {
            Input = stdin.readLine();
         }
         catch ( java.io.IOException e ){
            System.out.println("Error during input.");
         }
         System.out.println();
         
         if (Input.trim().equals("y") || Input.trim().equals("Y") || Input.trim().equals("yes")) { // If we want to continue
            
            /* 
               Write a translated thesaurus XML File in the same format
            */
            System.out.println("Write new XML file.");
            
            doc.getDocumentElement().normalize();            
            NodeList listOfTerms2 = doc.getElementsByTagName("termino");
            int totalTerms2 = listOfTerms2.getLength();

            // Go through the list of terms and try to translate every term
            for (int s=0; s<totalTerms2 ; s++) {
         
               Node term = listOfTerms2.item(s);
               
               if ( term.getNodeType() == Node.ELEMENT_NODE ) { // if we have an element
            
                  Element termElement = (Element)term;
                  
                  //~ // Lexeme
                  //~ NodeList lexemesList2 = termElement.getElementsByTagName("lexema");
                  //~ Element lexemeElement2 = (Element)lexemesList2.item(0);
                  //~ NodeList lexemeContentList2 = lexemeElement2.getChildNodes();
                  //~ String lexeme2 = ((Node)lexemeContentList2.item(0)).getNodeValue().trim();
                  //~ System.out.println(lexeme2); // TEST
                  
                  // Go through the list of childs of the term
                  // (that is every component, lexeme, all relations, ...)
                  // translate every content.
                  Node child = termElement.getFirstChild();
                  
                  while (child != null) {
               
                     while (child != null && child.getNodeType() != Node.ELEMENT_NODE) {
                        child = child.getNextSibling();
                     }

                     if (child != null) { // we have an Element_Node
                        Element childElement = (Element)child;
                        NodeList grandchildren = childElement.getElementsByTagName("string");
                        
                        if (grandchildren.getLength() > 0) { // we have subelements -> analyze
                           for (int k=0; k<grandchildren.getLength(); k++) {
                              Element grandchild = (Element)grandchildren.item(k);
                              if (grandchild != null) {
                                 NodeList grandgrandchildList = grandchild.getChildNodes();
                                 if ((grandgrandchildList != null) && (grandgrandchildList.item(0) != null)) {
                                    String word = ((Node)grandgrandchildList.item(0)).getNodeValue().trim();
                                    // Change node value to translation
                                    String translation = database.getMapEntry (language, word);
                                    if (!translation.equals("")) {
                                       ((Node)grandgrandchildList.item(0)).setNodeValue(translation);
                                    }
                                 }
                              }
                           }
                           
                        } else { // no subelements -> we are interested in node value of this node
                           if (child.getFirstChild() != null ) { // not empty tag <tag/>
                              String word = child.getFirstChild().getNodeValue().trim();
                              // Change node value to translation
                              String translation = database.getMapEntry (language, word);
                              if (!translation.equals("")) {
                                 child.getFirstChild().setNodeValue(translation);
                              }
                           } 
                        }
                        
                        child = child.getNextSibling();
                     } // if (child != null) {


                  } // while (child != null) {
                  
               } // if ( term.getNodeType() == Node.ELEMENT_NODE )
                  
            } // for (int s=0; s<totalTerms ; s++) {

            
            // Write the new doc
            XMLSerializer serializer = new XMLSerializer();
            serializer.setOutputCharStream( new java.io.FileWriter(outFilePath));   // Exceptions?
            serializer.serialize(doc);
            
         
         } else {
            System.out.println("No outfile written.");
         }
         
         

      } catch (SAXParseException err) {
        System.out.println ("** Parsing error" + ", line " 
             + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());

      } catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();

      } catch (javax.xml.parsers.ParserConfigurationException e) {
         System.out.println("Strange Exception asdf");
         System.out.println (e.getMessage());
         e.printStackTrace();
      }
      

      /* 
         Clean up
      */
      
      // Delete mappings
      database.deleteMapping (language);
      
      // Close file and connection to database
      database.closeConnection();
      

   } // ThesaurusTranslation (String inFilePath, String outFilePath, Language language) 
   
   
   /** 
      Method printResultSet
   
      Prints out the result set, if it is not empty.
      
   */
   private void printResultSet (ResultSet result) {
      try {
         if (result == null) {       
            System.out.println("Sorry, no entries found.");
         } else {
            int count = 0;
            while( result.next() ){
               count++;
               System.out.println(" " + count + " " + result.getString(2) + " - " +result.getString(1));
            }
         }
         result.close();
      }
      catch (SQLException e) {
         System.out.println(e.getMessage());
         System.out.println("Sorry, error getting the list from the database, please check the tablename you entered.");
      }
   }
   
   
} // class
