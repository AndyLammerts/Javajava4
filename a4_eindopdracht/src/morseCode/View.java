package morseCode;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class View extends JPanel implements PropertyChangeListener {
	private static final long serialVersionUID = 1L;
	public JTextField text;
	public JLabel label;
	
	  public View() {
		Controller controller = new Controller();
		controller.addPropertyChangeListener(this);
		
		
		text = new JTextField(20);
		this.add(text);
		
		label = new JLabel();
		this.add(label);
		
		text.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
                controller.setMorse(text.getText());
			}
			@Override
			public void removeUpdate(DocumentEvent e) {
                controller.setMorse(text.getText());
				
			}
			@Override
			public void changedUpdate(DocumentEvent e) {
                controller.setMorse(text.getText());
				
			}
		});
		
	  }
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		 this.addPropertyChangeListener(listener);
		 }
	
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		 if (evt.getPropertyName().equals("text")) {
			 label.setText((String) evt.getNewValue());
		 }
	}
}