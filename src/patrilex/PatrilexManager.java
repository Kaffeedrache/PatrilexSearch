// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class PatrilexManager

Main class for managing the resources of the Patrilex search engine.

The user can do the following:
Choose what to do:
1) Initialize the Patrilex search engine
2) Change settings
3) Manage the dictionary
4) Manage the thesaurus
5) Manage the index
5) Quit

*/

package patrilex;


import java.io.BufferedReader;
import java.io.InputStreamReader;


/** Main class for managing the resources of the Patrilex search engine */
public class PatrilexManager {
   
   /**
      Main
   
      Choose what to do:
      1) Initialize the Patrilex search engine
      2) Change settings
      3) Manage the dictionary
      4) Manage the thesaurus
      5) Manage the index
      5) Quit
   
   */
   public static void main (String[] args)  {
      
      BufferedReader stdin = new BufferedReader( 
            new InputStreamReader( System.in ) );
      
      Boolean end = false;
      
      System.out.println("==== ** ====");
      System.out.println("Welcome to the Patrilex management tool.");
      System.out.println("==== ** ====");
      
      while (!end) {
         System.out.println();
         System.out.println("What do you want to do?");
         System.out.println("1) Initialize the Patrilex search engine");
         System.out.println("2) Change settings");
         System.out.println("3) Manage the dictionary");
         System.out.println("4) Manage the thesaurus");
         System.out.println("5) Manage the index");
         System.out.println("6) Quit");
         System.out.println("Please enter the corresponding number.");
         
         String input;
         int answer = 0;
         try {
            input = stdin.readLine();
            answer = Integer.parseInt(input.trim());
         }
         catch ( java.io.IOException e ){
            System.out.println("Error during input.");
            answer = 0;
         }
         catch (NumberFormatException e) {
            System.out.println("Please enter a number.");
            answer = 0;
         }
         System.out.println();
         
         switch (answer) {
            case 1: // Initialize the Patrilex search engine
               InitializePatrilex ip = new InitializePatrilex();
               ip.initialize();
               break;
            case 2: // Change settings
               ConstantsManager cm = new ConstantsManager(stdin);
               cm.manageConstants();
               break;
            case 3: // Manage the dictionary
               DictionaryManager dm = new DictionaryManager(stdin);
               dm.manageDictionary();
               break;
            case 4: // Manage the thesaurus
               ThesaurusManager thm = new ThesaurusManager(stdin);
               thm.manageThesaurus();
               break;
            case 5: // Manage the index
               IndexManager im = new IndexManager(stdin);
               im.manageIndex();
               break;
            case 6: // Quit
               end = true;
               break;
            case 0: 
            default : 
               System.out.println("Number " + answer + " is no valid choice (1 to 6)! Try again!");
         } // switch
         
      } // while (!End)
      
      System.out.println("==== ** ====");
      System.out.println("Good bye from the Patrilex management tool.");
      System.out.println("==== ** ====");

   } // main
   
}
