package hw_10;

import java.util.*;

//Class name EchoFirst changed to Q74
public class Q74 {

	public static void main(String[] args) {
		Arrays.sort(args);
		int result = Arrays.binarySearch(args, args[0]);
		System.out.println(result);

	}

}
