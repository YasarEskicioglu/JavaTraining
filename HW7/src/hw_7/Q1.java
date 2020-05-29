package hw_7;

public class Q1 {
	
	private String name;
	
	public Q1(String name) {this.name = name;}
	}
	
	public class Movie extends Q1 {
		public Movie(String movie) {}
	
	public static void main(String[] showing) {
		System.out.print(new Movie("Another Trilogy").name);
	}

}
