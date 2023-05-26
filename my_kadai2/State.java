package my_kadai2;

public abstract class State {
    public abstract void mouseDown(int x, int y);
    public abstract void mouseUp(int x, int y);
    public abstract void mouseDrag(int x, int y);
    public abstract void setShadow(boolean b);
    public abstract boolean getShadow();
    public abstract void setDashed(boolean b);
    public abstract boolean getDashed();
}
