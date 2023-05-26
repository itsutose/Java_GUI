package q3_1;

public class StarState extends State {
    StateManager stateManager;

    public StarState(StateManager stateManager) {
	this.stateManager = stateManager;
    }

    int x1, y1, x2, y2;
    MyStar s;
    public void mouseDown(int x, int y) {
	x1 = x2 = x;
	y1 = y2 = y;
	s = new MyStar(x1, y1);
	s.setSize(0, 0);
	s.setLineWidth(stateManager.getLineWidth());
	s.setLineNumber(stateManager.getLineNumber());
	s.setStrokeType(stateManager.getStrokeType());
	s.setHasShadow(stateManager.getHasShadow());
	stateManager.addDrawing(s);
    }

    public void mouseUp(int x, int y) {
	x2 = x;
	y2 = y;
	if (Math.abs(x2-x1) < 5 || Math.abs(y2-y1) < 5)
	    stateManager.removeDrawing(s);
	else
	    s.setSize(x2-x1, y2-y1);
    }

    public void mouseDrag(int x, int y) {
	x2 = x;
	y2 = y;
	s.setSize(x2-x1, y2-y1);
    }
}
