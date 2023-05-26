package q3_1;

public class StateManager {
    State state;
    MyCanvas canvas;
    private int lineWidth;
    private int lineNumber;
    private int strokeType;
    private boolean hasShadow = false;

    public StateManager(MyCanvas canvas) {
	this.canvas = canvas;
    }

    public void setState(State state) {
	this.state = state;
    }

    public void repaint() { canvas.repaint(); }
    public void mouseDown(int x, int y) { state.mouseDown(x, y); }
    public void mouseUp(int x, int y) { state.mouseUp(x, y); }
    public void mouseDrag(int x, int y) { state.mouseDrag(x, y); }
    public MyDrawing getSelectedDrawing() { return canvas.getMediator().getSelectedDrawing(); }
    public void setSelected(int x, int y) { canvas.getMediator().setSelected(x, y); }
    public void addDrawing(MyDrawing d) { canvas.getMediator().addDrawing(d); }
    public void removeDrawing(MyDrawing d) { canvas.getMediator().removeDrawing(d); }

    public int getLineWidth() { return lineWidth; }
    public void setLineWidth(int lineWidth) { this.lineWidth = lineWidth; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public int getStrokeType() { return strokeType; }
    public void setStrokeType(int strokeType) { this.strokeType = strokeType; }
    public void setHasShadow(boolean hasShadow) { this.hasShadow = hasShadow; }
    public boolean getHasShadow() { return hasShadow; }
}
