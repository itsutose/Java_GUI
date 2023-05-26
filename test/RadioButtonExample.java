package test;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ラジオボタンの例");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JRadioButton radioButton1 = new JRadioButton("選択肢1");
        JRadioButton radioButton2 = new JRadioButton("選択肢2");
        JRadioButton radioButton3 = new JRadioButton("選択肢3");

        ButtonGroup group = new ButtonGroup();
        
        // コメントアウトを外すと単一入力になる
//        group.add(radioButton1);
//        group.add(radioButton2);
//        group.add(radioButton3);

        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}