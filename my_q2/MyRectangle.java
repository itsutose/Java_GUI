package my_q2;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyRectangle extends MyDrawing {
    public MyRectangle(int xpt, int ypt) {
	super();
	setLocation(xpt, ypt);
    }

    public void draw(Graphics g) {
	int x = getX();
	int y = getY();
	int w = getW();
	int h = getH();

	// 高さや横幅が負の時のための処理
	if (w < 0) {
	    x += w;
	    w *= -1;
	}
	if (h < 0) {
	    y += h;
	    h *= -1;
	}

	Graphics2D g2 = (Graphics2D) g;
	g2.setStroke(new BasicStroke(getLineWidth()));
	g2.setColor(getFillColor());
	g.fillRect(x, y, w, h);
	g.setColor(getLineColor());
	g.drawRect(x, y, w, h);
    }
}