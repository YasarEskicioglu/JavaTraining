package hw_3;

public class Q20 {

	public static void main(String[] vars) {
	
		// According to the question this line has no end parenthesis. 
		// I assume the parenthesis over there.
		int leaders = 10 * (2 + ( 1 + 2 / 5 ));
		int followers = leaders* 2;
		System.out.println(leaders + followers < 10? "Too few": "Too many");

	}
}
