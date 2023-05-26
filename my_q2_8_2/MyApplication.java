package my_q2_8_2;

import java.awt.BorderLayout;
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
	super("MyApplication myq2_8_2");
    

	canvas = new MyCanvas();
	canvas.setBackground(Color.white);

	JPanel jp = new JPanel();
	jp.setLayout(new FlowLayout());

//	state = new State();
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
		// キャンバスがクリックされたときif文で処理を場合分けする
		public void mousePressed(MouseEvent e) {
		   stateManager.mouseDown(e.getX(),e.getY());
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
