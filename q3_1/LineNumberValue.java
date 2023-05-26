package q3_1;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class LineNumberValue extends JTextField {
    StateManager stateManager;

    public LineNumberValue(StateManager stateManager) {
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
		stateManager.setLineNumber(1);
	    else {
		int n = Integer.parseInt(value);
		if (n == 0)
		    stateManager.setLineNumber(1);
		else
		    stateManager.setLineNumber(n);
	    }
	}
    }
}
