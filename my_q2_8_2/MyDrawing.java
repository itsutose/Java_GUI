package my_q2_8_2;

import java.awt.Color;
import java.awt.Graphics;

public class MyDrawing {
    private int x, y, w, h;	        // X ���W�AY ���W�A���A����
    private Color lineColor, fillColor; // �@�̐F�A�h��F
    private int lineWidth;		// ���̑���

    public MyDrawing() {
	this(0, 0, 40, 40, Color.black, Color.white, 1);
    }
    
    public MyDrawing(int xpt, int ypt) {
	this(xpt, ypt, 40, 40, Color.black, Color.white, 1);
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
	// �I�u�W�F�N�g���ړ����鏈��������
	x += dx;
	y += dy;
    }

    public void setLocation(int x, int y) {
	// �I�u�W�F�N�g�̈ʒu��ύX���鏈��������
	this.x = x;
	this.y = y;
    }

    public void setSize(int w, int h) {
	// �I�u�W�F�N�g�̃T�C�Y��ύX���鏈��������
	this.w = w;
	this.h = h;
    }

    public int getX() {
	// �I�u�W�F�N�g�� X �ʒu���擾���鏈��������
	return x;
    }

    // ���̑� lineColor�AfillColor �����擾�A�ݒ肷�郁�\�b�h�������ŏ�������
    // ***Web�y�[�W�Ɍf�ڂ���R�[�h����͂��̍s���܂߂�
    public int getY() { return y; }
    public int getW() { return w; }
    public int getH() { return h; }
    public Color getLineColor() { return lineColor; }
    public void setLineColor(Color lineColor) { this.lineColor = lineColor; }
    public Color getFillColor() { return fillColor; }
    public void setFillColor(Color fillColor) { this.fillColor = fillColor; }
    public int getLineWidth() { return lineWidth; }
    public void setLineWidth(int lineWidth) { this.lineWidth = lineWidth; }
    // ***�����܂ł��폜����B
}
