package hw_10;

import java.util.ArrayList;
import java.util.List;

public class Q15 {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList();
		
		List<> b = new ArrayList();
		// Incorrect number of arguments for type List<E>; ...
		
		List<String> c = new ArrayList<>();
		// C is compiled well
		
		List<> d = new ArrayList<>();
		//	Incorrect number of arguments for type List<E>; it cannot be parameterized with arguments <> 
		
		List<String> e = new ArrayList<String>();
		// E is compiled well
		
		List<> f = new ArrayList<String>();
		// Incorrect number of arguments for type List<E>
		}


	}

}
