// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class ThesaurusManager

This class provides some functions managing the thesaurus.

The user can do the following:
1) Import a UNL thesaurus
2) Import and translate a thesaurus
3) Translate a thesarus
4) Delete a thesaurus
5) Quit

*/

package patrilex;


import java.sql.SQLException;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/** Class providing functions for managing the dictionary */
public class ThesaurusManager {
   
   
   /** 
      Class providing access to the database with the dictionary
   */
   private DatabaseOperations database = new DatabaseOperations();
   
   
   /** 
      From where to read.
   */
   private BufferedReader stdin;


   /** 
      Constructor using own BufferedReader
   */
   public ThesaurusManager () {
      stdin = new BufferedReader( new InputStreamReader( System.in ) );
   }
   
   
   /** 
      Constructor using the given BufferedReader
   */
   public ThesaurusManager (BufferedReader in) {
      if (in != null) {
         stdin = in;
      } else {
         stdin = new BufferedReader( new InputStreamReader( System.in ) );
      }
   }

   
   /** 
      Method manageThesaurus
   
      Choose one of the following options:
      1) Import a UNL thesaurus
      2) Import and translate a thesaurus
      3) Translate a thesarus
      4) Delete a thesaurus
      5) Quit
      
   */
   public void manageThesaurus ()  {
      
      Boolean end = false;

      System.out.println("==== ** ====");
      System.out.println("Welcome to the thesaurus management.");
      System.out.println("==== ** ====");
      
      while (!end) {
         System.out.println();
         System.out.println("What do you want to do?");
         System.out.println("1) Import a UNL thesaurus");
         System.out.println("2) Import and translate a thesaurus");
         System.out.println("3) Translate a thesarus");
         System.out.println("4) Delete a thesaurus");
         System.out.println("5) Quit");
         System.out.println("Please enter the corresponding number.");
         
         int answer = getNumber();
         System.out.println();
         
         switch (answer) {
            case 1: importOnly();
               break;
            case 2: translateImport();
               break;
            case 3: translate();
               break;
            case 4: delete();
               break;
            case 5: end = true; 
               break;
            case 0: 
            default : 
               System.out.println("Number " + answer + " is no valid choice (1 to 5)! Try again!");
         } // switch

      } // while (!End)
      
      System.out.println("==== ** ====");
      System.out.println("Good bye from the thesaurus management.");
      System.out.println("==== ** ====");

   } // manageThesaurus
   
   
   /** 
      Method delete
   
      Deletes the WHOLE thesaurus.
      No turning back (after saying yes).
      
   */
   public void delete () {
      try{
         
         System.out.println("Do you really want to delete the thesaurus? (y/n)");
         System.out.println("All data contained in the thesaurus will be lost and cannot be retrieved anymore.");
         Boolean yes = getBoolean();
         
         if (yes) {
            DatabaseOperations database = new DatabaseOperations();
            database.connect();
            database.deleteThesaurus();
            database.closeConnection();
            System.out.println("Thesaurus has been deleted.");
         }
      } catch (SQLException e) {
         System.out.println("ERROR !!! Something went wrong while connecting to the DB");
         System.out.println (e.getMessage());
      } catch (ClassNotFoundException e) {
         System.out.println("ERROR !!! Something wrong with the database driver");
      }
   }
   

   /** 
      Method importOnly
   
      Imports a thesaurus using the class ThesaurusImport
      
   */
   public void importOnly () {
      translateImport (false, true);
   }
   
   
   /** 
      Method translate
   
      Translates a thesaurus using the class ThesaurusTranslation
      
   */
   public void translate () {
      translateImport (true, false);
   }  
   
   
   /** 
      Method translateImport
   
      Translates a thesaurus using the class ThesaurusTranslation.
      Then imports the thesaurus using the class ThesaurusImport.
   
   */
   public void translateImport () {
      translateImport (true, true);
   }   
   
   
   /** 
      Method translateImport
   
      Translates a thesaurus using the class ThesaurusTranslation.
      Then imports the thesaurus using the class ThesaurusImport.
      To be called via the wrappers translate(), importOnly(), translateImport().
   
   */
   private void translateImport (Boolean translation, Boolean importation) {
      //~ try {
        
         String importPath = "";
         
         if (translation) {
            System.out.println("Please enter the language of the thesaurus you want to add (EN/ES/DE/RU/AR).");
            Language language = getLanguage();

            System.out.println("How long is the longest possible word in your language?");
            System.out.println("(This should never be too low, because longer words than the number you give cannot be stored!)");
            int languagewidth = getNumber();
            
            System.out.println("Please enter the path of the file you want to translate the thesaurus from.");
            System.out.println("(The format must be TesaurVAI file .thr!)");
            String inPath = getString();
            
            if (!importation) {
               System.out.println("Please enter the path of the file you want to translate the thesaurus to.");
               importPath = getString();
            }
         
            translation (inPath, importPath, language, languagewidth);
         }
         
         if (!translation && importation) {
            System.out.println("Please enter the path of the file you want to import the thesaurus from.");
            System.out.println("(The format must be TesaurVAI file .thr!)");
            importPath = getString();
         }
         
         if (importation) {
            System.out.println("Do you want to overwrite a thesaurus if there is one existing? (y/n)");
            Boolean overwrite = getBoolean();
            importUNL(importPath, overwrite);
         }
         
      //~ }catch (NumberFormatException e) {
         //~ System.out.println(e.getMessage());
         //~ System.out.println("Please enter a number.");
      //~ }
   } // ImportTranslate (Boolean translation, Boolean importation) {
   
   
   /** 
      Method translation
   
      Calls upon ThesaurusTranslation for translation.
   
   */
   private void translation (String inFilePath, String outFilePath, Language language, int languagewidth) {
      try {
         ThesaurusTranslation x = new ThesaurusTranslation();
         x.translate (inFilePath, outFilePath, language, languagewidth);
      } catch (FileNotFoundException e) {
         System.out.println("File not found.");         
         System.out.println(e.getMessage());
      } catch (IOException e) {
         System.out.println("Error in input.");         
         System.out.println(e.getMessage());
      }
   }
   
   
   /** 
      Method importUNL
   
      Calls upon ThesaurusImport for the import of an UNL thesaurus.
   
   */
   private void importUNL (String path, Boolean create) {
      try {
         ThesaurusImport y = new ThesaurusImport();
         y.importThesaurus (path, create);      
      } catch (FileNotFoundException e) {
         System.out.println("File not found.");         
         System.out.println(e.getMessage());
      } catch (IOException e) {
         System.out.println("Error in input.");         
         System.out.println(e.getMessage());
      }
   }
   
   
   /** 
      Method getNumber
   
      Reads a number from the user and returns it.
      In case of error 0 is given back.
      
   */
   private int getNumber () {
      try {
         String input = stdin.readLine();
         input.trim();  
         return Integer.parseInt(input);
      } catch ( java.io.IOException e ){
         System.out.println("Error during input.");
         return 0;
      } catch (NumberFormatException e) {
         System.out.println("Please enter a number.");
         return 0;
      }
   }
   
   
   /** 
      Method getLanguage
   
      Reads a language from the user and returns it.
      In case of error 'null' is given back.
      
   */
   private Language getLanguage () {
      try {
         String input = stdin.readLine();
         input.trim();
         return Language.stringToLanguageUnknown(input);
      } catch ( java.io.IOException e ){
         System.out.println("Error during input.");
         return null;
      }
   }
  
   
   /** 
      Method getString
   
      Reads a String from the user and returns it.
      In case of error 'null' is given back.
      
   */
   private String getString () {
      try {
         String input = stdin.readLine();
         input.trim();
         return input;
      } catch ( java.io.IOException e ){
         System.out.println("Error during input.");
         return null;
      }
   }
   
   
   /** 
      Method getBoolean
   
      Reads a String from the user and return if
      it is igual to 'y' or 'Y'.
      In case of error 'false' is given back.
      
   */
   private Boolean getBoolean () {
      String input = getString();
      if (input != null) {
         char answer = input.charAt(0); // !!!
         return  (answer == 'y' || answer == 'Y');
      } else {
         return false;
      }
   }
   
   
}
