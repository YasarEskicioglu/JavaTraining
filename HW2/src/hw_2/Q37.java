package hw_2;

public class Q37 {

	public String first = "instance";
	public Q37() {
		first = "constructor";
	}
	{	first = "block"; }
	
	public void print() {
		System.out.println(first);
	}
	
	public static void main(String... args) {
		new Q37().print();
		// THe output of this code : constructor
		
	}

}
