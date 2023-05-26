package my_q2;

import static java.lang.System.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MyMouseEventTest extends JFrame{
	MyMouseEventTest(){
		super("Mouse Event Test");
		addMouseListener(new MyMouseListener());
		setSize(100, 100);
		System.out.println("public class MyMouseEventTest");
	}
	
	public static void main(String[] args) {
		MyMouseEventTest myapp = new MyMouseEventTest();
		out.println("public static void main");
		myapp.setVisible(true);
	}
}

class MyMouseListener extends MouseAdapter{
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked!");
	}
}
