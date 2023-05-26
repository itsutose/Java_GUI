package q3_1;

public class SelectState extends State {
    StateManager stateManager;

    public SelectState(StateManager stateManager) {
	this.stateManager = stateManager;
    }

    int x1, y1;
    public void mouseDown(int x, int y) {
	x1 = x;
	y1 = y;
	stateManager.setSelected(x, y);
    }

    public void mouseUp(int x, int y) {
	MyDrawing d = stateManager.getSelectedDrawing();
	if (d != null) {
	    d.move(x-x1, y-y1);
	    stateManager.repaint();
	}
	x1 = x;
	y1 = y;
    }

    public void mouseDrag(int x, int y) {
	MyDrawing d = stateManager.getSelectedDrawing();
	if (d != null) {
	    d.move(x-x1, y-y1);
	    stateManager.repaint();
	}
	x1 = x;
	y1 = y;
    }
}
