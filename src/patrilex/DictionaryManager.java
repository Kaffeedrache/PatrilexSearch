// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class DictionaryManager

This class provides some functions managing the dictionary.

The user can do the following:
1) View a list of existing dictionaries
2) View the contents of a dictionary
3) Search for an entry in a dictionary
4) Add entries to an existing dictionary
5) Create a new dictionary
6) Import a dictionary
7) Delete entries from an existing dictionary
8) Delete a dictionary
9) Quit

TODO
- combine results UNL and other search

*/

package patrilex;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.io.IOException;
import java.io.FileNotFoundException;


/** Class providing functions for managing the dictionary */
public class DictionaryManager {

   
   /** 
      Variable providing access to the database with the dictionary
   */
   private DatabaseOperations database = new DatabaseOperations();
   
   
   /** 
      From where to read.
   */
   private BufferedReader stdin;

   
   /** 
      Constructor using own BufferedReader
   */
   public DictionaryManager () {
      stdin = new BufferedReader( new InputStreamReader( System.in ) );
   }
   
   
   /** 
      Constructor using the given BufferedReader
   */
   public DictionaryManager (BufferedReader in) {
      if (in != null) {
         stdin = in;
      } else {
         stdin = new BufferedReader( new InputStreamReader( System.in ) );
      }
   
   }


   /** 
      Method manageDictionary
   
      Choose one of the following options:
      1) View a list of existing dictionaries
      2) View the contents of a dictionary
      3) Search for an entry in a dictionary
      4) Add entries to an existing dictionary
      5) Create a new dictionary
      6) Import a dictionary
      7) Delete entries from an existing dictionary
      8) Delete a dictionary
      9) Quit
      
   */
   public void manageDictionary ()  {
      
      Boolean end = false;
      
      System.out.println("==== ** ====");
      System.out.println("Welcome to the dictionary management.");
      System.out.println("==== ** ====");
      
      // Opening and connecting to the DB
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
      
      while (!end) {
         System.out.println();
         System.out.println("What do you want to do?");
         System.out.println("1) View a list of existing dictionaries");
         System.out.println("2) View the contents of a dictionary");
         System.out.println("3) Search for an entry in a dictionary");
         System.out.println("4) Add entries to an existing dictionary");
         System.out.println("5) Create a new dictionary");
         System.out.println("6) Import a dictionary");
         System.out.println("7) Delete entries from an existing dictionary");
         System.out.println("8) Delete a dictionary");
         System.out.println("9) Quit");
         System.out.println("Please enter the corresponding number.");
         
         int answer = getNumber();
         System.out.println();
         
         try {
            switch (answer) {
               case 1: printDictionaries();
                  break;
               case 2: printDictionary();
                  break;
               case 3: searchDictionary();
                  break;
               case 4: addEntry();
                  break;
               case 5: addDictionary(); 
                  break;
               case 6: importDictionary();
                  break;
               case 7: deleteEntry();
                  break;
               case 8: deleteDictionary();
                  break;
               case 9: end = true;
                  break;
               case 0: 
               default : 
                  System.out.println("Number " + answer + " is no valid choice (1 to 9)! Try again!");
            } // switch
         } catch (NullPointerException e) { // if connection to database failed
            System.out.println("The connection to the database has failed, trying to reconnect!");
            // Opening and connecting to the DB
            try {
               database.connect();
            } catch (SQLException e2) {
               System.out.println("ERROR !!! Something went wrong while connecting to the DB");
               System.out.println (e2.getMessage());
               return;
            } catch (ClassNotFoundException e2) {
               System.out.println("ERROR !!! Something wrong with the database driver");
               return;
            }
         }
         
      } // while (!End)
      
      database.closeConnection();
      
      System.out.println("==== ** ====");
      System.out.println("Good bye from the dictionary management.");
      System.out.println("==== ** ====");

   } // manageDictionary
  
   
   /** 
      Method printDictionary
   
      Prints the contents of a dictionary.
      
   */
   public void printDictionary () {
      try {
         System.out.println("Please enter the name of the dictionary you want to see.");
         Language language = getLanguage();
         
         if ((language != null) && (database.dictTableExists(language)) ) {

            ResultSet result =  database.getAllDictEntries (language);
            printResultSet(result, language);
            result.close();
         } else {
            System.out.println("Sorry, table doesn't exist.");
         }
         
      } catch (SQLException e) {
         System.out.println(e.getMessage());
         System.out.println("Sorry, error closing the result set, something stupid happened.");
      }
   }
   

   /** 
      Method searchDictionary
   
      Searches for a given entry in a given dictionary.
      
   */
   public void searchDictionary () {
      try {
         
         System.out.println("Please enter the name of the dictionary you want to search in.");
         Language language = getLanguage();

         
         System.out.println("Do you want to search by UNL (1) or by the language (2) or both (3)?");
         int answer = getNumber();
                  
         System.out.println("Please enter the term you want to find.");
         String term = getString();
         
         if ((language != null) && (database.dictTableExists(language)) ) {
            ResultSet result;
            
            if (answer == 1) { // search by unl
               result = database.getEntryByUnl (language, term);
            }
            else if (answer == 2) { // search by other language
               result = database.getEntryByOther (language, term);
            }
            else { // try both
               result = database.getEntryByUnl (language, term);
               if (result == null) {
                  result = database.getEntryByOther (language, term);
               } else { // combine both! // TODO
               }
            }

            printResultSet(result, language);
            result.close();
         } else {
            System.out.println("Sorry, table doesn't exist.");
         }
         
      } catch (SQLException e) {
         System.out.println(e.getMessage());
         System.out.println("Sorry, error getting the list from the database, please check the tablename you entered.");
      }
   }  
   
  
   /** 
      Method printDictionaries
   
      Prints a list of all dictionaries available.
      
   */
   public void printDictionaries () {
      try {
         ResultSet result = database.listTables();
         if (result == null) {       
            System.out.println("Sorry, no tables found.");
         } else {
            System.out.println("Found tables: ");
            while( result.next() ){
               System.out.println(" * " + result.getString(1));
            }
            result.close();
         }
      }
      catch (SQLException e) {
         System.out.println(e.getMessage());
         System.out.println("Sorry, error getting the list from the database.");
      }
   }
  
  
   /** 
      Method addDictionary
   
      Adds a dictionary of the specified language.
      Works only if there is no dictionary of this language yet.
      
   */
   public void addDictionary () {

      System.out.println("Please enter the language of the dictionary you want to add (EN/ES/DE/RU/AR).");
      System.out.println("This will be the name of the dictionary.");
      Language language = getLanguage();

      System.out.println("How long is the longest possible word in your language?");
      System.out.println("(This should never be too low, because longer words than the number you give cannot be stored!)");
      int input = getNumber();
   
      if ((language != null) && (!database.dictTableExists(language)) ) {
         database.createDictTable(language, input);
      } else {
         System.out.println("Sorry, either the language you want doesn't exist or there is already a dictionary for this language.");
      }
   } 
   
   
   /** 
      Method importDictionary
   
      Imports a dictionary using the class DictionaryImport.
      
   */
   public void importDictionary () {

      System.out.println("Please enter the dictionary you want to import (EN/ES/DE/RU/AR).");
      Language language = getLanguage();
      
      // languagewidth is only used if there is no dictionary existing
      int languagewidth = 0;
      if ((language != null) && !database.dictTableExists(language)) {
         System.out.println("How long is the longest possible word in your language?");
         System.out.println("(This should never be too low, because longer words than the number you give cannot be stored!)");
         languagewidth = getNumber();
      }
      
      System.out.println("Please enter the path of the file you want to import the dictionary from.");
      System.out.println("(The format must be csv with ; separating entries!)");
      String path = getString();
   
      if ((language != null)) {
         DictionaryImport di = new DictionaryImport();
         try {
            di.importDictionary (path, language, languagewidth);
         } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()); 
         } catch (IOException e) {
            System.out.println("Error in in/output");
            System.out.println(e.getMessage()); 
         }
      } else {
         System.out.println("Sorry, the language you want doesn't exist.");
      }
   }  
   
   
   /** 
      Method deleteDictionary
   
      Deletes a dictionary of the specified language.
      
   */
   public void deleteDictionary () {
      System.out.println("Please enter the name of the dictionary you want to delete.");
      Language language = getLanguage();
      
      System.out.println("Do you really want to delete the dictionary " + language + "? (y/n)");
      System.out.println("All data contained in the dictionary will be lost and cannot be retrieved anymore.");
      Boolean yes = getBoolean();
      
      if (yes && (language != null) ) {
         database.deleteDictTable (language);
         System.out.println("Table " + language + " has been deleted.");
      } else {
         System.out.println("Sorry, the language you want doesn't exist.");
      }
   }
   
   
   /** 
      Method addEntry
   
      Adds an entry to the dictionary of the specified language.
      Before writing the entries to the DB the entries are analyzed with the
      MultilingAnalyzer of the language and thus normalized.
      
   */
   public void addEntry () {   

      System.out.println("Please enter the name of the dictionary you want to add an entry to.");
      Language language = getLanguage();

      System.out.println("Please enter the unl value of the entry you want to add.");

      MultilingAnalyzer analyzer = new MultilingAnalyzer (language);
      MultilingAnalyzer analyzerUNL = new MultilingAnalyzer (Language.UNL);
      String unl = getString();
      unl = analyzerUNL.analyze (unl);

      System.out.println("Please enter the language value of the entry you want to add.");
      String other = getString();
      other = analyzer.analyze (other);
      
      if ((language != null) && (database.dictTableExists(language)) ) {
         database.addDictEntry(language, unl, other);
      } else {
         System.out.println("Sorry, table doesn't exist.");
      }
      
   }
  
   
   /** 
      Method deleteEntry
   
      Deletes an entry from the dictionary of the specified language.
      
   */
   public void deleteEntry () {   
      try {
      
         System.out.println("Please enter the name of the dictionary you want to delete an entry from.");
         Language language = getLanguage();

         System.out.println("Please enter the unl value of the entry you want to delete or leave empty for unknown.");
         String unl = getString();
         
         System.out.println("Please enter the language value of the entry you want to delete or leave empty for unknown.");
         String other = getString();
         
         if ((language != null) && (database.dictTableExists(language)) ) {

            if (unl.equals("") && other.equals("")) { // unl and other is empty
               System.out.println("Please enter at least one of the values 'unl' and 'language'.");
               
            } else if (unl.equals("") || other.equals("")) {// one is empty
               System.out.println("Do you really want to delete all this entries?");
               ResultSet result;
               if (unl.equals("")) {
                  result = database.getEntryByOther (language, other);
               } else {
                  result = database.getEntryByUnl (language, unl);
               }
               printResultSet(result, language);
               Boolean yes = getBoolean();
         
               if (yes) {
                  int count = 0;
                  while (result.next()) {
                     count += database.deleteDictEntry (language, result.getString(1), result.getString(2));
                  }
                  System.out.println(count + " entries have been deleted.");
               } else {
                  System.out.println("The entries won't be deleted.");
               }
               result.close();
               
            } else { // neither unl nor other are empty
               database.deleteDictEntry(language, unl, other);
            }
         } else {
            System.out.println("Sorry, table doesn't exist.");
         }
         
      } catch (SQLException e) {
         System.out.println(e.getMessage());
         System.out.println("Sorry, error in the database.");
      }
      
   }
   
   
   /** 
      Method printResultSet
   
      Prints a result set, if it is not empty.
      After every 25 results the user is asked if he wants to see more.
      
   */
   private void printResultSet (ResultSet result, Language tablename) {
      try {
         if (result == null) {       
            System.out.println("Sorry, no matching entries in table " + tablename + " found.");
         } else {
            System.out.println("Found entries in table " + tablename + ": ");
            int count = 1;
            while( result.next() ){
               if (count == 25) {
                  System.out.println("Do you want to see more entries? (y/n)");
                  Boolean more = getBoolean();
                  if (!more) {
                     return;
                  } else {
                     count = 1;
                  }
               }
               System.out.println(" * " + result.getString(1) + " - " +result.getString(2));
               count++;
            }
         }
         // does not close the result set because one might want to use the set 
         // for somehting else afterwards
      }
      catch (SQLException e) {
         System.out.println(e.getMessage());
         System.out.println("Sorry, error getting the list from the database, please check the tablename you entered.");
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
