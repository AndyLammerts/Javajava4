package morseCode;

import javax.swing.JFrame;
import morseCode.Controller;

public class Runner {
	public static void main(String[] args) {
	JFrame frame = new JFrame("Eindopdracht Java 4");
	frame.setVisible(true);
	frame.setSize(400, 400);
	Controller controller = new Controller();
	frame.add(new View());	
	}
}