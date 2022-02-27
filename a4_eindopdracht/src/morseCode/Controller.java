package morseCode;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;

public class Controller extends JPanel implements PropertyChangeListener {
	private View view;
	private Model model;
	
	public Controller() {
		model = new Model();
		model.addPropertyChangeListener(this);
		view = new View();
		this.add(view);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		
	}
}