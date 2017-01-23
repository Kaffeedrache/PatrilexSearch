// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class DictionaryImport

This class provides import of csv-files containing dictionary information.

The dictionary file has to have the format (csv)
   unl word; other language word;
(with or without "" or else around the words)

Before writing the entries to the DB the entries are analyzed with the
MultilingAnalyzer of the language and thus normalized.

*/

package patrilex;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.sql.SQLException;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.regex.Pattern;


/** Class providing import of csv-files containing dictionary information.*/
public class DictionaryImport {
   

   /** 
      Method importDictionary
   
      Imports the dictionary in file 'path' into the table of language 'language'. 
      If the table does not exist it is created, then 'languagewidth' is used.
      
   */
   public void importDictionary (String path, Language language, int languagewidth) 
         throws FileNotFoundException, IOException {
         
      /*
         Open file and deal with a lot of exceptions
      */
      File dictionaryFile = new File(path);
      System.out.println("Importing file: " + path); // TEST
      if (dictionaryFile == null) { // File is null
         System.out.println("ERROR !!! File is null!"); // TEST
         throw new IllegalArgumentException ("File should not be null!");
      }
      if (!dictionaryFile.exists()) { // File doesn't exist
         System.out.println("ERROR !!! File does not exist!"); // TEST
         throw new FileNotFoundException ("File does not exist: " + dictionaryFile);
      }
      if (!dictionaryFile.isFile()) { // File is a directory
         System.out.println("ERROR !!! File is a directory!"); // TEST
         throw new IllegalArgumentException ("File is a directory: " + dictionaryFile);
      }
      
      
      /*
         Open the DB, connect to it and check if the 
         table we want to import the file contents to exists
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
      
      if (!database.dictTableExists(language)) {
         database.createDictTable(language, languagewidth);
      }

      if (!database.dictTableExists(language)) {
         System.out.println("ERROR !!! Table does not exist");
         return;
      }
      
      /* 
         Now everything is ok and we can go on importing the entries
      */
      
      MultilingAnalyzer analyzer = new MultilingAnalyzer (language);
      MultilingAnalyzer analyzerUNL = new MultilingAnalyzer (Language.UNL);
      
      // Define a reader (should read UTF8)
      FileInputStream fis = new FileInputStream(dictionaryFile);
      InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
      BufferedReader inputFile = new BufferedReader(isr);
      String line = null;

      // Process each line of the file
      while  (( line = inputFile.readLine()) != null) {
         
         // The file is csv with 2 columns, first unl, then the other language
         // Search for the ';', split the string there and write into the dictionary
         // Empty lines are ignored
         if (!line.equals("")) {
            String unl = "";
            String other = "";
            Pattern pattern = Pattern.compile(";");
            String[] items = pattern.split(line);
            if (items.length > 0) { // should always be true
               unl = items[0];
               unl = analyzerUNL.analyze (unl);
               unl = unl.trim();
            }
            if (items.length > 1) { // if no translation is given, other stays ""
               other = items[1];
               other = analyzer.analyze (other);
               other = other.trim();
            }
            // an entry is only added if none of the fields is zero
            if (!unl.equals("") && !other.equals("")) {
               database.addDictEntry(language, unl, other);
            }
         }
         
      }


      /* 
         Clean up
      */
      
      // Close reader and connection to database
      inputFile.close();
      database.closeConnection();

   } // importation (path, tablename)
   
   
   
} // class
