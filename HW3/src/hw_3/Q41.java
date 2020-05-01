package hw_3;

public class Q41 {

	public static int getResult(int threshold) {
		return threshold > 5 ? 1 : 0;
	}
	
	public static final void main(String[] days) {
		// All these parameters takes less than 5 and all of them is zero
		System.out.println(getResult(5)+getResult(1)+getResult(0)+getResult(2)+"");

	}

}
