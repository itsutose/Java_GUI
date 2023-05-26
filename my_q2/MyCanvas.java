package my_q2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;

public class MyCanvas extends JPanel {
    // 各図形を格納する Vector
    private Vector<MyDrawing> drawings;

    public MyCanvas() {
	setBackground(Color.white);
	drawings = new Vector<MyDrawing>();
    }

    public void paint(Graphics g) {
	 	super.paint(g);
		for (MyDrawing d : drawings) {
		    d.draw(g);
		}
    }

    // 図形を描画する
    public void addDrawing(MyDrawing d) {
    	// 引数のdは図形のインスタンス(new MyRectangle()とか)，
    	// dは引数の時点でインスタンス化されているものを渡す
    	drawings.add(d);
    }

    public void removeDrawing(MyDrawing d) {
    	drawings.remove(d);
    }	
}