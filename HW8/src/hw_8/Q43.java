package hw_8;

// Class name Street changed with Q43
public class Q43 {

	public static void dancing() throws RuntimeException {
		try {
			throw new IllegalArgumentException();
		}catch (Error ) {
			System.out.print("Unable!");
		}
	}
	
	public static void main(String... count) throws RuntimeException {
		
		dancing();
	}

}
