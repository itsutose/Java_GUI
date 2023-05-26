package my_kadai2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;


public class ShadowRadioButton extends JRadioButton {
    StateManager stateManager;

    public ShadowRadioButton(StateManager stateManager) {
		super("Shadow");
	
		addActionListener(new ShadowListener());
	
		this.stateManager = stateManager;
    }
	
    class ShadowListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		System.out.println("Radio Button on");
    		State state = stateManager.getState();
    		if(state.getShadow() == true) {
    			state.setShadow(false);
    		}else {
    			state.setShadow(true);
    		}
		}
    }
}
