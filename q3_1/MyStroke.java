package q3_1;

import java.awt.BasicStroke;

public class MyStroke extends BasicStroke {
    private static final float[][] pattern = {{1, 0}, {2, 2}, {10, 15}};

    public MyStroke(float lineWidth, int strokeType) {
	super(lineWidth, CAP_BUTT, JOIN_BEVEL, 1.0f, pattern[strokeType], 0);
    }
}
