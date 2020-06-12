package hw_9;

import java.util.function.Predicate;

public class Q16 {

	public static void main(String[] args) {
		Predicate<String> pred1 = s -> false;
		Predicate<String> pred2 = (s) -> false;

		// The error occured in this line
		Predicate<String> pred3 = String s -> false;
		Predicate<String> pred4 = (String s) -> false;
	}

}
