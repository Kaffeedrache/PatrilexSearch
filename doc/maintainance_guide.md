Maintainance Guide for the Patrilex Multilingual Search Engine
=================

Author: Wiltrud Kessler

This document has two parts. The fist part explains the use of the
patrilex administration tool PatrilexManager. In the second part some
known difficulties and their solutions are presented.


The PatrilexManager
---------------

The Patrilex Multilingual Search Engine has an administration tool. This
is found in the Tomcat webapps folder (normally
`/usr/share/tomcat5.5/webapps` on Linux,
`C:\Progam Files\Apache Software Foundation\Tomcat 5.5\webapps` on
Windows).

Start the PatrilexManager by running `patrilexmanager.sh` (Linux) or
`patrilexmanager.bat` (Windows) on the command line. You then can chose
between the following options:

    1) Initialize the Patrilex search engine
    2) Change settings
    3) Manage the dictionary
    4) Manage the thesaurus
    5) Manage the index
    6) Quit

The initialization of the search engine will overwrite any changes made
in the past. It will delete the contents of dictionary and thesaurus and
refill them with the contents of the files to import. All settings are
made by editing the file `init.conf` located in the root of the patrilex
webapp directory. Use this point to initialize the search engine on
installation or to reset it. Please refer to the installation guide for
details or read the comments in the file itself.

The other options are explained in the following. You can chose one
option by entering the corresponding number. By chosing 6 you quit the
patrilex manager.

Managing the Settings
---------------------

The settings manager allows you to change the settings the Patrilex
Multilingual Search engine uses. In the settings management you can see
current settings and change them.

The output of showing the contents should look like this:

    Database Settings: 
    Location: jdbc:mysql://localhost/patrilex
    User: patrilexadmin
    Other settings: 
    DOCS_LOCATION = /home/username/patrilex_resources/documents
    INDEX_LANGUAGE = ES
    INDEX_ENCODING = ISO-8859-1
    INDEX_LOCATION = /home/username/patrilex_resources/index
    WEB_LOCATION = www.my.domain.org/something
    HTML_ROOT = /home/username/patrilex_resources/html
    HEADERFILE = header.html
    FOOTERFILE = footer.html
    UNLWIDTH = 200
    HITS_PER_PAGE = 25

Changing of database settings is sparated from changing the other
settings. If you choose to change the database settings (option 3) you
will be asked to enter a new location for the database as well as a new
user and password. Please try this with care as it depends on the
PatrilexManager being able to save a file in the webapps directory,
which does not always work. You can manually edit the file `db.conf` in
the directory `WEB-INF/classes/patrilex` if you really need to change
this settings.

To change a normal setting choose 2, then enter the exact name of the
setting (for example `HTML_ROOT`) and the new value. Use only `/` in
paths, even if you are on a Windows system.

`DOCS_LOCATION`
:   The location of the documents to be indexed. This may only be one
    directory. All subdirectories will be indexed.

`INDEX_LANGUAGE`
:   Language of the documents in the index. This can also be only one
    language. Possible values are EN, ES, RU, AR, DE. Unknown values
    will set the language to English.

`INDEX_ENCODING`
:   Encoding of the documents to be indexed. It is assumed that all
    documents in the directoty to be indexed have the same encoding.
    `ISO-8859-1` corresponds to Latin 1, `UTF-8` corresponds to UTF-8.
    For more encodings see
    <http://java.sun.com/javase/6/docs/technotes/guides/intl/encoding.doc.html>.

`INDEX_LOCATION`
:   Location of the index. This should be a directory outside of
    web-accesible content.

`WEB_LOCATION`
:   Web address of the documents (if document
    `DOCS_LOCATION/folder/file` should be linked as
    `www.my.domain.org/something/folder/file` enter\
    `www.my.domain.org/something/`). Again, only one location possible.

`HTML_ROOT`
:   The search engine needs one HTML file as a header and one HTML file
    as a footer that are included in the page before and after the code
    of the search engine. This setting should contain the directory
    where these files are. This may be inside or outside web accesible
    content, but be careful with relative links.

`HEADERFILE`
:   Header file, this can be any valid HTML with an open `body` tag.

`FOOTERFILE`
:   Footer file, valid HTML that should at least close the `html` and
    `body` tags.

`UNLWIDTH`
:   This setting influences the width of the column for the UNL value
    when a **new** table is created. Longer words will be truncated when
    somebody wants to add them to the dictionary or thesaurus. This
    should at least be 200.

`HITS_PER_PAGE`
:   The number of hits to be shown on one page by the search engine.

Managing the Index
------------------

You have two possibilities, create a new index or update an existing
index. If you create a new index in the same location as an existing
index, the old index will be overwritten. If you update the existing
index documents that were deleted will also be deleted from the index
and new documents will be added.

In both cases the path for the documents and the index is taken from the
saved settings. If you want to change the location of your index change
the setting `INDEX_LOCATION` and create a new index afterwards. If you
have changed the location of your documents the same similarly change
the `DOCS_LOCATION` setting and create a new index.

Only one directory can be indexed. All files with the endings `.txt`,
`.htm`, `.html` and `.pdf` in all its subdirectories will be indexed.
The index can only have one language (determined by the setting
`DOCS_LANGUAGE`).

If you chose the verbose mode, you will be told about every file that is
indexed or deleted. This can be helpful if you are expiriencing problems
with indexing. Depending on the size of your collection indexing can
take a while.

Managing the Dictionary
-----------------------

The dictionary management has the following functionalities:

**View a list of existing dictionaries**
:   Shows a list of existing tables in the database. The tables
    referenced by two-letter language codes are dictionaries, the others
    are tables for the constants management (`constants`) and the
    thesaurus (`thesaurus_hier`, `thesaurus_syn`)

**View the contents of a dictionary**
:   When asked for the name of the dictionary, you have to put the exact
    name, for example `EN` for English. Use the previous option to get
    the names. The first 25 entries will be shown, after that you will
    be asked for more. Entries are shown in no particular order.

**View the contents of a dictionary**
:   When asked for the name of the dictionary, you have to put the exact
    name, for example `EN` for English. Use the previous option to get
    the names. The first 25 entries will be shown, after that you will
    be asked for more. Entries are shown in no particular order.

**Search for an entry in a dictionary**
:   You can search for an entry by UNL (0), language of the dictionary
    (1) or both (2). Only exact entries are found.

**Add entries to an existing dictionary**
:   This is for adding entries to a dictionary manually. A lot of work,
    it is recommended to use the import function if you want to add more
    than one entry.

**Create a new dictionary**
:   You can only create dictionaries for languages that exist (you have
    to give the two-letter language code). Be careful when setting the
    value for the longest possible value, this cannot be changed later.

**Import a dictionary**
:   You can only import to an existing dictionary. New entries will be
    added to the previous content of the dictionary. The file you import
    from has to be in csv format, every line consisting of
    `unl word; other language word;` (with or without “” or else around
    the words). The file has to be encoded in utf8.

**Delete entries from an existing dictionary**
:   You have to know the exact values for UNL and the language of the
    dictionary to delete an entry (at least for one of them).

**Delete a dictionary**
:   Deletes all the entries of a dictionary and there is no undo. Sorry.

For more complex management functions please use a database management
tool.

Managing the Thesaurus
----------------------

To import a thesaurus the thesaurus has to be in UNL. It has to have the
TesaurVAI format, for more details please consult the specifications of
the TesaurVAI project. Files also have to be encoded in utf8.

If your thesaurus is not in UNL, the PatrilexManager offers you the
possibility to translate it using the internal dictionaries. It thus can
only translate words that are in the dictionary. If there is more than
one translation found you are asked to chose between them or provide an
alternative translation. If there is no translation found, you can
provide one manually or the word is either kept untranslated. There is
no way back and no way to correct errors except to begin again. Sorry
folks. This is no thesaurus translation tool, but a crude way to enable
you to play with the Patrilex search engine.

There is also the functionality to delete a thesaurus, without way back,
everything gone.


Troubleshooting
----------------------

### I see strange symbols instead of Arabic / Russian in the database

First check if it might only be an issue with the terminal you are
using. If it is still strange symbols check, if your database has utf-8
as a character set as well as the server. If it hasn’t you need to
change the settings and re-initialize the Patrilex search engine. If the
server and database settings are correct, check if the encoding of the
files to be imported into the database is also utf8.


### Tomcat doesn’t start

It could have a dependency with the file `msvcr71.dll` in the Java
installation directory. To get Tomcat to start, copy the file to the
tomcat `bin` directory or add the path to your Java VM to the
environment variable `Path`. Also check for errors in the configuration
(forgotten closing tags and the like).


### I get a NullPointerException instead of the search page, but the welcome page works

Check the connection to the database is working (the PatrilexManager
uses the same settings, if it is working there, it works). Check the
settings in the PatrilexManager and if the files you refer to really
exist.


### I can’t create the index

Check the permissions on the folder you want to write. Check that the
files you want to index exist.


### I get the message ”data truncated” when I import dictionaries

Adjust the width of the columns for the languages (for this to be
effective you will have to re-initialize the Patrilex search engine). If
the text is not really too long and should fit, check the encoding of
the files you are importing.
