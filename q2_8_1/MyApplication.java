package q2_8_1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyApplication extends JFrame {
    State state;
    MyCanvas canvas;

    public MyApplication() {
	super("My Paint Application");

	canvas = new MyCanvas();

	JPanel jp = new JPanel();
	jp.setLayout(new FlowLayout());

	state = new State();

	RectButton rectButton = new RectButton(state);
	jp.add(rectButton);
	OvalButton ovalButton = new OvalButton(state);
	jp.add(ovalButton);

	getContentPane().setLayout(new BorderLayout());
	getContentPane().add(jp, BorderLayout.NORTH);
	getContentPane().add(canvas, BorderLayout.CENTER);

	canvas.addMouseListener(new MouseAdapter() {
		// キャンバスがクリックされたときif文で処理を場合分けする
		public void mousePressed(MouseEvent e) {
		    if (state.getState() == State.RECTANGLE) {
			canvas.addDrawing(new MyRectangle(e.getX(), e.getY()));
			canvas.repaint();
		    } else if (state.getState() == State.OVAL) {
			canvas.addDrawing(new MyOval(e.getX(), e.getY()));
			canvas.repaint();
		    }
		}
	    });
	
	this.addWindowListener(new WindowAdapter() {
		// ウィンドウが閉じら終了
		public void windowClosing(WindowEvent e) {
		    System.exit(0);
		}
	    });
    }

    public Dimension getPreferredSize() {
	return new Dimension(300, 400);
    }

    public static void main(String[] args) {
	MyApplication app = new MyApplication();
	app.pack();
	app.setVisible(true);
    }
}
