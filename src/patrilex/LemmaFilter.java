// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class LemmaFilter

Provides a filter that lemmatizes tokens with the
lemmatizer provided by the caller.

Based on GermanStemmerFilter by Jörg Caumanns.

*/


package patrilex;


import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;

import java.io.IOException;
import java.util.Set;


/** Provides a filter that lemmatizes tokens */
public final class LemmaFilter extends TokenFilter {
  
  
   private Token token = null;
   private Lemmatizer lemmatizer = null;

   
   /**
      Constructor,
      sets the lemmatizer to be used by lemmatization
      to the EnglishLemmatizer.
   */
   public LemmaFilter( TokenStream in )
   {
      super(in);
      lemmatizer = new EnglishLemmatizer();
   }


   /**
      Constructor,
      sets the lemmatizer to be used by lemmatization
      to the lemmatizer provided by caller.
   */
   public LemmaFilter( TokenStream in, Lemmatizer mylemmatizer ) {
      super(in);
      lemmatizer = mylemmatizer;
   }
   

   /**
      Method next

      Takes the next token of the TokenStream,
      lemmatizes it and returnes the result of
      the lemmatization
   */
   public final Token next() throws IOException {
      
      if ( ( token = input.next() ) == null ) { 
         return null;
         
      } else {

         // Instead of tokenText
         int length = token.termLength();		
         char[] wordchars = token.termBuffer();
         String word = "";
         for (int j=0; j<length; j++) {
            word = word + wordchars[j];
         }

         // Lemmatize the word
         String s = lemmatizer.Lemmatize(word);
         
         // If not lemmatized, dont waste the time creating a new token
         if ( !s.equals( word ) ) {
            return new Token( s, token.startOffset(),
               token.endOffset(), token.type() );
         }
         return token;
      }
   }


}
