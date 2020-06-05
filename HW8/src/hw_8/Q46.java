package hw_8;

class Problem implements RuntimeException {}
// class name BiggerProblem changed with Q46 

public class Q46 extends Problem {

	public static void main(String uhOh[]) {
		try {
			throw new Q46();
		}catch (Q46 re) {
			System.out.println("Problem?");
		} catch (Problem e) {
			System.out.println("Handled");
		} finally {
			System.out.print("Fixed!");
		}
	}

}
