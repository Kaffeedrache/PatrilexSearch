// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class SearchModule

This module has two main functions. It constructs a query 
and runs a search on the index.

The query construction out of a Set converts every term of
the set (which may consiste of multiple words separated with
whitespaces) in a phrase query. All phrase queries are joined
with 'OR'.

The query construction out of a String uses the full power
of the QueryParser.

The search does nothing more than send the query to the
Index and return the hits.

*/

package patrilex;


import java.io.IOException;

import java.util.Iterator;
import org.apache.lucene.analysis.CharArraySet;

import org.apache.lucene.search.PhraseQuery;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.index.Term;
import java.util.regex.Pattern;

import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.queryParser.ParseException;
  
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.Searcher;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.Hits;


/** Class responsible for constructing a query and searching the index */
public class SearchModule {
   

   /**
      Global constants file
   */
   private Constants c;
   
   
   /**
      Constructor initializes the constants.
   */
   public SearchModule () {
      c = new Constants();
   }


   /**
      Method constructQuery
      
      Constructs a query out of a Set of Strings.
      Converts every term of the set (which may consist
      of multiple words separated with whitespaces) in a 
      phrase query.
      All phrase queries are joined with 'OR'.
      There are no special weightings done.
      
   */
   public Query constructQuery (CharArraySet querySet) {
   
      BooleanQuery myquery = new BooleanQuery ();
            
      Iterator li = querySet.iterator();
      while (li.hasNext()) {
         
         // Every item of the set is a phrase query
         PhraseQuery pquery = new PhraseQuery ();
         String line = li.next().toString();
         
         // Add every word of the string to the query
         // as one term (word are seperated by " ")
         Pattern pattern = Pattern.compile(" ");
         String[] items = pattern.split(line);
         for (int i=0; i<items.length; i++) {
            Term newterm = new Term(c.getField(), items[i]);
            pquery.add(newterm);
         }
         
         // Add the phrase query to the big query
         myquery.add( pquery, BooleanClause.Occur.SHOULD);
         
      }      
      
      return myquery;
   
   }
   
   
   /**
      Method constructQuery
      
      Constructs a query out of a String.
      Uses the Lucene QueryParser, 
      see Lucene documentation for syntax.
      
   */
   public Query constructQuery (String query, Language language) {
      try {
         MultilingAnalyzer analyzer = new MultilingAnalyzer(language);
         QueryParser parser = new QueryParser(c.getField(), analyzer);
         Query myquery = parser.parse(query);
      
         return myquery;     
      } catch (ParseException e) {
         return null;
      }
      
   }
   
   
   /**
      Method searchDocuments
      
      Searches for documents matching the query and returns them.
      
   */
   public Hits searchDocuments (Query query) throws IOException {
      
      // Open the index, initialise Searcher and QueryParser
      IndexReader reader = IndexReader.open( c.getIndexLocation() );
      Searcher searcher = new IndexSearcher(reader);
      
      return searcher.search(query);

   }


}
