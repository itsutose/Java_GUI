package q2_9;

public class StateManager {
    State state;
    MyCanvas canvas;

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
}
