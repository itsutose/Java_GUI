package q2_8_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class OvalButton extends JButton {
    State state;

    public OvalButton(State state) {
	super("Oval");

	addActionListener(new OvalListener());

	this.state = state;
    }

    class OvalListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    state.setState(State.OVAL);
	}
    }
}