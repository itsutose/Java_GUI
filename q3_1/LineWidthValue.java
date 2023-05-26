package q3_1;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class LineWidthValue extends JTextField {
    StateManager stateManager;

    public LineWidthValue(StateManager stateManager) {
	super(3);
	setHorizontalAlignment(JTextField.RIGHT);
	Document d = new JTextFieldFilter();
	setDocument(d);
	d.addDocumentListener(new ValueListener());
	this.stateManager = stateManager;
	setText("1");
    }

    class ValueListener implements DocumentListener {
	public void changedUpdate(DocumentEvent e) {
	    setState(getText());
	}
	public void insertUpdate(DocumentEvent e) {
	    setState(getText());
	}
	public void removeUpdate(DocumentEvent e) {
	    setState(getText());
	}
	private void setState(String value) {
	    if (value.length() <= 0)
		stateManager.setLineWidth(0);
	    else
		stateManager.setLineWidth(Integer.parseInt(value));
	}
    }
}
