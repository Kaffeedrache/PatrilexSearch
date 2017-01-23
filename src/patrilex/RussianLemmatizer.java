// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class RussianLemmatizer

Implements a lemmatizer for Russian nouns.

Rules are courtesy of Igor Boguslavsky.

*/

package patrilex;


/** Implements a lemmatizer for Russian nouns*/
public class RussianLemmatizer extends Lemmatizer {

   
   /**
      Method Lemmatize
      
      Lemmatizes the term according to a lot of rules.
      Terms should be lowercase for this to work.
   */
   public String Lemmatize ( String term ) {

      // if the term is not lemmatizable, quit
      if ( !isLemmatizable( term ) ) {
         return term;
      }
      
      String result;
      
      // Calling of lemmatization methods
      // If the term is changed (that means it was lemmatized)
      // -> quit
      
      result = lemmatizationMethod1(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod2(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod3(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod4(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod5(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod6(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod7(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod8(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod9(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod10(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod11(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod12(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod13(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod14(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod15(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod16(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod17(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod18(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod19(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod20(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod21(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod22(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod23(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod24(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod25(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod26(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod27(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod28(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod29(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod30(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod31(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod32(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod33(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod34(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod35(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod36(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod37(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod38(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod39(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod40(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod41(term);
      if (!result.equals(term)) {
         
         return result;
      }
      
      result = lemmatizationMethod42(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod43(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod44(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod45(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod46(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod47(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod48(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod49(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod50(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod51(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod52(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod53(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod54(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod55(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod56(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod57(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod58(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod59(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod60(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod61(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod62(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod63(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod64(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod65(term);
      if (!result.equals(term)) {
         
         return result;
      }
      
      result = lemmatizationMethod66(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod67(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod68(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod69(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod70(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod71(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod72(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod73(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod74(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod75(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod76(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod77(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod78(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod79(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod80(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod81(term);
      if (!result.equals(term)) {
         return result;
      }
      
      result = lemmatizationMethod82(term);
      if (!result.equals(term)) {
         return result;
      }
      
      // End calling lemmatization methods
   
      // Term was not lemmatized
      return term;
   }   
   
   
   // -------------------------------
   // Start of methods generated from rules

   
   /**
      Method lemmatizationMethod1
   
      Words changing ending into тель.
   */
   private String lemmatizationMethod1 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in тель

      // Words ending in теля => replace by тель
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("теля")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тель");
      }

      // Words ending in телю => replace by тель
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("телю")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тель");
      }

      // Words ending in телем => replace by тель
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("телем")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тель");
      }

      // Words ending in теле => replace by тель
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("теле")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тель");
      }

      // Words ending in тели => replace by тель
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("тели")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тель");
      }

      // Words ending in телей => replace by тель
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("телей")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тель");
      }

      // Words ending in телям => replace by тель
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("телям")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тель");
      }

      // Words ending in телями => replace by тель
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("телями")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тель");
      }

      // Words ending in телях => replace by тель
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("телях")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тель");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod2
   
      Words changing ending into тельницаь.
   */
   private String lemmatizationMethod2 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in тельница

      // Words ending in тельницы => replace by тельница
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("тельницы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тельница");
      }

      // Words ending in тельнице => replace by тельница
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("тельнице")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тельница");
      }

      // Words ending in тельницу => replace by тельница
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("тельницу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тельница");
      }

      // Words ending in тельницей => replace by тельница
      if ( ( sb.length() > 9 ) && (sb.substring(sb.length()-9, sb.length()).equals("тельницей")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тельница");
      }

      // Words ending in тельниц => replace by тельница
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("тельниц")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тельница");
      }

      // Words ending in тельницам => replace by тельница
      if ( ( sb.length() > 9 ) && (sb.substring(sb.length()-9, sb.length()).equals("тельницам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тельница");
      }

      // Words ending in тельницами => replace by тельница
      if ( ( sb.length() > 10 ) && (sb.substring(sb.length()-10, sb.length()).equals("тельницами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тельница");
      }

      // Words ending in тельницах => replace by тельница
      if ( ( sb.length() > 9 ) && (sb.substring(sb.length()-9, sb.length()).equals("тельницах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тельница");
      }

      // Words ending in тельницею => replace by тельница
      if ( ( sb.length() > 9 ) && (sb.substring(sb.length()-9, sb.length()).equals("тельницею")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тельница");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod3
   
      Words changing ending into чик.
   */
   private String lemmatizationMethod3 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in чик

      // Words ending in чика => replace by чик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("чика")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чик");
      }

      // Words ending in чику => replace by чик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("чику")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чик");
      }

      // Words ending in чиком => replace by чик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("чиком")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чик");
      }

      // Words ending in чике => replace by чик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("чике")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чик");
      }

      // Words ending in чики => replace by чик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("чики")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чик");
      }

      // Words ending in чиков => replace by чик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("чиков")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чик");
      }

      // Words ending in чикам => replace by чик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("чикам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чик");
      }

      // Words ending in чиками => replace by чик
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("чиками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чик");
      }

      // Words ending in чиках => replace by чик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("чиках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чик");
      }

      // Words ending in чико => replace by чик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("чико")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чик");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod4
   
      Words changing ending into щик.
   */
   private String lemmatizationMethod4 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in щик

      // Words ending in щика => replace by щик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("щика")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      // Words ending in щику => replace by щик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("щику")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      // Words ending in щиком => replace by щик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("щиком")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      // Words ending in щике => replace by щик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("щике")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      // Words ending in щики => replace by щик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("щики")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      // Words ending in щиков => replace by щик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("щиков")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      // Words ending in щикам => replace by щик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("щикам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      // Words ending in щиками => replace by щик
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("щиками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      // Words ending in щиках => replace by щик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("щиках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      // Words ending in щико => replace by щик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("щико")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      // Words ending in щиком => replace by щик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("щиком")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щик");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod5
   
      Words changing ending into ник.
   */
   private String lemmatizationMethod5 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ник

      // Words ending in ника => replace by ник
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ника")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ник");
      }

      // Words ending in нику => replace by ник
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("нику")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ник");
      }

      // Words ending in ником => replace by ник
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ником")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ник");
      }

      // Words ending in нике => replace by ник
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("нике")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ник");
      }

      // Words ending in ники => replace by ник
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ники")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ник");
      }

      // Words ending in ников => replace by ник
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ников")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ник");
      }

      // Words ending in никам => replace by ник
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("никам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ник");
      }

      // Words ending in никами => replace by ник
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("никами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ник");
      }

      // Words ending in никах => replace by ник
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("никах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ник");
      }

      // Words ending in нико => replace by ник
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("нико")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ник");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod6
   
      Words changing ending into чица.
   */
   private String lemmatizationMethod6 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in чица

      // Words ending in чицы => replace by чица
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("чицы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чица");
      }

      // Words ending in чице => replace by чица
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("чице")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чица");
      }

      // Words ending in чицу => replace by чица
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("чицу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чица");
      }

      // Words ending in чицей => replace by чица
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("чицей")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чица");
      }

      // Words ending in чиц => replace by чица
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("чиц")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чица");
      }

      // Words ending in чицам => replace by чица
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("чицам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чица");
      }

      // Words ending in чицами => replace by чица
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("чицами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чица");
      }

      // Words ending in чицах => replace by чица
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("чицах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чица");
      }

      // Words ending in чицею => replace by чица
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("чицею")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чица");
      }

      // Words ending in чиц => replace by чица
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("чиц")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("чица");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod7
   
      Words changing ending into щица.
   */
   private String lemmatizationMethod7 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in щица

      // Words ending in щицы => replace by щица
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("щицы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щица");
      }

      // Words ending in щице => replace by щица
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("щице")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щица");
      }

      // Words ending in щицу => replace by щица
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("щицу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щица");
      }

      // Words ending in щицей => replace by щица
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("щицей")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щица");
      }

      // Words ending in щиц => replace by щица
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("щиц")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щица");
      }

      // Words ending in щицам => replace by щица
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("щицам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щица");
      }

      // Words ending in щицами => replace by щица
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("щицами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щица");
      }

      // Words ending in щицах => replace by щица
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("щицах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щица");
      }

      // Words ending in щицею => replace by щица
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("щицею")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("щица");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod8
   
      Words changing ending into ница.
   */
   private String lemmatizationMethod8 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ница

      // Words ending in ницы => replace by ница
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ницы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ница");
      }

      // Words ending in нице => replace by ница
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("нице")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ница");
      }

      // Words ending in ницу => replace by ница
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ницу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ница");
      }

      // Words ending in ницей => replace by ница
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ницей")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ница");
      }

      // Words ending in ниц => replace by ница
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ниц")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ница");
      }

      // Words ending in ницам => replace by ница
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ницам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ница");
      }

      // Words ending in ницами => replace by ница
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ницами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ница");
      }

      // Words ending in ницах => replace by ница
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ницах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ница");
      }

      // Words ending in ницею => replace by ница
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ницею")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ница");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod9
   
      Words changing ending into нец.
   */
   private String lemmatizationMethod9 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Words ending in нца => replace by нец
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("нца")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нец");
      }

      // Words ending in нцу => replace by нец
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("нцу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нец");
      }

      // Words ending in нцем => replace by нец
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("нцем")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нец");
      }

      // Words ending in нце => replace by нец
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("нце")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нец");
      }

      // Words ending in нцы => replace by нец
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("нцы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нец");
      }

      // Words ending in нцев => replace by нец
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("нцев")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нец");
      }

      // Words ending in нцам => replace by нец
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("нцам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нец");
      }

      // Words ending in нцами => replace by нец
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("нцами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нец");
      }

      // Words ending in нцах => replace by нец
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("нцах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нец");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod10
   
      Words changing ending into ция.
   */
   private String lemmatizationMethod10 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ция

      // Words ending in ции => replace by ция
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ции")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ция");
      }

      // Words ending in цию => replace by ция
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("цию")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ция");
      }

      // Words ending in цией => replace by ция
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цией")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ция");
      }

      // Words ending in ций => replace by ция
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ций")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ция");
      }

      // Words ending in циям => replace by ция
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("циям")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ция");
      }

      // Words ending in циями => replace by ция
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("циями")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ция");
      }

      // Words ending in циях => replace by ция
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("циях")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ция");
      }

      // Words ending in циею => replace by ция
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("циею")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ция");
      }

      // Words ending in цие => replace by ция
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("цие")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ция");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod11
   
      Words changing ending into зия.
   */
   private String lemmatizationMethod11 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in зия

      // Words ending in зии => replace by зия
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("зии")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зия");
      }

      // Words ending in зию => replace by зия
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("зию")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зия");
      }

      // Words ending in зией => replace by зия
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("зией")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зия");
      }

      // Words ending in зий => replace by зия
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("зий")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зия");
      }

      // Words ending in зиям => replace by зия
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("зиям")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зия");
      }

      // Words ending in зиями => replace by зия
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("зиями")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зия");
      }

      // Words ending in зиях => replace by зия
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("зиях")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зия");
      }

      // Words ending in зиею => replace by зия
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("зиею")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зия");
      }

      // Words ending in зие => replace by зия
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("зие")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зия");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod12
   
      Words changing ending into ость.
   */
   private String lemmatizationMethod12 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ость

      // Words ending in ости => replace by ость
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ости")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ость");
      }

      // Don't change words ending in ость

      // Words ending in остью => replace by ость
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("остью")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ость");
      }

      // Words ending in осте => replace by ость
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("осте")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ость");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod13
   
      Words changing ending into есть.
   */
   private String lemmatizationMethod13 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in есть

      // Words ending in ести => replace by есть
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ести")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("есть");
      }

      // Don't change words ending in есть

      // Words ending in естью => replace by есть
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("естью")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("есть");
      }

      // Words ending in есте => replace by есть
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("есте")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("есть");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod14
   
      Words changing ending into ание.
   */
   private String lemmatizationMethod14 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ание

      // Words ending in ания => replace by ание
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ания")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ание");
      }

      // Words ending in анию => replace by ание
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("анию")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ание");
      }

      // Don't change words ending in ание

      // Words ending in анием => replace by ание
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("анием")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ание");
      }

      // Words ending in ании => replace by ание
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ании")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ание");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod15
   
      Words changing ending into яние.
   */
   private String lemmatizationMethod15 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in яние

      // Words ending in яния => replace by яние
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("яния")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("яние");
      }

      // Words ending in янию => replace by яние
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("янию")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("яние");
      }

      // Don't change words ending in яние

      // Words ending in янием => replace by яние
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("янием")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("яние");
      }

      // Words ending in янии => replace by яние
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("янии")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("яние");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod16
   
      Words changing ending into ение.
   */
   private String lemmatizationMethod16 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ение

      // Words ending in ения => replace by ение
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ения")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      // Words ending in ению => replace by ение
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ению")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      // Words ending in ением => replace by ение
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ением")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      // Words ending in ении => replace by ение
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ении")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod17
   
      Words changing ending into анье.
   */
   private String lemmatizationMethod17 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in анье

      // Words ending in анья => replace by анье
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("анья")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("анье");
      }

      // Words ending in анью => replace by анье
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("анью")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("анье");
      }

      // Words ending in аньем => replace by анье
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("аньем")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("анье");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod18
   
      Words changing ending into янье.
   */
   private String lemmatizationMethod18 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in янье

      // Words ending in янья => replace by янье
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("янья")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("янье");
      }

      // Words ending in янью => replace by янье
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("янью")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("янье");
      }

      // Words ending in яньем => replace by янье
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("яньем")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("янье");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod19
   
      Words changing ending into енье.
   */
   private String lemmatizationMethod19 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in енье

      // Words ending in енья => replace by енье
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("енья")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("енье");
      }

      // Words ending in енью => replace by енье
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("енью")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("енье");
      }

      // Words ending in еньем => replace by енье
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("еньем")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("енье");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod20
   
      Words changing ending into ствие.
   */
   private String lemmatizationMethod20 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ствие

      // Words ending in ствия => replace by ствие
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ствия")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ствие");
      }

      // Words ending in ствию => replace by ствие
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ствию")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ствие");
      }

      // Words ending in ствием => replace by ствие
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ствием")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ствие");
      }

      // Words ending in ствии => replace by ствие
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ствии")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ствие");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod21
   
      Words changing ending into овка.
   */
   private String lemmatizationMethod21 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in овка

      // Words ending in овки => replace by овка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овка");
      }

      // Words ending in овке => replace by овка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овке")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овка");
      }

      // Words ending in овку => replace by овка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овку")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овка");
      }

      // Words ending in овкой => replace by овка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овкой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овка");
      }

      // Words ending in овок => replace by овка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овок")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овка");
      }

      // Words ending in овкам => replace by овка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овкам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овка");
      }

      // Words ending in овками => replace by овка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("овками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овка");
      }

      // Words ending in овках => replace by овка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овка");
      }

      // Words ending in овкою => replace by овка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овкою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овка");
      }

      // Words ending in овко => replace by овка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овко")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овка");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod22
   
      Words changing ending into евка.
   */
   private String lemmatizationMethod22 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in евка

      // Words ending in евки => replace by евка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евка");
      }

      // Words ending in евке => replace by евка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евке")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евка");
      }

      // Words ending in евку => replace by евка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евку")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евка");
      }

      // Words ending in евкой => replace by евка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евкой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евка");
      }

      // Words ending in евок => replace by евка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евок")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евка");
      }

      // Words ending in евкам => replace by евка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евкам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евка");
      }

      // Words ending in евками => replace by евка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("евками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евка");
      }

      // Words ending in евках => replace by евка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евка");
      }

      // Words ending in евкою => replace by евка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евкою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евка");
      }

      // Words ending in евко => replace by евка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евко")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евка");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod23
   
      Words changing ending into ство.
   */
   private String lemmatizationMethod23 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ство

      // Words ending in ства => replace by ство
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ства")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ство");
      }

      // Words ending in ству => replace by ство
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ству")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ство");
      }

      // Words ending in ством => replace by ство
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ством")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ство");
      }

      // Words ending in стве => replace by ство
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("стве")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ство");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod24
   
      Words changing ending into уха.
   */
   private String lemmatizationMethod24 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in уха

      // Words ending in ухи => replace by уха
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ухи")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("уха");
      }

      // Words ending in ухе => replace by уха
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ухе")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("уха");
      }

      // Words ending in уху => replace by уха
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("уху")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("уха");
      }

      // Words ending in ухой => replace by уха
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ухой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("уха");
      }

      // Words ending in ух => replace by уха
      if ( ( sb.length() > 2 ) && (sb.substring(sb.length()-2, sb.length()).equals("ух")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("уха");
      }

      // Words ending in ухам => replace by уха
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ухам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("уха");
      }

      // Words ending in ухами => replace by уха
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ухами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("уха");
      }

      // Words ending in ухах => replace by уха
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ухах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("уха");
      }

      // Words ending in ухою => replace by уха
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ухою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("уха");
      }

      // Words ending in ухо => replace by уха
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ухо")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("уха");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod25
   
      Words changing ending into ушка.
   */
   private String lemmatizationMethod25 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ушка

      // Words ending in ушки => replace by ушка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ушки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ушка");
      }

      // Words ending in ушке => replace by ушка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ушке")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ушка");
      }

      // Words ending in ушку => replace by ушка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ушку")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ушка");
      }

      // Words ending in ушкой => replace by ушка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ушкой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ушка");
      }

      // Words ending in ушек => replace by ушка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ушек")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ушка");
      }

      // Words ending in ушкам => replace by ушка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ушкам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ушка");
      }

      // Words ending in ушками => replace by ушка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ушками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ушка");
      }

      // Words ending in ушках => replace by ушка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ушках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ушка");
      }

      // Words ending in ушкою => replace by ушка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ушкою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ушка");
      }

      // Words ending in ушко => replace by ушка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ушко")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ушка");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod26
   
      Words changing ending into ечка.
   */
   private String lemmatizationMethod26 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ечка

      // Words ending in ечки => replace by ечка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ечки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ечка");
      }

      // Words ending in ечке => replace by ечка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ечке")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ечка");
      }

      // Words ending in ечку => replace by ечка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ечку")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ечка");
      }

      // Words ending in ечкой => replace by ечка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ечкой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ечка");
      }

      // Words ending in ечек => replace by ечка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ечек")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ечка");
      }

      // Words ending in ечкам => replace by ечка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ечкам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ечка");
      }

      // Words ending in ечками => replace by ечка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ечками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ечка");
      }

      // Words ending in ечках => replace by ечка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ечках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ечка");
      }

      // Words ending in ечкою => replace by ечка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ечкою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ечка");
      }

      // Words ending in ечко => replace by ечка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ечко")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ечка");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod27
   
      Words changing ending into очек.
   */
   private String lemmatizationMethod27 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in очек

      // Words ending in очка => replace by очек
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("очка")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очек");
      }

      // Words ending in очку => replace by очек
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("очку")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очек");
      }

      // Words ending in очком => replace by очек
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("очком")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очек");
      }

      // Words ending in очке => replace by очек
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("очке")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очек");
      }

      // Words ending in очки => replace by очек
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("очки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очек");
      }

      // Words ending in очков => replace by очек
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("очков")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очек");
      }

      // Words ending in очкам => replace by очек
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("очкам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очек");
      }

      // Words ending in очками => replace by очек
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("очками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очек");
      }

      // Words ending in очках => replace by очек
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("очках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очек");
      }

      // Words ending in очко => replace by очек
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("очко")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очек");
      }

      // Words ending in очкой => replace by очка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("очкой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очка");
      }

      // Words ending in очкою => replace by очка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("очкою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("очка");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod28
   
      Words changing ending into нька.
   */
   private String lemmatizationMethod28 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in нька

      // Words ending in ньки => replace by нька
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ньки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нька");
      }

      // Words ending in ньке => replace by нька
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ньке")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нька");
      }

      // Words ending in ньку => replace by нька
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ньку")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нька");
      }

      // Words ending in нькой => replace by нька
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("нькой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нька");
      }

      // Words ending in нек => replace by нька
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("нек")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нька");
      }

      // Words ending in нькам => replace by нька
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("нькам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нька");
      }

      // Words ending in ньками => replace by нька
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ньками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нька");
      }

      // Words ending in ньках => replace by нька
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ньках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нька");
      }

      // Words ending in нькою => replace by нька
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("нькою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нька");
      }

      // Words ending in нько => replace by нька
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("нько")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("нька");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod29
   
      Words changing ending into ишка.
   */
   private String lemmatizationMethod29 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ишка

      // Words ending in ишки => replace by ишка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ишки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ишка");
      }

      // Words ending in ишке => replace by ишка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ишке")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ишка");
      }

      // Words ending in ишку => replace by ишка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ишку")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ишка");
      }

      // Words ending in ишкой => replace by ишка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ишкой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ишка");
      }

      // Words ending in ишек => replace by ишка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ишек")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ишка");
      }

      // Words ending in ишкам => replace by ишка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ишкам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ишка");
      }

      // Words ending in ишками => replace by ишка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ишками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ишка");
      }

      // Words ending in ишках => replace by ишка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ишках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ишка");
      }

      // Words ending in ишкою => replace by ишка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ишкою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ишка");
      }

      // Words ending in ишко => replace by ишка
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ишко")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ишка");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod30
   
      Words changing ending into водство.
   */
   private String lemmatizationMethod30 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in водство

      // Words ending in водства => replace by водство
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("водства")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("водство");
      }

      // Words ending in водству => replace by водство
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("водству")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("водство");
      }

      // Words ending in водством => replace by водство
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("водством")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("водство");
      }

      // Words ending in водстве => replace by водство
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("водстве")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("водство");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod31
   
      Words changing ending into оника.
   */
   private String lemmatizationMethod31 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in оника

      // Words ending in оники => replace by оника
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("оники")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оника");
      }

      // Words ending in онике => replace by оника
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("онике")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оника");
      }

      // Words ending in онику => replace by оника
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("онику")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оника");
      }

      // Words ending in оникой => replace by оника
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("оникой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оника");
      }

      // Words ending in оник => replace by оника
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("оник")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оника");
      }

      // Words ending in оникам => replace by оника
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("оникам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оника");
      }

      // Words ending in ониками => replace by оника
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("ониками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оника");
      }

      // Words ending in ониках => replace by оника
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ониках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оника");
      }

      // Words ending in оникою => replace by оника
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("оникою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оника");
      }

      // Words ending in онико => replace by оника
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("онико")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оника");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod32
   
      Words changing ending into тура.
   */
   private String lemmatizationMethod32 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in тура

      // Words ending in туры => replace by тура
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("туры")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тура");
      }

      // Words ending in туре => replace by тура
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("туре")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тура");
      }

      // Words ending in туру => replace by тура
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("туру")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тура");
      }

      // Words ending in турой => replace by тура
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("турой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тура");
      }

      // Words ending in тур => replace by тура
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("тур")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тура");
      }

      // Words ending in турам => replace by тура
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("турам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тура");
      }

      // Words ending in турами => replace by тура
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("турами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тура");
      }

      // Words ending in турах => replace by тура
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("турах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тура");
      }

      // Words ending in турою => replace by тура
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("турою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тура");
      }

      // Words ending in туро => replace by тура
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("туро")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тура");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod33
   
      Words changing ending into тор.
   */
   private String lemmatizationMethod33 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in тор

      // Words ending in тора => replace by тор
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("тора")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тор");
      }

      // Words ending in тору => replace by тор
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("тору")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тор");
      }

      // Words ending in тором => replace by тор
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("тором")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тор");
      }

      // Words ending in торе => replace by тор
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("торе")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тор");
      }

      // Words ending in торы => replace by тор
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("торы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тор");
      }

      // Words ending in торов => replace by тор
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("торов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тор");
      }

      // Words ending in торам => replace by тор
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("торам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тор");
      }

      // Words ending in торами => replace by тор
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("торами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тор");
      }

      // Words ending in торах => replace by тор
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("торах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тор");
      }

      // Words ending in торо => replace by тор
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("торо")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тор");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod34
   
      Words changing ending into тер.
   */
   private String lemmatizationMethod34 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in тер

      // Words ending in тера => replace by тер
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("тера")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тер");
      }

      // Words ending in теру => replace by тер
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("теру")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тер");
      }

      // Words ending in тером => replace by тер
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("тером")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тер");
      }

      // Words ending in тере => replace by тер
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("тере")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тер");
      }

      // Words ending in теры => replace by тер
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("теры")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тер");
      }

      // Words ending in теров => replace by тер
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("теров")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тер");
      }

      // Words ending in терам => replace by тер
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("терам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тер");
      }

      // Words ending in терами => replace by тер
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("терами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тер");
      }

      // Words ending in терах => replace by тер
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("терах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тер");
      }

      // Words ending in теро => replace by тер
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("теро")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("тер");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod35
   
      Words changing ending into рша.
   */
   private String lemmatizationMethod35 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in рша

      // Words ending in рши => replace by рша
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("рши")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("рша");
      }

      // Words ending in рше => replace by рша
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("рше")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("рша");
      }

      // Words ending in ршу => replace by рша
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ршу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("рша");
      }

      // Words ending in ршей => replace by рша
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ршей")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("рша");
      }

      // Words ending in рш => replace by рша
      if ( ( sb.length() > 2 ) && (sb.substring(sb.length()-2, sb.length()).equals("рш")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("рша");
      }

      // Words ending in ршам => replace by рша
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ршам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("рша");
      }

      // Words ending in ршами => replace by рша
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ршами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("рша");
      }

      // Words ending in ршах => replace by рша
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ршах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("рша");
      }

      // Words ending in ршею => replace by рша
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ршею")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("рша");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod36
   
      Words changing ending into граф.
   */
   private String lemmatizationMethod36 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in граф

      // Words ending in графа => replace by граф
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("графа")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("граф");
      }

      // Words ending in графу => replace by граф
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("графу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("граф");
      }

      // Words ending in графом => replace by граф
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("графом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("граф");
      }

      // Words ending in графе => replace by граф
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("графе")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("граф");
      }

      // Words ending in графы => replace by граф
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("графы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("граф");
      }

      // Words ending in графов => replace by граф
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("графов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("граф");
      }

      // Words ending in графам => replace by граф
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("графам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("граф");
      }

      // Words ending in графами => replace by граф
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("графами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("граф");
      }

      // Words ending in графах => replace by граф
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("графах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("граф");
      }

      // Words ending in графо => replace by граф
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("графо")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("граф");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod37
   
      Words changing ending into графия.
   */
   private String lemmatizationMethod37 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in графия

      // Words ending in графии => replace by графия
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("графии")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("графия");
      }

      // Words ending in графию => replace by графия
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("графию")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("графия");
      }

      // Words ending in графией => replace by графия
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("графией")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("графия");
      }

      // Words ending in графий => replace by графия
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("графий")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("графия");
      }

      // Words ending in графиям => replace by графия
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("графиям")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("графия");
      }

      // Words ending in графиями => replace by графия
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("графиями")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("графия");
      }

      // Words ending in графиях => replace by графия
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("графиях")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("графия");
      }

      // Words ending in графиею => replace by графия
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("графиею")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("графия");
      }

      // Words ending in графие => replace by графия
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("графие")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("графия");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod38
   
      Words changing ending into скоп.
   */
   private String lemmatizationMethod38 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in скоп

      // Words ending in скопа => replace by скоп
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("скопа")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скоп");
      }

      // Words ending in скопу => replace by скоп
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("скопу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скоп");
      }

      // Words ending in скопом => replace by скоп
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("скопом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скоп");
      }

      // Words ending in скопе => replace by скоп
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("скопе")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скоп");
      }

      // Words ending in скопы => replace by скоп
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("скопы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скоп");
      }

      // Words ending in скопов => replace by скоп
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("скопов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скоп");
      }

      // Words ending in скопам => replace by скоп
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("скопам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скоп");
      }

      // Words ending in скопами => replace by скоп
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("скопами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скоп");
      }

      // Words ending in скопах => replace by скоп
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("скопах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скоп");
      }

      // Words ending in скопо => replace by скоп
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("скопо")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скоп");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod39
   
      Words changing ending into скопия.
   */
   private String lemmatizationMethod39 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in скопия

      // Words ending in скопии => replace by скопия
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("скопии")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скопия");
      }

      // Words ending in скопию => replace by скопия
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("скопию")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скопия");
      }

      // Words ending in скопией => replace by скопия
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("скопией")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скопия");
      }

      // Words ending in скопий => replace by скопия
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("скопий")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скопия");
      }

      // Words ending in скопиям => replace by скопия
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("скопиям")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скопия");
      }

      // Words ending in скопиями => replace by скопия
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("скопиями")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скопия");
      }

      // Words ending in скопиях => replace by скопия
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("скопиях")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скопия");
      }

      // Words ending in скопиею => replace by скопия
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("скопиею")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скопия");
      }

      // Words ending in скопие => replace by скопия
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("скопие")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("скопия");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod40
   
      Words changing ending into оид.
   */
   private String lemmatizationMethod40 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in оид

      // Words ending in оида => replace by оид
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("оида")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оид");
      }

      // Words ending in оиду => replace by оид
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("оиду")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оид");
      }

      // Words ending in оидом => replace by оид
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("оидом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оид");
      }

      // Words ending in оиде => replace by оид
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("оиде")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оид");
      }

      // Words ending in оиды => replace by оид
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("оиды")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оид");
      }

      // Words ending in оидов => replace by оид
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("оидов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оид");
      }

      // Words ending in оидам => replace by оид
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("оидам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оид");
      }

      // Words ending in оидами => replace by оид
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("оидами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оид");
      }

      // Words ending in оидах => replace by оид
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("оидах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оид");
      }

      // Words ending in оидо => replace by оид
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("оидо")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("оид");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod41
   
      Words changing ending into ент.
   */
   private String lemmatizationMethod41 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ент

      // Words ending in ента => replace by ент
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ента")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ент");
      }

      // Words ending in енту => replace by ент
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("енту")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ент");
      }

      // Words ending in ентом => replace by ент
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ентом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ент");
      }

      // Words ending in енте => replace by ент
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("енте")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ент");
      }

      // Words ending in енты => replace by ент
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("енты")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ент");
      }

      // Words ending in ентов => replace by ент
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ентов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ент");
      }

      // Words ending in ентам => replace by ент
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ентам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ент");
      }

      // Words ending in ентами => replace by ент
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ентами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ент");
      }

      // Words ending in ентах => replace by ент
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ентах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ент");
      }

      // Words ending in енто => replace by ент
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("енто")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ент");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod42
   
      Words changing ending into ентка.
   */
   private String lemmatizationMethod42 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Words ending in ентока => replace by ентка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ентока")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      // Words ending in ентоки => replace by ентка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ентоки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      // Words ending in ентоке => replace by ентка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ентоке")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      // Words ending in ентоку => replace by ентка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ентоку")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      // Words ending in ентокой => replace by ентка
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("ентокой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      // Words ending in енток => replace by ентка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("енток")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      // Words ending in ентокам => replace by ентка
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("ентокам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      // Words ending in ентоками => replace by ентка
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("ентоками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      // Words ending in ентоках => replace by ентка
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("ентоках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      // Words ending in ентокою => replace by ентка
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("ентокою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      // Words ending in ентоко => replace by ентка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ентоко")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ентка");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod43
   
      Words changing ending into ант.
   */
   private String lemmatizationMethod43 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ант

      // Words ending in анта => replace by ант
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("анта")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ант");
      }

      // Words ending in анту => replace by ант
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("анту")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ант");
      }

      // Words ending in антом => replace by ант
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("антом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ант");
      }

      // Words ending in анте => replace by ант
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("анте")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ант");
      }

      // Words ending in анты => replace by ант
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("анты")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ант");
      }

      // Words ending in антов => replace by ант
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("антов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ант");
      }

      // Words ending in антам => replace by ант
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("антам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ант");
      }

      // Words ending in антами => replace by ант
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("антами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ант");
      }

      // Words ending in антах => replace by ант
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("антах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ант");
      }

      // Words ending in анто => replace by ант
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("анто")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ант");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod44
   
      Words changing ending into антка.
   */
   private String lemmatizationMethod44 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in антка

      // Words ending in антки => replace by антка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("антки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("антка");
      }

      // Words ending in антке => replace by антка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("антке")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("антка");
      }

      // Words ending in антку => replace by антка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("антку")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("антка");
      }

      // Words ending in анткой => replace by антка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("анткой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("антка");
      }

      // Words ending in анток => replace by антка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("анток")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("антка");
      }

      // Words ending in анткам => replace by антка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("анткам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("антка");
      }

      // Words ending in антками => replace by антка
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("антками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("антка");
      }

      // Words ending in антках => replace by антка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("антках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("антка");
      }

      // Words ending in анткою => replace by антка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("анткою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("антка");
      }

      // Words ending in антко => replace by антка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("антко")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("антка");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod45
   
      Words changing ending into вик.
   */
   private String lemmatizationMethod45 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in вик

      // Words ending in вика => replace by вик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("вика")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      // Words ending in вику => replace by вик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("вику")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      // Words ending in виком => replace by вик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("виком")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      // Words ending in вике => replace by вик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("вике")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      // Words ending in вики => replace by вик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("вики")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      // Words ending in виков => replace by вик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("виков")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      // Words ending in викам => replace by вик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("викам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      // Words ending in виками => replace by вик
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("виками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      // Words ending in виках => replace by вик
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("виках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      // Words ending in вико => replace by вик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("вико")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      // Words ending in вика => replace by вик
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("вика")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("вик");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod46
   
      Words changing ending into метр.
   */
   private String lemmatizationMethod46 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in метр

      // Words ending in метра => replace by метр
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("метра")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      // Words ending in метру => replace by метр
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("метру")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      // Words ending in метром => replace by метр
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("метром")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      // Words ending in метре => replace by метр
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("метре")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      // Words ending in метры => replace by метр
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("метры")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      // Words ending in метров => replace by метр
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("метров")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      // Words ending in метрам => replace by метр
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("метрам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      // Words ending in метры => replace by метр
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("метры")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      // Words ending in метрами => replace by метр
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("метрами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      // Words ending in метрах => replace by метр
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("метрах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      // Words ending in метро => replace by метр
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("метро")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("метр");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod47
   
      Words changing ending into изм.
   */
   private String lemmatizationMethod47 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in изм

      // Words ending in изма => replace by изм
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("изма")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("изм");
      }

      // Words ending in изму => replace by изм
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("изму")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("изм");
      }

      // Words ending in измом => replace by изм
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("измом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("изм");
      }

      // Words ending in изме => replace by изм
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("изме")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("изм");
      }

      // Words ending in измо => replace by изм
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("измо")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("изм");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod48
   
      Words changing ending into ист.
   */
   private String lemmatizationMethod48 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ист

      // Words ending in иста => replace by ист
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("иста")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ист");
      }

      // Words ending in исту => replace by ист
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("исту")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ист");
      }

      // Words ending in истом => replace by ист
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("истом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ист");
      }

      // Words ending in исте => replace by ист
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("исте")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ист");
      }

      // Words ending in исты => replace by ист
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("исты")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ист");
      }

      // Words ending in истов => replace by ист
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("истов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ист");
      }

      // Words ending in истам => replace by ист
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("истам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ист");
      }

      // Words ending in истами => replace by ист
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("истами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ист");
      }

      // Words ending in истах => replace by ист
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("истах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ист");
      }

      // Words ending in исто => replace by ист
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("исто")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ист");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod49
   
      Words changing ending into истка.
   */
   private String lemmatizationMethod49 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in истка

      // Words ending in истки => replace by истка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("истки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("истка");
      }

      // Words ending in истке => replace by истка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("истке")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("истка");
      }

      // Words ending in истку => replace by истка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("истку")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("истка");
      }

      // Words ending in исткой => replace by истка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("исткой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("истка");
      }

      // Words ending in исток => replace by истка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("исток")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("истка");
      }

      // Words ending in исткам => replace by истка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("исткам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("истка");
      }

      // Words ending in истками => replace by истка
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("истками")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("истка");
      }

      // Words ending in истках => replace by истка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("истках")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("истка");
      }

      // Words ending in исткою => replace by истка
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("исткою")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("истка");
      }

      // Words ending in истко => replace by истка
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("истко")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("истка");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod50
   
      Words changing ending into олог.
   */
   private String lemmatizationMethod50 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in олог

      // Words ending in олога => replace by олог
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("олога")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("олог");
      }

      // Words ending in ологу => replace by олог
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ологу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("олог");
      }

      // Words ending in ологом => replace by олог
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ологом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("олог");
      }

      // Words ending in ологе => replace by олог
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ологе")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("олог");
      }

      // Words ending in ологи => replace by олог
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ологи")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("олог");
      }

      // Words ending in ологов => replace by олог
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ологов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("олог");
      }

      // Words ending in ологам => replace by олог
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ологам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("олог");
      }

      // Words ending in ологами => replace by олог
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("ологами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("олог");
      }

      // Words ending in ологах => replace by олог
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ологах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("олог");
      }

      // Words ending in олого => replace by олог
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("олого")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("олог");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod51
   
      Words changing ending into ология.
   */
   private String lemmatizationMethod51 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ология

      // Words ending in ологии => replace by ология
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ологии")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ология");
      }

      // Words ending in ологию => replace by ология
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ологию")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ология");
      }

      // Words ending in ологией => replace by ология
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("ологией")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ология");
      }

      // Words ending in ологий => replace by ология
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ологий")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ология");
      }

      // Words ending in ологиям => replace by ология
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("ологиям")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ология");
      }

      // Words ending in ологиями => replace by ология
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("ологиями")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ология");
      }

      // Words ending in ологиях => replace by ология
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("ологиях")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ология");
      }

      // Words ending in ологиею => replace by ология
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("ологиею")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ология");
      }

      // Words ending in ологие => replace by ология
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ологие")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ология");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod52
   
      Words changing ending into ев.
   */
   private String lemmatizationMethod52 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ев

      // Words ending in ева => replace by ев
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ева")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ев");
      }

      // Words ending in еву => replace by ев
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("еву")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ев");
      }

      // Words ending in евым => replace by ев
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евым")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ев");
      }

      // Words ending in еве => replace by ев
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("еве")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ев");
      }

      // Words ending in евы => replace by ев
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("евы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ев");
      }

      // Words ending in евых => replace by ев
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евых")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ев");
      }

      // Words ending in евым => replace by ев
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евым")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ев");
      }

      // Words ending in евыми => replace by ев
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евыми")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ев");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod53
   
      Words changing ending into ов.
   */
   private String lemmatizationMethod53 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ов

      // Words ending in ова => replace by ов
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ова")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ов");
      }

      // Words ending in ову => replace by ов
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ову")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ов");
      }

      // Words ending in овым => replace by ов
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овым")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ов");
      }

      // Words ending in ове => replace by ов
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ове")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ов");
      }

      // Words ending in овы => replace by ов
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("овы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ов");
      }

      // Words ending in овых => replace by ов
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овых")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ов");
      }

      // Words ending in овым => replace by ов
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овым")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ов");
      }

      // Words ending in овыми => replace by ов
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овыми")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ов");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod54
   
      Words changing ending into ева.
   */
   private String lemmatizationMethod54 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ева

      // Words ending in евой => replace by ева
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ева");
      }

      // Words ending in еву => replace by ева
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("еву")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ева");
      }

      // Words ending in евы => replace by ева
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("евы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ева");
      }

      // Words ending in евых => replace by ева
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евых")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ева");
      }

      // Words ending in евым => replace by ева
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евым")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ева");
      }

      // Words ending in евыми => replace by ева
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евыми")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ева");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod55
   
      Words changing ending into ова.
   */
   private String lemmatizationMethod55 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ова

      // Words ending in овой => replace by ова
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ова");
      }

      // Words ending in ову => replace by ова
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ову")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ова");
      }

      // Words ending in овы => replace by ова
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("овы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ова");
      }

      // Words ending in овых => replace by ова
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овых")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ова");
      }

      // Words ending in овым => replace by ова
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овым")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ова");
      }

      // Words ending in овыми => replace by ова
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овыми")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ова");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod56
   
      Words changing ending into ин.
   */
   private String lemmatizationMethod56 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ин

      // Words ending in ина => replace by ин
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ина")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ин");
      }

      // Words ending in ину => replace by ин
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ину")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ин");
      }

      // Words ending in иным => replace by ин
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("иным")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ин");
      }

      // Words ending in ине => replace by ин
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ине")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ин");
      }

      // Words ending in ины => replace by ин
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ины")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ин");
      }

      // Words ending in иных => replace by ин
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("иных")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ин");
      }

      // Words ending in иными => replace by ин
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("иными")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ин");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod57
   
      Words changing ending into ина.
   */
   private String lemmatizationMethod57 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ина

      // Words ending in иной => replace by ина
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("иной")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ина");
      }

      // Words ending in ину => replace by ина
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ину")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ина");
      }

      // Words ending in иной => replace by ина
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("иной")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ина");
      }

      // Words ending in ины => replace by ина
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ины")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ина");
      }

      // Words ending in иных => replace by ина
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("иных")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ина");
      }

      // Words ending in иным => replace by ина
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("иным")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ина");
      }

      // Words ending in иных => replace by ина
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("иных")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ина");
      }

      // Words ending in иными => replace by ина
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("иными")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ина");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod58
   
      Words changing ending into цын.
   */
   private String lemmatizationMethod58 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in цын

      // Words ending in цына => replace by цын
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цына")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цын");
      }

      // Words ending in цыну => replace by цын
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цыну")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цын");
      }

      // Words ending in цыным => replace by цын
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("цыным")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цын");
      }

      // Words ending in цыне => replace by цын
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цыне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цын");
      }

      // Words ending in цыны => replace by цын
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цыны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цын");
      }

      // Words ending in цыных => replace by цын
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("цыных")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цын");
      }

      // Words ending in цыным => replace by цын
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("цыным")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цын");
      }

      // Words ending in цыных => replace by цын
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("цыных")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цын");
      }

      // Words ending in цыными => replace by цын
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("цыными")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цын");
      }

      // Words ending in цыных => replace by цын
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("цыных")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цын");
      }

      // Words ending in цыной => replace by цына
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("цыной")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цына");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod59
   
      Words changing ending into ский.
   */
   private String lemmatizationMethod59 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ский

      // Words ending in ского => replace by ский
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ского")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ский");
      }

      // Words ending in скому => replace by ский
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("скому")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ский");
      }

      // Words ending in ского => replace by ский
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ского")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ский");
      }

      // Words ending in ским => replace by ский
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ским")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ский");
      }

      // Words ending in ском => replace by ский
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ском")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ский");
      }

      // Words ending in ско => replace by ский
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ско")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ский");
      }

      // Words ending in ские => replace by ский
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ские")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ский");
      }

      // Words ending in ских => replace by ский
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ских")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ский");
      }

      // Words ending in скими => replace by ский
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("скими")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ский");
      }

      // Words ending in ски => replace by ский
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ски")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ский");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod60
   
      Words changing ending into ская.
   */
   private String lemmatizationMethod60 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ская

      // Words ending in ской => replace by ская
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ской")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ская");
      }

      // Words ending in скую => replace by ская
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("скую")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ская");
      }

      // Words ending in ска => replace by ская
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("ска")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ская");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod61
   
      Words changing ending into цкий.
   */
   private String lemmatizationMethod61 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in цкий

      // Words ending in цкого => replace by цкий
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("цкого")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкий");
      }

      // Words ending in цкому => replace by цкий
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("цкому")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкий");
      }

      // Words ending in цким => replace by цкий
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цким")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкий");
      }

      // Words ending in цком => replace by цкий
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цком")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкий");
      }

      // Words ending in цко => replace by цкий
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("цко")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкий");
      }

      // Words ending in цкие => replace by цкий
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цкие")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкий");
      }

      // Words ending in цких => replace by цкий
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цких")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкий");
      }

      // Words ending in цкими => replace by цкий
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("цкими")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкий");
      }

      // Words ending in цких => replace by цкий
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цких")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкий");
      }

      // Words ending in цки => replace by цкий
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("цки")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкий");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod62
   
      Words changing ending into цкая.
   */
   private String lemmatizationMethod62 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in цкая

      // Words ending in цкой => replace by цкая
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цкой")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкая");
      }

      // Words ending in цкую => replace by цкая
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("цкую")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкая");
      }

      // Words ending in цка => replace by цкая
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("цка")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("цкая");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod63
   
      Words changing ending into ович.
   */
   private String lemmatizationMethod63 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ович

      // Words ending in овича => replace by ович
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овича")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ович");
      }

      // Words ending in овичу => replace by ович
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овичу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ович");
      }

      // Words ending in овичем => replace by ович
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("овичем")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ович");
      }

      // Words ending in овиче => replace by ович
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овиче")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ович");
      }

      // Words ending in овичи => replace by ович
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овичи")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ович");
      }

      // Words ending in овичей => replace by ович
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("овичей")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ович");
      }

      // Words ending in овичам => replace by ович
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("овичам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ович");
      }

      // Words ending in овичами => replace by ович
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("овичами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ович");
      }

      // Words ending in овичах => replace by ович
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("овичах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ович");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod64
   
      Words changing ending into евич.
   */
   private String lemmatizationMethod64 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in евич

      // Words ending in евича => replace by евич
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евича")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евич");
      }

      // Words ending in евичу => replace by евич
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евичу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евич");
      }

      // Words ending in евичем => replace by евич
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("евичем")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евич");
      }

      // Words ending in евиче => replace by евич
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евиче")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евич");
      }

      // Words ending in евичи => replace by евич
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евичи")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евич");
      }

      // Words ending in евичей => replace by евич
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("евичей")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евич");
      }

      // Words ending in евичам => replace by евич
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("евичам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евич");
      }

      // Words ending in евичами => replace by евич
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("евичами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евич");
      }

      // Words ending in евичах => replace by евич
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("евичах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евич");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod65
   
      Words changing ending into овна.
   */
   private String lemmatizationMethod65 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in овна

      // Words ending in овны => replace by овна
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овна");
      }

      // Words ending in овне => replace by овна
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овна");
      }

      // Words ending in овну => replace by овна
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овну")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овна");
      }

      // Words ending in овной => replace by овна
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овной")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овна");
      }

      // Words ending in овною => replace by овна
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("овною")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овна");
      }

      // Words ending in овно => replace by овна
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("овно")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("овна");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod66
   
      Words changing ending into евна.
   */
   private String lemmatizationMethod66 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in евна

      // Words ending in евны => replace by евна
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евна");
      }

      // Words ending in евне => replace by евна
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евна");
      }

      // Words ending in евну => replace by евна
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евну")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евна");
      }

      // Words ending in евной => replace by евна
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евной")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евна");
      }

      // Words ending in евне => replace by евна
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евна");
      }

      // Words ending in евною => replace by евна
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("евною")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евна");
      }

      // Words ending in евно => replace by евна
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("евно")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("евна");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod67
   
      Words changing ending into град.
   */
   private String lemmatizationMethod67 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in град

      // Words ending in града => replace by град
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("града")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("град");
      }

      // Words ending in граду => replace by град
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("граду")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("град");
      }

      // Words ending in градом => replace by град
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("градом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("град");
      }

      // Words ending in граде => replace by град
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("граде")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("град");
      }

      // Words ending in градо => replace by град
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("градо")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("град");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod68
   
      Words changing ending into ман.
   */
   private String lemmatizationMethod68 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ман

      // Words ending in мана => replace by ман
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мана")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ман");
      }

      // Words ending in ману => replace by ман
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ману")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ман");
      }

      // Words ending in маном => replace by ман
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("маном")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ман");
      }

      // Words ending in мане => replace by ман
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мане")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ман");
      }

      // Words ending in маны => replace by ман
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("маны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ман");
      }

      // Words ending in манов => replace by ман
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("манов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ман");
      }

      // Words ending in манам => replace by ман
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("манам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ман");
      }

      // Words ending in манами => replace by ман
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("манами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ман");
      }

      // Words ending in манах => replace by ман
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("манах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ман");
      }

      // Words ending in мано => replace by ман
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мано")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ман");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod69
   
      Words changing ending into мэн.
   */
   private String lemmatizationMethod69 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in мэн

      // Words ending in мэна => replace by мэн
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мэна")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мэн");
      }

      // Words ending in мэну => replace by мэн
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мэну")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мэн");
      }

      // Words ending in мэном => replace by мэн
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("мэном")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мэн");
      }

      // Words ending in мэне => replace by мэн
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мэне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мэн");
      }

      // Words ending in мэны => replace by мэн
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мэны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мэн");
      }

      // Words ending in мэнов => replace by мэн
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("мэнов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мэн");
      }

      // Words ending in мэнам => replace by мэн
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("мэнам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мэн");
      }

      // Words ending in мэнами => replace by мэн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("мэнами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мэн");
      }

      // Words ending in мэнах => replace by мэн
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("мэнах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мэн");
      }

      // Words ending in мэно => replace by мэн
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мэно")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мэн");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod70
   
      Words changing ending into мен.
   */
   private String lemmatizationMethod70 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in мен

      // Words ending in мена => replace by мен
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мена")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мен");
      }

      // Words ending in мену => replace by мен
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мену")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мен");
      }

      // Words ending in меном => replace by мен
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("меном")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мен");
      }

      // Words ending in мене => replace by мен
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мене")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мен");
      }

      // Words ending in мены => replace by мен
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мены")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мен");
      }

      // Words ending in менов => replace by мен
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("менов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мен");
      }

      // Words ending in менам => replace by мен
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("менам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мен");
      }

      // Words ending in менами => replace by мен
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("менами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мен");
      }

      // Words ending in менах => replace by мен
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("менах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мен");
      }

      // Words ending in мено => replace by мен
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("мено")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("мен");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod71
   
      Words changing ending into манн.
   */
   private String lemmatizationMethod71 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in манн

      // Words ending in манна => replace by манн
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("манна")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("манн");
      }

      // Words ending in манну => replace by манн
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("манну")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("манн");
      }

      // Words ending in манном => replace by манн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("манном")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("манн");
      }

      // Words ending in манне => replace by манн
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("манне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("манн");
      }

      // Words ending in манны => replace by манн
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("манны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("манн");
      }

      // Words ending in маннов => replace by манн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("маннов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("манн");
      }

      // Words ending in маннам => replace by манн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("маннам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("манн");
      }

      // Words ending in маннами => replace by манн
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("маннами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("манн");
      }

      // Words ending in маннах => replace by манн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("маннах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("манн");
      }

      // Words ending in манно => replace by манн
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("манно")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("манн");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod72
   
      Words changing ending into штейн.
   */
   private String lemmatizationMethod72 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in штейн

      // Words ending in штейна => replace by штейн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штейна")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штейн");
      }

      // Words ending in штейну => replace by штейн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штейну")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штейн");
      }

      // Words ending in штейном => replace by штейн
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штейном")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штейн");
      }

      // Words ending in штейне => replace by штейн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штейне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штейн");
      }

      // Words ending in штейны => replace by штейн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штейны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штейн");
      }

      // Words ending in штейнов => replace by штейн
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штейнов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штейн");
      }

      // Words ending in штейнам => replace by штейн
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штейнам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штейн");
      }

      // Words ending in штейнами => replace by штейн
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("штейнами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штейн");
      }

      // Words ending in штейнах => replace by штейн
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штейнах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штейн");
      }

      // Words ending in штейно => replace by штейн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штейно")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штейн");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod73
   
      Words changing ending into штадт.
   */
   private String lemmatizationMethod73 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in штадт

      // Words ending in штадта => replace by штадт
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штадта")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штадт");
      }

      // Words ending in штадту => replace by штадт
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штадту")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штадт");
      }

      // Words ending in штадтом => replace by штадт
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штадтом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штадт");
      }

      // Words ending in штадте => replace by штадт
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штадте")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штадт");
      }

      // Words ending in штадты => replace by штадт
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штадты")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штадт");
      }

      // Words ending in штадтов => replace by штадт
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штадтов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штадт");
      }

      // Words ending in штадтам => replace by штадт
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штадтам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штадт");
      }

      // Words ending in штадтами => replace by штадт
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("штадтами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штадт");
      }

      // Words ending in штадтах => replace by штадт
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штадтах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штадт");
      }

      // Words ending in штадто => replace by штадт
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штадто")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штадт");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod74
   
      Words changing ending into таун.
   */
   private String lemmatizationMethod74 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in таун

      // Words ending in тауна => replace by таун
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("тауна")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("таун");
      }

      // Words ending in тауну => replace by таун
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("тауну")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("таун");
      }

      // Words ending in тауном => replace by таун
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("тауном")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("таун");
      }

      // Words ending in тауне => replace by таун
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("тауне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("таун");
      }

      // Words ending in тауны => replace by таун
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("тауны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("таун");
      }

      // Words ending in таунов => replace by таун
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("таунов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("таун");
      }

      // Words ending in таунам => replace by таун
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("таунам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("таун");
      }

      // Words ending in таунами => replace by таун
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("таунами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("таун");
      }

      // Words ending in таунах => replace by таун
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("таунах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("таун");
      }

      // Words ending in тауно => replace by таун
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("тауно")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("таун");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod75
   
      Words changing ending into штайн.
   */
   private String lemmatizationMethod75 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in штайн

      // Words ending in штайна => replace by штайн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штайна")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штайн");
      }

      // Words ending in штайну => replace by штайн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штайну")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штайн");
      }

      // Words ending in штайном => replace by штайн
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штайном")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штайн");
      }

      // Words ending in штайне => replace by штайн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штайне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штайн");
      }

      // Words ending in штайны => replace by штайн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штайны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штайн");
      }

      // Words ending in штайнов => replace by штайн
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штайнов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штайн");
      }

      // Words ending in штайнам => replace by штайн
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штайнам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штайн");
      }

      // Words ending in штайнами => replace by штайн
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("штайнами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штайн");
      }

      // Words ending in штайнах => replace by штайн
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("штайнах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штайн");
      }

      // Words ending in штайно => replace by штайн
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("штайно")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("штайн");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod76
   
      Words changing ending into берг.
   */
   private String lemmatizationMethod76 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in берг

      // Words ending in берга => replace by берг
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("берга")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("берг");
      }

      // Words ending in бергу => replace by берг
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("бергу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("берг");
      }

      // Words ending in бергом => replace by берг
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("бергом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("берг");
      }

      // Words ending in берге => replace by берг
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("берге")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("берг");
      }

      // Words ending in берги => replace by берг
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("берги")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("берг");
      }

      // Words ending in бергов => replace by берг
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("бергов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("берг");
      }

      // Words ending in бергам => replace by берг
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("бергам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("берг");
      }

      // Words ending in бергами => replace by берг
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("бергами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("берг");
      }

      // Words ending in бергах => replace by берг
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("бергах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("берг");
      }

      // Words ending in берго => replace by берг
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("берго")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("берг");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod77
   
      Words changing ending into сон.
   */
   private String lemmatizationMethod77 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in сон

      // Words ending in сона => replace by сон
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("сона")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("сон");
      }

      // Words ending in сону => replace by сон
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("сону")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("сон");
      }

      // Words ending in соном => replace by сон
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("соном")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("сон");
      }

      // Words ending in соне => replace by сон
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("соне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("сон");
      }

      // Words ending in соны => replace by сон
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("соны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("сон");
      }

      // Words ending in сонов => replace by сон
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("сонов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("сон");
      }

      // Words ending in сонам => replace by сон
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("сонам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("сон");
      }

      // Words ending in сонами => replace by сон
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("сонами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("сон");
      }

      // Words ending in сонах => replace by сон
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("сонах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("сон");
      }

      // Words ending in соно => replace by сон
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("соно")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("сон");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod78
   
      Words changing ending into зон.
   */
   private String lemmatizationMethod78 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in зон

      // Words ending in зона => replace by зон
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("зона")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зон");
      }

      // Words ending in зону => replace by зон
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("зону")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зон");
      }

      // Words ending in зоном => replace by зон
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("зоном")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зон");
      }

      // Words ending in зоне => replace by зон
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("зоне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зон");
      }

      // Words ending in зоны => replace by зон
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("зоны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зон");
      }

      // Words ending in зонов => replace by зон
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("зонов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зон");
      }

      // Words ending in зонам => replace by зон
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("зонам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зон");
      }

      // Words ending in зонами => replace by зон
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("зонами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зон");
      }

      // Words ending in зонах => replace by зон
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("зонах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зон");
      }

      // Words ending in зоно => replace by зон
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("зоно")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("зон");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod79
   
      Words changing ending into ян.
   */
   private String lemmatizationMethod79 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ян

      // Words ending in яна => replace by ян
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("яна")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ян");
      }

      // Words ending in яну => replace by ян
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("яну")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ян");
      }

      // Words ending in яном => replace by ян
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("яном")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ян");
      }

      // Words ending in яне => replace by ян
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("яне")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ян");
      }

      // Words ending in яны => replace by ян
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("яны")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ян");
      }

      // Words ending in янов => replace by ян
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("янов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ян");
      }

      // Words ending in янам => replace by ян
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("янам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ян");
      }

      // Words ending in янами => replace by ян
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("янами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ян");
      }

      // Words ending in янах => replace by ян
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("янах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ян");
      }

      // Words ending in яно => replace by ян
      if ( ( sb.length() > 3 ) && (sb.substring(sb.length()-3, sb.length()).equals("яно")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ян");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod80
   
      Words changing ending into гольд.
   */
   private String lemmatizationMethod80 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in гольд

      // Words ending in гольда => replace by гольд
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("гольда")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольд");
      }

      // Words ending in гольду => replace by гольд
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("гольду")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольд");
      }

      // Words ending in гольдом => replace by гольд
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("гольдом")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольд");
      }

      // Words ending in гольде => replace by гольд
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("гольде")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольд");
      }

      // Words ending in гольды => replace by гольд
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("гольды")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольд");
      }

      // Words ending in гольдов => replace by гольд
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("гольдов")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольд");
      }

      // Words ending in гольдам => replace by гольд
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("гольдам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольд");
      }

      // Words ending in гольдами => replace by гольд
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("гольдами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольд");
      }

      // Words ending in гольдах => replace by гольд
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("гольдах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольд");
      }

      // Words ending in гольдо => replace by гольд
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("гольдо")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольд");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod81
   
      Words changing ending into гольц.
   */
   private String lemmatizationMethod81 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in гольц

      // Words ending in гольца => replace by гольц
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("гольца")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольц");
      }

      // Words ending in гольцу => replace by гольц
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("гольцу")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольц");
      }

      // Words ending in гольцем => replace by гольц
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("гольцем")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольц");
      }

      // Words ending in гольце => replace by гольц
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("гольце")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольц");
      }

      // Words ending in гольцы => replace by гольц
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("гольцы")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольц");
      }

      // Words ending in гольцев => replace by гольц
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("гольцев")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольц");
      }

      // Words ending in гольцам => replace by гольц
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("гольцам")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольц");
      }

      // Words ending in гольцами => replace by гольц
      if ( ( sb.length() > 8 ) && (sb.substring(sb.length()-8, sb.length()).equals("гольцами")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольц");
      }

      // Words ending in гольцах => replace by гольц
      if ( ( sb.length() > 7 ) && (sb.substring(sb.length()-7, sb.length()).equals("гольцах")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("гольц");
      }

      return sb.toString();
   }

   
   /**
      Method lemmatizationMethod82
   
      Words changing ending into ение.
   */
   private String lemmatizationMethod82 (String term) {
      StringBuffer sb = new StringBuffer();
      sb.delete( 0, sb.length() );
      sb.insert( 0, term );
      // Don't change words ending in ение

      // Words ending in ения => replace by ение
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ения")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      // Words ending in ению => replace by ение
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ению")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      // Words ending in ением => replace by ение
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ением")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      // Words ending in ении => replace by ение
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ении")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      // Words ending in ений => replace by ение
      if ( ( sb.length() > 4 ) && (sb.substring(sb.length()-4, sb.length()).equals("ений")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      // Words ending in ениям => replace by ение
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ениям")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      // Words ending in ениями => replace by ение
      if ( ( sb.length() > 6 ) && (sb.substring(sb.length()-6, sb.length()).equals("ениями")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      // Words ending in ениях => replace by ение
      if ( ( sb.length() > 5 ) && (sb.substring(sb.length()-5, sb.length()).equals("ениях")) ) {
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.deleteCharAt(sb.length()-1);
         sb.append("ение");
      }

      return sb.toString();
   }
   
   // Don't change words ending in ани

   // Don't change words ending in швили

   // Don't change words ending in дзе

   // Don't change words ending in нко

   // Don't change words ending in ями

   // Don't change words ending in ях
   
   // -------------------------------
   // End of generated rules

   
}

