// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/** 
Class InitializePatrilex

This class is meant for initializing the Patrilex Search Engine.
It loads dictionaries for the different languages.
It loads one or more thesaurus in UNL.
It creates the index.

*/

package patrilex;


import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


/** Class for initializing the Patrilex Search Engine. */
public class InitializePatrilex {
   
   
   // Configuration file to be read
   private String initFile = "init.conf";
   
   // File for saving DB connection information
   // Never ever change the name of this file
   // (or change it also in Constants!)
   private String dbFile = "db.conf";
   
   
   /** 
      Method initialize
   
      Initializes the search engine according to the date
      in the initialization file init.conf
   
      Step 1 : Reading init.conf
      Step 2 : Cleaning database
      Step 3 : Importing dictionaries
      Step 4 : Importing thesauri
      Step 5 : Indexing files
      
   */
   public void initialize ()  {
      
      // Variables for dictionary import
      String dicEN = "";
      int widthEN = 0;
      String dicES = "";
      int widthES = 0;
      String dicRU = "";
      int widthRU = 0;
      String dicAR = "";
      int widthAR = 0;
      
      // Variable for thesaurus import
      String thesaurus = "";
      
      // Variables for connection to DB
      String dbLocation = "";
      String dbUser = "";
      String dbPassword = "";
      
      // Variables for initialization of constants
      String docsLocation = "";
      Language indexLanguage = Language.EN;
      String encoding = "";
      String indexLocation = "";
      String webLocation = "";
      String htmlRoot = "";
      String headerfile = "";
      String footerfile = "";
      int widthUNL = 0;
      int hitsPerPage = 0;
      
      
      
      /*
         Collect data from init.conf and store it
      */
      System.out.println("Reading init.conf (step 1 of 5)");
      try {
         BufferedReader inputFile = new BufferedReader(new FileReader(initFile));
         String line = null;

         // Process each line of the file
         // Lines that start with # are comments
         // Other lines should have the format
         // ATTRIBUTE=VALUE
         while  (( line = inputFile.readLine()) != null) {
            
            Pattern commentPattern = Pattern.compile("#");

            Matcher comment = commentPattern.matcher(line);
         
            if (!line.equals("") && !comment.find()) {
               
               // Split into attribute (before =) and value (after)
               Pattern pattern = Pattern.compile("=");
               String[] items = pattern.split(line);
               if (items.length > 1) { // if we have a value entered
                  String attribute = items[0];
                  String value = items[1];
                  attribute.trim();
                  value.trim();
                  
                  // Database attributes
                  if (attribute.equals("DB_LOCATION")) {
                     dbLocation = value.trim();
                     continue;
                  }
                  if (attribute.equals("DB_USER")) {
                     dbUser = value.trim();
                     continue;
                  }
                  if (attribute.equals("DB_PASSWORD")) {
                     dbPassword = value.trim();
                     continue;
                  }
                  
                  // Dictionary files
                  if (attribute.equals("DIC_EN")) {
                     dicEN = value;
                     continue;
                  }
                  if (attribute.equals("WIDTH_EN")) {
                     widthEN = stringToInt(value);
                     continue;
                  }
                  if (attribute.equals("DIC_ES")) {
                     dicES = value;
                     continue;
                  }
                  if (attribute.equals("WIDTH_ES")) {
                     widthES = stringToInt(value);
                     continue;
                  }
                  if (attribute.equals("DIC_RU")) {
                     dicRU = value;
                     continue;
                  }
                  if (attribute.equals("WIDTH_RU")) {
                     widthRU = stringToInt(value);
                     continue;
                  }
                  if (attribute.equals("DIC_AR")) {
                     dicAR = value;
                     continue;
                  }
                  if (attribute.equals("WIDTH_AR")) {
                     widthAR = stringToInt(value);
                     continue;
                  }         
                  if (attribute.equals("WIDTH_UNL")) {
                     widthUNL = stringToInt(value);
                     continue;
                  }
                  
                  // Thesaurus
                  if (attribute.equals("THES")) {
                     thesaurus = value;
                     continue;
                  }
                  
                  // Locations
                  if (attribute.equals("DOCS_LOCATION")) {
                     docsLocation = value;
                     continue;
                  }
                  if (attribute.equals("DOCS_LANGUAGE")) {
                     indexLanguage = Language.stringToLanguage(value);
                     continue;
                  }
                  if (attribute.equals("DOCS_ENCODING")) {
                     encoding = value;
                     continue;
                  }
                  if (attribute.equals("INDEX_LOCATION")) {
                     indexLocation = value;
                     continue;
                  }
                  if (attribute.equals("WEB_LOCATION")) {
                     webLocation = value;
                     continue;
                  }
                  if (attribute.equals("HTML_ROOT")) {
                     htmlRoot = value;
                     continue;
                  }
                  if (attribute.equals("HEADERFILE")) {
                     headerfile = value;
                     continue;
                  }
                  if (attribute.equals("FOOTERFILE")) {
                     footerfile = value;
                     continue;
                  }
                  if (attribute.equals("HITS_PER_PAGE")) {
                     hitsPerPage = stringToInt(value);
                     continue;
                  }
                  
                  // if we got to here we have an unknown attribute
                  System.out.println("Unknown control sequence in following line, please check:");
                  System.out.println(line);
                  
               } // if (items.length > 1) {
               
            } //  if (!line.equals("") && !comment.find()) {
            
         } //  while  (( line = inputFile.readLine()) != null) {
      
      } catch (Exception e) {
         System.out.println("Error in reading configuration file. " + e.getMessage());
         return;
      }
      
      // Save gathered information about database in db-config file
      if (!dbLocation.equals("") && !dbUser.equals("")) {
         try {
            String path = this.getClass().getResource(dbFile).getPath();
            File file = new File(path);
            //~ file.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(dbFile));
            out.write(dbLocation);
            out.newLine();
            out.write(dbUser);
            out.newLine();
            out.write(dbPassword);
            out.newLine();
            out.close();
         } catch (Exception e) {
            System.out.println("Error in writing DB configuration file. " + e.getMessage());
         }
      }
      
      
      /* 
         Delete existing tables (if any exist)
      */
      System.out.println("Cleaning database (step 2 of 5)");
      try {
         DatabaseOperations database = new DatabaseOperations();
         database.connect();
         database.deleteAllTables();
         database.closeConnection();
      } catch (SQLException e) {
         System.out.println("ERROR !!! Something went wrong while connecting to the DB");
         System.out.println (e.getMessage());
         return;
      } catch (ClassNotFoundException e) {
         System.out.println("ERROR !!! Something wrong with the database driver");
         System.out.println (e.getMessage());
         return;
      }
      
      
      /* 
         Create constants table and fill it
      */
      Constants c = new Constants(dbLocation, dbUser, dbPassword);
      c.initialize();
      c.setDocsLocation (docsLocation);
      c.setIndexLanguage (indexLanguage);
      c.setEncoding (encoding);
      c.setIndexLocation (indexLocation);
      c.setWebLocation (webLocation);
      c.setHtmlRoot (htmlRoot);
      c.setHeaderfile (headerfile);
      c.setFooterfile (footerfile);
      c.setUNLwidth (widthUNL);
      c.setHitsPerPage (hitsPerPage);
      
      
      /* 
         Import dictionary files
      */
      System.out.println("Importing dictionaries (step 3 of 5)");
      DictionaryImport dictionaryImport = new DictionaryImport ();
      Pattern dividerPattern = Pattern.compile(";");
      
      // Spanish
      System.out.println("Importing dictionary - Spanish");
      String[] items = dividerPattern.split(dicES);
      for (int i=0; i<items.length; i++) {
         String filename = items[i];
         if (!filename.equals("")) {
            try {
               dictionaryImport.importDictionary (filename, Language.ES, widthES); 
            } catch (Exception e) {
               System.out.println ("ERROR !!! " + e.getMessage());
               return;
            }
         }
      }
      // English
      System.out.println("Importing dictionary - English");
      items = dividerPattern.split(dicEN);
      for (int i=0; i<items.length; i++) {
         String filename = items[i];
         if (!filename.equals("")) {  
            try {
               dictionaryImport.importDictionary (filename, Language.EN, widthEN);
            } catch (Exception e) {
               System.out.println ("ERROR !!! " + e.getMessage());
               return;
            }
         }
      }
      // Russian
      System.out.println("Importing dictionary - Russian");
      items = dividerPattern.split(dicRU);
      for (int i=0; i<items.length; i++) {
         String filename = items[i];
         if (!filename.equals("")) {
            try {
               dictionaryImport.importDictionary (filename, Language.RU, widthRU);
            } catch (Exception e) {
               System.out.println ("ERROR !!! " + e.getMessage());
               return;
            }
         }
      }      // Arabic
      System.out.println("Importing dictionary - Arabic");
      items = dividerPattern.split(dicAR);
      for (int i=0; i<items.length; i++) {
         String filename = items[i];
         if (!filename.equals("")) {
            try {
               dictionaryImport.importDictionary (filename, Language.AR, widthAR);
            } catch (Exception e) {
               System.out.println ("ERROR !!! " + e.getMessage());
               return;
            }
         }
      }

      /* 
         Import thesaurus files
      */
      System.out.println("Importing thesaurus files (step 4 of 5)");
      ThesaurusImport thesaurusImport = new ThesaurusImport();
      items = dividerPattern.split(thesaurus);
      for (int i=0; i<items.length; i++) {
         String filename = items[i];
         if (!filename.equals("")) {
            try {
               thesaurusImport.importThesaurus (filename, false);
            } catch (Exception e) {
               System.out.println ("ERROR !!! " + e.getMessage());
               return;
            }
         }
      }
      
      
      /* 
         Create index
      */
      System.out.println("Creating index (step 5 of 5)");
      IndexFilesWeb indexBuilder = new IndexFilesWeb();
      indexBuilder.createIndex (false); // true for verbose
      
      
      /* 
         Finished
      */
      System.out.println("System is initialized.");
      
   } // initialize()

   
   
   /** 
      Method stringToInt
   
      Converts a String to an Integer.
      If it is no number, 0 is returned.
      
   */
   private int stringToInt (String input) {
      try {
         return Integer.parseInt(input.trim());
      }
      catch (NumberFormatException e) {
         return 0;
      }
   }
   
   
   
}
