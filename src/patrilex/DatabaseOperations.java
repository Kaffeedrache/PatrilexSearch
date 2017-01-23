// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class DatabaseOperations

This package provides some functions for accessing the database where
the dictionary and the thesaurus is stored.

The scheme of the database is as follows:
Tablename = Name of Language (p.e. 'ES')
Columns names = 'unl' for the column with the unl entry
   'other' for the column with the entry in the language
Everything should be encoded in UTF8 (check the database settings!!)

If any method is called while there is no open connection a 
NullPointerException will be thrown. This is not catched because it would
lead to a lot of trouble...

*/

package patrilex;


import java.sql.*;
import java.util.regex.Pattern;


/** Implements some basic functions for accessing the DB */ 
public class DatabaseOperations {
   

   
   /**
      Name of the tables that contain the thesaurus
   */
   private String thesaurusHierTable = "thesaurus_hier";
   private String thesaurusSynTable = "thesaurus_syn";
   
   /**
      Name of the suffix to add to a language mapping table
   */
   private String mapSuffix = "_map";
   
   
   /**
      Global variables for connection, statement and constants
   */
   private Connection con;
   private Statement stmt;
   private Constants c;
   
   
   /*
      Methods for managing the connection
      ----------------------------------------------------------------------------------
   */
   
   /** 
      Method connect
   
      Opens a database and creates a connection to it and
      a statement.
   
      Throws: 
      ClassNotFoundException: if DB-driver is not found
      SQLException: if some problem connecting occurs
   */
   public void connect () throws ClassNotFoundException, SQLException {
      
      c = new Constants();
      
      // Specify jdbc-driver
      // may throw ClassNotFoundException
      Class.forName( c.getDriver() );

      // Open connection
      con = DriverManager.getConnection(c.getLocation(), c.getUser(), c.getPassword());

      // Create a statment
      stmt = con.createStatement();
   
      // Set the connection to work with utf8
      stmt.executeQuery("Set names 'utf8';");

   }
   
   /** 
      Method connected
   
      Checks if a connection to the DB is existing.
   
   */
   public Boolean connected () {
      
      return (con != null) && (stmt != null);

   }
   
   /** 
      Method closeConnection
   
      Closes the connection to the database.
   
   */
   public void closeConnection () {
      
      try {
         stmt.close();
         con.close();
      }
      catch ( SQLException e ){
      } 
   }
  
   
   /*
      Methods for managing the dictionary
      ----------------------------------------------------------------------------------
   */
   
   
   // Methods for managing tables of the dictionary
   
   /** 
      Method createDictTable
   
      Creates the dictionary table for the specified language
      if it doesn't already exists.
   
   */ 
   public Boolean createDictTable (Language language, int languagewidth) {
   
      return createTable (language.toString(), languagewidth, 0);
      
   }
   
   /** 
      Method deleteDictTable
   
      Deletes the dictionary table of the specified language
      if it exists.
   
   */ 
   public void deleteDictTable (Language language) {
   
      deleteTable (language.toString());
   }
   
   /** 
      Method dictTableExists
   
      Returns true if the dictionary table exists,
      else false.
   
   */ 
   public Boolean dictTableExists (Language language) {
      
      return tableExists (language.toString());
   
   }
   
   
   // Methods for managing entries of the dictionary
   
   /** 
      Method addDictEntry
   
      Adds an entry with the values of (unl, language)
      to the table specified by 'tablename'.
   
      Returns 'true' in the event of successfully
      adding the entry,
      'false' if some error ocurred and the entry
      could not be added.
   */
   public Boolean addDictEntry (Language tablename, String unl, String other) {
   
      return addEntry (tablename.toString(), unl, other);
   
   }
   
   /** 
      Method deleteDictEntry
   
      Deletes all entries with the values of (unl, last)
      of the dictionary table of the specified language.
   
      Returns the number of deleted entries, 0 if there
      was none deleted or an exception ocurred.
   
   */   
   public int deleteDictEntry (Language tablename, String unl, String other) {
      
      return deleteEntry (tablename.toString(), unl, other, 0);
      
   }
   
   /** 
      Method GetEntryByUnl
   
      Returns a list of all entries of the table
      where the 'unl' column has the value of
      the parameter 'unl'
      (wich may not contain any entries, in this case
      the void ResultSet is returned).
   
      Returns null in case of error.
   
   */ 
   public ResultSet getEntryByUnl (Language tablename, String unl) {
      
      return getByAttribute (tablename.toString(), "unl", unl);
      
   }
   
   /** 
      Method GetEntryByOther
   
      Returns a list of all entries of the table
      where the 'other' column has the value of
      the parameter 'other'
      (wich may not contain any entries, in this case
      the void ResultSet is returned).
   
      Returns null in case of error.
   
   */ 
   public ResultSet getEntryByOther (Language tablename, String other) {
      
      return getByAttribute (tablename.toString(), "other", other);
      
   }
   
   /** 
      Method getAllDictEntries
   
      Returns a list of all entries of the table.
   
      Returns null in case of error.
   
   */ 
   public ResultSet getAllDictEntries (Language tablename) {
      
      return getList (tablename.toString());
      
   }
   
   
   /*
      Methods for managing the thesaurus translation
      ----------------------------------------------------------------------------------
   */
   
   
   // Methods for manipulating tables for translation of thesaurus
   
   /** 
      Method createMapping
   
      Creates a mapping table for a the translation of a language.
      If there was a mapping for the same language existing, it is
      deleted previously.
   
   */ 
   public Boolean createMapping (Language language, int languagewidth) {
   
      deleteMapping (language);
      
      return createTable ( language.toString() + mapSuffix, languagewidth, 1);
   
   }
   
   /** 
      Method deleteMapping
   
      Deletes a mapping for the specified language.
   
   */ 
   public void deleteMapping (Language language) {
   
      deleteTable (language.toString() + mapSuffix);
   
   }
   
   /** 
      Method mappingExists
   
      Returns true if the mapping exists, else false.
   
   */ 
   public Boolean mappingExists (Language language) {
      
      return tableExists (language.toString() + mapSuffix);
   
   }
   
   
   // Methods for manipulating data inside of mapping tables

   /** 
      Method addMapEntry
   
      Adds an entry with the values of (unl, language)
      to the mapping table of the language.
   
      Returns 'true' in the event of successfully
      adding the entry,
      'false' if some error ocurred and the entry
      could not be added.

   
   */
   public Boolean addMapEntry (Language language, String unl, String other) {
   
      return addEntry (language.toString() + mapSuffix, unl, other);
   
   }
   
   /** 
      Method deleteMapEntry
   
      Deletes all entries with the values of (unl, last)
      of the mapping table of the specified language.
   
      Returns the number of deleted entries, 0 if there
      was none deleted or an exception ocurred.
   
   */   
   public int deleteMapEntry (Language tablename, String unl, String other) {
      
      return deleteEntry (tablename.toString() + mapSuffix, unl, other, 1);
      
   }
   
   /** 
      Method GetMapEntry
   
      Returns the corresponding unl entry 
      to 'word' of the mapping table
      (mappings are unique!).
   
      Returns null in case of error.
   
   */ 
   public String getMapEntry (Language tablename, String word) {
      
      return getByAttributeUnique (tablename.toString() + mapSuffix, "other", word);
      
   }
   
   /** 
      Method GetMapEntry
   
      Returns the corresponding unl entry 
      to 'word' of the mapping table
      (mappings are unique!).
   
      Returns null in case of error.
   
   */ 
   public ResultSet getAllMapEntries (Language tablename) {
      
      return getList (tablename.toString() + mapSuffix);
      
   }
   
   
   
   /*
      Methods for managing the thesaurus
      ----------------------------------------------------------------------------------
   */
   
   
   // Methods for manipulating tables for the thesaurus
   
   /** 
      Method createThesaurus
      
      Creates a thesaurus with tables for synonymy and
      hierarchy. A previously existing thesaurus will
      be deleted.
   
   */ 
   public Boolean createThesaurus () {
   
      deleteThesaurus();
      
      return createTable ( thesaurusHierTable, 0, 2) 
            && createTable ( thesaurusSynTable, 0, 2);
   
   }
   
   /** 
      Method DeleteThesaurus
   
      Deletes the thesaurus synonymy and hierarchy tables.
   
   */ 
   public void deleteThesaurus () {
   
      deleteTable ( thesaurusHierTable );
      deleteTable ( thesaurusSynTable );
   
   }
   
   /** 
      Method thesaurusExists
   
      Returns true if both thesaurus tables exists, else false.
   
   */ 
   public Boolean thesaurusExists () {
      
      return tableExists (thesaurusHierTable) && tableExists (thesaurusSynTable);
   
   }

   
   // Methods for manipulating data inside of tables for the thesaurus
   
   /**
      Method addHierEntry
   
      Adds an entry with the values of (father, son)
      to the thesaurus hierarchy table.
   
      Returns 'true' in the event of successfully
      adding the entry,
      'false' if some error ocurred and the entry
      could not be added.
   */
   public Boolean addHierEntry (String father, String son) {
   
      return addEntry (thesaurusHierTable, father, son);
   
   }

   /**
      Method addSynEntry
   
      Adds an entry with the values of (father, son)
      to the thesaurus synonymy table.
   
      Returns 'true' in the event of successfully
      adding the entry,
      'false' if some error ocurred and the entry
      could not be added.
   */
   public Boolean addSynEntry (String father, String son) {
   
      return addEntry (thesaurusSynTable, father, son);

   }
   
   /** 
      Method deleteHierEntry
   
      Deletes all entries with the values of (father, son)
      of the hierarchy table of the thesaurus.
   
      Returns the number of deleted entries, 0 if there
      was none deleted or an exception ocurred.
   
   */   
   public int deleteHierEntry (String father, String son) {
      
      return deleteEntry (thesaurusHierTable, father, son, 2);
      
   }
   
   /** 
      Method deleteHierEntry
   
      Deletes all entries with the values of (father, son)
      of the synonymy table of the thesaurus.
   
      Returns the number of deleted entries, 0 if there
      was none deleted or an exception ocurred.
   
   */   
   public int deleteSynEntry (String father, String son) {
      
      return deleteEntry (thesaurusSynTable, father, son, 2);
      
   }
   
   /** 
      Method getSons
   
      Returns a list of all entries of the table
      where the 'father' column has the value of
      the parameter 'unl'
      (wich may not contain any entries, in this case
      the void ResultSet is returned).
   
      Returns null in case of error.
   
   */ 
   public ResultSet getSons (String unl) {

      return getByAttribute (thesaurusHierTable, "father", unl);

   }
   
   /** 
      Method getFathers
   
      Returns a list of all entries of the table
      where the 'son' column has the value of
      the parameter 'unl'
      (wich may not contain any entries, in this case
      the void ResultSet is returned).
   
      Returns null in case of error.
   
   */ 
   public ResultSet getFathers (String unl) {

      return getByAttribute (thesaurusHierTable, "son", unl);

   }
   
   /** 
      Method getSynSons
   
      Returns a list of all entries of the table
      where the 'father' column has the value of
      the parameter 'unl'
      (wich may not contain any entries, in this case
      the void ResultSet is returned).
   
      Returns null in case of error.
   
   */ 
   public ResultSet getSynSons (String unl) {

      return getByAttribute (thesaurusSynTable, "father", unl);

   }
   
   /** 
      Method getSynFathers
   
      Returns a list of all entries of the table
      where the 'son' column has the value of
      the parameter 'unl'
      (wich may not contain any entries, in this case
      the void ResultSet is returned).
   
      Returns null in case of error.
   
   */ 
   public ResultSet getSynFathers (String unl) {

      return getByAttribute (thesaurusSynTable, "son", unl);

   }
   
   
   
   /*
      Generic methods
      ----------------------------------------------------------------------------------
   */
   
   
   // Methods for manipulating tables (generic)

   
   /** 
      Method createTable
   
      Creates a table with the name 'tablename'.
   
      Kind must be 0 (dictionary table), 1 (mapping)
      or 2 (thesaurus table).
   
      In case of a dictionary or a mapping table,
      the table has two columns, one for UNL
      (name 'unl' and width the longest possible UNL
      Expression as set in the global variable 'unlwidth')
      and one for the other language (name 'other' and
      width to be set by the user in 'languagewidth').
      In case of a thesaurus table the columns are 
      'father' and 'son', both of width 'unlwidth'.
   
      'true' is returned if the creation was successful, 
      else false (for example if the table already exists).
      
      Call upon this go via wrapper functions (see above).
   
   */ 
   private Boolean createTable (String tablename, int languagewidth, int kind) {
      
      // checking the tablename is not necessary, as this function can only
      // be called by wrapper functions.
      
      try{
         
         if (tableExists(tablename)) { //table already exists -> can't create it
            return false;
         } else { // table doesn't exist -> create it
            int count;
            switch (kind) {  
               case 0 : // Dictionary table
               case 1 : // Mapping table
                  count = stmt.executeUpdate("create table " + tablename + 
                     "( unl varchar(" + c.getUNLwidth() + ") CHARACTER SET Utf8, " +
                     "other varchar(" + languagewidth + ") CHARACTER SET Utf8 );");
                  return true;
               case 2 : // Thesaurus table
                  count = stmt.executeUpdate("create table " + tablename + 
                     "(" +
                     " father varchar(" + c.getUNLwidth() + ") CHARACTER SET Utf8," +
                     " son varchar(" + c.getUNLwidth() + ") CHARACTER SET Utf8" +
                     ");");
                  return true;
               default : // invalid kind
                  return false;
            }
            
         }
      }
      catch ( SQLException e ){ // if table already exists
         System.out.println(
               "Comand: " + "Create table type " + kind + " name " + tablename);
         System.out.println(e.getMessage()); 
         return false;
      }
   }
   
   
   /** 
      Method deleteTable
   
      Deletes the table with the name 'tablename',
      if it exists.
      
      Call upon this go via wrapper functions (see above).
   
   */ 
   private void deleteTable (String tablename) {
   
      try{

         int count = stmt.executeUpdate("drop table if exists " + tablename + ";");
         
      }
      catch ( SQLException e ){ // this should not happen
         System.out.println("Comand: " + "drop table if exists " + tablename);
         System.out.println(e.getMessage());
      }
   }
   
   
   /** 
      Method tableExists
   
      Returns true if the table exists, else false.
      
      Call upon this go via wrapper functions (see above).
   
   */ 
   private Boolean tableExists (String tablename) {
      
      try{ 
         
         ResultSet rs = stmt.executeQuery(" select 1 from Information_schema.tables where table_name='" + tablename + "' and table_schema='patrilex';");
         
         if (rs.next()) {
            return true;
         } else {
            return false;
         }
      }
      catch ( SQLException e ){
         System.out.println(e.getMessage());
         return false; 
      }   
   
   }
   
   
   /** 
      Method deleteAllTables
   
      Deletes ALL EXISTING tables!!
      No going back!!
      Use with care!!
   
      Returns the number of deleted tables or 0 in case of error.
   
   */ 
   public int deleteAllTables () {
      
      try{
         
         ResultSet rs = stmt.executeQuery("show tables;");
         
         // create an arry of Strings from the results
         // to save the entries there, because we can't 
         // change the data the resultset was made of
         int resultcount = 0;
         String[] oldresults = new String[resultcount];
         String[] results = new String[resultcount];
         
         if (rs != null) {
            while( rs.next() ){
               oldresults = results;
               results = new String[resultcount+1];
               for (int i=0; i<resultcount; i++) {
                  results[i] = oldresults[i];
               }
               results[resultcount] = rs.getString(1);
               resultcount++;
            }
         }    
       
         // Execute the drop table commands
         for (int i=0; i<resultcount; i++) {
            int count = stmt.executeUpdate("drop table if exists " + results[i] + ";");
         }         
         
         return resultcount;
         
      }
      catch ( SQLException e ){
         System.out.println(e.getMessage());
         return 0;
      }   
   
   }
   
   
   /** 
      Method listTables
   
      Returns a list of existing tables or null in the case of error.
   
   */ 
   public ResultSet listTables () {
      
      try{ 
         
         ResultSet rs = stmt.executeQuery("show tables;");
         
         return rs;
      }
      catch ( SQLException e ){
         System.out.println(e.getMessage());
         return null; // if possible change to void ResultSet
      }   
   
   }
 
   
   // Methods for manipulating data inside tables (generic)
   
   
   /** 
      Method addEntry
   
      Adds an entry to the specified table
      with the values (first, second).
      The entries are previously checked if they
      contain ' or " or any prohibited characters.
   
      Returns 'true' in the event of successfully
      adding the entry,
      'false' if some error ocurred and the entry
      could not be added.
      
      Call upon this go via wrapper functions (see above).
   
   */
   
   private Boolean addEntry (String tablename, String first, String second) {
      
      // we don't have to check on tablename, but check the inputs
      // to be inserted that they don't contain any
      // potencially malicious things.
      
      if ( tableExists(tablename) && check(first) && check(second) ) { 

         try{
            int count = stmt.executeUpdate("insert into " + tablename + " values ('" + first + "', '" + second + "');");

            if (count == 1) { // an entry was added
                return true;
            } else { // no entry was added
               return false;
            }
         }
         catch ( SQLException e ){ // no entry was added
            System.out.println("Comand: " + "insert into " + tablename + " values ('" + first + "', '" + second + "');");
            System.out.println(e.getMessage());
            return false;
         }
         
      } else { // table doesn't exist or inputs are not ok
         return false;
      }
      
   }
   
   
   /** 
      Method deleteEntry
   
      Deletes all entries with the values of (first, last)
      of the table specified by 'tablename'.
   
      Kind must be 0 (dictionary table), 1 (mapping)
      or 2 (thesaurus table).
   
      Returns the number of deleted entries, 0 if there
      was none deleted.
      Exceptions are catched and 0 is returned.
      
      Call upon this go via wrapper functions (see above).
   
   */   
   private int deleteEntry (String tablename, String first, String second, int kind) {
         
      if (tableExists(tablename) && check(first) && check(second)) {
         try {
            int count;
            switch (kind) {  
               case 0 : // Dictionary table
               case 1 : // Mapping table
                  count = stmt.executeUpdate("delete from " + tablename + " where unl='" + first + "' and other='" + second + "';");
                  return count;
               case 2 : // Thesaurus table
                  count = stmt.executeUpdate("delete from " + tablename + " where father='" + first + "' and son='" + second + "';");
                  return count;
               default : // invalid kind
                  return 0;
            }
            
         } catch ( SQLException e ){ // if table already exists
            System.out.println(
                  "Comand: " + "Delete from table type " + kind + " name " + tablename + "('" + first + "', '" + second + "');");
            System.out.println(e.getMessage());
            return 0;
         }
      } else {
         return 0;
      }
      
   }
   
   
   /** 
      Method getByAttribute
   
      Returns a list of all entries of the table
      where column 'attribute' has the value 'value'
      (wich may not contain any entries, in this case
      the void ResultSet is returned).
      Returns null in case of error.
      
      Call upon this go via wrapper functions (see above).
   
   */ 
   private ResultSet getByAttribute (String tablename, String attribute, String value) {
      
      // we don't have to check on tablename or attribute
      
      if (tableExists(tablename) && check(value)) {
         try{ 
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tablename + " WHERE " +attribute + "='" + value + "';");
            
            return rs;
         }
         catch ( SQLException e ){
            System.out.println("Comand: " + "SELECT * FROM " + tablename + " WHERE " +attribute + "='" + value + "';");
            System.out.println(e.getMessage());
            return null;
         }   
      } else {
         return null;
      }
   
   }
   
   
   /** 
      Method getByAttributeUnique
   
      Returns a the first found entry of the table
      where column 'attribute' has the value 'value'.
      Returns "" in case of error.
      
      Call upon this go via wrapper functions (see above).
   
   */ 
   private String getByAttributeUnique (String tablename, String attribute, String value) {
      
      // we don't have to check on tablename or attribute
      
      if (tableExists(tablename) && check(value)) {
         try{ 
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tablename + " WHERE " + attribute + "='" + value + "';");
            
            if (rs.next()) {
               return rs.getString(1);
            } else {
               return "";
            }
         }
         catch ( SQLException e ){
            System.out.println("Comand: " + "SELECT * FROM " + tablename + " WHERE " +attribute + "='" + value + "';");
            System.out.println(e.getMessage());
            return "";
         }   
      } else {
         return null;
      }
   
   }
   
   
   /** 
      Method getList
   
      Returns a list of all entries of the table
      (wich may not contain any entries, in this case
      the void ResultSet is returned).
      Returns null in case of error.
   
   */ 
   public ResultSet getList (String tablename) {
      
      if (tableExists(tablename) && check(tablename)) {
         try{ 
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tablename + ";");
            
            return rs;
         }
         catch ( SQLException e ){
            System.out.println("Comand: " + "SELECT * FROM " + tablename + ";");
            System.out.println(e.getMessage());
            return null; // if possible change to void ResultSet
         }   
      } else {
         return null;
      }
   
   }
   
   
   /**
      Helper method check
   
      Check if the String contains illegal character.
      Illegal character is ".
   */
   
   private Boolean check (String input) {
      return !Pattern.matches(".*\".*", input);
   }
   

   
} // class
