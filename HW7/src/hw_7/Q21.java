package hw_7;

abstract class Q21 {

	protected static String material = "papyrus";
	public Q21() {}
	public Q21 (String material) {this.material = material;}
	
	
	
	public static void main(String[] pages) {
		System.out.print(new  Encyclopedia().getMaterial());

	}

}
