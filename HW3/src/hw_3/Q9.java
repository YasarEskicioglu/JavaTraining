package hw_3;

public class Q9 {

	public void calculateResult(Integer candidateA, Integer candidateB) {
		boolean process = candidateA == null || candidateA.intValue() < 10;
		
		//  Compiler give the error that operator && is undefined for the argument type java.lang.Integer
//		boolean value = candidateA && candidateB;
		
		System.out.println(process || value);
	}
	
	public static void main(String[] unused) {
		
		new Q9().calculateResult(null, 203);
	}
}
