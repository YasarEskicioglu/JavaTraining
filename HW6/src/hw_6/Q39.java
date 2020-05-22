package hw_6;

public class Q39 {

	private int size;
	public Q39(int size) {this.size=size;}
	
	public static void sendHome (Q39 q, int newSize) {
		q = new Q39 (newSize);
		q.size = 4;
	}
	
	public static final void main(String... params) {
		final Q39 q39 = new Q39(3);
		sendHome(q39, 7);
		System.out.print(q39.size);

	}

}
