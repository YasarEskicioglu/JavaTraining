package hw_1;

public class Q21 {
	private static int yesterday = 1;
	int tomorrow = 10;

	public static void main(String[] args) { 
		Q21 q21 = new Q21();
		int today = 20, tomorrow = 40;		// In this line, tomorrow variable is useless.
		// Value is come from above statement.
		System.out.println(today + q21.tomorrow + q21.yesterday);
	

	}

}
