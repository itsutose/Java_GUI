package my_kadai2;

public class RectState extends State {
    StateManager stateManager;
    MyDrawing rect = new MyRectangle(0, 0, 0, 0);
    private boolean isDashed = false;

    public RectState(StateManager stateManager) {
    	this.stateManager = stateManager;
    }

    public void mouseDown(int x, int y) {
    	rect = new MyRectangle(x, y, 0, 0);
    	rect.setDashed(isDashed);
    	stateManager.addDrawing(rect);
    }

    public void mouseUp(int x, int y) {
    	int _w = rect.getW();
    	int _h = rect.getH();
    	int _lx = rect.getX();
    	int _ly = rect.getY();
    	
    	if( _w < 0) {
    		rect.setLocation(_lx + _w , _ly);
    		rect.setSize( _w*(-1), _h);
    	}
    	
    	if( _h < 0) {
    		rect.setLocation(_lx, _ly + _h);
    		rect.setSize( _w, _h*(-1));
    	}
    }
    
    public void mouseDrag(int x, int y) {
    	int _x = rect.getX();
    	int _y = rect.getY();
    	
    	rect.setSize(x - _x, y - _y);
    	stateManager.repaint();
    }
    
    public void setShadow(boolean b) { rect.setShadow(b); }
    public void setDashed(boolean b) { this.isDashed = b; }
    
    public boolean getShadow() {
//    	System.out.println(
//    			String.format("x:%d y:%d", rect.getX(), rect.getX()));
//    	System.out.println(
//    			String.format("len(drawing):%d", stateManager.sm_canvas.getVecSize()));
    	return rect.getShadow(); }
    public boolean getDashed() {return this.isDashed; }
}
