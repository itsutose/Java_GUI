package q3_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyRectangle extends MyDrawing {
    public MyRectangle(int xpt, int ypt) {
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
	    g2.fillRect(x+SHADOW_X_OFFSET, y+SHADOW_Y_OFFSET, w, h);
	}

	g2.setColor(getFillColor());
	g.fillRect(x, y, w, h);
	g.setColor(getLineColor());
	int lw = getLineWidth();
	int ln = getLineNumber();
	for (int i = 0; i < ln; i++)
	    g.drawRect(x+i*2*lw, y+i*2*lw, w-i*4*lw, h-i*4*lw);

	super.draw(g);
    }
}