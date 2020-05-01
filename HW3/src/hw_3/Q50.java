package hw_3;

public class Q50 {

	public static String play (int toy, int age) {
		final String game;
		if (toy<2)
			// Code does not compile because game not an integer. 
			game = age > 1 ? 1 : 10; //p1
			else
				game = age > 3 ? "Ball" : "Swim" ; //p2
			return game;
	}
	
	public static void main(String[] args) {
		System.out.print(play(5,2));

	}

}
