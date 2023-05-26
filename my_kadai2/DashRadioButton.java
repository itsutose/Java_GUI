package my_kadai2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;


public class DashRadioButton extends JRadioButton {
    StateManager stateManager;

    public DashRadioButton(StateManager stateManager) {
		super("Dashed");
	
		addActionListener(new DashedListener());
	
		this.stateManager = stateManager;
    }
	
    class DashedListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
//		    stateManager.setState(new RectState(stateManager));
//    		stateManager.setShadow();
//    		System.out.println("Radio Button on");
    		State state = stateManager.getState();
    		if(state.getDashed() == true) {
    			state.setDashed(false);
    		}else {
    			state.setDashed(true);
    		}
		}
    }
}
