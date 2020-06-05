package hw_8;

// Class name Football cahnged with Q9
public class Q9 {

	public static void main(String officials[]) {
		try {
			System.out.print('A');
			throw new RuntimeException("Out of bounds!");
		}catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.print('B');
			throw t;
		}finally {
			System.out.println('C');
		}

	}

}
