package q3_1;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

public class StrokeTypeSelector extends JComboBox {
    private static final String[] types = {"solid", "dash1", "dash2"};
    StateManager stateManager;
    
    public StrokeTypeSelector(StateManager stateManager) {
	super(types);
	addItemListener(new StrokeTypeListener());
	this.stateManager = stateManager;
    }

    class StrokeTypeListener implements ItemListener {
	public void itemStateChanged(ItemEvent e) {
   	    stateManager.setStrokeType(getSelectedIndex());
	}
    }
}