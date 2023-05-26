package test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SliderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("バーの例");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(slider, BorderLayout.CENTER);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

//上記の例では、JFrameを作成し、その中にJSliderを配置しています。
//JSliderのコンストラクタには、スライダーの方向
//（JSlider.HORIZONTALまたはJSlider.VERTICAL）、
//最小値、最大値、初期値を指定します。
//この例では水平方向のスライダーを作成し、
//最小値は0、最大値は100、初期値は50に設定しています。
//
//setMajorTickSpacing()とsetMinorTickSpacing()メソッドを使用して、
//メジャーティックとミノーティックの間隔を設定します。
//setPaintTicks()とsetPaintLabels()メソッドを使用して、
//ティックとラベルの表示を有効にします。
//
//最後に、JSliderをJPanelに追加し、JPanelをJFrameに追加して表示します。
//
//これにより、基本的なバー（スライダー）が表示されます。
//ユーザーがバーの位置を変更すると、ChangeListenerを使用して
//イベントを検知することもできます。