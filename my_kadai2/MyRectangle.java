package my_kadai2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyRectangle extends MyDrawing {
    public MyRectangle(int xpt, int ypt) {
    	super(xpt, ypt);
    }
    
    public MyRectangle(int xpt, int ypt, int w, int h) {
    	super(xpt, ypt, w, h);
    }

    public MyRectangle(int x, int y, int w, int h, Color lineColor, Color fillColor, int lineWidth) {
    	super(x, y, w, h, lineColor, fillColor, lineWidth);
    }

    public void draw(Graphics g) {
	int x = getX();
	int y = getY();
	int w = getW();
	int h = getH();

	// �����≡�������̎��̂��߂̏���
	if (w < 0) {
	    x += w;
	    w *= -1;
	}
	if (h < 0) {
	    y += h;
	    h *= -1;
	}

	Graphics2D g2 = (Graphics2D) g;
	
	if (getDashed()) {
		g2.setStroke(new MyDashStroke(getLineWidth()));
	}else {
		g2.setStroke(new BasicStroke(getLineWidth()));
	}
		g2.setColor(getFillColor());
		g2.fillRect(x, y, w, h);
		g2.setColor(getLineColor());
		g2.drawRect(x, y, w, h);
    }
}