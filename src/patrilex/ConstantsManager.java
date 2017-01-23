// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class ConstantsManager

This class provides some functions managing the constants (settings).
1) Show settings
2) Change a setting
3) Quit

*/

package patrilex;


import java.sql.SQLException;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.*;


/** Class providing functions for managing the dictionary */
public class ConstantsManager {
   
   
   /** 
      From where to read.
   */
   private BufferedReader stdin;


   /**
      Global variables for constants
   */
   private Constants c;
   
   
   
   /** 
      Constructor using own BufferedReader
   */
   public ConstantsManager () {
      stdin = new BufferedReader( new InputStreamReader( System.in ) );
      c = new Constants();
   }
   
   
   /** 
      Constructor using the given BufferedReader
   */
   public ConstantsManager (BufferedReader in) {
      if (in != null) {
         stdin = in;
      } else {
         stdin = new BufferedReader( new InputStreamReader( System.in ) );
      }
      c = new Constants();
   }
   
   
  /** 
      Method manageConstants
   
      Choose one of the following options:
      1) Show settings
      2) Change a setting
      3) Quit
      
   */
   public void manageConstants ()  {
      
      Boolean end = false;

      System.out.println("==== ** ====");
      System.out.println("Welcome to the settings management.");
      System.out.println("==== ** ====");
      
      while (!end) {
         System.out.println();
         System.out.println("What do you want to do?");
         System.out.println("1) Show settings");
         System.out.println("2) Change a setting");
         System.out.println("3) Change database settings");
         System.out.println("4) Quit");
         System.out.println("Please enter the corresponding number.");
         
         int answer = getNumber();
         System.out.println();
         
         switch (answer) {
            case 1: printSettings();
               break;
            case 2: changeSettings();
               break;
            case 3: changeDBSettings();
               break;
            case 4: end = true; 
               break;
            case 0: 
            default : 
               System.out.println("Number " + answer + " is no valid choice (1 to 4)! Try again!");
         } // switch

      } // while (!End)
      
      System.out.println("==== ** ====");
      System.out.println("Good bye from the settings management.");
      System.out.println("==== ** ====");

   } // manageThesaurus
   
   

   /** 
      Method printSettings
   
      Prints out the current settings in a list.
   */
   private void printSettings () {
      
      
      // Database settings
      System.out.println("Database Settings: ");
      System.out.println("Location: " + c.getLocation ());
      System.out.println("User: " + c.getUser ());   
      
      ResultSet result = c.getConstantsList();
      try {
         if (result == null) {       
            System.out.println("Sorry, no other settings found.");
         } else {
            System.out.println("Other settings: ");
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
               System.out.println(result.getString(1) + " = " +result.getString(2));
               count++;
            }
         }
         result.close();
      }
      catch (SQLException e) {
         System.out.println(e.getMessage());
         System.out.println("Sorry, error getting the list from the database, please check the tablename you entered.");
      }
   }
   
   

   /** 
      Method changeSetting
   
      Changes a setting.
   */
   private void changeSettings () {
      
      System.out.println("Please enter the name of the setting you want to change. ");
      String attribute = getString();
      System.out.println("Please enter the new value for " + attribute + ":");
      String value = getString();
      
      if (attribute.equals("DOCS_LOCATION")) {
         c.setDocsLocation(value);
      }
      if (attribute.equals("DOCS_LANGUAGE")) {
         c.setIndexLanguage(Language.stringToLanguage(value));
      }
      if (attribute.equals("DOCS_ENCODING")) {
         c.setEncoding(value);
      }
      if (attribute.equals("INDEX_LOCATION")) {
         c.setIndexLocation(value);
      }
      if (attribute.equals("WEB_LOCATION")) {
         c.setWebLocation(value);
      }
      if (attribute.equals("HTML_ROOT")) {
         c.setHtmlRoot(value);
      }
      if (attribute.equals("HEADERFILE")) {
         c.setHeaderfile(value);
      }
      if (attribute.equals("FOOTERFILE")) {
         c.setFooterfile(value);
      }
      if (attribute.equals("HITS_PER_PAGE")) {
         c.setHitsPerPage(stringToInt(value));
      }
      if (attribute.equals("UNL_WIDTH")) {
         c.setUNLwidth(stringToInt(value));
      }
   }
   
   
   /** 
      Method changeDBSettings
   
      Changes the database settings.
   */
   private void changeDBSettings () {
      
      System.out.println("Please enter the location of the new database ");
      String location = getString();
      System.out.println("Please enter the name of the user for the new database:");
      String user = getString();
         System.out.println("Please enter the password of the user for the new database:");
      String pass = getString();
      
      if (c.writeDBFile(location, user, pass)) {
      
         System.out.println("Settings have been changed.");
         System.out.println("Changes on database settings will take place on the web application");
         System.out.println("immediately, the management tool must be restarted.");
      } else {
         System.out.println("An error has ocurred, no change was made.");
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
