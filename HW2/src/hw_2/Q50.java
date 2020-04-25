package hw_2;

public class Q50 {
	
	public Q50() {
		System.out.print("a");
	}
	public void Sand() {
		System.out.print("b");
	}
	public void run() {
		new Q50();
		Sand();
	}
	
	public static void main(String... args) {
		new Q50().run();
	}

	// The result is aab. 
}
