package hw_9;

import java.util.ArrayList;
import java.util.List;

public class Q23 {

	public static void main(String[] args) {
		List <Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		chars.add(1, 'c');
		chars.remove(0);
		System.out.println(chars.size());
		
	}

}
