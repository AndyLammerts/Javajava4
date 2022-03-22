package morseCode;

import java.util.Hashtable;

public class Model {
	private String text;
	final String[][] morseArray = {
            {"A",".-"}, {"B","-..."}, {"C","-.-."},{"D","-.."},
            {"E","."}, {"F","..-."}, {"G","--."}, {"H","...."},
            {"I",".."}, {"J",".---"},{"K","-.-"}, {"L",".-.."}, {"M","--"},
            {"N","-."}, {"O","---"}, {"P",".--."}, {"Q","--.-"},00
            {"R",".-."},{"S","..."}, {"T","-"}, {"U","..-"},
            {"V","	...-"}, {"W",".--"}, {"X","-..-"}, {"Y","-.--"},
            {"Z","--.."},{"1",".----"},{"2","..---"},{"3","...--"},
            {"4","....-"},{"5","....."},{"6","-...."},{"7","--..."},
            {"8","---.."},{"9","----."},{"0","-----"},{" ","/"}
    };
    
	 Hashtable<String,String> ht = new Hashtable<String, String>();
	 
	 public Model() {
		 for(String[] p:morseArray) {
			 ht.put(p[0], p[1]);
		 }
		 
	 }
	 
	 public String getMorse() {
		 String result = "";
		 //tekst uit elkaar plukken en morse van maken
		 
		 return result;
	 }

	public void setText(String text) {
		this.text = text.toUpperCase();
	}

	public String getText() {
		return text;
	}

	public String convertChar(String string) {
		return ht.get(string);
	}
}
	