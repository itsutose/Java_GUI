package q2_9;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyApplication extends JFrame {
    StateManager stateManager;
    MyCanvas canvas;

    public MyApplication() {
	super("My Paint Application");

	canvas = new MyCanvas();

	JPanel jp = new JPanel();
	jp.setLayout(new FlowLayout());

	stateManager = new StateManager(canvas);
	stateManager.setState(new RectState(stateManager));

	RectButton rectButton = new RectButton(stateManager);
	jp.add(rectButton);
	OvalButton ovalButton = new OvalButton(stateManager);
	jp.add(ovalButton);

	getContentPane().setLayout(new BorderLayout());
	getContentPane().add(jp, BorderLayout.NORTH);
	getContentPane().add(canvas, BorderLayout.CENTER);

	canvas.addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent e) {
		    stateManager.mouseDown(e.getX(), e.getY());
		    canvas.repaint();
		}
		public void mouseReleased(MouseEvent e) {
		    stateManager.mouseUp(e.getX(), e.getY());
		    canvas.repaint();
		}
	    });
	canvas.addMouseMotionListener(new MouseMotionAdapter() {
		public void mouseDragged(MouseEvent e) {
		    stateManager.mouseDrag(e.getX(), e.getY());
		    canvas.repaint();
		}
	    });
	
	this.addWindowListener(new WindowAdapter() {
		// �E�B���h�E������I��
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
