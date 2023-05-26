package my_q2_10;

import java.awt.Color;
import java.awt.Graphics;

public class MyDrawing {
    private int x, y, w, h;	       
    private Color lineColor, fillColor; // �@�̐F�A�h��F
    private int lineWidth;		// ���̑���
    
    private boolean isDashed = true; // if true : 破線 
    
    public MyDrawing() {
    	this(0, 0, 40, 40, Color.black, Color.white, 1);
    }
    
    public MyDrawing(int xpt, int ypt) {
    	this(xpt, ypt, 40, 40, Color.black, Color.white, 1);
    }
    
    public MyDrawing(int x, int y, int w, int h) {
    	this(x, y, w, h, Color.black, Color.white, 1);
    }

    public MyDrawing(int x, int y, int w, int h, Color lineColor, Color fillColor, int lineWidth) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.lineWidth = lineWidth;
    }

    public void draw(Graphics g) {

    }

    public void move(int dx, int dy) {
		x += dx;
		y += dy;
    }

    public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
    }

    public void setSize(int w, int h) {
		this.w = w;
		this.h = h;
    }
    
    public void setDashed(boolean b) {
    	isDashed = b;
    }
    
    public int getX() {	return x; }
    public int getY() { return y; }
    public int getW() { return w; }
    public int getH() { return h; }
    public Color getLineColor() { return lineColor; }
    public void setLineColor(Color lineColor) { this.lineColor = lineColor; }
    public Color getFillColor() { return fillColor; }
    public void setFillColor(Color fillColor) { this.fillColor = fillColor; }
    public int getLineWidth() { return lineWidth; }
    public void setLineWidth(int lineWidth) { this.lineWidth = lineWidth; }
    public boolean getDashed() { return isDashed; }
}
