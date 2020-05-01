package hw_3;

public class Q15 {

	public static void main(String[] args) {
		int hops = 0 , jumps = 0 ;
		
		jumps = hops++;
		
		if(jumps)		// This condition state include the boolean expression. 
			System.out.print("Jump!");
		else 
			System.out.print("Hop!");
	}
}

