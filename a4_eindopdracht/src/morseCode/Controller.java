package morseCode;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.*;

public class Controller  {
	 Model model = new Model();
	PropertyChangeSupport pcs;
	
	public Controller() {
		pcs = new PropertyChangeSupport(this);
	}
	
	public void setMorse(String textField) {
		model.setText(textField);
		String result = model.getMorse();
		
		pcs.firePropertyChange("textInput", textField, result);
	}
	
	public void addPropertyChangeListener(View view) {
		pcs.addPropertyChangeListener(view);
	}
}
