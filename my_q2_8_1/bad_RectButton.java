package my_q2_8_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class bad_RectButton extends JButton {
    bad_State bad_state;

    public bad_RectButton(bad_State bad_state) {
	super("Rectangle");

	addActionListener(new RectListener());

	this.bad_state = bad_state;
    }

    class RectListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    bad_state.setState(bad_State.RECTANGLE);
	}
    }
}