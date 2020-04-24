package hw_1;

public class Q46 {
	
	String color = "red";
	private void printColor(String color) {
		color = "purple";
		System.out.println(color);
	}

	public static void main(String[] args) {
		new Q46().printColor("blue");

	}

}
