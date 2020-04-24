package hw_1;

public class Q44 {

	private boolean numLock = true;
	static boolean capLock = false;
		
	public static void main(String... shortcuts) {
		
		// At this line we across the compile error.
		// Because we can not reach the non-static field numlock
		System.out.print(numLock+" "+capLock);
		
		
	}
}
