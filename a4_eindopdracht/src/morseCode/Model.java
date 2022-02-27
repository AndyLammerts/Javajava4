package morseCode;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Model {
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
		            'g', 'h', 'i', 'j', 'k', 'l',
		            'm', 'n', 'o', 'p', 'q', 'r',
		            's', 't', 'u', 'v', 'w', 'x',
		            'y', 'z', '1', '2', '3', '4',
		            '5', '6', '7', '8', '9', '0' };
    	// Morse code by indexing
	String[] code = { ".-",   "-...", "-.-.", "-..",  ".",
					"..-.", "--.",  "....", "..",   ".---",
					"-.-",  ".-..", "--",   "-.",   "---",
					".--.", "--.-", ".-.",  "...",  "-",
					"..-",  "...-", ".--",  "-..-", "-.--",
					"--..", "|" };
			
	 public void addPropertyChangeListener(PropertyChangeListener listener) {
         this.pcs.addPropertyChangeListener(listener);
     }
	 
	 public void setMorse() {
		 
	 }
}