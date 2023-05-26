package my_q2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyButtonTest2 extends JFrame {
	public MyButtonTest2() {
		super("MyButtonTest2");
		
		JPanel jp = new JPanel();
		
		//FlowLayoutでは部品を左から配置
		jp.setLayout(new FlowLayout());
		
//		BorderLayoutでは部品を
//		上部(North)、下部(South)、右側(East)、
//		左側(West)、中央(Center)に配置
		
		getContentPane().add(jp);
		
		Button rectButton = new Button("Rectangle");
		rectButton.addActionListener(new RectButtonListener());
		jp.add(rectButton);
		
		Button ovalButton = new Button("Oval");
		ovalButton.addActionListener(new RectButtonListener());
		jp.add(ovalButton);
		
		Button triangleButton = new Button("Triangle");
		triangleButton.addActionListener(new RectButtonListener());
		jp.add(triangleButton);
		
		setSize(300,250);
		
	}
	
	public static void main(String[] args) {
		MyButtonTest2 myapp = new MyButtonTest2();
		myapp.setVisible(true);
	}
}

//レイアウトについてhttps://www.iplab.cs.tsukuba.ac

class RectButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Rect is pressed.");
	}
}

class CircleButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Circle is pressed.");
	}
}

class TriangleButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Triangle is pressed.");
	}
}
