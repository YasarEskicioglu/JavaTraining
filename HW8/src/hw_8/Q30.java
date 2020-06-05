package hw_8;

abstract class Duck {
	protected int count;
	public abstract int getDuckies();
}

// Class name Ducklings changed with Q30
public class Q30 extends Duck {
	private int age;
	public Q30(int age) {this.age = age;}
	public int getDuckies() {
		return this.age/count;
	}
	
	public static void main(String[] pondInfo) {
		Duck itQuacks = new Q30(5);
		System.out.print(itQuacks.getDuckies());
	}

}
