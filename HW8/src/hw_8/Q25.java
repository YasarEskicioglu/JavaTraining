package hw_8;

// Class name Attendance changed with Q25
public class Q25 {

	private Boolean[] list = //value omitted 
	public int printTodaysCount() {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if(list[i]) ++count;
		}
		return count;
	}
			
	public static void main(String[] args) {
		new Q25().printTodaysCount();

	}

}
