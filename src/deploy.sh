cp src/patrilex/*.java WEB-INF/classes/patrilex/

cd WEB-INF/classes/patrilex

# Delete old class files
rm *.class

# Compile files for administration
javac -cp ../../lib/lucene-core-2.3.1.jar:../../lib/lucene-demos-2.3.1.jar:../../lib/dom3-xercesImpl.jar:../../lib/PDFBox-0.7.3.jar:.. PatrilexManager.java

if [ -f PatrilexManager.class  ]
then

   # Compile files for search engine
   javac -cp /usr/share/tomcat5.5/common/lib/servlet-api.jar:../../lib/lucene-core-2.3.1.jar:.. SearchFilesWeb.java
   
   # Compile files for display of help file
   javac -cp /usr/share/tomcat5.5/common/lib/servlet-api.jar:.. DisplayHelp.java
   
   # Compile files for display of welcome file
   javac -cp /usr/share/tomcat5.5/common/lib/servlet-api.jar:.. Welcome.java

   # Make war file
   cd ../../../ # should now be back in root
   jar -cf patrilexweb.war . 

   #Stop Tomcat:
   sudo /etc/init.d/tomcat5.5 stop

   #Delete old version:
   sudo rm -r /usr/share/tomcat5.5/webapps/patrilexweb

   #Copy new war file:
   sudo cp patrilexweb.war /usr/share/tomcat5.5/webapps

   # Start Tomcat again:
   sudo /etc/init.d/tomcat5.5 start

   # Access file in Browser:
   # firefox http://localhost:8180/patrilexweb/patrilex
fi
