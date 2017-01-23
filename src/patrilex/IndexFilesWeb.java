// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class IndexFilesWeb

Provides functions for creating and updating the index.

File types that are put in the index are .txt, .html, .htm and .pdf.
PDFs are parsed with PDFbox, so only files that can be parsed with it
are added to the index (this does NOT include scanned documents).

The location of the documents and the index are to be set in 
the class Constants.

*/

package patrilex;


import java.util.Date;
import java.util.Arrays;
import org.apache.lucene.index.Term;
import org.apache.lucene.index.TermEnum;

import java.io.File;
import java.io.Reader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.StringReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.Field.Index;

// for creating documents out of HTML files
import org.apache.lucene.demo.html.HTMLParser;

// for creating documents out of PDF files
import org.pdfbox.pdfparser.PDFParser;
import org.pdfbox.cos.COSDocument;
import org.pdfbox.util.PDFTextStripper;
import org.pdfbox.pdmodel.PDDocument;


/** Class providing functions for managing the index. */
public class IndexFilesWeb {


   /** 
      Separator of files, / on Linux, \ on Windows
   */
   private char dirSep = System.getProperty("file.separator").charAt(0);

   
   /** 
      A few bad global variables
   */
   private IndexWriter writer; 
   private IndexReader reader;
   private TermEnum uidIter;
   private Constants c = new Constants(); // global variables in patrilex

   
   /** 
      Method createIndex
   
      Creates a new index.
      The index is created at the location specified as IndexLocation in the
      constants class.
      It is created from the documents specified as DocsLocation in the
      constants class.
      If the parameter 'verbose' is true, the path of every document that is
      indexed is printed out.
      
   */
   public void createIndex (Boolean verbose) {
      try {         

         Date start = new Date();
         
         String indexLocation = c.getIndexLocation();
         File docsLocation = new File(c.getDocsLocation());
         
         if (!docsLocation.exists() || !docsLocation.canRead()) {
            System.out.println("Document directory does not exist or is not readable, please check the path");
            return;
         }

         // Initialize an IndexWriter for creating a new index
         writer = new IndexWriter 
               (indexLocation, new MultilingAnalyzer(c.getIndexLanguage()), true);
         writer.setMaxFieldLength(1000000); // just a random number

         // Index documents
         System.out.println("Indexing to directory '" + indexLocation + "'...");
         indexDocs (docsLocation, verbose);

         // Optimize the index
         System.out.println("Optimizing index...");
         writer.optimize();
         writer.close();

         Date end = new Date();

         System.out.println("Time for indexation: " + (end.getTime() - start.getTime()) + " ms");

      } catch (Exception e) {
         System.out.println(" caught a " + e.getClass() +
          "\n with message: " + e.getMessage());
    }
  }
  
  
   /** 
      Method indexDocs
   
      Indexes documents for a newly created index.
      Only documents ending in .html, .htm, .txt and .pdf
      are considered.
  
   */
   private void indexDocs (File file, Boolean verbose) throws Exception {
      // Directories
      if (file.isDirectory()) {
         String[] files = file.list();		  // list its files
         Arrays.sort(files);			  // sort the files
         for (int i = 0; i < files.length; i++) {	  // recursively index them
            indexDocs(new File(file, files[i]), verbose);
         }
         
      // Files
      } else if (file.getPath().endsWith(".html") ||
                  file.getPath().endsWith(".htm") ||
                  file.getPath().endsWith(".txt") ||
                  file.getPath().endsWith(".pdf")) {
                     
         Document doc = makeDoc (file);
         
         if (verbose) {
            System.out.println("adding " + doc.get("path"));
         }
         writer.addDocument(doc);
      }
   } //  private void newIndexDocs (File file)
   
   
   
   /** 
      Method updateIndex
   
      Updates an index.
      The index must be at the location specified as IndexLocation in the
      constants class.
      It is created from the documents specified as DocsLocation in the
      constants class.
      If the parameter 'verbose' is true, the path of every document that is
      deleted or added is printed out.
      
   */
   public void updateIndex (Boolean verbose) {

      try {
         // Open a reader and writer for existing index
         String indexLocation = c.getIndexLocation();
         reader = IndexReader.open(indexLocation);
         writer = new IndexWriter 
               (indexLocation, new MultilingAnalyzer(c.getIndexLanguage()), false);
         writer.setMaxFieldLength(1000000); // just a random number
         uidIter = reader.terms(new Term("uid", "")); // init uid iterator
         
         File docsLocation = new File(c.getDocsLocation());
         if (!docsLocation.exists() || !docsLocation.canRead()) {
            System.out.println("Document directory does not exist or is not readable, please check the path");
            return;
         }

         updateDocs(docsLocation, verbose);

         // We are at the end of the documents, but there are still some in the index
         // -> delete
         while (uidIter != null && uidIter.term() != null && uidIter.term().field() == "uid") {
            if (verbose) {
               System.out.println("deleting " + uid2url(uidIter.term().text()));
            }
            reader.deleteDocuments(uidIter.term());
            uidIter.next();
         }

         uidIter.close();
         reader.close();
         writer.close();
      } catch (Exception e) {
         System.out.println(" caught a " + e.getClass() +
          "\n with message: " + e.getMessage());
      }
   } //    public void updateIndex (Boolean verbose)
   
   
   private void updateDocs (File file, Boolean verbose) throws Exception {
      
      // Directories
      if (file.isDirectory()) {
         String[] files = file.list();		  // list its files
         Arrays.sort(files);			  // sort the files
         for (int i = 0; i < files.length; i++) {	  // recursively index them
            updateDocs(new File(file, files[i]), verbose);
         }
         
      // Files
      } else if (file.getPath().endsWith(".html") ||
                     file.getPath().endsWith(".htm") ||
                     file.getPath().endsWith(".txt") ||
                  file.getPath().endsWith(".pdf")) {

         if (uidIter != null) {
            // Construct uid for doc
            String uid = uid(file);

            // Documents before the current uid
            // -> delete
            while (uidIter.term() != null && uidIter.term().field() == "uid" &&
                        uidIter.term().text().compareTo(uid) < 0) {
               if (verbose) {
                  System.out.println("deleting " + uid2url(uidIter.term().text()));
               }
               reader.deleteDocuments(uidIter.term());
               uidIter.next();
            }
               
            // Document with the current uid does already exist
            // -> keep it
            if (uidIter.term() != null && uidIter.term().field() == "uid" &&
                     uidIter.term().text().compareTo(uid) == 0) {
               uidIter.next();			  // keep matching docs
               
            // The document is not yet in the index
            // -> add it
            } else {
               Document doc = makeDoc (file);
               if (verbose) {
                  System.out.println("adding " + doc.get("path"));
               }
               writer.addDocument(doc);
            }
         } else {
            // we are at the end of the index
            Document doc = makeDoc (file);
            if (verbose) {
               System.out.println("adding " + doc.get("path"));
            }
            writer.addDocument(doc);
         }

      } // if (file.isDirectory()) {} else if ends with .html
      
   } //  private static void updateDocs (File file) {

   
   /** 
      Method makeDoc
   
      Creates a Document out of a file, depending on its ending.
  
   */
   private Document makeDoc (File file) {
      try {
         if ( file.getPath().endsWith(".html") || file.getPath().endsWith(".html") ) {
            // HTML files
            return makeHTMLDocument(file);
         } else if (file.getPath().endsWith(".txt")){ // txt files
            return makeTextDocument(file);
         } 
         else { // pdf files
            return makePDFDocument(file);
         }
      } catch (FileNotFoundException e) {
         return new Document();
      }
   }
   
   
   /** 
      Method makeTextDocument
   
      Creates a Document out of a text file.
   
      path: path of file
      modified: modification date
      uid: uid
      contents: contents of the file
      summary: first 50 lines
      title: filename without termination
  
   */
   private Document makeTextDocument (File file) throws FileNotFoundException {
      
      int summaryLength = 50; // first how many lines of the file create summary
      String summary = "";
      int linecount = 0;
      try {
         String line = null;
         FileInputStream fis = new FileInputStream(file);
         InputStreamReader isr = new InputStreamReader(fis, c.getEncoding());
         BufferedReader inputFile = new BufferedReader(isr);
         while ( (( line = inputFile.readLine()) != null) && (linecount < summaryLength) ) {
            summary += line;
            linecount++;
         }
      } catch (IOException e) {
         System.out.println (e.getMessage());
      }
      
      String path = file.getPath();
      String title = path.substring(path.lastIndexOf('/')+1, path.lastIndexOf('.'));

      return makeDocument (file, new FileReader(file), summary, title);
   }
   
   
   /** 
      Method makeHTMLDocument
   
      Creates a Document out of a HTML file.
   
      path: path of file
      modified: modification date
      uid: uid
      contents: raw contents of the file
      summary: first 200 characters of raw text
      title: HTML Tag <title>
   
   */
   private Document makeHTMLDocument (File file) throws FileNotFoundException {

      FileInputStream fis = new FileInputStream(file);
      HTMLParser parser = new HTMLParser(fis);
      
      Reader contents = null;
      String summary = "";
      String title = "";
      try {
         contents = parser.getReader();
         summary = parser.getSummary();
         title = parser.getTitle();
      } catch (IOException e) {
         System.out.println (e.getMessage());
      } catch (InterruptedException e) {
         System.out.println (e.getMessage());
      }
      
      return makeDocument (file, contents, summary, title);
  }
  
  
   /** 
      Method makePDFDocument
   
      Creates a Document out of a PDF file.
      
      path: path of file
      modified: modification date
      uid: uid
      contents: raw contents of the file
      summary: first 500 characters of content
      title: filename without termination
  
   */
   private Document makePDFDocument (File file) throws FileNotFoundException {
      String text = "";
      try {
         FileInputStream fi = new FileInputStream(file);
         PDFParser parser = new PDFParser(fi);
         parser.parse();
         PDDocument doc = parser.getPDDocument();
         PDFTextStripper stripper = new PDFTextStripper();
         text = stripper.getText(doc);
         doc.close();
      } catch (IOException e) {
         System.out.println (e.getMessage());
      }
      
      String path = file.getPath();
      String title = path.substring(path.lastIndexOf('/')+1, path.lastIndexOf('.'));
      
      return makeDocument (file, new StringReader(text), "", title);
  }

   
   /** 
      Method makeDocument
   
      Creates a Document with different fields.
      
      path: stored, indexed, not analyzed
      modified: stored, indexed, not analyzed
      uid: not stored, indexed, not analyzed
      contents: not stored, indexed, tokenized
      summary: stored, not indexed
      title: stored, indexed, tokenized
  
   */
   private Document makeDocument (File file, Reader contents, String summary, String title) {

      Document doc = new Document();
      
      String path = file.getPath();
      doc.add(new Field("path", path.replace(dirSep, '/'), 
            Store.YES, Field.Index.UN_TOKENIZED));

      doc.add(new Field("modified", Long.toString(file.lastModified()),
            Store.YES, Field.Index.UN_TOKENIZED));

      doc.add(new Field("uid", uid(file), 
            Store.NO, Index.UN_TOKENIZED));

      doc.add(new Field("contents", contents));
      
      doc.add(new Field("summary", summary,
            Store.YES, Index.NO));
      
      doc.add(new Field("title", title,
            Store.YES, Index.TOKENIZED));
      
      return doc;
   }
  
   
   /** 
      Method uid
   
      Creates a unique ID for every file.
   
      Appends path and date into a string in such a way that lexicographic
      sorting gives the same results as a walk of the file hierarchy.  Thus
      null (\u0000) is used both to separate directory components and to
      separate the path from the date.
  
   */
   private String uid(File f) {

      return f.getPath().replace(dirSep, '\u0000') +
            "\u0000" +
            f.lastModified();
   }
   
   
   /** 
      Method uid2url
   
      Creates an URL (path)   from an UID.
  
   */
   private String uid2url(String uid) {
      String url = uid.replace('\u0000', '/');	  // replace nulls with slashes
      return url.substring(0, url.lastIndexOf('/')); // remove date from end
   }
   
}
