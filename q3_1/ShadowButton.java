package q3_1;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JToggleButton;

public class ShadowButton extends JToggleButton {
    StateManager stateManager;

    public ShadowButton(StateManager stateManager) {
	super("Shadow");

	addItemListener(new ShadowListener());
	
	this.stateManager = stateManager;
    }

    class ShadowListener implements ItemListener {
	public void itemStateChanged(ItemEvent e) {
	    int state = e.getStateChange();
	    stateManager.setHasShadow(state == ItemEvent.SELECTED);
	}
    }
}