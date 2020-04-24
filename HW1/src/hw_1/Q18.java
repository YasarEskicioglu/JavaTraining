package hw_1;

public class Q18 {

	public static void main(String[] args) {

		String tree = "pine";
		int count = 0;
		if (tree.equals("pine")) {
			int height = 55;		// Scope of height is vaild in if block. 
			count = count +1;
		}
		System.out.println(height + count);
		// This code does not compile.
		
	}

}
