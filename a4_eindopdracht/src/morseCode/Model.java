package morseCode;

import java.util.Hashtable;

public class Model {
	private String text;
	final String[][] morseArray = { { "A", ".-" }, { "B", "-..." }, { "C", "-.-." }, { "D", "-.." }, { "E", "." },
			{ "F", "..-." }, { "G", "--." }, { "H", "...." }, { "I", ".." }, { "J", ".---" }, { "K", "-.-" },
			{ "L", ".-.." }, { "M", "--" }, { "N", "-." }, { "O", "---" }, { "P", ".--." }, { "Q", "--.-" },
			{ "R", ".-." }, { "S", "..." }, { "T", "-" }, { "U", "..-" }, { "V", "	...-" }, { "W", ".--" },
			{ "X", "-..-" }, { "Y", "-.--" }, { "Z", "--.." }, { "1", ".----" }, { "2", "..---" }, { "3", "...--" },
			{ "4", "....-" }, { "5", "....." }, { "6", "-...." }, { "7", "--..." }, { "8", "---.." }, { "9", "----." },
			{ "0", "-----" }, { " ", "/" } };

	Hashtable<String, String> ht = new Hashtable<String, String>();

	public Model() {
		for (String[] p : morseArray) {
			ht.put(p[0], p[1]);
		}

	}

	public String getMorse() {
		String result = "";
		// tekst uit elkaar plukken en morse van maken
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			result += convertChar(ch) + " ";

		}
		return result;
	}

	public void setText(String text) {
		this.text = text.toUpperCase();
	}

	public String getText() {
		return text;
	}

	public String convertChar(char ch) {

		String result = ht.get(Character.toString(ch).toUpperCase());

		if (result==null) {
			return "Dit teken is niet beschikbaar";
		} else {
			return result;
		}
	}

}
