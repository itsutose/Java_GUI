package my_kadai2;

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
    
    public void setShadow(boolean b) { oval.setShadow(b); }
    public void setDashed(boolean b) { oval.setDashed(b); }
    
    public boolean getShadow() {return oval.getShadow(); }
    public boolean getDashed() {return oval.getDashed(); }
}
