package q3_1;

public class PentagonState extends State {
    StateManager stateManager;

    public PentagonState(StateManager stateManager) {
	this.stateManager = stateManager;
    }

    int x1, y1, x2, y2;
    MyPentagon p;
    public void mouseDown(int x, int y) {
	x1 = x2 = x;
	y1 = y2 = y;
	p = new MyPentagon(x1, y1);
	p.setSize(0, 0);
	p.setLineWidth(stateManager.getLineWidth());
	p.setLineNumber(stateManager.getLineNumber());
	p.setStrokeType(stateManager.getStrokeType());
	p.setHasShadow(stateManager.getHasShadow());
	stateManager.addDrawing(p);
    }

    public void mouseUp(int x, int y) {
	x2 = x;
	y2 = y;
	if (Math.abs(x2-x1) < 5 || Math.abs(y2-y1) < 5)
	    stateManager.removeDrawing(p);
	else
	    p.setSize(x2-x1, y2-y1);
    }

    public void mouseDrag(int x, int y) {
	x2 = x;
	y2 = y;
	p.setSize(x2-x1, y2-y1);
    }
}
