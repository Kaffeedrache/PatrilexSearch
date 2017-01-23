// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class ArabicVowelFilter

Based on ISOLatin1AccentFilter.

Removes Arabic vowels from the input. 

(see http://www.unicode.org/charts/PDF/U0600.pdf)

*/

package patrilex;


import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;


/** Removes Arabic vowels from the input.  */
public class ArabicVowelFilter extends TokenFilter {
   
   
   /**
      Constructor
   */
   public ArabicVowelFilter (TokenStream input) {
      super(input);
   }
   
   /**
      Current token
   */
   private Token token = null;

   
   /**
      Method next

      Takes the next token of the TokenStream,
      and removes the vowels it contains.
   */
   public final Token next () throws java.io.IOException {
      
      token = input.next();
      
      if ( token == null ) { 
         return null;
      } else {
         // Get content of token
         char[] buffer = token.termBuffer();
         int length = token.termLength();
         
         // Delete vowels
         String s = removeVowels (buffer, length);
         
         // return new token
         return new Token( s, token.startOffset(),
               token.endOffset(), token.type() );
      }
      
   }

   
   /**
      Method removeVowels
   
      Method that removes Arabic vowels from a String of Arabic letters.
      Aleph with diacritics is changed into a normal aleph.
   */
   public final String removeVowels(char[] input, int length) {
      
      String output = "";

      // Every letter is checked and added to the output String
      // if it is not a vowel
      for (int i=0; i<length; i++) {
         final char c = input[i];

         // Quick test: if it's not in range then just add
         // current character
         if (c < '\u0613' || c > '\u06ED' ) {
            output = output + c;
         } else {
            switch (c) {
               // It is a vowel -> add nothing
               case '\u0613' : 
               case '\u0614' : 
               case '\u0615' : 
               case '\u0616' : 
               case '\u0617' : 
               case '\u0618' : 
               case '\u0619' : 
               case '\u061A' : 
               case '\u064B' : 
               case '\u064C' : 
               case '\u064D' : 
               case '\u064E' : 
               case '\u064F' : 
               case '\u0650' : 
               case '\u0651' : 
               case '\u0652' : 
               case '\u0653' : 
               case '\u0654' : 
               case '\u0655' : 
               case '\u0656' : 
               case '\u0657' : 
               case '\u0658' : 
               case '\u0659' : 
               case '\u065A' : 
               case '\u065B' : 
               case '\u065C' : 
               case '\u065D' : 
               case '\u065E' : 
               case '\u0670' : 
               case '\u06D6' : 
               case '\u06D7' : 
               case '\u06D8' : 
               case '\u06D9' : 
               case '\u06DA' : 
               case '\u06DB' : 
               case '\u06DC' : 
               case '\u06DF' : 
               case '\u06E0' : 
               case '\u06E1' : 
               case '\u06E2' : 
               case '\u06E3' : 
               case '\u06E4' : 
               case '\u06E7' : 
               case '\u06E8' : 
               case '\u06EA' : 
               case '\u06EB' : 
               case '\u06EC' : 
               case '\u06ED' : 
                  break;
               
               // It is aleph with a diacritic
               // add normal aleph (u0627)
               case '\u0622' :
               case '\u0623' :
               case '\u0625' :
               case '\u0671' :
               case '\u0672' :
               case '\u0673' :
               case '\u0675' :
                  output += '\u0627';
                  break;
                  
               // It is waw with a diacritic
               // add normal waw (u0648)
               case '\u0624' :
               case '\u0676' :
               case '\u0677' :
                  output += '\u0648';
                  break;
               
               // It's a normal letter
               // add this letter
               default :
                  output += c;
                  break;
            } // switch (c) {
         } // if (c < '\u0610' || c > '\u06ED' ) {
      } // for (int i=0; i<length; i++) {
      return output;
      
   } // public final String removeVowels(char[] input, int length) {
   
   
}
