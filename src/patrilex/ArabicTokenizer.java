// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class ArabicTokenizer

Tokenizer for Arabic.
Similar to LetterTokenizer, but doesn't start 
a new token when finding vowels or diacritics.

*/

package patrilex;


import java.io.Reader;
import org.apache.lucene.analysis.CharTokenizer;


/** Tokenizer for Arabic correctly processing diacritics. */
public class ArabicTokenizer extends CharTokenizer {
 
 
   /**
      Constructor
   */
   public ArabicTokenizer(Reader in) {
      super(in);
   }

   
   /** 
      Method isTokenChar
   
      Tokenchar is every letter and everything that has type 'non_spacing_mark'.
      That includes diacritics and arabic vowels.   
   */
   protected boolean isTokenChar(char c) {
      return Character.isLetter(c) || Character.getType(c) == Character.NON_SPACING_MARK;
   }
   
}
