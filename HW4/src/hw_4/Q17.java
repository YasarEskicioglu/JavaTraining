package hw_4;

import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {
		
		String[] os = new String[] {
				"Mac", "Linux", "Windows" 		};
		
		Arrays.sort(os);
		System.out.println(Arrays.binarySearch(os, "Mac"));

	}

}