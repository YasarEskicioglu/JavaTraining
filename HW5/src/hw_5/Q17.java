package hw_5;

public class Q17 {

	public static void main(String[] args) {
		
		do {
			int count = 0;
			do {
				count++;
			}while (count < 2);
				break;
		}while (true);
		
		// count is defined in the outer do-while loop. So this code gives the error.
		System.out.println(count);
	}

}
