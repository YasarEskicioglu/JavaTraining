package hw_8;

import javax.management.RuntimeErrorException;

class Organ {
	public void operate() throws RuntimeException {
		throw new RuntimeErrorException("Not supported")
	}
}

// Class name Heart changed with Q38
public class Q38 extends Organ {

	public void operate() throws Exception {
		System.out.println("beat");
	}
	
	public static void main(String... cholestrol) throws Exception {
		try {
			new Q38().operate();
		}finally {}

	}

}
