// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

package patrilex;


import org.apache.lucene.analysis.CharArraySet;
import java.util.Arrays;
import java.util.Iterator; /// para imprimir  - se puede borrar despues

public class GermanLemmatizer extends Lemmatizer
{

   // THIS NEEDS MORE
   private static final String[] German_Exclusion_Set = {
      "bla"
   };

   // Set of words that are not to be lemmatized
   private CharArraySet Exclusion_Set;

   // Buffer for word while lemmatizing
   private StringBuffer sb = new StringBuffer();


   // Initializing the Lemmatizer with setting the exclusionSet
   public GermanLemmatizer () {
      Exclusion_Set = new CharArraySet(German_Exclusion_Set.length, true);
      Exclusion_Set.addAll(Arrays.asList(German_Exclusion_Set));
      
      //~ Iterator naechstes = Exclusion_Set.iterator (  ) ;              // TEST
      //~ while  ( naechstes.hasNext (  )  )  {  
         //~ String nextScore =  ( String ) naechstes.next (  ) ;   
         //~ System.out.println ( "--" + nextScore + "--" ) ; 
      //~ }
   }


   // Lemmatizing the term
   public String Lemmatize ( String term ) {

      // Use lowercase for medium stemming.
      term = term.toLowerCase();

      // if the term is not lemmatizable, quit
      if ( !isLemmatizable( term ) ) {
         return term;
      }

      // if the word is not to be lemmatized, quit
      if ( Exclusion_Set != null && Exclusion_Set.contains( term ) ) {
         return term;
      }

      // Reset the StringBuffer.
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );

      // Lemmatizing of nouns


      return sb.toString();
   }


}
