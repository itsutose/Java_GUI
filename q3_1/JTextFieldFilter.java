package q3_1;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextFieldFilter extends PlainDocument {
    private static final String NUMERIC = "0123456789";

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
	if (str == null)
	    return;

	for (int i = 0; i < str.length(); i++) {
	    if (NUMERIC.indexOf(str.valueOf(str.charAt(i))) == -1)
		return;
	}

	super.insertString(offset, str, attr);
    }
}
