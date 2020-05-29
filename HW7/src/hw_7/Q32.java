package hw_7;

 class Q32 {
	protected final int height = 5;

	abstract int fly();

	public static void main(String[] unused) {

		Helicopter h = (Helicopter)new Q32();
		System.out.print(h.fly());

	}

}