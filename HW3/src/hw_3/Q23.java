package hw_3;

public class Q23 {

	public static void main(String[] args) {
		int dog = 11;
		int cat = 3;
		int partA = dog / cat;
		int partB = dog % cat;
		int newDog = partB + partA * cat;
		
		System.out.print(newDog);

	}

}