package hw_1;

public class Q10 {

	static String weight = "A lot";				// Static variable
	double ageMonths = 5, ageDays = 2;			// Instance variables
	private static boolean success = true;		// Static variable
	
	public static void main(String[] args) {}
	
	// This method written as non-static just like question.
	public void NonStaticMain(String[] args ) {
		
		final String retries = "1";				// Local variable
		//P1
		
		// retries is a local variable and accessible at P1
		System.out.println(retries);
		
		// weight is a static variable and accessible at P1   
		System.out.println(weight); 
		
		// These instance variables are reachable without static method
		System.out.println(ageMonths);
		System.out.println(ageDays);
		  
		// We can access with static variable at P1 without static method
		System.out.println(success);
			
	}
}
