package hw_2;

public class Q19 {

	private String name;
	private Q19 next;
	public Q19(String name, Q19 next) {
		this.name = name;
		this.next = next;
	}
	public void setNext(Q19 next) {
		this.next = next;
	}
	public Q19 getNext() {
		return next;
	}
	
	//  I will called the string as a square to easy understanding.
	public static void main(String... args) {
		
		// link1 points the  square x , x points the null.
		Q19 link1 = new Q19("x", null);
		
		// link2 points the square y , y points the link1's next (x) 
		Q19 link2 = new Q19("y", link1);
		
		// link3 points the square z , z points the link2's next y
		Q19 link3 = new Q19("z", link2);

		// Square y points the square z, not square x in this line. 
		link2.setNext(link3);
		
		// Square z points the square y. Nothing changed in this line
		link3.setNext(link2);

		// link 1 points the null now. Nothing points the square x 
		link1 = null;
		
		// link3 points the square z. It points the null now
		link3 = null;

		/* The result is link1 and link3 points the null, 
		 * link2 points the square y
		 * square y and square z and pointing each other.
		 */ 
	}

}
