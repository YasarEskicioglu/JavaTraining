package hw_5;

public class Q34 {

	public static void main(String[] args) {
	
		String[] nycTourLoops = new String[] {
				"Downtown", "Uptown", "Brooklyn" };
		String[]	times = new String[] {"Day", "Night"};
		// The semicolon where the near the i++ changed with a comma 
		for (int i = 0, j = 0 ; i < nycTourLoops.length 
				&& j < times.length; i++; j++) {
			System.out.print(nycTourLoops[i] + " " + times[j] + "-");
		}
		

	}

}
