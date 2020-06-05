package hw_8;

// Class name BasketBall changed with Q12
public class Q12 {

	public static void main(String[] dribble) {
		try {
			System.out.print(1);
			throw new ClassCastException();
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.print(2);
		}catch (Throwable ex) {
			System.out.print(3);
		} finally {
			System.out.print(4);
		}
		System.out.print(5);
	}

}
