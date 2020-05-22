package hw_6;

public class Q3 {

	private static int price = 5;

	public boolean sell() {
		if (price < 10) {
			price++;
			return true;
		}else if (price >= 10) {
			return false;
		}
		
	}

	public static void main(String[] cash) {
		new Q3().sell();
		new Q3().sell();
		new Q3().sell();
		System.out.println(price);
	}

}
