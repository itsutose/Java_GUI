package my_q2;


import java.awt.Color;
import java.awt.Graphics;

public class MyDrawing {
    private int x, y, w, h;	        // X 座標、Y 座標、幅、高さ
    private Color lineColor, fillColor; // 繊の色、塗り色
    private int lineWidth;		// 線の太さ

    public MyDrawing() {
	x = y = 0;
	w = h = 40;
	lineColor = Color.black;
	fillColor = Color.white;
	lineWidth = 1;
    }

    public MyDrawing(int x, int y) {
	this.x = x;
	this.y = y;
	w = h = 40;
	lineColor = Color.black;
	fillColor = Color.white;
	lineWidth = 1;
    }
    
    public void draw(Graphics g) {

    }

    public void move(int dx, int dy) {
	// オブジェクトを移動する処理を書く
	x += dx;
	y += dy;
    }

    public void setLocation(int x, int y) {
	// オブジェクトの位置を変更する処理を書く
	this.x = x;
	this.y = y;
    }

    public void setSize(int w, int h) {
	// オブジェクトのサイズを変更する処理を書く
	this.w = w;
	this.h = h;
    }

    public int getX() {
	// オブジェクトの X 位置を取得する処理を書く
	return x;
    }

    // その他 lineColor、fillColor 等を取得、設定するメソッドを自分で書くこと
    // ***Webページに掲載するコードからはこの行を含めて
    public int getY() { return y; }
    public int getW() { return w; }
    public int getH() { return h; }
    
    public Color getLineColor() { return lineColor; }
    public void setLineColor(Color lineColor) { this.lineColor = lineColor; }
    public Color getFillColor() { return fillColor; }
    public void setFillColor(Color fillColor) { this.fillColor = fillColor; }
    public int getLineWidth() { return lineWidth; }
    public void setLineWidth(int lineWidth) { this.lineWidth = lineWidth; }
    // ***ここまでを削除する。
}