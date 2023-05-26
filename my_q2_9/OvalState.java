package my_q2_9;

public class OvalState extends State {
    StateManager stateManager;
    MyDrawing oval;

    public OvalState(StateManager stateManager) {
	this.stateManager = stateManager;
    }

    public void mouseDown(int x, int y) {
    	oval = new MyOval(x, y, 0, 0);
    	stateManager.addDrawing(oval);
    }

    public void mouseUp(int x, int y) {}
    public void mouseDrag(int x, int y) {
    	int _x = oval.getX();
    	int _y = oval.getY();
    	    	
    	oval.setSize(x - _x, y - _y);
    	stateManager.repaint();
    }
}
