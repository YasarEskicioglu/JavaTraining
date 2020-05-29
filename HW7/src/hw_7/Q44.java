package hw_7;

abstract class Q44 {
	protected abstract Object getSpace();
}

abstract class Room extends Q44 {
	abstract Object getSpace(Object list);



	public static void main(String[] args) {
		System.out.print("Let's start the party!");

	}

}
