package hw_2;

public class Q30 {

	public static void main(String[] args) {
	
		// This line assigns correctly.
		String cat = "animal", dog = "animal";
	
		/* 	String cat = "animal0"; dog = "animal1";
		 	This line give the error dog variable cannot resolve a variable. */ 
		
		/* String cat, dog = "animal";
	       This line dog is initialized but cat is not. */
		
		/* String cat, String dog = "animal";
		  cat and dog variable needs separation with ";" in this line*/
		
		System.out.print(cat + " " + dog); 
	}
}
