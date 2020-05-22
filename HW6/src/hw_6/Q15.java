package hw_6;


public class Q15 {

	private int age = 18;
	private static void slalom (Q15 racer, int[] speed, String name) {
		racer.age = 18;
		name = "Wendy";
		speed = new int[1];
		speed[0]=11;
		racer = null;
	
	}
	
	
	public static void main(String[] args) {
		final Q15 mySkier = new Q15();
		mySkier.age = 16;
		final int [] mySpeed = new int[1];
		final String myName = "Rosie";
		slalom(mySkier,mySpeed,myName);

		System.out.println(mySkier.age);
		System.out.println(mySpeed[0]);
		
	}

	
}
