package hw_10;

public class Q79 {

	abstract class Bear {
		protected int sing;

		protected abstract int grunt();

		int sing() {
			return sing;
		}
	}

	public class PolarBear extends Bear {
		int grunt() {
			sing() += 10;
			return super.grunt() + 1;
			return 10;
		}
	}

	public static void main(String[] args) {
	}

}
