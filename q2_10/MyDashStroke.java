package q2_10;

import java.awt.BasicStroke;

public class MyDashStroke extends BasicStroke {
    private static final float[] pattern = {10, 15};

    public MyDashStroke(float lineWidth) {
	super(lineWidth, CAP_BUTT, JOIN_BEVEL, 1.0f, pattern, 0);
    }
}
