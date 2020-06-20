package hw_10;

import java.time.*;
import java.time.format.*;

//Class name HowLong changed to Q59
public class Q59 {

	public void main(String[] args) {
		LocalDate newYears = new LocalDate(2017, 1, 1);
		Period period = Period.ofYears(1).ofDays(1);
		DateTimeFormat format = DateTimeFormat.ofPattern("MM-dd-yyyy");

		System.out.print(format.format(newYears.minus(period)));
	}
}
