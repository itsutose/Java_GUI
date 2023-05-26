package my_kadai2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;

public class MyCanvas extends JPanel {
    // �e�}�`���i�[���� Vector
    private Vector<MyDrawing> drawings;

    public MyCanvas() {
		setBackground(Color.white);
		drawings = new Vector<MyDrawing>();
    }

    // 格納した図形をfor文で描画する
    public void paint(Graphics g) {
	 	super.paint(g);
		for (MyDrawing d : drawings) {
		    d.draw(g);
		}
    }

    // 図形を格納用Vectorに格納
    public void addDrawing(MyDrawing d) {
	drawings.add(d);
    }

    public void removeDrawing(MyDrawing d) {
	drawings.remove(d);
    }	
    
    public int getVecSize() {
    	return drawings.size();
    }
}