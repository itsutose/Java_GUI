package q3_1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
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

	SelectButton selectButton = new SelectButton(stateManager);
	jp.add(selectButton);

	RectButton rectButton = new RectButton(stateManager);
	jp.add(rectButton);
	OvalButton ovalButton = new OvalButton(stateManager);
	jp.add(ovalButton);
	PentagonButton pentagonButton = new PentagonButton(stateManager);
	jp.add(pentagonButton);
  	StarButton starButton = new StarButton(stateManager);
  	jp.add(starButton);

	jp.add(new JLabel("LineWidth:"));
	LineWidthValue lineValue = new LineWidthValue(stateManager);
	jp.add(lineValue);
	jp.add(new JLabel("LineNumber:"));
	LineNumberValue numberValue = new LineNumberValue(stateManager);
	jp.add(numberValue);
	jp.add(new JLabel("StrokeType:"));
	StrokeTypeSelector strokeSelector = new StrokeTypeSelector(stateManager);
	jp.add(strokeSelector);
	ShadowButton shadowButton = new ShadowButton(stateManager);
	jp.add(shadowButton);

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
		// �E�B���h�E��������I��
		public void windowClosing(WindowEvent e) {
		    System.exit(0);
		}
	    });
    }

    public Dimension getPreferredSize() {
	return new Dimension(1024, 600);
    }

    public static void main(String[] args) {
	MyApplication app = new MyApplication();
	app.pack();
	app.setVisible(true);
    }
}
