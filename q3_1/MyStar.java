package q3_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class MyStar extends MyDrawing {
    public MyStar(int xpt, int ypt) {
	super(xpt, ypt);
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
  	g2.setStroke(new MyStroke(getLineWidth(), getStrokeType()));

	if (getHasShadow()) {
 	    g2.setColor(Color.black);
	    g2.fillPolygon(makePolygon(x+(double)w/2+SHADOW_X_OFFSET, y+(double)h/2+SHADOW_Y_OFFSET, (double)w/2, (double)h/2));
	}

	g2.setColor(getFillColor());
	g2.fillPolygon(makePolygon(x+(double)w/2, y+(double)h/2, (double)w/2, (double)h/2));
	g.setColor(getLineColor());
	int lw = getLineWidth();
	int ln = getLineNumber();
	for (int i = 0; i < ln; i++) {
	    double cx = x+(double)w/2;
	    double cy = y+(double)h/2;
	    double rx = (double)w/2-i*4*lw;
	    double ry = (double)h/2-i*4*lw;
	    if (rx < 0 || ry < 0)
		break;
	    g2.drawPolygon(makePolygon(cx, cy, rx, ry));
	}

	super.draw(g);
    }

    public void setRegion() {
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

	region = makePolygon(x+(double)w/2, y+(double)h/2, (double)w/2, (double)h/2);
    }

    private Polygon makePolygon(double cx, double cy, double rx, double ry) {
	int[] xp = new int[10];
	int[] yp = new int[10];
	for (int i = 0; i < 10; i++) {
 	    xp[i] = (int)(cx + (i%2==0 ? rx : rx*0.5)*Math.cos(i*Math.PI/5.0));
 	    yp[i] = (int)(cy + (i%2==0 ? ry : ry*0.5)*Math.sin(i*Math.PI/5.0));
	}
	return new Polygon(xp, yp, 10);
    }
}
