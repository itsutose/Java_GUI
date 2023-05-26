package my_q2_8_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class bad_OvalButton extends JButton {
    bad_State state;

    public bad_OvalButton(bad_State state) {
	super("Oval");

	addActionListener(new OvalListener());

	this.state = state;
    }

    class OvalListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    state.setState(bad_State.OVAL);
	}
    }
}