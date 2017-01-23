User Guide for the Patrilex Multilingual Search Engine
===============

Author: Wiltrud Kessler


How Does the Search Work
---------------

When you enter some search words there are several steps to be done
before you receive your results.

1.  Normalization\
    When searching for *Minerals* you will also want to find documents
    that contain the word *minerals*. Because of that, words are
    normalized to a standard (here lowercase). Also you would probably
    like to find documents that contain *mineral*, so every plural noun
    in the search words is replaced by its singular form.

2.  Translation to UNL\
    The search words are translated to an artificial language called
    UNL. From this point on, the initial query language is not important
    anymore. The word *mineral* is *mineral(icl\>material\>thing)* in
    UNL.

3.  Query expansion\
    Synonyms and more specific words are added to the original search
    words. For example, to the word *mineral* the words *malachite* or
    *gold* would be added (in UNL).

4.  Translation to Spanish\
    Finally the words are translated to Spanish, what would give us
    *mineral malaquita oro* in the example.

5.  Search for documents\
    The search will return all documents that contain at least one word
    of the Spanish search words.


Search Modes 
---------------

There are four different modes for the multilingual search engine
available. They differ in which of the the above mentioned steps they
perform.

**Normal search**
:   This is the default mode. The search includes the steps
    normalization, translation to UNL, query expansion, translation to
    Spanish and search.

**No query expansion**
:   The step query expansion is excluded from the procedure, so the
    search consists only of normalization, translation to UNL,
    translation to Spanish and search.

**Advanced search**
:   When this mode is selected, more specific searches can be conducted.
    For an explanation of the possibilities see the explanation of the
    advanced search below. There is neither translation nor expansion
    performed, only normalization.


Selection of Language 
---------------

The selection of the correct language is very important for the success
of the search. It influences the dictionary that is used and the kind of
normalization that is done. The Spanish word *árboles*, for example,
will be correctly normalized to the singular *arbol* when Spanish is
selected. But if English is selected it becomes *arbole*. This word will
not be in the English dictionary and if the word is searched without
translation it will not find documents that contain *árbol* or
*árboles*, because it is not the same word.


Advanced Search
---------------

There are many different ways to search for something if you use the
advanced search. Note that these features are only available if you
search in Spanish or search for names. If your search words are
translated all of the special symbols will be ignored.

**Phrase searches**
:   A phrase is a group of words that you want to find together. It has
    to be entered surrounded by quotes. A search for *”monasterio real”*
    will only find documents where these words appear next to each
    other.

**Wildcard searches**
:   Wildcard searches allow you to search for words leaving undefined
    one or more letters. The symbol *?* can replace one letter, the
    symbol *\** replaces various letters. A search for *te?t* will find
    documents for *test*, *text* and so on. Note that you cannot use
    *\** or *?* as the first character of a search or in phrase
    searches.

**Fuzzy searches**
:   Fuzzy searches find also words that are similar in spelling to the
    original search word. The \~ symbol after the search word is used
    for this type of search. A search for *madera\~* will also find
    documents for *manera* or *madero*.

**Proximity searches**
:   This type of search is similar to a phrase search, but here you can
    specify the maximum distance where two words must appear. A search
    for *“monasterio visita”\~10 * will find every document where the
    words *monasterio* and *visita* occur less than 10 words from each
    other.

**Fields**
:   A document contains different fields. The path of a document is
    contained in the field ”path”, the title in ”title” and the contents
    of the file in ”contents”. So if you want to find documents that
    have the word *monasterio* in the title try *title:monasterio*

**Boosting of terms**
:   You can give more weight to a word or a phrase you are searching by
    adding the symbol *\^* followed by a number, as, for example, in
    *monasterio\^3 real*. The higher the number is, the more important
    the word is for your search.

**Boolean operators**
:   By default documents that are returned as a result of your search
    must contain at least one of the search words. That is equivalent to
    writing *OR*. If you want only documents that contain all of the
    search terms you can join them by *AND* as in *monasterio AND
    visita*. The *+* symbol denotes a term that must be present in all
    returned documents, as the *-* symbol forbids a term to be present
    in one of the returned documents. So a search for *+monasterio
    visita -escorial* will give you all documents that contain
    *monasterio*, may contain *visita* and do not contain *escorial*.
    *AND* and *OR* must be in upper case. *+* and *-* must be directly
    in front of the word, without a space.
