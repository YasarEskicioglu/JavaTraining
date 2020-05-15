package hw_5;

import java.util.Arrays;
import java.util.List;

public class Q13 {

	public static void main(String[] args) {
		
		List<String> bottles = Arrays.asList("glass", "plastic");
		
		// The increment operator is missing. This for loop returns only first element.
		for (int type = 0; type < bottles.size();) {
			System.out.print(bottles.get(type) + ",");
			break;
		}		
		System.out.println("end");
	}

}
