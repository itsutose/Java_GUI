package q3_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PentagonButton extends JButton {
    StateManager stateManager;

    public PentagonButton(StateManager stateManager) {
	super("Pentagon");

	addActionListener(new PentagonListener());

	this.stateManager = stateManager;
    }

    class PentagonListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    stateManager.setState(new PentagonState(stateManager));
	}
    }
}
