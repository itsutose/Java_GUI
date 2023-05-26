package q3_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StarButton extends JButton {
    StateManager stateManager;

    public StarButton(StateManager stateManager) {
	super("Star");

	addActionListener(new StarListener());

	this.stateManager = stateManager;
    }

    class StarListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    stateManager.setState(new StarState(stateManager));
	}
    }
}
