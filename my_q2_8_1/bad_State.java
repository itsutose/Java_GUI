package my_q2_8_1;

public class bad_State {
    public static final int RECTANGLE = 1;
    public static final int OVAL = 2;

    private int currentState;

    public bad_State() {
    	currentState = RECTANGLE;
    }

    public void setState(int bad_state) {
    	currentState = bad_state;
    }

    public int getState() {
    	return currentState;
    }
}