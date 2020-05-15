package hw_5;

import java.util.Arrays;
import java.util.List;

public class Q33 {

	public static void main(String[] args) {
		List<String> bottles = Arrays.asList("glass", "plastic");
		
		// The for need a scope with curly braces
		for (int type = 0; type < bottles.size();) 
			System.out.print(bottles.get(type) + ",");
			break;
				
		System.out.println("end");
	}
	

}
