// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/** 
Class Dictionary

This class provides functionality for the translation of single terms 
or comlexer queries consisting of various terms from and to UNL.

Multiword-terms are possible, that is for example for the input 
'polychrome wood' in English the (single) UNL translation of 
'polychrome_wood(icl>plant_material>thing,mod<polychrome)'
will be found [think for a better example youself!].

The dictionary is stored in a database, the access is done via 
the class 'DatabaseOperations'.

*/

package patrilex;


import java.sql.*;

import org.apache.lucene.analysis.Token;
import java.util.LinkedList;
import java.util.Iterator;
import org.apache.lucene.analysis.CharArraySet;


/** Class providing functionality for translation of one or multiple words */
public class Dictionary {

   
   // Connection to the Database containing the dictionary
   private static DatabaseOperations database;


   /**
      Constructor without an existing connection to the
      dictionary database. Connection is created.
   */
   public Dictionary () {
      database = new DatabaseOperations();
      try {
         database.connect();
      } catch (SQLException e) {
         System.out.println("ERROR !!! Something went wrong while connecting to the DB");
         System.out.println (e.getMessage());
         System.exit(1);
      } catch (ClassNotFoundException e) {
         System.out.println("ERROR !!! Something wrong with the database driver");
         System.exit(1);
      }
   }
   
   
   /**
      Constructor with an existing connection to the
      dictionary database.
   */
   public Dictionary (DatabaseOperations db) { 
      database = db;
      if ( db == null ) {
         database = new DatabaseOperations();
      }
      if ( !database.connected() ) {
         try {
            database.connect();
         } catch (SQLException e) {
            System.out.println("ERROR !!! Something went wrong while connecting to the DB");
            System.out.println (e.getMessage());
            System.exit(1);
         } catch (ClassNotFoundException e) {
            System.out.println("ERROR !!! Something wrong with the database driver");
            System.exit(1);
         }
      }
   }
   
   
   /**
      Method translate
   
      Translates the String originalword from sourceLanguage to
      targetLanguage.
      All results are returned in an Array of Strings.
      To be called via the wrappers (to ensure that one of the 
      languages is UNL, because otherwise we can't translate).
   */
   private String[] translate (String originalword, Language sourceLanguage, Language targetLanguage) {
      
      String word = originalword;
      String tablename;
      ResultSet result = null;
      
      // Depending on in which direction we want to translate we
      // need to geht the 'unl' column or the 'other' column
      if (sourceLanguage == Language.UNL) {
         result = database.getEntryByUnl (targetLanguage, word);
      } else if (targetLanguage == Language.UNL) {
         result = database.getEntryByOther (sourceLanguage, word);
      }

      // create an arry of tokens from the resultset
      int resultcount = 0;
      String[] oldtranslations = new String[resultcount];
      String[] translations = new String[resultcount];
      
      // which column of the table to return
      int which = 0;      
      if (sourceLanguage == Language.UNL) {
         which = 2;
      } else if (targetLanguage == Language.UNL) {
         which = 1;
      }

      try {
         if (result == null) { // No translation found
            return new String[0];
         } else { // Translations found -> write them into Array
            while( result.next() ){
               oldtranslations = translations;
               translations = new String[resultcount+1];
               for (int i=0; i<resultcount; i++) {
                  translations[i] = oldtranslations[i];
               }
               translations[resultcount] = result.getString(which);
               resultcount++;
            }
         }
      } catch (SQLException e) {
         System.out.println(e.getMessage());
         System.out.println("Sorry, error getting the list from the database.");
      }
      
      return translations;
      
   } // translate
   
   
   /**
      Method translateToUNL
   
      Translates the String originalword from sourceLanguage to UNL.
      All results are returned in an Array of Strings, if no results are
      found an empty Array is returned.
   */
   public String[] translateToUNL (String originalword, Language sourceLanguage) {
      
      return translate (originalword, sourceLanguage, Language.UNL);
      
   } // translateToUnl
   

   /**
      Method translateFromUNL
   
      Translates the String originalword from UNL to targetLanguage.
      All results are returned in an Array of Strings, if no results are
      found an empty Array is returned
   */
   public String[] translateFromUNL (String originalword, Language targetLanguage) {
      
      return translate (originalword, Language.UNL, targetLanguage);
      
   } // translatefromUNL
   
   
   /**
      Method translateMWToUNL
   
      Translates a String multiWordTerm from sourceLanguage to UNL.
      All results are returned in a set, if no results are
      found an empty set is returned.
   */
   public String[] translateMWToUNL (String[] multiWordTerm, Language sourceLanguage) {
      String term = "";
      for (int i=0; i<multiWordTerm.length; i++) {
         term += multiWordTerm[i] + " ";
      }
      return translateToUNL (term, sourceLanguage);
   }
   
   
   /**
      Method findMultiWordTerms
   
      To cope with multi word terms the query is first regarded
      as only one multi word term of length k and tried to translate.
      If there is no translation found all sub multi word terms of 
      length k-1 are tried. If a match is found the translated words 
      are removed from the query. If we arrive at one word terms, 
      there is either a translation (or various) returned or not, in any
      case the processing stops.
   */
   public CharArraySet findMultiWordTerms (String[] query, Language sourceLanguage) {
      
      CharArraySet result = new CharArraySet(2, true);
      
      if ( query == null ) {
         return result;
      }
      
      if (query.length == 1) { // we only have one word -> translate and return
         String[] translationArray = translateToUNL (query[0], sourceLanguage);
         result = addAll (result, translationArray);
         return result;
         
      } else { // we have more than one word
         // start with chunksize = querylength, go down
         for (int chunk=query.length; chunk>1; chunk--) {
            // all possible chunks
            // (example for 4 words and chunk=3: [1,2,3] [2,3,4])
            for (int i=0; i<=query.length-chunk; i++) {
               String[] currentChunk = new String[chunk];
               System.arraycopy(query, i, currentChunk, 0, currentChunk.length);
               String[] translations = translateMWToUNL (currentChunk, sourceLanguage);
               if (translations.length != 0) { // translation found
                  // add found translation to result
                  result = addAll (result, translations);
                  // process words before current chunk recursively
                  String[] beforeChunk = new String[i];
                  System.arraycopy(query, 0, beforeChunk, 0, beforeChunk.length);
                  result.addAll (findMultiWordTerms (beforeChunk, sourceLanguage));
                  // process words after current chunk recursively
                  String[] afterChunk = new String[query.length-i-chunk];
                  System.arraycopy(query, i+chunk, afterChunk, 0, afterChunk.length);
                  result.addAll (findMultiWordTerms (afterChunk, sourceLanguage));
                  return result;
               }
            } // for (int i=0; i<=query.length-chunk; i++) {
         } // for (int chunk=query.length; chunk>1; chunk--) {
         // at this point chunk is 1 -> translate and return
         for (int j=0; j<query.length; j++) {
            String[] translations = translateToUNL (query[j], sourceLanguage);
            result = addAll (result, translations);
         }
         return result;
      } // if (query.length == 1)
   } // public CharArraySet findMultiWordTerms 
   
   
   /**
      Method translateListToUNL
   
      Translates a query consisting of various words from sourceLanguage
      to UNL. Multiword-terms are found.
      All results are returned in a set, if no results are
      found an empty set is returned.
   */
   public CharArraySet translateListToUNL (LinkedList query, Language sourceLanguage) {
      
      CharArraySet result = new CharArraySet(2, true);
      
      if (query != null) {
         String[] queryArray = new String[query.size()];
         Iterator li = query.listIterator();
         for (int i=0; i<query.size(); i++) {
            queryArray[i] = li.next().toString();
         }

         result.addAll (findMultiWordTerms (queryArray, sourceLanguage));
      }
      
      return result;
      
   }
   
   
   /**
      Method translateFromUNL
   
      Translates every term of the query from UNL to targetLanguage.
      All results are returned in a set. If there is more than one translation
      for a word, all translations will be in the set. If none of the query
      terms can be translated, the empty set is returned.
   */
   public CharArraySet translateFromUNL (CharArraySet query, Language targetLanguage) {
      
      CharArraySet result = new CharArraySet(2, true);

      if (query != null) {
         // Translate every term and for every term add 
         // all possible translations.
         // Multiword terms don't have to be processed, they are one
         // item of the set.
         Iterator li = query.iterator();
         while (li.hasNext()) {
            String[] unlwords = translateFromUNL(li.next().toString(), targetLanguage);
            for (int j=0; j<unlwords.length; j++) {
               result.add (unlwords[j]);
            }
         }
      }
      
      return result;
   }
   
   
   /**
      Method tokenToString
   
      Provides an alternative to the deprecated token.term().
      Returns a String with the content of the token.
   */
   private String tokenToString (Token originalword) {
      if (originalword != null) {
         int laenge = originalword.termLength();
         char[] wordchars = originalword.termBuffer();
         String word = "";
         for (int j=0; j<laenge; j++) {
               word = word + wordchars[j];
         }
         return word;
      } else {
         return "";
      }
   }
   

   /**
      Method addAll
   
      Adds all elements of the array to the CharArraySet.
   */
   private CharArraySet addAll (CharArraySet set, String[] array) {
      CharArraySet result = set;
      if (set != null && array != null) {
         for (int i=0; i<array.length; i++) {
            result.add(array[i]);
         }
      }
      return result;
   } 
   
   
}
