package q2_8_1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyRectangle extends MyDrawing {
    public MyRectangle(int xpt, int ypt) {
    	super(xpt, ypt);
    }

    public MyRectangle(int x, int y, int w, int h,
    	Color lineColor, Color fillColor, int lineWidth) {
    	super(x, y, w, h, lineColor, fillColor, lineWidth);
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