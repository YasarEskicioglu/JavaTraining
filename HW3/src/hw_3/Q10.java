package hw_3;

public class Q10 {

	public static void main(String... arguments) {
		int  pterodactyl = 6;
		long triceratops = 3;
		
		/* 6 % 3 equals zero. 6 is divide by 3 without remainder. 
		*  Then If statement skipped.
		*  Last line of program evaluated.
		*/
		if (pterodactyl % 3 >= 1) 
			triceratops++;
			triceratops--;
		
		System.out.print(triceratops);

	}
}
