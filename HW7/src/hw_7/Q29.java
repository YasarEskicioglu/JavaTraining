package hw_7;

abstract class Q29 {
	protected final int size;

	public Q29(int size) {
		this.size = size;
	}

	public Q29 get() {
		return this;
	}

	public static void main(String[] passes) {
		Equipment equipment = (Equipment) (Q29) new SoccerBall().get();
		System.out.print(((SoccerBall)equipment).size);
	}

}
