package morseCode;

public class Model {
	private String text;
	final String[][] morseArray = {
            {"A",".-"}, {"B","-..."}, {"C","-.-."},{"D","-.."},
            {"E","."}, {"F","..-."}, {"G","--."}, {"H","...."},
            {"I",".."}, {"J",".---"}, {"L",".-.."}, {"M","--"},
            {"N","-."}, {"O","---"}, {"P",".--."}, {"Q","--.-"},
            {"R",".-."},{"S","..."}, {"T","-"}, {"U","..-"},
            {"V","...-"}, {"W",".--"}, {"X","-..-"}, {"Y","-.--"},
            {"Z","--.."},{"1",".----"},{"2","..---"},{"3","...--"},
            {"4","....-"},{"5","....."},{"6","-...."},{"7","--..."},
            {"8","---.."},{"9","----."},{"0","-----"},{" ","/"}
    };
    
	 public String getMorse() {
		 String result = "";
		 //tekst uit elkaar plukken en morse van maken
		 
		 return result;
	 }

	public void setText(String text) {
		this.text = text.toUpperCase();
	}

	public Object getText() {
		return text;
	}
}
