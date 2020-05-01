package hw_3;

public class Q40 {

	public static void main(String[] arguments) {
		int turtle = 10 * (2+(3+2)/5);
		int hare	= turtle < 5 ? 10 : 25;
		System.out.println( turtle < hare ? "Hare wins!" : "Turtle wins!");

	}

}
