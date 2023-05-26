package q2_10;

public class OvalState extends State {
    StateManager stateManager;

    public OvalState(StateManager stateManager) {
	this.stateManager = stateManager;
    }

    int x1, y1, x2, y2;
    MyOval o;
    public void mouseDown(int x, int y) {
	x1 = x2 = x;
	y1 = y2 = y;
	o = new MyOval(x1, y1);
	o.setSize(0, 0);
	o.setDashed(stateManager.getDashed());
	stateManager.addDrawing(o);
    }

    public void mouseUp(int x, int y) {
	x2 = x;
	y2 = y;
	if (Math.abs(x2-x1) < 5 || Math.abs(y2-y1) < 5)
	    stateManager.removeDrawing(o);
	else
	    o.setSize(x2-x1, y2-y1);
    }

    public void mouseDrag(int x, int y) {
	x2 = x;
	y2 = y;
	o.setSize(x2-x1, y2-y1);
    }
}
