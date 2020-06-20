package hw_10;

//Class name Highway changed to Q48
public class Q48 {

	public int drive (long car) 	{ return 2; }
	public int drive (double car) 	{ return 3; }
	public int drive (int car) 		{ return 5; }
	public int drive (short car) 	{ return 3; }
	
	public static void main(String[] gears) {
		float value = 5;
		System.out.println(new Q48().drive(value));
	}
		
}
