package hw_10;

public class Q26 {

	interface Plant {
		default String grow() {return "Grow!"; }
	}
	
	interface Living {
		public default String grow() { return "Growing!"; }
	}
	
	public class Tree implements Plant {   //m1
	
		public String grow( int height) { return "Super Growing!"; }
		
		public static void main(String[] leaves) {
			Plant p = new Tree(); //m2
			System.out.print((Living)p).grow()); //m3
	}
	
	} 	
}
