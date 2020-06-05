package hw_8;

interface Source {
	void flipSwitch() throws Exception;
}
// Class name lightBulb change with Q47
public class Q47 implements Source {

	public void flipSwitch() {
		try {
			throws new RuntimeException("Circuit Break!");
		}finally {
			System.out.print("Flipped");
		}
	}
	public static void main(String... electricity) throws Throwable {
		final Source bulb = new Q47();
		bulb.flipSwitch();
	}

}
