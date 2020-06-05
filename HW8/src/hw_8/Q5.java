package hw_8;

// Class name Baseball changed with Q5
public class Q5 {

	public static void main(String... teams) {
		try {
			int score = 1;
			System.out.print(score++);
		} catch (Throwable t) {
			System.out.println(score++);
		} finally {
			System.out.println(score++);
		}

	}

}
