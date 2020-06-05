package hw_8;

class GasException extends Exception {
}

// The class name Element changed with Q20
class Q20 {

	public int getSymbol() throws GasException {
		return -1;
	} // g1

	public class Oxygen extends Q20 {

	public void printData() {
		try {
			System.out.print(getSymbol());
		}catch { //g3
			System.out.print("Unable to read data");
		}
		}
	}
	public static void main(String[] args) {}
}
