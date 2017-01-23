// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class ArabicLemmatizer

Implements a lemmatizer for Arabic nouns.

Rules (by Adriana Toni):

The word  فعل stands for any patron of a three-letter word
The words فعْلَل and فعِيل represent four-letter words

1. Check list of words that are not to be lemmatized
2. If a word ends with ة it cannot be a plural
3. Apply rules for broken plural:
      Rule 3.1:  فعالل becomes فعلل 
      Rule 3.2:  افعلاء becomes فعيل
      Rule 3.3: فعلاء becomes فعيل
      Rule 3.4: افعال becomes فعل
      Rule 3.5: فعول becomes فعل
      Rule 3.6: فعال becomes فعل
      Rule 3.7: افعل becomes فعل
4. Rule for accusative: delete final ا
5. Rules for derived forms:
      Rule 5.1: استفعالات becomes استفعال
      Rule 5.2: تفعيلات becomes تفعيل
      Rule 5.3: تفعلات becomes تفعل
      Rule 5.4: تفاعلات becomes تفاعل
      Rule 5.5: انفعالات becomes انفعال
      Rule 5.6: افتعالات becomes افتعال
      Rule 5.7: افعلالات becomes افعلال [last two letters must be equal]
      Rule 5.8: افعالات becomes افعال
6. Rules for feminine sane plural:
      Rule 6.1: ending ات becomes ة
7. Rules for feminine dual:
      Rule 7.1: ending تان becomes ة
      Rule 7.2: ending تين becomes ة
8. Rules for masculine sane plural:
      Rule 8.1: ending ون is deleted
9. Rules for masculine dual:
      Rule 9.1: ending ين is deleted
      Rule 9.2: ending ان is deleted

*/

// \\p{L} denotes a unicode letter
// \\u0627 is <alif>
// \\u0621 is <hamsa>
// \\u0629 is <ta marbuta>
// \\u0648 is <waw>
// \\u0633 is <sin>
// \\u062A is <ta>
// \\u064A is <ya>
// \\u0632 is <nun>
// see http://www.unicode.org/charts/PDF/U0600.pdf

package patrilex;


import org.apache.lucene.analysis.CharArraySet;
import java.util.Arrays;


/** Implements a lemmatizer for Arabic nouns*/
public class ArabicLemmatizer extends Lemmatizer {

   
   /** Words that are not to be lemmatized at all */
   private static final String[] ArabicExclusionSet = {
      "بناء", "اجراء", 
   };
   
   /** 
      Words that are not to be lemmatized according to 
      the masculine termination rules, even if they match
      because they are exceptions.
   */
   private static final String[] ArabicExceptionSetMasculine = {
      "لون", "غضبان", "بستان"
   };
   
   /**
      Words that are not to be lemmatized according to 
      the feminie termination rules, even if they match,
      because they are masculine and should be lemmatized
      according to the masculine rules.
   */
   private static final String[] ArabicExceptionSetFeminine = {
      "بيتان", "استثمارات"
   };

   // Above Strings are written into these sets
   private CharArraySet ExclusionSet;
   private CharArraySet exceptionSetFeminine;
   private CharArraySet exceptionSetMasculine;
   

   /**
      Constructor, initializes the exclusion sets
   */
   public ArabicLemmatizer () {
      ExclusionSet = new CharArraySet(ArabicExclusionSet.length, true);
      ExclusionSet.addAll(Arrays.asList(ArabicExclusionSet));
      
      exceptionSetFeminine = new CharArraySet(ArabicExceptionSetFeminine.length, true);
      exceptionSetFeminine.addAll(Arrays.asList(ArabicExceptionSetFeminine));
      
      exceptionSetMasculine = new CharArraySet(ArabicExceptionSetMasculine.length, true);
      exceptionSetMasculine.addAll(Arrays.asList(ArabicExceptionSetMasculine));
   }


   /**
      Method Lemmatize
      
      Lemmatizes the term according to a lot of rules.
      Terms should be without vowels for this to work.

   */
   public String Lemmatize ( String term ) {
      
      // If the term is not lemmatizable, quit
      if ( !isLemmatizable( term ) ) {
         return term;
      }

      
      /* 
         1. Check list of words that are not to be lemmatized
      */
      if ( ExclusionSet != null && ExclusionSet.contains( term ) ) {
         return term;
      }

      // Buffer for word while lemmatizing
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      
      
      /*
         2. If a word ends with ة it cannot be a plural
      */
      if ( ( sb.length() > 2 ) && ( sb.charAt( sb.length() - 1) == '\u0629' ) ) {
         return term;
      }

      
      /* 
         3. Apply rules for broken plural
      */
      
      // Rule 3.1:  فعالل becomes فعلل 
      // Four-letter words that form plural with  LL<alif>LL
      //  => delete the ا (position length-3)
      if (term.matches("\\p{L}\\p{L}\\u0627\\p{L}\\p{L}") ) {
         sb.deleteCharAt(sb.length()-3);
         return sb.toString();
      }

      // Rule 3.2:  افعلاء becomes فعيل
      // Four-letter words that form the plural with  <alif>LLL<alif><hamsa>
      // there are actually only three letters in the plural form
      // the fourth letter is an ي that is to be inserted
      //  => delete the  ا (position 0) and the اء (position length-1 and length-2)
      //       insert ي at position length-2
      if (term.matches("\\u0627\\p{L}\\p{L}\\p{L}\\u0627\\u0621")) {
         sb.deleteCharAt(0);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.insert(sb.length()-1, 'ي'); // this is -2
         return sb.toString();
      }
     
      // Rule 3.3: فعلاء becomes فعيل
      // Four-letter words that form the plural with  LLL<alif><hamsa>
      // there are actually only three letters in the plural form
      // the fourth letter is an ي that is to be inserted
      //  => delete the اء (position length-1 and length-2)
      //       insert ي at position length-2
      if (term.matches("\\p{L}\\p{L}\\p{L}\\u0627\\u0621")) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1); // is length-2
         sb.insert(sb.length()-1, 'ي'); // this is -2
         return sb.toString();
      }
      
      // Rule 3.4: افعال becomes فعل
      // Three-letter words that form the plural with  <alif>LL<alif>L
      //  => delete the two ا (position 0 and length-2)
      if (term.matches("\\u0627\\p{L}\\p{L}\\u0627\\p{L}")) {
         sb.deleteCharAt(0);
         sb.deleteCharAt(sb.length()-2);
         return sb.toString();
      }
      
      // Rule 3.5: فعول becomes فعل
      // Three-letter words that form the plural with  LL<waw>L
      //  => delete the و (position length-2)
      if (term.matches("\\p{L}\\p{L}\\u0648\\p{L}")) {
         sb.deleteCharAt(sb.length()-2);
         return sb.toString();
      }
      
      // Rule 3.6: فعال becomes فعل
      // Three-letter words that form the plural with  LL<alif>L
      //  => delete the ا (position length-2)
      if (term.matches("\\p{L}\\p{L}\\u0627\\p{L}")) {
         sb.deleteCharAt(sb.length()-2);
         return sb.toString();
      }
      
      // Rule 3.7: افعل becomes فعل
      // Three-letter words that form the plural with  <alif>LLL
      //  => delete the ا (position 0)
      if (term.matches("\\u0627\\p{L}\\p{L}\\p{L}")) {
         sb.deleteCharAt(0);
         return sb.toString();
      }
      
      
      /* 
         4. Apply rule for accusative: delete final ا
      */
      // Regular plural for non determined nouns in accusative
      //  Ending in ا => delete the ending.
      if ( ( sb.length() > 1 ) && ( sb.substring(sb.length()-1, sb.length()).equals("ا")) ) {
         sb.deleteCharAt(sb.length()-1);
         return sb.toString();
      }
      
      
      /* 
         5. Apply rules for derived forms
      */
      
      // Rule 5.1: استفعالات becomes استفعال
      // Three-letter word with form <alif><sin><ta>LL<alif>L<alif><ta>
      //  => delete the ات (position lenght-1, lenght-2)
      if (term.matches("\\u0627\\u0633\\u062A\\p{L}\\p{L}\\u0627\\p{L}\\u0627\\u062A")) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         return sb.toString();
      }
      
      // Rule 5.2: تفعيلات becomes تفعيل
      // Three-letter word with form <ta>LL<ya>L<alif><ta>
      //  => delete the ات (position lenght-1, lenght-2)
      if (term.matches("\\u062A\\p{L}\\p{L}\\u064A\\p{L}\\u0627\\u062A") ){
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         return sb.toString();
      }
      
      // Rule 5.3: تفعلات becomes تفعل
      // Three-letter word with form <ta>LLL<alif><ta>
      //  => delete the ات (position lenght-1, lenght-2)
      if (term.matches("\\u062A\\p{L}\\p{L}\\p{L}\\u0627\\u062A")) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         return sb.toString();
      }
      
      // Rule 5.4: تفاعلات becomes تفاعل 
      // Three-letter word with form <ta>L<alif>LL<alif><ta>
      //  => delete the ات (position lenght-1, lenght-2)
      if (term.matches("\\u062A\\p{L}\\u0627\\p{L}\\p{L}\\u0627\\u062A")) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         return sb.toString();
      }
      
      // Rule 5.5: انفعالات becomes انفعال
      // Three-letter word with form <alif><nun>LL<alif>L<alif><ta>
      //  => delete the ات (position lenght-1, lenght-2)
      if (term.matches("\\u0627\\u0632\\p{L}\\p{L}\\u0627\\p{L}\\u0627\\u062A")) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         return sb.toString();
      }
      
      // Rule 5.6: افتعالات becomes افتعال
      // Three-letter word with form <alif>L<ta>L<alif>L<alif><ta>
      //  => delete the ات (position lenght-1, lenght-2)
      if (term.matches("\\u0627\\p{L}\\u062A\\p{L}\\u0627\\p{L}\\u0627\\u062A")) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         return sb.toString();
      }
      
      // Rule 5.7: افعلالات becomes افعلال [last two letters must be equal]
      // Four-letter word with form <alif>LLL<alif>L<alif><ta>
      //  => delete the ات (position lenght-1, lenght-2)
      if (term.matches("\\u0627\\p{L}\\p{L}\\p{L}\\u0627\\p{L}\\u0627\\u062A")
            && (sb.charAt(4) == sb.charAt(6) ) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         return sb.toString();
      }
      
      // Rule 5.8: افعالات becomes افعال      
      // Three-letter word with form <alif>LL<alif>L<alif><ta>
      //  => delete the ات (position lenght-1, lenght-2)
      if (term.matches("\\u0627\\p{L}\\p{L}\\u0627\\p{L}\\u0627\\u062A")) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         return sb.toString();
      }
      
      
      /* 
         6. Apply rules for feminine sane plural
      */
      // Ending in ات  => delete the ending, replace by ة
      if ( exceptionSetFeminine != null && exceptionSetFeminine.contains( term ) ) {
      } else {
         if ( ( sb.length() > 2 ) && ( sb.substring(sb.length()-2, sb.length()).equals("ات")) ) {
            //~ System.out.println("rule for feminine 1"); // TEST
            sb.deleteCharAt(sb.length()-1);
            sb.setCharAt(sb.length()-1, 'ة');
            return sb.toString();
         }
      
         
         /* 
            7. Apply rules for feminine dual
         */
         // Ending in تان,تينِ  => delete the ending, replace by ة
         if ( ( sb.length() > 2 ) && ( sb.substring(sb.length()-2, sb.length()).equals("تان")) ) {
            //~ System.out.println("rule for feminine 2"); // TEST
            sb.deleteCharAt(sb.length()-1);
            sb.setCharAt(sb.length()-1, 'ة');
            return sb.toString();
         }

         if ( ( sb.length() > 3 ) && ( sb.substring(sb.length()-3, sb.length()).equals("تينِ")) ) {
            //~ System.out.println("rule for feminine 3"); // TEST
            sb.deleteCharAt(sb.length()-1);
            sb.setCharAt(sb.length()-1, 'ة');
            return sb.toString();
         } 
      }
      
      
      /* 
         8. Apply rules for masculine sane plural
      */
      // Ending in ون => delete the ending
      if ( exceptionSetMasculine != null && exceptionSetMasculine.contains( term ) ) {
      } else {
         if ( ( sb.length() > 2 ) && ( sb.substring(sb.length()-2, sb.length()).equals("ون")) ) {
            //~ System.out.println("rule for masculine 1"); // TEST
            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            return sb.toString();
         }
         
         
         /* 
            9. Apply rules for masculine dual
         */
         // Ending in ين,انِ => delete the ending
         if ( ( sb.length() > 2 ) && ( sb.substring(sb.length()-2, sb.length()).equals("ين")) ) {
            //~ System.out.println("rule for masculine 2"); // TEST
            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            return sb.toString();
         }
         if ( ( sb.length() > 2 ) && ( sb.substring(sb.length()-2, sb.length()).equals("انِ")) ) {
            //~ System.out.println("rule for masculine 3"); // TEST
            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            return sb.toString();
         }
      }

      
      // there was nothing done
      return sb.toString();
   }


}
