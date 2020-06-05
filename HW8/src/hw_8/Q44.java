package hw_8;

// Class name DragonExeption extends Exception 
public class Q44 extends Exception {
}

public class Lair {
	public void openDrawbridge() throws Exception { //r1
		try {
			throw new Exception ("This Exception");
		} catch (RuntimeException e) {
			throw new Q44(); //r2
		} finally {
			throw new RuntimeException("Or maybe this one");	
			}
		}

	public static void main(String[] moat) throws Exception {
			new Lair().openDrawbridge(); //r3
	}
}
