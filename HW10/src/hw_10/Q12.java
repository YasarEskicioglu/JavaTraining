package hw_10;

public class Q12 {

public static void main(String[] args) {
// 	long bigNum = 1234;
			long bigNum = 1234.0;
		// takes the type mismatch error value is double and type is long 
		
			long bigNum = 1234.0L;
		// takes the type mismatch error value is double and type is long 
		
		 long bigNum = 1234l;
		// There is not any Error
		 
		 long bigNum = 1234L;
		 // There is not any Error
		
		// Capital l and l letter used to make it as long type.
		// By default all integer type variable (byte, int, long) is int. 
			
		long bigNum = 1_234;
		// This line seems correct but 
		System.out.println(bigNum);
}
		
}
