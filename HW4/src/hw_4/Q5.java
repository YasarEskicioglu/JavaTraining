package hw_4;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		
		
		printStormName("Arlene");
		
		printStormName(new String[] {"Bret","Pitt"});
		
		// This method can not regard applicable it needs the array representation.
		printStormNames("Cindy");
		
		printStormNames(new String[] {"Don"} );	
	
		
	}
	
	
	public static void printStormName(String... names) {
		System.out.println(Arrays.toString(names));
	}
	
	
	public static void printStormNames(String[] names) {
		System.out.println(Arrays.toString(names));
	}

}
