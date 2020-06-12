package hw_9;

import java.util.function.Predicate;

public class Q28 {

	Predicate dash = c -> c.startswith("-");
	System.out.println(dash.test("-"));
}
