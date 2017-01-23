// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class Thesaurus

This class provides functionality for the expansion of a query.

Expansion is possible with synonymes or using hierarchy relations.
Hierarchy relations are 'father', that means if A father of B, A is a
more general term than B, and 'son', that means if B is a son of A 
again A is a more general term as B and B is a more specific term
as A.

A term may have as many sons as the database restrictions permits
and also as many fathers. If the resulting structure is a valid and
sensible thesaurus the expert has to decide.

The thesaurus is stored in a database, the access is done 
via the class 'DatabaseOperations'.

*/

package patrilex;


import java.sql.*;

import java.util.LinkedList;
import java.util.Iterator;
import org.apache.lucene.analysis.CharArraySet;


/** Class providing functions for the expansion of a query */
public class Thesaurus {
   

   // Connection to the Database containing the dictionary
   private static DatabaseOperations database;
      
   
   /**
      Constructor without an existing connection to the
      dictionary database. Connection is created.
   */
   public Thesaurus () {
      database = new DatabaseOperations();
      try {
         database.connect();
         System.out.println("Connected to Dictionary DB");
      } catch (SQLException e) {
         System.out.println("ERROR !!! Something went wrong while connecting to the DB");
         System.out.println (e.getMessage());
         System.exit(1);
      } catch (ClassNotFoundException e) {
         System.out.println("ERROR !!! Something wrong with the database driver");
         System.exit(1);
      }
   }
   
   
   /**
      Constructor with an existing connection to the
      dictionary database.
   */
   public Thesaurus (DatabaseOperations db) {
      database = db;
      if ( db == null ) {
         database = new DatabaseOperations();
      }
      if ( !database.connected() ) {
         try {
            database.connect();
         } catch (SQLException e) {
            System.out.println("ERROR !!! Something went wrong while connecting to the DB");
            System.out.println (e.getMessage());
            System.exit(1);
         } catch (ClassNotFoundException e) {
            System.out.println("ERROR !!! Something wrong with the database driver");
            System.exit(1);
         }
      }
   }
   
   
   /**
      Method expand
   
      Calls the default expansion method.
      The default is expanding by synonymes as well as
      by direct sons.
   */
   public CharArraySet expand (CharArraySet query) {
      
      query = expandBySynonymes (query);
      query = expandBySons (query);
      
      return query;  
   
   }
   

   /**
      Method expandBySynonymes
   
      Finds synonymes for every word in the query.
      Synonymes can be father or son of other synonymes.
   */
   public CharArraySet expandBySynonymes (CharArraySet query) {
      if (query != null) {
         Iterator iterator = query.iterator();
         while (iterator.hasNext()) {
            String word = iterator.next().toString();
            ResultSet rs = database.getSynFathers (word);
            LinkedList relatedWords = toList (rs, 1);
            query.addAll (relatedWords);
            rs = database.getSynSons (word);
            relatedWords = toList (rs, 2);
            query.addAll (relatedWords);
         }
      }
      return query;
   }
   

   /**
      Method expandBySons
   
      Finds the direct sons of every word in the query
      and expands the query with them.
   */
   public CharArraySet expandBySons (CharArraySet query) {
      return expandDown (query, 1);
   }
   
   
   /**
      Method expandByGrandsons
   
      Finds the direct sons and the grandsons (sons of sons)
      of every word in the query and expands the query with them.
   */
   public CharArraySet expandByGrandsons (CharArraySet query) {
      return expandDown (query, 2);
   }
   

   /**
      Method expandByFathers
   
      Finds the direct fathers
      of every word in the query and expands the query with them.
   */
   public CharArraySet expandByFathers (CharArraySet query) {
      return expandUp (query, 1);
   }
   

   /**
      Method expandByGrandfathers
   
      Finds the direct fathers and the fathers of the fathers (grandfathers)
      of every word in the query and expands the query with them.
   */
   public CharArraySet expandByGrandfathers (CharArraySet query) {
      return expandUp (query, 2);
   }
   
   
   /**
      Method expandDown
   
      Expands downwards for every word in the query for 'level' levels.
   */   
   private CharArraySet expandDown (CharArraySet query, int level) {
      if (query != null) {
         CharArraySet toexpand = new CharArraySet (query, true);
         Iterator iterator = toexpand.iterator();
         while (iterator.hasNext()) {
            CharArraySet expansion = expandDown(iterator.next().toString(), level); 
            query.addAll (expansion);
         }
      }
      return query;
   }
   
   
   /**
      Method expandDown
   
      Generic method to expande 'level' levels downwards from a
      string. Ends when a word has no more sons or all sons are
      already contained in the result.
   */   
   private CharArraySet expandDown (String word, int level) {

      if (level == 0) { // end of recursion
         return null;
      } else {
         // Add actual word to list
         CharArraySet result = new CharArraySet(2, true);
         result.add(word);
         
         // Get Sons
         // For every son call self recursively with level-1
         // and add result to list
         ResultSet rs = database.getSons (word);
         if (rs != null) {
            CharArraySet sons = toSet (rs, 2);
            Iterator iterator = sons.iterator();
            while (iterator.hasNext()) {
               String son = iterator.next().toString();
               if (!result.contains(son)) {
                  CharArraySet sonlist = expandDown(son, level-1);
                  if (sonlist != null) {
                     result.addAll(sonlist);
                  } else {
                     result.add(son);
                  }
               }
            } // while (iterator.hasNext()) {
         } //  if (rs != null) {
         
         return result;
      } // if (level == 0) {
   }
   
   
   /**
      Method expandUp
   
      Expands upwards for every word in the query for 'level' levels.
   */   
   private CharArraySet expandUp (CharArraySet query, int level) {
      Iterator iterator = query.iterator();
      while (iterator.hasNext()) {
         CharArraySet expansion = expandUp (iterator.next().toString(), level); 
         query.addAll (expansion);
      }
      return query;
   }
   

   /**
      Method expandUp
   
      Generic method to expande 'level' levels upwards from a
      string. Ends when a word has no more fathers or all fathers are
      already contained in the result (this should not happen
      with a sane structure, but who knows).
   */   
   private CharArraySet expandUp (String word, int level) {

      if (level == 0) { // end of recursion
         return null;
      } else {
         // Add actual word to list
         CharArraySet result = new CharArraySet(2, true);
         result.add(word);
         
         // Get fathers
         // For every father call self recursively with level-1
         // and add result to list
         ResultSet rs = database.getFathers (word);
         if (rs != null) {
            CharArraySet fathers = toSet (rs, 1);
            Iterator iterator = fathers.iterator();
            while (iterator.hasNext()) {
               String father = iterator.next().toString();
               if (!result.contains(father)) {
                  CharArraySet fatherlist = expandUp(father, level-1);
                  if (fatherlist != null) {
                     result.addAll(fatherlist);
                  } else {
                     result.add(father);
                  }
               }
            } // while (iterator.hasNext()) {
         } //  if (rs != null) {
         
         return result;
      } // if (level == 0) {
   }
   
   
   /**
      Method toSet
   
      Small method to convert a ResultSet to a CharArraySet
      taking only the relevant part out of the set (indicated via
      the number of column by the parameter which)
   */   
   private CharArraySet toSet (ResultSet rs, int which) {
      CharArraySet newOne = new CharArraySet (2,true);
      try {
         if (rs != null) {
            while( rs.next() ){
               newOne.add(rs.getString(which));
            }
         }
      }
      catch (SQLException e) {
         System.out.println(e.getMessage());
      }
      return newOne;
   }
   
   
   /**
      Method toList
   
      Small method to convert a ResultSet to a LinkedList
      taking only the relevant part out of the set (indicated via
      the number of column by the parameter which)
   */   
   private LinkedList toList (ResultSet rs, int which) {
      LinkedList newOne = new LinkedList();
      try {
         if (rs != null) {
            while( rs.next() ){
               newOne.add(rs.getString(which));
            }
         }
      }
      catch (SQLException e) {
         System.out.println(e.getMessage());
      }
      return newOne;
   }
   
   
}
