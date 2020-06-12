package hw_9;

import java.awt.List;
import java.util.ArrayList;

public class Q48 {

	public static void main(String[] args) {
		List<String> magazines = new ArrayList();
		magazines.add("Readers Digest");
		magazines.add("People");
		magazines.clear();
		magazines.add("The Economist");
		magazines.remove(1);
		System.out.print(magazines.size());
		
	}

}
