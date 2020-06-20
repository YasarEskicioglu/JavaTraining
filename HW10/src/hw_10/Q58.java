package hw_10;

import java.io.*;

//Class name CarbonStructure changed to Q58
abstract class Q58 {
	protected long count;
	public abstract Number getCount() throws IOException; 	// q1
	public Q58 (int count) {this.count = count; }
}

public class Diamond extends Q58 {

	public Diamond() { super(15); }
	public Long getCount() throws FileNotFoundException { 	// q2
		return count;
	}

	public static void main(String[] args) {
		try {
			final Q58 ring = new Diamond();			// q3
			System.out.print(ring.getCount());
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
}	