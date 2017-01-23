// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Abstract class Lemmatizer

Abstract class for the implementation of a Lemmatizer.

The method isLemmatizable only checks if a term consists only of letters and might be changed by lemmatizers for different languages.

*/

package patrilex;


/** Abstract class for lemmatizer implementations */
public abstract class Lemmatizer {
 
   
   /**
      Method Lemmatize
   
      Lemmatizes a term and returns the result.
      The result is equal to the term if there was nothing to do.
   */ 
   public abstract String Lemmatize ( String term );
   
   
   /**
      Method isLemmatizable
   
      Checks if a term could be lemmatized.
      Returns true if, the given term consists in letters.
   */
   public boolean isLemmatizable (String term ) {
      for ( int c = 0; c < term.length(); c++ ) {
         if ( !Character.isLetter( term.charAt( c ) ) )
            return false;
      }
      return true;
   }

   
}
