package hw_3;

public class Q30 {

	public static void main(String[] args) {
		int x = 10, y = 5;
		boolean w = true, z = false;
		x = w ? y++ : y--;
		w = !z;
		System.out.println((x+y)+"  "+ (w ? 5 : 10));

	}

}
