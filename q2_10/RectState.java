package q2_10;

public class RectState extends State {
    StateManager stateManager;

    public RectState(StateManager stateManager) {
	this.stateManager = stateManager;
    }

    int x1, y1, x2, y2;
    MyRectangle r;
    public void mouseDown(int x, int y) {
	x1 = x2 = x;
	y1 = y2 = y;
	r = new MyRectangle(x1, y1);
	r.setSize(0, 0);
	r.setDashed(stateManager.getDashed());
	stateManager.addDrawing(r);
    }

    public void mouseUp(int x, int y) {
	x2 = x;
	y2 = y;
	if (Math.abs(x2-x1) < 5 || Math.abs(y2-y1) < 5)
	    stateManager.removeDrawing(r);
	else
	    r.setSize(x2-x1, y2-y1);
    }

    public void mouseDrag(int x, int y) {
	x2 = x;
	y2 = y;
	r.setSize(x2-x1, y2-y1);
    }
}
