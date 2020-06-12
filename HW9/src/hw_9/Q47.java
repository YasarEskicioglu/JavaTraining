package hw_9;

import java.util.List;
import java.util.function.*;

public class Q47 {

	public static void main(String[] args) {
		List<String> list = new Arraylist<>();
		list.add("-5");
		list.add("0");
		list.add("5");
		print(list, e -> e < 0);
	}

	public static void print(List<String> list, Predicate<Integer> p) {
		for (String num : list)
			if (p.test(num)) {
				System.out.println(num);

			}
	}

}
