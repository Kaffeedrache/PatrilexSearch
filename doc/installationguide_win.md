Installation Guide for the Patrilex Multilingual Search Engine  - Windows -
===================

Author: Wiltrud Kessler

The Patrilex multilingual search engine is implemented as a Java Servlet
and runs with Apache Tomcat. Additionally there is a MySQL database
required. If you are familiar with the installation and configuration of
these applications you may skip these parts of this document. Please
note that your MySQL has to be set to UTF-8.

The installation has been tested with Windows 2003 Server and Windows XP
using MySQL version 5.0, Apache HTTP Server version 2.2 and Apache
Tomcat version 6.0. There is no guarantee it will work with other
combinations.


Installation of MySQL
---------------

These instructions are based on the version 5.0 of MySQL installed on a
Windows 2003 Server and Windows XP. Adjust according to your Windows
version and MySQL version.

1.  Install MySQL following the instructions on <http://www.mysql.com>.
    In the process you will be asked to select an encoding for MySQL.
    Select `utf8`, otherwise some languages of the Multilingual Search
    Engine won’t work.

2.  Log into the MySQL ”Command Line Chat” and create a database that
    uses UTF-8 to use for the Patrilex multilingual search engine. Here
    the database will be called `patrilex`.

        create database patrilex default character set utf8;

    Create a user for the Patrilex search engine and grant him rights on
    the patrilex database. As an example we will call the user
    `patrilexadmin` and set his password to `mypassword`.

        grant all privileges on patrilex.* to patrilexadmin@localhost 
          identified by "mypassword";
        flush privileges;

3.  The language part of the environment variables if you log into MySQL
    and connect to the newly created database should now look like this
    (execute the command `show variables` to see this table):

        | character_set_client            | utf8                        | 
        | character_set_connection        | utf8                        | 
        | character_set_database          | utf8                        | 
        | character_set_filesystem        | binary                      | 
        | character_set_results           | utf8                        | 
        | character_set_server            | utf8                        | 
        | character_set_system            | utf8                        | 
        | character_sets_dir              | /usr/share/mysql/charsets/  | 
        | collation_connection            | utf8_general_ci             | 
        | collation_database              | utf8_general_ci             | 
        | collation_server                | utf8_general_ci             | 


Installation and Configuration of Apache HTTP Server 
---------------

These instructions are based on the version 2.2.8 of the Apache HTTP
Server installed on a Windows 2003 Server and Windows XP. Adjust
according to your Windows version and Apache version.

1.  Install Apache HTTP Server following the instructions on
    <http://httpd.apache.org/>.

2.  Edit the configuration files `apache2.conf`,
    `sites-available/default` and `httpd.conf` in the installation
    directory (normally\
    `C:\Progam Files\Apache Software Foundation\Apache2\conf`) according
    to the instructions from <http://httpd.apache.org/> so that you are
    able to host a webpage.

3.  Restart Apache for the changes to take effect.


Installation and Configuration of Tomcat 
---------------

These instructions are based on the version 6.0 of the Apache Tomcat
installed on a Windows 2003 Server and Windows XP. Adjust according to
your Windows version and Tomcat version.

1.  Install Apache Tomcat following the instructions on
    <http://tomcat.apache.org/>.

2.  Permit the Patrilex multilingual search engine the access to the
    database by adding the following to the file\
    `C:\Progam Files\Apache Software Foundation\Tomcat 6.0\conf\context.xml`
    . You can put it in the default context, the context of / or in the
    context of the patrilexweb servlet (see\
    <http://tomcat.apache.org/tomcat-5.5-doc/jndi-datasource-examples-howto.html>).
    Here it is supposed that the database is called `patrilex` and there
    is a user `patrilexadmin` with password `mypassword` existing.

            <ResourceParams name="jdbc/patrilexdb">
                <parameter>
                  <name> driverClassName </name>
                  <value> com.mysql.jdbc.Driver </value>
                </parameter>
                <parameter>
                  <name> url </name>
                  <value> jdbc:mysql://localhost/patrilex </value>
                </parameter>
                <parameter>
                  <name> username </name>
                  <value> patrilexadmin </value>
                </parameter>
                <parameter>
                  <name> password </name>
                  <value> mypassword </value>
                </parameter>
          </ResourceParams>

3.  Move jdbc Driver `mysql.jar` to the Tomcat library folder\
    (should be in
    `C:\Progam Files\Apache Software Foundation\Tomcat 6.0\lib`, you should have the file if you have something that uses jdbc. If not, it is included in the Software folder of the Patrilex search
    engine).


Installation of Patrilex Multilingual Search Engine {#patrilex .unnumbered}
---------------

1.  Stop Tomcat.

2.  Copy the file `patrilexweb.war` that contains the Patrilex
    multilingual search engine to the Tomcat web application folder\
    (should be
    `C:\Progam Files\Apache Software Foundation\Tomcat 5.5\webapps`).

3.  Start Tomcat again. If it doesn’t start with the error ”Cannot
    create Java”, there is a dependency with the file `msvcr71.dll` in
    the Java installation directory. To get Tomcat to start, copy the
    file to the tomcat `bin` directory or add the path to your Java VM
    to the environment variable `Path`.

4.  Open a browser. You should be able to see the the welcome page of
    the Patrilex multilingual search engine at
    `http://localhost:8180/patrilexweb/welcome` (8180 is the default port for Tomcat, adjust if you changed it).


Configuration and Initialization of Patrilex Multilingual Search Engine 
---------------

Before you can use the Patrilex multilingual search engine, the search
engine must be told where to find the database and some other resources.

1.  Stop Tomcat.

2.  Edit the configuration file `init.conf` in the web application
    folder (should be
    `C:\Progam Files\Apache Software Foundation\Tomcat 5.5\webapps\patrilexweb`)
    giving the paths to all the dictionary files and thesaurus files you
    want to use. Use `/` instead of `\` for paths. Note that all
    thesaurus files you want to import have to be in UNL. You can
    translate a thesaurus later with the Patrilex management tool.

3.  Run the patrilex management tool by running the script
    `patrilexmanager.bat` from the web application folder in your shell.

4.  Select point 1 (”Initialize Patrilex”) from the menu. This will
    import the dictionaries and the thesaurus from the files you
    supplied in the cofiguration file and create an index.

5.  Start Tomcat again.

6.  Try out some searches at `http://localhost:8180/patrilexweb/search`. If you get a NullPointerException or some other error check, that
    Tomcat and MySQL are running and that your firewall allows access to
    both.

7.  You can use the patrilex management tool also to later manage the
    resources, for example, to translate a thesaurus or to add more
    translations to the dictionary. For further details please see the
    maintainance guide.
   