package morseCode;



import javax.swing.*;

public class View extends JPanel {
	public JTextField textField;
	

	public  View() {	
		textField = new JTextField(20);
		this.add(textField);
	}
	public void setText(String text) {
		textField.setText(text);
	}
	
}