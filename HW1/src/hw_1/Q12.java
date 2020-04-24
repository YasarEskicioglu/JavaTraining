package hw_1;

public class Q12 {

	int birds = 10;
	public static void main(String[] args) {
		int trees = 5;
		System.out.println(trees+birds);
		// In last line non-static variable birds cannot make a static reference. 
		// So, this class not compiled. 
	}
}
