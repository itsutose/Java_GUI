package q2_10;

public class StateManager {
    State state;
    MyCanvas canvas;
    private boolean isDashed = true;

    public StateManager(MyCanvas canvas) {
	this.canvas = canvas;
    }

    public void setState(State state) {
	this.state = state;
    }

    public void mouseDown(int x, int y) { state.mouseDown(x, y); }
    public void mouseUp(int x, int y) { state.mouseUp(x, y); }
    public void mouseDrag(int x, int y) { state.mouseDrag(x, y); }
    public void addDrawing(MyDrawing d) { canvas.addDrawing(d); }
    public void removeDrawing(MyDrawing d) { canvas.removeDrawing(d); }

    public void setDashed(boolean b) { isDashed = b; }
    public boolean getDashed() { return isDashed; }
}
