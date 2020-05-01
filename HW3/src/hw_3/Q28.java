package hw_3;

public class Q28 {

	public static void main(String... in) {
		
		int intersections = 100;
		int streets = 200;
		
		if (intersections < 150) {
			System.out.print("1");
			// operator && is undefined for the argument typeS int boolean
		} else if (streets && intersections > 1000) {
			System.out.print("2");
		} if (streets < 500)
			System.out.print("1");
			else 
				System.out.println("2");
		

	}

}
