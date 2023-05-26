package q2_5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyButtonTest2 extends JFrame {
    public MyButtonTest2() {
	super("MyButtonTest");

	JPanel jp = new JPanel();
	jp.setLayout(new FlowLayout());
	getContentPane().add(jp);

	JButton rectButton = new JButton("Rectangle");
	rectButton.addActionListener(new RectButtonListener());
	jp.add(rectButton);

	JButton circleButton = new JButton("Circle");
	circleButton.addActionListener(new CircleButtonListener());
	jp.add(circleButton);

	JButton triangleButton = new JButton("Triangle");
	triangleButton.addActionListener(new TriangleButtonListener());
	jp.add(triangleButton);

	setSize(300, 250);
    }

    public static void main(String[] args) {
	MyButtonTest2 myapp = new MyButtonTest2();
	myapp.setVisible(true);
    }
}

// Rect ボタンのイベントリスナ
class RectButtonListener implements ActionListener {
    // Rect ボタンが押されたときの処理をここに書く
    public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, "Rect is pressed.");
    }
}

// Circle ボタンのイベントリスナ
class CircleButtonListener implements ActionListener {
    // Circle ボタンが押されたときの処理をここに書く
    public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, "Circle is pressed.");
    }
}

// Triangle ボタンのイベントリスナ
class TriangleButtonListener implements ActionListener {
    // Triangle ボタンが押されたときの処理をここに書く
    public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, "Triangle is pressed.");
    }
}