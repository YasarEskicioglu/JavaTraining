package hw_3;

public class Q24 {

	public static void main(String... args) {
		
		int flavors = 30;
		int eaten = 0;
		// There is no break keyword in switch statement. Code complied without any obstacle. 
		switch (flavors) {
			case 30: eaten++;
			case 40: eaten+=2;
			default: eaten--;
		}
		
		System.out.println(eaten);
	}

}
