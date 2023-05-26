package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI extends JFrame{
	JButton exitButton;
	
	public TestGUI() {
		super("TestGUI");
	
	
		exitButton = new JButton("Press to Exit");
		exitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(new JLabel("Test Button :"));
		getContentPane().add(exitButton);
	}
	
	public static void main(String[] args) {
		TestGUI t = new TestGUI();
		t.pack();
		t.setVisible(true);
	}
}
