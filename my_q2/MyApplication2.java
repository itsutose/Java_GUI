package my_q2;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyApplication2 extends JFrame{
	public MyApplication2() {
		super("My Painter");
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		MyCanvas canvas = new MyCanvas();
		
		jp.add(BorderLayout.CENTER, canvas);
		getContentPane().add(jp);
		
		// MyMouseAdapterをインスタンス化
		MyMouseAdapter ma = new MyMouseAdapter(canvas);
		canvas.addMouseListener(ma);
		
		addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(1);;
			}
		});
	}
	
	public static void main(String[] args) {
		MyApplication2 ma = new MyApplication2();
		ma.setSize(400,300);
		ma.setVisible(true);
	}
}


class MyMouseAdapter extends MouseAdapter{
	private MyCanvas canvas;
	
	// canvasを設定
	public MyMouseAdapter(MyCanvas canvas) {
		this.canvas = canvas;
	}
	
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse click");
		canvas.addDrawing(new MyRectangle(e.getX(), e.getY()));
	
		canvas.repaint();

	}
}