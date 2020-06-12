package hw_9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

// Class name HowLong changed with Q38
public class Q38 {

	public static void main(String[] args) {
		
		LocalDate newYears = LocalDate.of(2017, 1, 1);
		Period period = Period.ofDays(1);
		DateTimeFormatter format =
				DateTimeFormatter.ofPattern("MM-dd-yyyy");
		
		System.out.println(format.format(newYears.minus(period)));
				

	}

}
