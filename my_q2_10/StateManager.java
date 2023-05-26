package my_q2_10;

public class StateManager {
	MyCanvas sm_canvas;
	State state;
	
	// MyApplication.javaより
	public StateManager(MyCanvas canvas) {
		this.sm_canvas = canvas;
	}
	
	// MyApplication.javaより
	public void mouseDown(int x, int y){
		state.mouseDown(x, y);
	}
	
	public void mouseUp(int x, int y) {
		state.mouseUp(x, y);
	}
	
	public void mouseDragged(int x, int y) {
//		System.out.println("mouseDragged");
//		System.out.println(String.format("int x: %d", x));
		state.mouseDrag(x, y);
	}

	// RectButton.javaより
	public void setState(State state) {
		this.state = state;
	}
	
	// RectState.javaより
	// addDrawingはcanvas.addDrawingする
	public void addDrawing(MyDrawing d){
		// canvas.addDrawingに図形を入れる
		sm_canvas.addDrawing(d);
		// canvasのメソッドで再描画
		sm_canvas.repaint();
		
		// 再描画についてはMyCanvasの描画プロセスを追えばわかる
	}
	
	public void repaint() {
		sm_canvas.repaint();
	}
}
