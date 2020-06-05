package hw_8;
import java.io.*;

// Class name Printer changed with Q14 
public class Q14 {

	public void print() {
		try {
		throw new FileNotFoundException();
	} catch (IOException exception) {
		System.out.print("Z");
	} catch (FileNotFoundException enfe) {
		System.out.print("X");
	} finally {
		System.out.print("Y");
	}
}
	public static void main(String... ink) {
		new Q14().print();

	}

}
