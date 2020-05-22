package hw_6;

public class Q10 {

	private int rope = 1;
	protected boolean outside;
	public Q10() {
		this(4);//p1
		//new Q10(4);			// This is not affectd the rope value
		// this(5);				// This changes the rope value with 5. This code returns 6.
		// rope = 4;			// This is an changes the value. This code returns 4.
		outside = true;
	}
	public Q10(int rope) {
		this.rope = outside ? rope : rope+1;
	}
	
	public static void main(String[] args) {
		System.out.println(new Q10().rope);
		
		

	}

}
