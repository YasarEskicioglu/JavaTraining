package hw_9;

public class Q39 {

	public static void main(String[] args) {
		String happy = ":) - (: ";
		String really = happy.trim();
		String question =  happy.substring(0, happy.length() -1) ;
		System.out.println(really.equals(question));

	}

}
