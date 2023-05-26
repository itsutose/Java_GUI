package my_q3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;

public class MyDrawing {
    private int x, y, w, h;	        // X ���W�AY ���W�A���A����
    private Color lineColor, fillColor; // �@�̐F�A�h��F
    private int lineWidth;		// ���̑���
    private int lineNumber;		// ���̐�
    private int strokeType;	        // ���̎��
    private boolean hasShadow = false;	// �h���b�v�V���h�E�������ǂ���
    public static final int SHADOW_X_OFFSET = 3;
    public static final int SHADOW_Y_OFFSET = 5;

    boolean isSelected;
    Shape region;		        // ��ܔ���p
    static final int SIZE = 3;

    public MyDrawing() {
	this(0, 0, 40, 40, Color.black, Color.white, 1, 1, 0, false);
    }
    
    public MyDrawing(int xpt, int ypt) {
	this(xpt, ypt, 40, 40, Color.black, Color.white, 1, 1, 0, false);
    }

    public MyDrawing(int x, int y, int w, int h, Color lineColor, Color fillColor, int lineWidth, int lineNumber, int strokeType, boolean hasShadow) {
	this.x = x;
	this.y = y;
	this.w = w;
	this.h = h;
	this.lineColor = lineColor;
	this.fillColor = fillColor;
	this.lineWidth = lineWidth;
 	this.lineNumber = lineNumber;
	this.strokeType = strokeType;
	this.hasShadow = hasShadow;
	setRegion();
    }

    public void draw(Graphics g) {
	// �I����Ԃ�\���l�p�`��`��
	if (isSelected) {
	    g.setColor(Color.black);
	    g.fillRect(x+w/2-SIZE, y-SIZE, SIZE*SIZE, SIZE*SIZE);
	    g.fillRect(x-SIZE, y+h/2-SIZE, SIZE*SIZE, SIZE*SIZE);
	    g.fillRect(x+w/2-SIZE, y+h-SIZE, SIZE*SIZE, SIZE*SIZE);
	    g.fillRect(x+w-SIZE, y+h/2-SIZE, SIZE*SIZE, SIZE*SIZE);
	    g.fillRect(x-SIZE, y-SIZE, SIZE*SIZE, SIZE*SIZE);
	    g.fillRect(x+w-SIZE, y-SIZE, SIZE*SIZE, SIZE*SIZE);
	    g.fillRect(x-SIZE, y+h-SIZE, SIZE*SIZE, SIZE*SIZE);
	    g.fillRect(x+w-SIZE, y+h-SIZE, SIZE*SIZE, SIZE*SIZE);
	}
    }

    public void move(int dx, int dy) {
	// �I�u�W�F�N�g���ړ����鏈��������
	x += dx;
	y += dy;
	setRegion();
    }

    public void setLocation(int x, int y) {
	// �I�u�W�F�N�g�̈ʒu��ύX���鏈��������
	this.x = x;
	this.y = y;
	setRegion();
    }

    public void setSize(int w, int h) {
	// �I�u�W�F�N�g�̃T�C�Y��ύX���鏈��������
	this.w = w;
	this.h = h;
	setRegion();
    }

    public int getX() {
	// �I�u�W�F�N�g�� X �ʒu���擾���鏈��������
	return x;
    }

    public int getY() { return y; }
    public int getW() { return w; }
    public int getH() { return h; }
    public Color getLineColor() { return lineColor; }
    public void setLineColor(Color lineColor) { this.lineColor = lineColor; }
    public Color getFillColor() { return fillColor; }
    public void setFillColor(Color fillColor) { this.fillColor = fillColor; }
    public int getLineWidth() { return lineWidth; }
    public void setLineWidth(int lineWidth) { this.lineWidth = lineWidth; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public int getStrokeType() { return strokeType; }
    public void setStrokeType(int strokeType) { this.strokeType = strokeType; }
    public void setHasShadow(boolean hasShadow) { this.hasShadow = hasShadow; }
    public boolean getHasShadow() { return hasShadow; }

    // ��ܔ���p�̃��\�b�h
    public boolean contains(int x, int y) {
	return region.contains(x, y);
    }

    public boolean getSelected() {
	return isSelected;
    }

    public void setSelected(boolean isSelected) {
	this.isSelected = isSelected;
    }

    public void setRegion() {
 	region = new Rectangle(x, y, w, h);
    }
}
