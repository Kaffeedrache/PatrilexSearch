/**
Class IndexFilesWeb


*/
// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class IndexManager

This class provides some functions managing the index.

The user can do the following:
1) Create new index
2) Update existing index
3) Quit

*/

package patrilex;


import java.util.Date;
import java.util.Arrays;
import org.apache.lucene.index.Term;
import org.apache.lucene.index.TermEnum;

import java.io.File;
import java.io.Reader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.Field.Index;

// for creating documents out of HTML files
import org.apache.lucene.demo.html.HTMLParser;

// for creating documents out of PDF files
import org.pdfbox.searchengine.lucene.LucenePDFDocument;


/** This class provides functions for managing the index. */
public class IndexManager {

   
   /** 
      From where to read.
   */
   private BufferedReader stdin;


   /** 
      Constructor using own BufferedReader
   */
   public IndexManager () {
      stdin = new BufferedReader( new InputStreamReader( System.in ) );
   }
   
   
   /** 
      Constructor using the given BufferedReader
   */
   public IndexManager (BufferedReader in) {
      if (in != null) {
         stdin = in;
      } else {
         stdin = new BufferedReader( new InputStreamReader( System.in ) );
      }
   }

   /** 
      Method manageIndex
   
      Choose one of the following options:
      1) Create new index
      2) Update existing index
      
   */
   public void manageIndex ()  {
      
      Boolean end = false;
      IndexFilesWeb indexer = new IndexFilesWeb();

      System.out.println("==== ** ====");
      System.out.println("Welcome to the index management.");
      System.out.println("==== ** ====");
      
      while (!end) {
         System.out.println();
         System.out.println("What do you want to do?");
         System.out.println("1) Create new index");
         System.out.println("2) Update existing index");
         System.out.println("3) Quit");
         System.out.println("Please enter the corresponding number.");
         
         int answer = getNumber();
         System.out.println();
         
         Boolean verbose = false;
         if (answer == 1 || answer == 2) {
            System.out.println("Verbose mode (tell me about every file)? (y/n)");         
            verbose = getBoolean();
            System.out.println();
         }
         
         switch (answer) {
            case 1: indexer.createIndex (verbose);
               break;
            case 2: indexer.updateIndex (verbose);
               break;
            case 3: end = true; 
               break;
            case 0: 
            default : 
               System.out.println("Number " + answer + " is no valid choice (1 to 3)! Try again!");
         } // switch

      } // while (!End)
      
      System.out.println("==== ** ====");
      System.out.println("Good bye from the thesaurus management.");
      System.out.println("==== ** ====");

   } // manageIndex
   
   
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
   
}
