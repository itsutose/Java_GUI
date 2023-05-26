package q2_4;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyButtonTest extends JFrame {
    public MyButtonTest() {
	super("MyButtonTest");

	// FlowLayoutを使って部品を左から配置するパネルを作成
	JPanel jp = new JPanel();
	jp.setLayout(new FlowLayout());
	getContentPane().add(jp);

	JButton rectButton = new JButton("Rectangle");
	jp.add(rectButton);

	JButton circleButton = new JButton("Circle");
	jp.add(circleButton);

	JButton triangleButton = new JButton("Triangle");
	jp.add(triangleButton);

	setSize(300, 250);
    }

    public static void main(String[] args) {
	MyButtonTest myapp = new MyButtonTest();
	myapp.setVisible(true);
    }
}