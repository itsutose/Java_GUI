package q2_8_1;

public class State {
    public static final int RECTANGLE = 1;
    public static final int OVAL = 2;

    private int currentState;

    public State() {
	currentState = RECTANGLE;
    }

    public void setState(int state) {
	currentState = state;
    }

    public int getState() {
	return currentState;
    }
}