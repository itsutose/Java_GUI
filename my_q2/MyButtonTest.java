package my_q2;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyButtonTest extends JFrame {
	public MyButtonTest() {
		super("MyButtonTest");
		
		JPanel jp = new JPanel();
		
		//FlowLayoutでは部品を左から配置
		jp.setLayout(new FlowLayout());
		
//		BorderLayoutでは部品を
//		上部(North)、下部(South)、右側(East)、
//		左側(West)、中央(Center)に配置
		
		getContentPane().add(jp);
		
		Button rectButton = new Button("Rectangle");
		jp.add(rectButton);
		
		Button ovalButton = new Button("Oval");
		jp.add(ovalButton);
		
		Button triangleButton = new Button("Triangle");
		jp.add(triangleButton);
		
		setSize(300,250);
		
	}
	
	public static void main(String[] args) {
		MyButtonTest myapp = new MyButtonTest();
		myapp.setVisible(true);
	}
}

//https://www.iplab.cs.tsukuba.ac.jp/lecture/java/text/layout.html