package hw_7;

abstract class Q31 {

	private int getEqualSides() {return 0;}


abstract class Rectangle extends Q31 {
	public static int getEqualSides() {return 2;} // x1
}

public static void main(String[] corners) {
	final Square myFigure = new Square(); //x3
	System.out.print(myFigure.getEqualSides());
}

}
