package hw_3;

public class Q42 {

	public String runTest ( boolean spinner, boolean roller) {
		if(spinner = roller) return "up";
		else return roller ? "down" : "middle";
	}
	
	
	public static final void main(String pieces[]) {
		final Q42 tester = new Q42();
		System.out.print(tester.runTest(false, true));

	}

}
