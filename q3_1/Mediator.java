package q3_1;

import java.util.Enumeration;
import java.util.Vector;

public class Mediator {
    Vector<MyDrawing> drawings;
    MyCanvas canvas;
    MyDrawing selectedDrawing = null;

    public Mediator(MyCanvas canvas) {
	this.canvas = canvas;
	drawings = new Vector<MyDrawing>();
    }

    public Enumeration<MyDrawing> drawingElements() {
	return drawings.elements();
    }

    public void addDrawing(MyDrawing d) {
	drawings.add(d);
	setSelectedDrawing(d);
    }

    public void removeDrawing(MyDrawing d) {
	drawings.remove(d);
    }

    public MyDrawing getSelectedDrawing() {
	return selectedDrawing;
    }

    public void setSelectedDrawing(MyDrawing selectedDrawing) {
	if (this.selectedDrawing != null)
	    this.selectedDrawing.setSelected(false);
	this.selectedDrawing = selectedDrawing;
	if (selectedDrawing != null)
	    selectedDrawing.setSelected(true);
    }

    public void move(int dx, int dy) {
	if (selectedDrawing != null)
	    selectedDrawing.move(dx, dy);
    }

    public void repaint() {
	canvas.repaint();
    }

    public void setSelected(int x, int y) {
	System.out.println("Mediator.setSelected: x="+x+",y="+y);
	System.out.println("Mediator.setSelected: selectedDrawing="+selectedDrawing);

	MyDrawing result = null;
	for (MyDrawing d : drawings)
	    if (d.contains(x, y))
		result = d;
	setSelectedDrawing(result);

	System.out.println("Mediator.setSelected: selectedDrawing="+selectedDrawing);
    }
}
