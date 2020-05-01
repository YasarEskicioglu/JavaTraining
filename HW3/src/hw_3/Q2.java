package hw_3;

public class Q2 {

	static int meal = 5;
	static int tip =  2;
	static int total = meal + (meal>6? ++tip : --tip);
	/* ternary statement  if meal bigger than 6 			 
			 pre-increment of tip and run 
		else pre-decrement to tip and run		
	*/		
	
	public static void main(String[] args) {
		System.out.println(total);
	}

}
