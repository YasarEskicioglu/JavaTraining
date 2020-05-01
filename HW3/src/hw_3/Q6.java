package hw_3;

public class Q6 {

	public static void main(String[] args) {
		
		// parentheses are optional in ternary operator.
		long thatNumber = 5 >= 5 ? 1+2 : 1*1 ;
		if (++thatNumber < 4)
			// thatNumber gets 4 in if condition and exit from it.
			// This line a form of thatNumber = thatNumber + 1
				thatNumber +=1;
		System.out.print(thatNumber);

	}
	
}

