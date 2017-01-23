// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8

/**
Class Constants

Class for global constants that are set in
initialization and used throughout the program.
The settings may be changed later.

If there is a problem with the database, all
settings will return "" or 0.

*/

package patrilex;


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


/** Main class for managing the resources of the Patrilex search engine */
public class Constants {
   
   
   /** 
      File for reading DB connection information
      Never ever change the name of this file
      (or change it also in InitializePatrilex
      and make sure to re-initialize or change
      the name of the existing file!)
   */
   private String dbFile = "db.conf";
   
   
   /**
      Variables necessary for the connection to the database
   */
   private String dbDriver = "com.mysql.jdbc.Driver";
   private String dbLocation = "";
   private String dbUser = "";
   private String dbPassword = "";
   private String tablename = "constants";
   private String widthAttribute = "20";
   private String widthValue = "255";
   
   
   private String field = "contents";
   
   
   /**
      Global variables for the connection and a statement
   */
   private Connection con;
   private Statement stmt;
   
   
   /** 
      Global constants that are set in
      initialization and used throughout the program.
      This constructor is for use without a file with DB access information.
   */
   public Constants (String location, String user, String password) {
      try {
         dbLocation = location;
         dbUser = user;
         dbPassword = password;
         
         // Connect to DB
         Class.forName( dbDriver );

         // Open connection
         con = DriverManager.getConnection(dbLocation, dbUser, dbPassword);

         // Create a statment
         stmt = con.createStatement();
      
         // Set the connection to work with utf8
         stmt.executeQuery("Set names 'utf8';");
      
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
   
   
   /** 
      Global constants that are set in
      initialization and used throughout the program.
   */
   public Constants () {
      
      // Get Path to dbFile from normal context as well as from
      // Tomcat Webapp context
      String path = this.getClass().getResource(dbFile).getPath();
      path = path.replaceAll("%20", " "); // for paths with spaces
      
      try {
         // Open file
         BufferedReader inputFile = new BufferedReader(new FileReader(path));
         String line = null;

         // Process each line of the file
         if ((line = inputFile.readLine()) != null) { // Location
            dbLocation = line.trim();
         }
         if ((line = inputFile.readLine()) != null) { // User
            dbUser = line.trim();         
         }
         if ((line = inputFile.readLine()) != null) { // Password
            dbPassword = line.trim();         
         }
         
         // Connect to DB
         Class.forName( dbDriver );

         // Open connection
         con = DriverManager.getConnection(dbLocation, dbUser, dbPassword);

         // Create a statment
         stmt = con.createStatement();
      
         // Set the connection to work with utf8
         stmt.executeQuery("Set names 'utf8';");
      
      } catch (Exception e) {
         System.out.println(e.getMessage());

      }
      
   }
   
   
   // Methods for constants of connection to the database
   
   /**
      Returns the driver used for the connection to the patrilex DB
   */
   public String getDriver () {
      return dbDriver;
   }
   
   /**
      Returns the location of the patrilex DB
   */
   public String getLocation () {
      return dbLocation;
   }
   
   /**
      Returns the username of the search engine DB user
   */
   public String getUser () {
      return dbUser;
   }

   /**
      Returns the password of the search engine DB user
   */
   public String getPassword () {
      return dbPassword;
   }
   
   /**
      Sets the location of the patrilex DB
   */
   public void setLocation (String value) {
      dbLocation = value;
   }
   
   /**
      Sets the username of the search engine DB user
   */
   public void setUser (String value) {
      dbUser = value;
   }
   
   /**
      Sets the password of the search engine DB user
   */
   public void setPassword (String value) {
      dbPassword = value;
   }
   

   // Methods for constants of location of files   
   
   /**
      Returns the location of the documents of the collection
   */
   public String getDocsLocation () {
      return getValue("DOCS_LOCATION");
   }
   
   /**
      Returns the location of the index
   */
   public String getIndexLocation () {
      return getValue("INDEX_LOCATION");
   }
   
   /**
      Returns the language of the collection/the index
   */   
   public Language getIndexLanguage () {
      return Language.stringToLanguage(getValue("INDEX_LANGUAGE"));
   }
   
   /**
      Returns the encoding of the collection documents
   */
   public String getEncoding () {
      return getValue("INDEX_ENCODING");
   }

   /**
      Returns the directory where the HTML-Files are
   */
   public String getHtmlRoot () {
      return getValue("HTML_ROOT");
   }

   /**
      Returns the file printed as header of the webpage
   */
   public String getHeaderfile () {
      return getValue("HEADERFILE");
   }
   
   /**
      Returns the  file printed as footer of the webpage
   */
   public String getFooterfile () {
      return getValue("FOOTERFILE");
   }
   
   /**
      Returns the root location the files have on the web
   */
   public String getWebLocation () {
      return getValue("WEB_LOCATION");
   }
   
   /**
      Sets the location of the documents of the collection
   */
   public void setDocsLocation (String value) {
      setValue("DOCS_LOCATION", value);
   }
   
   /**
      Sets the location of the index
   */
   public void setIndexLocation (String value) {
      setValue("INDEX_LOCATION", value);
   }
   
   /**
      Sets the language of the collection/the index
   */
   public void setIndexLanguage (Language language) {
      setValue("INDEX_LANGUAGE", language.toString());
   }
   
   /**
      Sets the encoding of the collection documents
   */
   public void setEncoding (String value) {
      setValue("INDEX_ENCODING", value);
   }

   /**
      Sets the directory where the HTML-Files are
   */
   public void setHtmlRoot (String value) {
      setValue("HTML_ROOT", value);
   }

   /**
      Sets the file printed as header of the webpage
   */
   public void setHeaderfile (String value) {
      setValue("HEADERFILE", value);
   }
   
   /**
      Sets the file printed as footer of the webpage
   */
   public void setFooterfile (String value) {
      setValue("FOOTERFILE", value);
   }
   
   /**
      Sets the root location the files have on the web
   */
   public void setWebLocation (String value) {
      setValue("WEB_LOCATION", value);
   }

   
   // Methods for rest of things.
   // Nice to be able to change - unlwidth and hits per page
   // "Field" is not changeable.
   
   /**
      Returns the width of UNL
   */
   public int getUNLwidth () {
      return stringToInt(getValue("UNLWIDTH"));
   }   
   
   /**
      Sets the width of UNL
   */
   public void setUNLwidth (int value) {
      setValue("UNLWIDTH", Integer.toString(value));
   }   
   
   /**
      Returns the number of hits to be displayed per page
   */
   public int getHitsPerPage () {
      return stringToInt(getValue("HITS_PER_PAGE"));
   }
   
   /**
      Sets the number of hits to be displayed per page
   */
   public void setHitsPerPage (int value) {
      setValue("HITS_PER_PAGE", Integer.toString(value));
   }
   
   /**
      Returns the default field
   */
   public String getField () {
      return field;
   }
   
   
   /** 
      Method setValue
   
      Sets the value of the constant 'field' to 'value'.
      A value is not inserted if it contains the character ".
   */
   private void setValue (String field, String value) {
      
      value.trim();
      if ( tableExists() && !Pattern.matches(".*\".*", value) ) {

         try{
            // if exists, delete previous value
            stmt.executeUpdate("delete from " + tablename + " where attribute='" + field + "';");
            stmt.executeUpdate("insert into " + tablename + " values ('" + field + "', '" + value + "');");

         }
         catch ( SQLException e ){ // no entry was added
            System.out.println("Comand: " + "insert into " + tablename + " values ('" + field + "', '" + value + "');");
            System.out.println(e.getMessage());
         }
         
      } 
      
   }   
   
   
   /** 
      Method getValue
   
      Returns the value of the field with name of the parameter.
      If the field is not found "" is returned.
   */
   private String getValue (String field) {
      if (tableExists()) {
         try{ 
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tablename + " WHERE attribute='" + field + "';");
            
            if (rs.next()) {
               return rs.getString(2);
            } else {
               return "";
            }
         }
         catch ( SQLException e ){
            System.out.println("Comand: " + "SELECT * FROM " + tablename + " WHERE attribute='" + field + "';");
            System.out.println(e.getMessage());
            return "";
         }   
      } else {
         return "";
      }
      
   }
   
   
   /** 
      Method initialize
   
      Creates the constants table.
      If the table already exists, nothing is done.
   
   */
   public void initialize () {
      if (!tableExists()) {
         try{
            stmt.executeUpdate("create table " + tablename + 
                     "(" +
                     " attribute varchar(" + widthAttribute + ") CHARACTER SET Utf8 unique," +
                     " value varchar(" + widthValue + ") CHARACTER SET Utf8" +
                     ");");
         } catch ( SQLException e ){
            System.out.println(e.getMessage());
         }   
      }
   }
   
   
   /** 
      Method getConstantsList
   
      Returns a list of all entries of the constants table
      (wich may not contain any entries, in this case
      the void ResultSet is returned).
      Returns null in case of error.
   */
   public ResultSet getConstantsList () {
      
      if (tableExists()) {
         try{ 
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tablename + ";");
            
            return rs;
         }
         catch ( SQLException e ){
            System.out.println(e.getMessage());
            return null; 
         }   
      } else {
         return null;
      }
      
   }
   
   
   /** 
      Method writeDBFile
   
      Writes a new location, user and password combination
      to the file for the database information.
   
   */ 
   public Boolean writeDBFile (String location, String user, String password) {
      
      if (!location.equals("") && !user.equals("")) {
         try {
            File file = new File(dbFile);
            file.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(dbFile));
            out.write(location);
            out.newLine();
            out.write(user);
            out.newLine();
            out.write(password);
            out.newLine();
            out.close();
            return true;
         } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
         }
      } else {
         return false;
      }
      
   }
   
   
   
   /** 
      Method tableExists
   
      Returns true if the table exists, else false.
   
   */ 
   private Boolean tableExists () {
      
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
      Method stringToInt
   
      Converts a String to an Integer.
      If it is no number, 0 is returned.
      
   */
   private int stringToInt (String input) {
      try {
         return Integer.parseInt(input.trim());
      }
      catch (NumberFormatException e) {
         return 0;
      }
   }
   
   
}
