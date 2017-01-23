// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class EnglishLemmatizer

Implements a lemmatizer for English  nouns.

English plural rules are
normally : append an -s
if ends with -x, -ch, -sh, -ss, -z, sometimes -o : append -es
if ends with -<consonant>y : change y to i and append -es
if ends with -f of -fe : change to -v and append -es
some foreign words from latin ending in -a : append -e
some foreign words from latin ending in -us : change to -i
some foreign words from latin ending in -um : change to -a
some foreign words from latin ending in -<vowel>x : change to -ices
some foreign words from latin ending in -sis : change to -ses
some foreign words from latin ending in -xis : change to -xes
some foreign words from latin ending in -on : change to -a

now we have to invert this rule to come from plural to singular.

Ending in -ss
   - no plural, don't change

Ending in -a
   - might be latin origin word ending in -um
   - might be latin origin word ending in -on
   => not implemented
   
Ending in -ae
   - latin origin word rule, delete -e

Ending in -i
   - latin origin word rule, change i to u, append s
   => could create problems for chili, brocoli, bikini, ...
   
Ending in -ices 
   - latin origin word rule, delete es, change c to x, change i to vowel 
   => problem which vowel, mostly -e, always changed to -e

Ending in -ies
   - change i to y, delete es

Ending in -ves
   - change v to f, delete -s  if preceded by i or -es else

Ending in -xes
   - latin origin word rule, change to -xis
   => problem with Engish words
   => not implemented

Ending in -es  && es-ending (-x, -o, -ch, -zz, -sh, -ss)
   - delete -es 
   
Ending in -ses && not -sses
   - latin origin word rule, change to -sis
   => problem with English words ending in -s
   => not implemented

Ending in -s
   - delete -s

reference pages
http://www.english-zone.com/spelling/plurals.html
http://www2.gsu.edu/~wwwesl/egw/crump.htm#Regular%20Plural%20Forms
http://web2.uvcs.uvic.ca/elc/studyzone/330/grammar/irrplu.htm

*/

package patrilex;


import org.apache.lucene.analysis.CharArraySet;
import java.util.Arrays;


/** Implements a lemmatizer for English nouns */
public class EnglishLemmatizer extends Lemmatizer {

   
   /** 
      Word that are not to be lemmatized
      These are words ending regularily with -s
      some words that only occur in plural,
      and words with a different meaning in plural   
   */
   private static final String[] englishExclusionSet = {
      // words ending regularily with -s
      "bus", "yes", "thanks", 
      "bonus", "circus", "campus", "virus",
      "canvas", "proceedings",
      // words that only occur in plural
      "scissors", "glasses", "binoculars",
      "forceps", "tongs", "tweezers",
      "species", "barracks", "crossroads",
      "gallows", "headquarters", "means", "series",
      "jeans", "pants", "pyjamas", "shorts", "trousers",
      "panties", "knickers", "underpants", "tweezers",
      "pliers", "tights",
      "accommodations", "amends", "archives",
      "bowels", "intestines", "stairs", "dregs", "annals",
      "clothes", "congratulations", "riches", "goods", 
      "particulars", "customs", "mains", "credentials",
      "outskirts", "shears", 
      "politics", "linguistics", "physics", "mathematics",
      // words with different meaning in plural
      "arms", "brains", "airs", "looks", "manners",
      "premises", "savings", "works", "glasses"
   };

   // Set of words that are not to be lemmatized
   private CharArraySet exclusionSet;


   /**
      Words that are completely irregular in plural
      the plural and singular form is given
   */
   private static final String[][] exceptionSet = {   // [plural form][singular form]
      {"men", "firemen", "women", "children", "oxen", "feet", "geese", "teeth", "lice", "dormice", "mice"},
      {"man", "fireman", "woman", "child", "ox", "foot", "goose", "tooth", "louse", "dormouse", "mouse"}
   };
   

   /**
      Constructor, initializes the exclusion sets
   */   
   public EnglishLemmatizer () {
      exclusionSet = new CharArraySet(englishExclusionSet.length, true);
      exclusionSet.addAll(Arrays.asList(englishExclusionSet));	
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
      
      // if the word is an irregular plural
      String singular = isException( term );
      if ( singular != null ) {
         return singular;
      }
      
      // Lemmatizing of nouns

      // Buffer for word while lemmatizing
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      
      // English rule
      // if a word ends with -ss it is no plural
      if ( ( sb.length() > 2 ) && ( sb.substring(sb.length()-2, sb.length()).equals("ss") ) ) {
         return term;
      }

      // Foreign word rule
      // rule for plural with -ae => delete e
      if ( ( sb.length() > 2 ) && ( sb.substring(sb.length()-2, sb.length()).equals("ae") ) ) {
         sb.deleteCharAt( sb.length() - 1 ); // delete e
         return sb.toString();
      }

      // Foreign word rule
      // rule for plural with -i =>  change i to u, append s
      // => could create problems for chili, brocoli, bikini
      if ( ( sb.length() > 1 ) && ( sb.charAt( sb.length() - 1) == 'i') ) {
         sb.setCharAt( sb.length() - 1, 'u' ); // change i to u
         sb.append('s'); // append s
         return sb.toString();
      }

      // Foreign word rule
      // rule for plural with -ices => delete es, change c to x, change i to vowel
      // => problem which vowel, mostly -e
      if ( ( sb.length() > 4 ) && ( sb.substring(sb.length()-4, sb.length()).equals("ices") ) )  {
         sb.deleteCharAt( sb.length() - 1 ); // delete s
         sb.deleteCharAt( sb.length() - 1 ); // delete e
         sb.setCharAt( sb.length() - 1, 'x' ); // change c to x
         sb.setCharAt( sb.length() - 2, 'e' ); // change i to e
         return sb.toString();
      }

      // English rule
      // rule for plural with -ies => change i to y, delete es
      if ( ( sb.length() > 3 ) && ( sb.substring(sb.length()-3, sb.length()).equals("ies")
               && (consonant(sb.charAt( sb.length() - 4 )))) ) {
         sb.deleteCharAt( sb.length() - 1 ); // delete s
         sb.deleteCharAt( sb.length() - 1 ); // delete e
         sb.setCharAt( sb.length() - 1, 'y' ); // change i to y
         return sb.toString();
      }

      // English rule
      // rule for plural with -ves => change v to f, delete s or es
      if ( ( sb.length() > 3 ) && ( sb.substring(sb.length()-3, sb.length()).equals("ves")) ) {
         sb.deleteCharAt( sb.length() - 1 ); // delete s
         sb.deleteCharAt( sb.length() - 1 ); // delete e
         sb.setCharAt( sb.length() - 1, 'f' ); // change v to f
         // if there is an -i before the -f it was -fe => append -e again
         if (sb.charAt( sb.length() - 2 ) == 'i') {
            sb.append('e');
         }
         return sb.toString();
      }

      // Foreign word rule
      // rule for plural with -xes => change to -xis
      // => problem with Engish words
      // => not implemented
      //~ if  ( ( sb.length() > 3 ) && ( sb.substring(sb.length()-3, sb.length()).equals("xes") ) ) {
         //~ sb.setCharAt( sb.length() - 2, 'i' ); // change e to i
         //~ return sb.toString();
      //~ }      

      // English rule
      // rule for plural with -es => delete es 
      // (if it's an -es ending and not a word ending with -e)
      if ( ( sb.length() > 4 ) && ( ( sb.substring(sb.length()-2, sb.length()).equals("es") )
               && (esEnding(sb.charAt( sb.length() - 4 ),sb.charAt( sb.length() - 3 )) )) ) {
         sb.deleteCharAt( sb.length() - 1 ); // delete s
         sb.deleteCharAt( sb.length() - 1 ); // delete e
         return sb.toString();
      }
      
      // Foreign word rule
      // rule for plural with -ses => change to -sis
      // (we have already eliminated with the previous rule words ending in -ss
      // => problem with English words ending in -s
      // => not implemented
      //~ if ( ( sb.length() > 3 ) && ( sb.substring(sb.length()-3, sb.length()).equals("ses") ) ) {
         //~ sb.setCharAt( sb.length() - 2, 'i' ); // change e to i
         //~ return sb.toString();
      //~ }

      // English rule
      // rule for plural with -s
      if ( ( sb.length() > 1 ) && (sb.charAt( sb.length() - 1) == 's') ) {
         sb.deleteCharAt( sb.length() - 1 ); // delete s
         return sb.toString();
      }

      // there was nothing done
      return term;
   }


   /**
      Method esEnding 
   
      words with this end letters make plural with -es
      these are the words ending in x and o
      and the words ending in -ch, -zz, -sh or -ss
   */
   private boolean esEnding ( char beforelast, char last) {
      if ( (last == 'x') || (last == 'o') ) {
         return true;
      }
      if ( (beforelast == 's') && ( (last == 's') || (last == 'h') ) ) {
         return true;
      }
      if ( (beforelast == 'c') && (last == 'h') ) {
         return true;
      }
      if ( (beforelast == 'z') && (last == 'z') ) {
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


   /**
      Method vowel
   
      Checks if a letter is a vowel.
      A letter is a vowel if it is a, e, i, o or u
      (y is not considered a vowel here).
   */
   private boolean vowel (char b) {
      if ( (b == 'a') || (b == 'e') || (b == 'i') || (b == 'o') || (b == 'u') ) {
         return true;
      }
      return false;
   }
   
   
   /**
      Method isException
   
      If a word is an irregular plural
      the corresponding singular form is returned
      else 'null' is returned
   */
   private String isException (String term) {      
      for (int i=0; i<exceptionSet[0].length; i++) {
         if (term.equals(exceptionSet[0][i])){
            return exceptionSet[1][i];
         } 
      }
      return null;
   }
   
   
}
