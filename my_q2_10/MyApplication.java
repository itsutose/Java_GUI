package my_q2_10;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyApplication extends JFrame {
	
	StateManager stateManager;
	MyCanvas canvas;
	
    public MyApplication() {
	super("MyApplication my_q2_10");
	
	canvas = new MyCanvas();
	canvas.setBackground(Color.white);

	JPanel jp = new JPanel();
	jp.setLayout(new FlowLayout());

	stateManager = new StateManager(canvas);
	
	stateManager.setState(new RectState(stateManager));

	RectButton rectButton = new RectButton(stateManager);
	jp.add(rectButton);
	OvalButton ovalButton = new OvalButton(stateManager);
	jp.add(ovalButton);


	canvas.addMouseListener(new MouseAdapter() {
		// キャンバスがクリックされたときif文で処理を場合分けする
		public void mousePressed(MouseEvent e) {
//			System.out.println("mouseListener pressed");
		   stateManager.mouseDown(e.getX(),e.getY());
		}
		
		public void mouseReleased(MouseEvent e) {
		   stateManager.mouseUp(e.getX(),e.getY());
		}
		
	    });
	
	canvas.addMouseMotionListener(new MouseAdapter() {

		public void mouseDragged(MouseEvent e) {
			stateManager.mouseDragged(e.getX(),e.getY());
		}
	    });
	
	this.addWindowListener(new WindowAdapter() {
		// ウィンドウが閉じられて終了
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
