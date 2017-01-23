// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class SearchFilesWeb

This is the main file responsible for the communication with the user and
for providing the user interface.

This class calls on all other methods. The logic is as follows:

   Set initial parameters translation, expansion, language and queryString

   Initialize MultilingAnalyzer with corresponding language.

   if (query) 
      Analyze Query (tokenize, normalize, lemmatize)  -> MultilingAnalyzer.java
   
   if (query && translation)
      Translate query to UNL                          -> Dictionary.java

   if (query && translation && expansion) 
      Expand query                                    -> Thesaurus.java

   if (query && translation) 
      Translate query to index language               -> Dictionary.java

   if (query)  
      Construct query                                 -> SearchModule.java
      Search documents                                -> SearchModule.java
      Show hits with highlighting

If at any point the query is empty or any other error occurs 'query' is set to false
and the processing is stopped.

All this is done in the method 'doGet'.

*/

package patrilex;


// Servlets
import javax.servlet.*;
import javax.servlet.http.*;

// Data types
import java.util.Date;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.AbstractCollection;
import org.apache.lucene.analysis.CharArraySet;

// IO and Exceptions
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

// Analysis
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;

// Search and display of hits
import org.apache.lucene.search.Query;
import org.apache.lucene.search.Hits;
import org.apache.lucene.document.Document;

// Highlighting of query terms
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.search.highlight.SimpleFragmenter;
import org.apache.lucene.search.highlight.QueryScorer;
import java.io.StringReader;


/** Main class providing the interface for search */
public class SearchFilesWeb extends HttpServlet {

   
   /** 
      Method utf8Convert
   
      Converts a String that is UTF8 to UTF8 -
      Seems nonsense, but without it it doesn't work.
   */
   private static final String utf8Convert (String utf8String)
            throws java.io.UnsupportedEncodingException
   {
      byte[] bytes = new byte[utf8String.length()];
      for (int i = 0; i < utf8String.length(); i++) {
         bytes[i] = (byte) utf8String.charAt(i);
      }
      return new String(bytes, "UTF-8");
   }


   /** 
      Method encodeURL
   
      Encodes a String as an url, escaping important characters.
   */   
   private static final String encodeURL (String url) {
      url = url.replaceAll("&", "&amp;");
      url = url.replaceAll("<", "&lt;");
      url = url.replaceAll(">", "&gt;");
      url = url.replaceAll("\"", "&quot;");
      url = url.replaceAll("'", "&apos;");
      // UTF8???
      return url;
   }

   
   /** 
      Method printList
   
      Prints the contents of a linked list or a set
   */
   private static final void printList (AbstractCollection list, PrintWriter out) {
      try {
         Iterator iterator = list.iterator();
         while (iterator.hasNext()) {
            out.println(encodeURL(iterator.next().toString())+ "<br>");
         }      
      } catch (Exception e) {
         out.println("<br><br><br><font color=red>"); 
         out.println("AN ERROR OCURRED: ");
         out.println(e.getMessage()); 
         e.printStackTrace(out);
         out.println("</font>");
         out.println("</body>");
         out.println("</html>");
      }
   }
   
   
   /** 
      Method printListWithLinks
   
      Prints the contents of a linked list or a set with links
   */
   private final void printListWithLinks (AbstractCollection list, PrintWriter out, Language indexlang) {
      try {       
         Iterator iterator = list.iterator();
         
         while (iterator.hasNext()) {
            String text = encodeURL(iterator.next().toString());
            String linktext = "search?query=&quot;" + text + "&quot;&amp;mode=3&amp;language=" + indexlang;
            out.println("<a href=\"" + linktext + "\">" + text + "</a><br>");
         }
      } catch (Exception e) {
         out.println("<br><br><br><font color=red>"); 
         out.println("AN ERROR OCURRED: ");
         out.println(e.getMessage()); 
         e.printStackTrace(out);
         out.println("</font>");
         out.println("</body>");
         out.println("</html>");
      }
   }
   
   
   /** 
      Method printQuery
   
      Prints the contents of a linked list in one line and with ""
   */
   private static final void printQuery (AbstractCollection list, PrintWriter out) {
      try { 
         Iterator iterator = list.iterator();
         String queryString = "";
         
         while (iterator.hasNext()) {
            queryString += encodeURL("\"" + iterator.next().toString()+ "\" ");
         }
         out.println(queryString + "<br>");
      } catch (Exception e) {
         out.println("<br><br><br><font color=red>"); 
         out.println("AN ERROR OCURRED: ");
         out.println(e.getMessage()); 
         e.printStackTrace(out);
         out.println("</font>");
         out.println("</body>");
         out.println("</html>");
      }
   }

   
   /** 
      Method printHTML
   
      Prints the contents of a file that is supposed to be HTML.
      There is no checking of the HTML so it could contain anything!
   */
   private static void printHTML (String path, PrintWriter out) {
      try {
         
         /*
            Open file and deal with a lot of exceptions
         */

         File file = new File (path);
         if (file == null) { // File is null
            throw new IllegalArgumentException ("File should not be null!");
         }
         if (!file.exists()) { // File doesn't exist
            throw new FileNotFoundException ("File does not exist: " + file);
         }
         if (!file.isFile()) { // File is a directory
            throw new IllegalArgumentException ("File is a directory: " + file);
         }
      
         /*
            Print the contents of the file
         */
         
         BufferedReader inputFile = new BufferedReader(new FileReader(file));
         String line = null;
         while  (( line = inputFile.readLine()) != null) {
            out.println(line);
         }
         
      } catch (Exception e) {
         out.println("<br><br><br><font color=red>"); 
         out.println("AN ERROR OCURRED: ");
         out.println(e.getMessage()); 
         e.printStackTrace(out);
         out.println("</font>");
      }
   }
   
   
   /** 
      Method doGet
   
      Main method, responsible for calling on analysis, translation,
      expansion and search.
      Also provides the user interface.
   */
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {

      response.setContentType("text/html; charset=UTF-8");
      Constants c = new Constants();

      PrintWriter out = new PrintWriter(
         new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
       
      try {
         String filePath = c.getHtmlRoot() + File.separator + c.getHeaderfile();
         printHTML (filePath, out);
    
         out.println("<form method=\"POST\" ");
         out.println("action=\"search\">");
         
         out.println("Please enter your query");
         out.println("<input type=text size=30 name=query>");
         out.println("(<a href=\"help\">Help</a>)<br>");         
         
         out.println("Language: <br>");
         out.println("<input type=\"radio\" name=\"language\" value=\"EN\">English<br>");
         out.println("<input type=\"radio\" name=\"language\" value=\"ES\">Español<br>");
         out.println("<input type=\"radio\" name=\"language\" value=\"RU\">Русский<br>");
         out.println("<input type=\"radio\" name=\"language\" value=\"AR\">عربية<br>");
         out.println("<br>");
  
         out.println("<input type=\"radio\" name=\"mode\" value=\"0\">Normal search<br>");         
         out.println("<input type=\"radio\" name=\"mode\" value=\"1\">No query expansion<br>");
         out.println("<input type=\"radio\" name=\"mode\" value=\"3\">Phrase query (Lucene, only Spanish)<br>");
         out.println("<br>");
         
         out.println("<input type=\"submit\" value=\"Search\">");
         out.println("<br>");
         
         
         /*
            Set behaviour
         */

         // Initialize variables to direct behaviour
         Boolean query = true;
         Boolean translation = true;
         Boolean expansion = true;
         Boolean phrase = false;
         
         String mode = request.getParameter("mode");
         if (mode != null && mode.length() != -1) {
            if (mode.equals("1")) { // no expansion
               expansion = false;
            }
            if (mode.equals("2")) { // no translation
               translation = false; 
               // implies no expansion
            }
            if (mode.equals("3")) { // phrase query
               phrase = true;
               translation = false;
               // implies no translation or expansion
            }
         } // if parameter is not set - normal search
         
         
         /*
            Check if we have a query
         */
         String queryString1 = request.getParameter("query");
         String queryString = "";
         Date startDate = new Date();
         
         if (queryString1 == null || queryString1.length() == -1)  { 
            // no query entered
            query = false;
         } else {         
            queryString = utf8Convert (queryString1);
            queryString = queryString.trim();

            out.println("Query entered:<font color=\"blue\"> " 
                  + queryString + "</font><br>"); // TEST
            
            if (queryString == null || queryString.length() == -1)  { 
               // query consisted of spaces
               query = false;
            }
         }
         
         
         /*
            Set language of query and initialize corresponding analyzer
         */
         
         String languageString = request.getParameter("language");
         Language queryLanguage;
         if (languageString == null || languageString.length() == -1) {
            out.println("Language set to english<br>"); // TEST
            queryLanguage = Language.EN;
         } else {
            out.println("Language set to " + languageString + "<br>"); // TEST
            queryLanguage = Language.stringToLanguage(languageString);
         }

         MultilingAnalyzer queryLanguageAnalyzer = 
               new patrilex.MultilingAnalyzer(queryLanguage);


         /* 
            Analyze Query (tokenize, normalize and lemmatize)
         */
         
         LinkedList queryList = new LinkedList();
         CharArraySet querySet = new CharArraySet(2, true);
         
         if (query && translation && !phrase) { 
            // we make a list, because word order is important for translation
            
            queryList = queryLanguageAnalyzer.analyzeList (c.getField(), queryString);
               
            out.println("<br>Query tokenized and lemmatized:<font color=\"blue\"> ");    // TEST
            printList (queryList, out);
            out.println("</font><br>");
            
            // if the query is empty stop processing by setting query to false
            if ( queryList.isEmpty() ) {
               query = false;
            }
            
         } // Analysis for translation
         
         if (query && !translation && !phrase) { 
            // we make a set, because word order is not important anymore
            
            querySet = queryLanguageAnalyzer.analyzeSet (c.getField(), queryString);
               
            out.println("<br>Query tokenized and lemmatized:<font color=\"blue\"> ");    // TEST
            printList (querySet, out);
            out.println("</font><br>");
            
            // if the query is empty stop processing by setting query to false
            if ( querySet.isEmpty() ) {
               query = false;
            }
            
         } // Analysis for not translating


         /*
            Translate query to UNL
         */
         
         // Initialize Dictionary
         Dictionary dictionaryUNL = new Dictionary();
         
         if (query && translation) {
            
            querySet =  dictionaryUNL.translateListToUNL (queryList, queryLanguage);
            
            out.println("<br>Query in UNL :<font color=\"blue\"> ");    // TEST
            printList (querySet, out);
            out.println("</font><br>");
            
            // if the query is empty stop processing by setting query to false
            if ( querySet.isEmpty() ) {
               query = false;
            }
            
         } // Translation of query to UNL


         /*
            Expand query
         */

         // to be expanded the query has to be in UNL, that is translated
         if (query && translation && expansion) {
            
            // Initialize Thesaurus
            Thesaurus thesaurusUNL = new Thesaurus();
            
            // Expand query
            querySet = thesaurusUNL.expand (querySet);
            
            out.println("<br>Query expanded :<font color=\"blue\"> ");    // TEST
            printList (querySet, out);
            out.println(" </font><br>");
            
            // if the query is empty stop processing by setting query to false
            if ( querySet.isEmpty() ) {
               query = false;
            }
            
         } // Query expansion

         
         /*
            Translate query to index language
         */
         
         if (query && translation) {

            querySet = dictionaryUNL.translateFromUNL (querySet, c.getIndexLanguage());
                    
            out.println("<br>Query in index language (Spanish) :<font color=\"blue\"> ");    // TEST
            printListWithLinks (querySet, out, c.getIndexLanguage());
            out.println("</font><br>");
            
            // if the query is empty stop processing by setting query to false
            if ( querySet.isEmpty() ) {
               query = false;
            }
            
         } // Translation of query to index language


         /*
            Search
         */
         if (query)  {
               
            out.println("<hr>");
            
            SearchModule search = new SearchModule();
            
            Query myquery;
            if (phrase) {
               myquery = search.constructQuery (queryString, queryLanguage);
            } else {
               myquery = search.constructQuery (querySet);
            }
         
            out.println("<br>Results found for :  <font color=\"green\"> ");    // TEST
            String myqueryString = myquery.toString();
            out.println(myqueryString); // TEST
            out.println("</font><br>");

            Date startSearchDate = new Date();
            Hits hits = search.searchDocuments(myquery);            
            Date endDate = new Date();

            
            /*
               Show results
            */

            // Print some statistics
            out.println("Preprocessing time: "+(startSearchDate.getTime()-startDate.getTime())+"ms<br>");
            out.println("Search time: "+(endDate.getTime()-startSearchDate.getTime())+"ms<br>");
            out.println(hits.length() + " total matching documents<br><br>");

            // Get from where to start and where to end showing documents
            String startString = request.getParameter("start");
            int start;
            try{
               start = Integer.parseInt(startString);
               if (start < 0) {
                  start = 0;
               }
            } catch (Exception e) {
               // we didn't have the parameters, so it's the first run for this query
               start = 0;
            }
            int end = Math.min(hits.length(), start + c.getHitsPerPage());

            // Initialize highlighter
            Highlighter highlighter = new Highlighter(new SimpleHTMLFormatter(), 
                  new QueryScorer(myquery, c.getField()));          
            highlighter.setTextFragmenter(new SimpleFragmenter(50));
            
            // Print hits
            for (int i = start; i < end; i++) {
               Document doc = hits.doc(i);
               String path = doc.get("path");
               if (path != null) {
                  path = path.trim();
                  path = path.replaceFirst(c.getDocsLocation(), c.getWebLocation());
                  path = path.replace("\\", "/"); // for Windows
               } else {
                  path = "";
               }
               out.println((i+1) + ". <a href=\"http://" + path + "\">");
               String title = doc.get("title");
               if (title != null && title.length() != -1) {
                  title = title.trim();
                  out.println(title);
               } else {
                  out.println(path); // path is never null here
               }
               out.println("</a><br>");
               
               // Print out highlighted fragments
               // - this is very crude still - 
               String text = doc.get("summary");
               int maxNumFragmentsRequired = 10;
               String fragmentSeparator = " ... ";
               MultilingAnalyzer indexLanguageAnalyzer = 
                     new patrilex.MultilingAnalyzer(c.getIndexLanguage());
               TokenStream tokenStream = 
                     indexLanguageAnalyzer.tokenStream(c.getField(), new StringReader(text));

               String result =
                        highlighter.getBestFragments(
                        tokenStream,
                        text,
                        maxNumFragmentsRequired,
                        fragmentSeparator);
               out.println(fragmentSeparator + result + fragmentSeparator + "<br>");
               
            } // for (int i = start; i < end; i++) 
            
            // Show navigation for results
            if ( start > 0) {
               String lessurl = "search?query="
                     + encodeURL(myqueryString)
                     + "&amp;language=" + c.getIndexLanguage()
                     + "&amp;start=" + (start - c.getHitsPerPage())
                     + "&amp;mode=3";
               out.println("<a href=\"" + lessurl + "\">< Back ...</a>");
            }
            if ( (start + c.getHitsPerPage()) < hits.length()) {
               String moreurl = "search?query="
                     + encodeURL(myqueryString)
                     + "&amp;language=" +c.getIndexLanguage()
                     + "&amp;start=" + (start + c.getHitsPerPage())
                     + "&amp;mode=3";
               out.println("<a href=\"" + moreurl + "\">More ></a>");
            }
            
         } // Search & Results
         

         filePath = c.getHtmlRoot() + File.separator + c.getFooterfile();
         printHTML (filePath, out);

         
      } catch (Exception e) {
         out.println("<br><br><br><font color=red>"); 
         out.println("AN ERROR OCURRED: ");
         out.println(e.getMessage()); 
         e.printStackTrace(out);
         out.println("</font><br>");
         String filePath = c.getHtmlRoot() + File.separator + c.getFooterfile();
         printHTML (filePath, out);
      }
    }


   /** 
      Method doPost
   
      Calls on doGet.
   */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
      doGet(request, response);
    }

}

