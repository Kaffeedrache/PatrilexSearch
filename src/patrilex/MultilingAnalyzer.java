// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8


/**
Class MultilingAnalyzer

This class implements an analyzer where the language
can be selected at time of initializing the Analyzer.
For every language there is a different preprocessing 
of the input done.
For every language there is also a lemmatizer 
(subclass of abstract class Lemmatizer) loaded.

*/


package patrilex;


import java.util.LinkedList;
import java.util.Set;
import org.apache.lucene.analysis.CharArraySet;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.StopFilter;
import org.apache.lucene.analysis.LetterTokenizer;
import org.apache.lucene.analysis.WhitespaceTokenizer;
import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.ISOLatin1AccentFilter;
import org.apache.lucene.analysis.LowerCaseFilter;

import java.io.Reader;
import java.io.IOException;
import java.io.StringReader;


/** Implements an analyzer where the language can be selected at initializing */
public class MultilingAnalyzer extends Analyzer {
   
      
   /**
      Set of stopwords for the chosen language
   */
   private Set stopWords;

   
   /**
      Stopwords for English
   */
   private static final String[] englishStopWords = {
      // Articles
      "a", "an", "the",
      // Personal pronouns
      "i", "it", "they", "their",
      // To be
      "be", "is", "are", "was", "will",
      // Question markers
      "how", "what", "when", "where", "who",
      // Prepositions and others
      "of", "on", "at", "in", "into", "to", "with","by",
      "about", "for", "from",
      "such", "that", "there", "these", "this",
      "then", "as", "but", "if", 
      "no", "not",   
      "and", "or"
   };
   
   
   /**
      Stopwords for Spanish
   */
   private static final String[] spanishStopWords = {
      // Articles
      "el", "la", "lo", "las", "los", "un", "una", "uno", "unas", "unos",
      // Demonstrative pronouns
      "algun", "alguno", "alguna", "algunos", "algunas",
      "todo", "cada", "otro", 
      // Forms of to be (ser/estar)
      "ser", "soy", "eres", "es", "somos", "sois", "son", "siendo",
      "fui", "fuiste", "fue", "fuimos", "fuisteis", "fueron",
      "estar", "estoy", "estas", "esta", "estamos", "estais", "estan", "estado", "estaba",
      // To do (hacer)
      "hacer", "hago", "haces", "hace", "hacemos", "haceis", "hacen",
      // To have (haber)
      "haber", "he", "has", "ha", "hemos", "habeis", "han",
      // To go (ir)
      "ir", "voy", "vas", "va", "vamos", "vais", "van",
      // Personal pronouns
      "yo", "tu", "el", "ella", "nosotros", "vosotros", "ellos", "ellas",
      // Prepositions and others
      "en", "de", "del", "por", "para", "con", "sin",
      "pero", "si", "y", "o",
      "si", "no"
   };
   
   
   /**
      Stopwords for German
   */
   private static final String[] germanStopWords = {
      // articles
      "der", "die", "das", "dem", "den", "des", "dessen",
      "ein", "eine", "eines", "einem", "einen", "einer",
      // demonstrative pronouns
      "dies", "dieser", "dieses",
      "jener", "jene", "jenes",      
      "jede", "jedem", "jeden", "jeder", "jedes",
      // to be (sein)
      "sein", "bin", "bist", "ist", "sind", "seid",
      "werden", "werde", "wirst", "wird", "werdet",
      "war", "warst", "wart", "waren",
      // personal pronouns
      "ich", "du", "er", "sie", "es", "wir", "ihr", 
      "mich", "dich", "sich", "mir", "dir", "ihm", "uns", "euch",
      "mein", "dein", "unser", "euer",
      "meine", "deine", "unsere", "eure",
      // question markers
      "was", "wer", "wie", "wo",
      // prepositions and others
      "nicht", "nein", "ja", "doch",
      "nun", "und", "oder",
      "aber", "und", "oder", "dass", "daß", 
      "am", "an", "auf", "aus", "bei", "beim", "durch", "für", "ohne",
      "im", "in", "mit", "vom", "von", "vor", "zu", "zum", "zur", "über"
      
   };
   

   /**
      Stopwords for Russian
   */
   // from http://members.unine.ch/jacques.savoy/clef/russianST.txt
   private static final String[] russianStopWords = {
       "a", "е", "и", "ж", "м", "о", "на", "не", "ни", "об", "но", "он",
       "мне", "мои", "мой", "она", "они", "оно", "мной", "много",
       "многочисленное", "многочисленная", "многочисленные",
       "многочисленный", "мною", "мой", "мог", "могут", "можно",
       "может", "можно", "мор", "моя", "моё", "мочь", "над", "неё",
       "оба", "нам", "нем", "нами", "ними", "мимо", "немного",
       "одной", "одного", "менее", "однажды", "однако", "меня",
       "нему", "меньше", "ней", "наверху", "него", "ниже", "мало",
       "надо", "один", "одиннадцать", "одиннадцатый", "назад",
       "наиболее", "недавно", "миллионов", "недалеко", "между",
       "низко", "меня", "нельзя", "нибудь", "непрерывно", "наконец",
       "никогда", "никуда", "нас", "наш", "нет", "нею", "неё", "них",
       "наша", "наше", "наши", "ничего", "сначала", "нередко",
       "несколько", "обычно", "опять", "около", "мы", "ну", "их", "от",
       "отовсюду", "особенно", "нужно", "очень", "отсюда", "в", "во",
       "вон", "вниз", "внизу", "вокруг", "вот", "восемнадцать", 
       "восемнадцатый", "восемь", "восьмой", "вверх", "вам", "вами",
       "важное", "важная", "важные", "важный", "вдали", "везде",
       "ведь", "вас", "ваш", "ваша", "ваше", "ваши", "впрочем", "весь",
       "вдруг", "вы", "все", "второй", "всем", "всеми", "времени", "время",
       "всему", "всего", "всегда", "всех", "всею", "всю", "вся", "всё", "всюду",
       "г", "год", "говорил", "говорит", "года", "году", "где", "да", "ее", "за",
       "из", "ли", "же", "им", "до", "по", "ими", "под", "иногда", "довольно",
       "именно", "долго", "позже", "более", "должно", "пожалуйста",
       "значит", "иметь", "больше", "пока", "ему", "имя", "пор", "пора",
       "потом", "потому", "после", "почему", "почти", "посреди", "ей", "два",
       "две", "двенадцать", "двенадцатый", "двадцать", "двадцатый", "двух",
       "его", "или", "без", "день", "занят", "занята", "занято", "заняты", 
       "действительно", "давно", "девятнадцать", "девятнадцатый", "девять",
       "девятый", "даже", "алло", "далеко", "близко", "здесь", "дальше", "для",
       "лет", "зато", "даром", "первый", "перед", "затем", "зачем", "лишь", "десять",
       "десятый", "ею", "её", "их", "бы", "ещё", "при", "был", "про", "процентов",
       "процент", "против", "просто", "бывает", "бывь", "если", "люди", "была",
       "были", "было", "будем", "будет", "будете", "будешь", "прекрасно", "буду",
       "будь", "будто", "будут", "ещё", "пятнадцать", "пятнадцатый", "друго",
       "другое", "другой", "другие", "другая", "других", "есть", "пять", "быть", "лучше",
       "пятый", "к", "ком", "конечно", "кому", "кого", "когда", "которой", "которого",
       "которая", "которые", "который", "которых", "кем", "каждое", "каждая",
       "каждые", "каждый", "кажется", "как", "какой", "какая", "кто", "кроме",
       "куда", "кругом", "с", "т", "у", "я", "та", "те", "уж", "со", "то", "том", "снова",
       "тому", "совсем", "того", "тогда", "тоже", "собой", "тобой", "собою", "тобою",
       "сначала", "только", "уметь", "тот", "тою", "хорошо", "хотеть", "хочешь",
       "хоть", "хотя", "своё", "свои", "твой", "своей", "своего", "своих", "свою",
       "твоя", "твоё", "раз", "уже", "сам", "там", "тем", "чем", "сама", "сами",
       "теми", "само", "рано", "самом", "самому", "самой", "самого", "семнадцать",
       "семнадцатый", "самим", "самими", "самих", "саму", "семь", "чему", "раньше",
       "сейчас", "чего", "сегодня", "себе", "тебе", "собой", "человек", "разве", "теперь",
       "себя", "тебя", "седьмой", "спасибо", "слишком", "так", "такое", "такой", "такие",
       "также", "такая", "сих", "тех", "чаще", "четвертый", "через", "часто", "шестой",
       "шестнадцать", "шестнадцатый", "шесть", "четыре", "четырнадцать", 
       "четырнадцатый", "сколько", "сказал", "сказала", "сказать", "ту", "ты", "три",
       "эта", "эти", "что", "это", "чтоб", "этом", "этому", "этой", "этого", "чтобы",
       "этот", "стал", "туда", "этим", "этими", "рядом", "тринадцать", "тринадцатый",
       "этих", "третий", "тут", "эту", "суть", "чуть", "тысяч", "тысяча"
   };
       
   // This list is from Igor Buguslavsky
   // and contains all pronouns
//~ ВАШ
//~ ВЕЗДЕ
//~ ВЕСЬ
//~ ВСЕ1
//~ ВСЕ3
//~ ВСЮДУ
//~ ВСЯКИЙ
//~ ВЫ
//~ ГДЕ
//~ ГДЕ$БЫ$ТО$НИ$БЫЛО
//~ ГДЕ-ЛИБО
//~ ГДЕ-НИБУДЬ
//~ ГДЕ-ТО
//~ ДОКОЛЕ1
//~ ДОКУДА
//~ ДРУГОЙ
//~ ЗАЧЕМ
//~ ЗАЧЕМ-ЛИБО
//~ ЗАЧЕМ-НИБУДЬ
//~ ЗАЧЕМ-ТО
//~ ЗДЕСЬ
//~ ИНОЙ
//~ КАК$БЫ$ТО$НИ$БЫЛО
//~ КАК2
//~ КАК-ЛИБО
//~ КАК-НИБУДЬ
//~ КАКОВ
//~ КАКОВОЙ
//~ КАКОЙ
//~ КАКОЙ$БЫ$ТО$НИ$БЫЛО
//~ КАКОЙ-ЛИБО
//~ КАКОЙ-НИБУДЬ
//~ КАКОЙ-ТО
//~ КОГДА$БЫ$ТО$НИ$БЫЛО
//~ КОГДА1
//~ КОГДА-ЛИБО
//~ КОГДА-НИБУДЬ
//~ КОГДА-ТО
//~ КОЕ-ГДЕ
//~ КОЕ-КАК
//~ КОЕ-КАКОЙ
//~ КОЕ-КОГДА
//~ КОЕ-КТО
//~ КОЕ-КУДА
//~ КОЕ-ЧТО
//~ КОЙ
//~ КОТОРЫЙ
//~ КОТОРЫЙ-ЛИБО
//~ КТО
//~ КТО$БЫ$ТО$НИ$БЫЛО
//~ КТО-Л
//~ КТО-ЛИБО
//~ КТО-НИБУДЬ
//~ КТО-ТО
//~ КУДА
//~ КУДА$БЫ$ТО$НИ$БЫЛО
//~ КУДА-ЛИБО
//~ КУДА-НИБУДЬ
//~ КУДА-ТО
//~ МОЙ
//~ МЫ
//~ НАШ
//~ НЕГО1
//~ НЕГО2
//~ НЕЕ
//~ НЕКИЙ
//~ НЕКОГДА2
//~ НЕКОГО
//~ НЕКОТОРЫЙ
//~ НЕКТО
//~ НЕСКОЛЬКО1
//~ НЕЧЕГО1
//~ НЕЧТО
//~ НИ$РАЗУ
//~ НИГДЕ
//~ НИКАК
//~ НИКАКОЙ
//~ НИКОГДА
//~ НИКТО
//~ НИКУДА
//~ НИМАЛО
//~ НИОТКУДА
//~ НИСКОЛЕЧКО
//~ НИСКОЛЬКО
//~ НИХ
//~ НИЧЕЙ
//~ НИЧТО
//~ НИЧУТЬ
//~ ОН
//~ ОНА
//~ ОНИ
//~ ОНО
//~ ОТКУДА
//~ ОТКУДА$БЫ$ТО$НИ$БЫЛО
//~ ОТКУДА-ЛИБО
//~ ОТКУДА-НИБУДЬ
//~ ОТКУДА-ТО
//~ ОТСЮДА
//~ ОТТУДА
//~ ОТЧЕГО
//~ ОТЧЕГО-ЛИБО
//~ ОТЧЕГО-НИБУДЬ
//~ ОТЧЕГО-ТО
//~ ПОВСЮДУ
//~ ПОЧЕМУ
//~ ПОЧЕМУ-ЛИБО
//~ ПОЧЕМУ-НИБУДЬ
//~ ПОЧЕМУ-ТО
//~ ПРИЧЕМ2
//~ ПРОЧИЙ
//~ САМ
//~ СВОЙ
//~ СЕБЯ
//~ СЕЙ
//~ СЕЙЧАС
//~ СКОЛЬКО
//~ СТОЛЬ$ЖЕ
//~ СТОЛЬКО
//~ СТОЛЬКО-ТО
//~ СЮДА
//~ ТАК
//~ ТАК$ЖЕ
//~ ТАКЖЕ
//~ ТАКОВ
//~ ТАКОВОЙ
//~ ТАКОЙ
//~ ТАКОЙ-ТО
//~ ТАМ
//~ ТВОЙ
//~ ТЕПЕРЬ
//~ ТО3
//~ ТОГДА
//~ ТОЖЕ
//~ ТОТ1
//~ ТОТ2
//~ ТУДА
//~ ТУДА-СЮДА
//~ ТУТ1
//~ ТЫ
//~ ЧЕЙ
//~ ЧЕЙ$БЫ$ТО$НИ$БЫЛО
//~ ЧЕЙ-ЛИБО
//~ ЧЕЙ-НИБУДЬ
//~ ЧЕЙ-ТО
//~ ЧТО$БЫ$ТО$НИ$БЫЛО
//~ ЧТО2
//~ ЧТО-Л
//~ ЧТО-ЛИБО
//~ ЧТО-НИБУДЬ
//~ ЧТО-ТО1
//~ ЭТАК
//~ ЭТАКИЙ
//~ ЭТО
//~ ЭТОТ
//~ Я
   
   
   /**
      Stopwords for Arabic
   */
   // This list is from Adriana Toni
   private static final String[] arabicStopWords = {
      // Conjunctions
      "اذ", "اذا", "ان", "الا", "اما", "ان", "او", "ببينما",
      "ثم", "حتى", "مكي", "كي", "لكيلا", "كيلا", "لكن",
      "لكن", "لما", "لو", "ما", "متى", "مذ", "منذ",
      // Interjections
      "يا", "ها", "وا", "هيا", "هات",
      // Prepositions
      "الى", "حتى", "على", "عن", "في", "لدا", "لدن", "لدى",
      "مع", "من", "مذ", "منذ",
      // Adverbial particles
      "اذن", "ام", "ان", "اي", "اين", "بل", "بلى", "ثم", 
      "فقط", "قط", "لا", "لما", "لن", "ما", "متى", "نعم",
      "هنا", "هناك", "هنالك",
      // Personal pronouns
      "انا", "انت", "انت", "هو", "هي", "انتما", "هما", "نحن",
      "انتم", "انتن", "هم", "هن",
      // Demonstrative pronouns
      "هذا", "هذه", "هذان", "هتان", "هذين", "هتين", "هولاء",
      "ذا", "ذي", "ذان", "تان", "ذين", "تين", "اولى", "اولاء",
      "ذاك", "ذلك", "تلك", "تاك", "تيك", "ذانك", "تانك",
      "ذينك", "تينك", "اولائك ",
      // Interrogative pronouns
      "من", "ما", "مذا", "اي", "اية", "كم",
      // Interrogative particles
      "هل", "ا",
      // All, every
      "كل", "جميع",
      // Inna
      "ان", "لكن", "لعل", "لان"
   };
   
   
   /**
      Lemmatizer of the selected language
   */
   private Lemmatizer mylemmatizer;
   
   
   /**
      Selected language
   */
   private Language mylanguage;
   
   
   /**
      Global constants file
   */
   private Constants c;
   
   
   /**
      Constructor without specifying language
      Language is set to English as default.
      Initializes the corresponding Lemmatizer and 
      the set of stop words.
   */
   public MultilingAnalyzer () {
      this (Language.EN);
   }

   
   /**
      Constructor with a String specifying language.
      If the String is no valid language (see class Language),
      the language is set to English.
      Initializes the corresponding Lemmatizer and 
      the set of stop words.
   */
   public MultilingAnalyzer (String language) {
      this (Language.stringToLanguage(language));
   }
   
   
   /**
      Constructor with specified language.
      Initializes the corresponding Lemmatizer and 
      the set of stop words.
   */
   public MultilingAnalyzer (Language language) {
      
      c = new Constants();

      switch (language) {
         case EN :  // English
            stopWords = StopFilter.makeStopSet(englishStopWords);
            mylanguage = Language.EN;
            mylemmatizer = new EnglishLemmatizer();
            break;
         case ES : // Spanish
            stopWords = StopFilter.makeStopSet(spanishStopWords);
            mylanguage = Language.ES;
            mylemmatizer = new SpanishLemmatizer();
            break;
         case DE : // German
            stopWords = StopFilter.makeStopSet(germanStopWords);
            mylanguage = Language.DE;
            mylemmatizer = new GermanLemmatizer();
            break;
         case RU : // Russian
            stopWords = StopFilter.makeStopSet(russianStopWords);
            mylanguage = Language.RU;
            mylemmatizer = new RussianLemmatizer();
            break;
         case AR : // Arabic
            stopWords = StopFilter.makeStopSet(arabicStopWords);
            mylanguage = Language.AR;
            mylemmatizer = new ArabicLemmatizer();
            break;
         case UNL : // UNL
            stopWords = null;
            mylanguage = Language.UNL;
            break;
      }
      
   }
   
   
   /**
      Method tokenStream
   
      Depending on language the text is normalized and lemmatized.
   
      Normalizations for the different languages:
      UNL: Lowercasing 
      EN: Lowercasing & remove accents
      ES: Lowercasing & remove accents
      RU: Lowercasing
      AR: Remove vowels
   */
   public TokenStream tokenStream(String fieldName, Reader reader) {

      TokenStream result;
      
      // UNL has a different Tokenizer, therefor it neads different treatment
      if (mylanguage == Language.UNL) {
         //~ result = new UNLTokenizer (reader);
         result = new WhitespaceTokenizer(reader);
         result = new LowerCaseFilter(result);
         return result;
      }
   
      switch (mylanguage) {
         case EN: // English -> lowercase + remove accented words
         case ES: // Spanish -> lowercase + remove accented words
            result = new LetterTokenizer(reader);
            result = new LowerCaseFilter(result);
            result = new ISOLatin1AccentFilter(result);
            break;
         case AR: // Arabic -> remove vowels
            result = new ArabicTokenizer(reader);
            result = new ArabicVowelFilter(result);
            break;
         case RU: // Russian -> lowercase
            result = new LetterTokenizer(reader);
            result = new LowerCaseFilter(result);
            break;
         default: // Standard is lowercase
            result = new LetterTokenizer(reader);
            result = new LowerCaseFilter(result);
            break;
      }
      
      // Remove stop words (initialized acording to language)
      result = new StopFilter(result, stopWords); 
      // Lemmatize
      result = new LemmaFilter(result, mylemmatizer);
     
     return result;
  }
  
  
   /**
      Method analyze
   
      Gives the input to the analyze and returns the resulting TokenStream
      in a String where Tokens are sperated by whitespaces.
   */
   public String analyze (String input, String fieldName) {
      
      TokenStream stream = tokenStream (fieldName, new StringReader(input));
      
      String output = "";
      
      try {
      Token token = stream.next();
         while (token != null) {
            String word = getText (token);
            output += word + " ";
            token = stream.next();
         }
      } catch (IOException e) {
         return "";
      }
      
      return output.trim();

   }
  
   
   /**
      Method analyze
   
      Gives the input to the analyze and returns the resulting TokenStream
      in a String where Tokens are sperated by whitespaces.
      Uses the default field.
   */
   public String analyze (String input) {
      return analyze (input, c.getField());
   }

  
   /**
      Method analyzeList
   
      Gives the input to the analyze and returns the resulting TokenStream
      in a LinkedList, every Token is an item in the list.
   */
   public LinkedList analyzeList (String fieldName, String input) {
      
      LinkedList<Object> outList = new LinkedList<Object>();

      TokenStream stream = tokenStream (fieldName, new StringReader(input));

      try {
         Token token = stream.next();
            
         while (token != null) {
            String word = getText (token);
            outList.add (word);
            token = stream.next();
         }
      } catch (IOException e) {
         return null;
      }
      
      return outList;
   }
   
   
   /**
      Method analyzeSet
   
      Gives the input to the analyze and returns the resulting TokenStream
      in a CharArraySet, every Token is an item in the set.
   */
   public CharArraySet analyzeSet (String fieldName, String input) {
      
      CharArraySet resultSet = new CharArraySet(2, true);
      
      TokenStream stream = tokenStream (fieldName, new StringReader(input));

      try {
         Token token = stream.next();
            
         while (token != null) {
            String word = getText (token);
            resultSet.add (word);
            token = stream.next();
         }
      } catch (IOException e) {
         return null;
      }
      
      return resultSet;
   }
   
   
   /**
      Method getText
   
      Stupid way to get arround deprecation of tokenText
      and get a String with the content ouf of a Token.
   */
   private static final String getText (Token t) {
      int laenge = t.termLength();		
      char[] wordchars = t.termBuffer();
      String word = "";
      for (int j=0; j<laenge; j++) {
         word = word + wordchars[j];
      }
      return word;
   }
   
   
}
