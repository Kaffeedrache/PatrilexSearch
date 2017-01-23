// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8


package patrilex;

	/*
	Data type to represent a language.
	
	Possible languages are
		Spanish
		English
		German
		Russian
		Arabic
		UNL (see http://www.undl.org)
		
	Methods: 
		Language stringToLanguage (String lang)
	*/

public enum Language {

	UNL,    // UNL
	EN,     // English
	ES,     // Spanish
	DE,     // German
	AR,     // Arabic
	RU;     // Russian
	 
	 
	// Method to convert a String to a Language
	// If the language is unknown, it is set to English
	public static Language stringToLanguage (String lang) {
		Language l = stringToLanguageUnknown (lang);
		if (l == null) {
			return EN;
		} else {
			return l;
		}
	}
	
	// Method to convert a String to a Language
	// returns null if unknown language
	public static Language stringToLanguageUnknown (String lang) {
		// English
		if (lang.equals("EN")) {
			return EN;
		}
		// Spanish
		else if (lang.equals("ES")) {
			return ES;
		}
		// German
		else if (lang.equals("DE")) {
			return DE;
		}
		// Russian
		else if (lang.equals("RU")) {
			return RU;
		}
		// Arabic
		else if (lang.equals("AR")) {
			return AR;
		}
		// UNL
		else if (lang.equals("UNL")) {
			return UNL;
		}
		// Unknown
		else {	
			return null;
		}
	}

}
