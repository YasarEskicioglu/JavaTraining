package hw_8;

// Sleep class name changed with Q50
public class Q50 {
	public static void snore() {
		try {
			String sheep[] = new String[3];
			System.out.print(sheep[3]);
		} catch (RuntimeException e) {
			System.out.print("Awake!");
		} finally {
			throw new Exception(); // x1
		}
	}

	public static void main(String... sheep) { // x2
		new Q50().snore(); // x3
	}
}
