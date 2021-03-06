package morseCode;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


public class Controller  {
	 Model model = new Model();
	 private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	
	public void setMorse(String text) {
		String morseArray = "";
		model.setText(text);
		morseArray = model.getMorse();
		pcs.firePropertyChange("text", "", morseArray);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(listener);
	}
	
}
