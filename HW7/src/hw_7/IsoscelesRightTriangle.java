package hw_7;


	public abstract class IsoscelesRightTriangle extends RightTriangle { // g2

		public String getDescription() { return "irt"; }
	
	public static void main(String[] edges) {
		final Q18 shape = new IsoscelesRightTriangle();  //g3
		System.out.print(shape.getDescription());
	}
}
