package hw_10;

import java.time.LocalDate;

//Class name OnePlusOne changed to Q76
public class Q76 {

	public static void main (String... nums) {
		LocalDate time = LocalDate.of(1, 11);
		while (time.getHour() < 1) {
			time.plusHours(1);
			System.out.println("in loop");
			
		}
	}
}
	
