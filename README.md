# Patrilex search engine

This is code for my student project "A Multilingual Search Engine Based on the Universal Networking Language" published in 2008. Since then, there has not been any further work on this.


## Contents

Main classes (each one a separate Tomcat servlet): 
* `patrilex.SearchFilesWeb`:  Main class providing the interface for search.
* `patrilex.Welcome`: Displays a welcome message.
* `patrilex.DisplayHelp`: Displays the help for the search.

The script `deploy.sh` creates a `.war` file from the sources and puts it in the right place to access the servlet.

## Needed resources

Assumed to be in `WEB-INF/lib`.

* Tomcat 5.5
* `lucene-core-2.3.1.jar`
* `lucene-demos-2.3.1.jar`
* `org.apache.lucene.search.highlight`
* `PDFBox-0.7.3.jar`
* `dom3-xercesImpl.jar`
* `fontbox-0.1.0.jar`


## More information

The folder `doc` contains the Javadoc, as well as an installation guide, a maintainance guide and a user guide. Keep in mind that this project is from 2008.


## Licence and References

This code is distributed under a Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported license http://creativecommons.org/licenses/by-nc-sa/3.0/

Please cite:
Wiltrud Kessler (2008)
A Multilingual Search Engine Based on the Universal Networking Language.
Studienarbeit, Universität Stuttgart.
