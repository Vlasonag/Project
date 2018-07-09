package task2;

public class View {
	
	
	public static final String WRONG_RANGE_DATA = "Out of range! ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
	public static final String INPUT_INT_DATA = "Guess an integer figure in a range of: ";
	public static final String LEFT_BARRIER = "(";
	public static final String RIGHT_BARRIER = ")";
	public static final String COMMA = ", ";
	public static final String WRONG_FIGURE = "You did not guess the figure! Try another one. ";
	public static final String TRY_NUMBER = "Your try number";
	public static final String CONGRUTILATIONS = "Congratulations!";

    public void printMessage(String message){
        System.out.println(message);
    }
}
