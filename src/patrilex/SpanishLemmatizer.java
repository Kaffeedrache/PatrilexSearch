// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class SpanishLemmatizer

Implements a lemmatizer for Spanish nouns.

Spanish plural rules are
ending with vowel : append an -s
ending with consonant: append -es
ending with -z : change -z to -c, append -es
ending with -g : change -g to -gu, append -es
ending with -c : change -c to -qu, append -es
ending with í or ú : append -es or -s
foreign words : append -es

Now we have to invert this rule to come from plural to singular

If the word ends with -<other letter than e>s => delete -s

If word ends with -ces => change -c to -z, delete -es, 
   => BUT there are words regularly ending in -ce !
If word ends with -gues => delete -ues
If word ends with -ques => delte -ues, change -q to -c  
   => not implemented because there are nearly no Spanish words ending in -c, 
         but some ending in -que (building plural with -ques)

If the word ends with -es:
delete only -s if ending with -<letter>es if letter is of :
   b, f, v, p, ll, m, j, ch, qu, t, <consonant>r, <consonant>l, n<consonant not g>, c
delete -es else

*/

package patrilex;


import org.apache.lucene.analysis.CharArraySet;
import java.util.Arrays;


/** Implements a lemmatizer for Spanish nouns */
public class SpanishLemmatizer extends Lemmatizer {

   
   /** 
      Word that are not to be lemmatized
      In Spanish those are the days of the week, some
      words regularily ending in -s
      and some words that only occur in plural
   */
   private static final String[] spanishExclusionSet = {
      // words regularily ending in -s 
      "lunes", "martes", "miercoles", "jueves", "viernes",
      "bus", "autobus", "mes", "tesis", "crisis", "pais",
      "cumplanos", "abrelatas", "paraguas", "sacacorchos",
      // and some words that only occur in plural
      "alrededores", "afueras", "tijeras", "pantalones", "gafas",
      "funerales", "bragas", "leotardos", "tenazas", "alicates",
      // non substantives
      "entonces", "dos", "tres", "seis"
   };
   
   // Set of words to hold the above words
   private CharArraySet exclusionSet;

   
   /**
      Constructor, initializes the exclusion sets
   */
   public SpanishLemmatizer () {
      exclusionSet = new CharArraySet(spanishExclusionSet.length, true);
      exclusionSet.addAll(Arrays.asList(spanishExclusionSet));
   }

   
   /**
      Method Lemmatize
      
      Lemmatizes the term according to a lot of rules.
      Terms should be normalized, that is lowercase and without accents.

   */
   public String Lemmatize ( String term ) {

      // if the term is not lemmatizable, quit
      if ( !isLemmatizable( term ) ) {
         return term;
      }

      // if the word is not to be lemmatized, quit
      if ( exclusionSet != null && exclusionSet.contains( term ) ) {
         return term;
      }
      
      // Buffer for word while lemmatizing
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );

      // all words to be lemmatized end with -s
      // if the word does not end with -s => quit
      if (sb.charAt( sb.length() - 1) != 's' ) {
         return term;
      }
      
      
      // Lemmatizing of nouns
      
      // ending not with e => delete -s
      if ( ( sb.length() > 2 ) && ( sb.charAt( sb.length() - 2) != 'e' ) ) {
         sb.deleteCharAt( sb.length() - 1 ); // delete s
         return sb.toString();
      }
      
      // ending with -es
      
      // ending with -ces => change c to z, delete es
      // BUT: there are words ending in -ce regularly !
      if ( ( sb.length() > 3 ) && ( sb.charAt( sb.length() - 3) == 'c' ) ) {
         sb.deleteCharAt( sb.length() - 1 ); // delete s
         sb.deleteCharAt( sb.length() - 1 ); // delete e
         sb.setCharAt( sb.length() - 1, 'z' ); // change c to z
         return sb.toString();
      }
      
      // ending with -gues => delete -ues
      if ( ( sb.length() > 4 ) && ( sb.charAt( sb.length() - 3) == 'u' )  
            && ( sb.charAt( sb.length() - 4) == 'g' ) ) {
         sb.deleteCharAt( sb.length() - 1 ); // delete s
         sb.deleteCharAt( sb.length() - 1 ); // delete e
         sb.deleteCharAt( sb.length() - 1 ); // delete u
         return sb.toString();
      }

      //~ // ending with -ques => delete -ues, change -q to -c
      //~ if ( ( sb.length() > 4 ) && ( sb.charAt( sb.length() - 3) == 'u' )  
            //~ && ( sb.charAt( sb.length() - 4) == 'q' ) ) {
         //~ sb.deleteCharAt( sb.length() - 1 ); // delete s
         //~ sb.deleteCharAt( sb.length() - 1 ); // delete e
         //~ sb.deleteCharAt( sb.length() - 1 ); // delete u
         //~ sb.setCharAt( sb.length() - 1, 'c' ); // change c to z
         //~ return sb.toString();
      //~ }
      
      // the word ends most probably with -e  (check one letter before)
      // => delete -s
      if ( ( sb.length() > 3 ) && ( eEnding1( sb.charAt (sb.length()-3) ) ) ) {
         sb.deleteCharAt( sb.length() - 1 ); // delete s  
         return sb.toString();
      }
      
      // the word ends most probably with -e  (check two letters before)
      // => delete -s      
      if ( ( sb.length() > 4 ) && ( eEnding2( sb.charAt( sb.length() - 4), sb.charAt (sb.length()-3) ) ) ) {
         sb.deleteCharAt( sb.length() - 1 ); // delete s  
         return sb.toString();
      }
      
      // the word ends most probably not with -e
      // => delete -es
      if (sb.length() > 2) {
         sb.deleteCharAt( sb.length() - 1 ); // delete s
         sb.deleteCharAt( sb.length() - 1 ); // delete e
         return sb.toString();
      }
      
      // no change done
      return term;
      
   }
   
   
   /**
      Method eEnding1
      Checks if the last letter is of the letters where words
      nearly always end with -e
   
      These are: -b, -v, -f, -p, -j, -t, -c, -m
   */
   private boolean eEnding1 ( char last) {
      if ( (last == 'b') || (last == 'v') || (last == 'f') || (last == 'p') || (last == 'j') 
            || (last == 't') || (last == 'c') || (last == 'm') ) {
         return true;
      }
      return false;
   }
   
   /**
      Method eEnding2
      Checks if the last two letters are of the letters where words
      nearly always end with -e

      These are: -ch, -ll, -qu, -<consonant>l, -<consonant>r, -n<consonant not g>
   */
   private boolean eEnding2 ( char beforelast, char last) {
      if ( (beforelast == 'c') && (last == 'h') ) {
         return true;
      }
      if ( (beforelast == 'l') && (last == 'l') ) {
         return true;
      }
      if ( (beforelast == 'q') && (last == 'u') ) {
         return true;
      }
      if ( consonant(beforelast) && ( (last == 'r') || (last == 'l') ) ) {
         return true;
      }
      if ( (beforelast == 'n') && consonant(last) && (last != 'g') ) {
         return true;
      }
      return false;
   }
   

   /**
      Method vowel
   
      Checks if a letter is a vowel.
      A letter is a vowel if it is a, e, i, o, u or y.
   */
   private boolean vowel (char b) {
      if ( (b == 'a') || (b == 'e') || (b == 'i') || (b == 'o') || (b == 'u') || (b == 'y') ) {
         return true;
      }
      return false;
   }
   
   
   /**
      Method consonant
   
      Checks if a letter is a consonant.
      A letter is a consonant if it's not a vowel.
   */
   private boolean consonant (char b) {
      if (!vowel(b)){
         return true;
      }
      return false;
   }
   

}
