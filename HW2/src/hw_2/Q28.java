package hw_2;

public class Q28 {

	public static void main(String[] args) {
		
	Integer integer = new Integer(4);
	System.out.print(integer.byteValue());
	System.out.print("-");
	
	int i = new Integer(4);
	// Give the error cause of primitive type cannot invoke the byteValue() method.
	System.out.println(i.byteValue());

	}
}
