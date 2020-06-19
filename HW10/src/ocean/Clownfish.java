package ocean;

// This class belongs in the Q17
public final class Clownfish extends Fish {
	public final Clownfish getFish() {
		throw new RuntimeException("clown!");
	}

	// This line needs "throws Q17"
	public static void main(String[] bubbles) {
		final Fish f = new Clownfish();
		f.getFish();
		System.out.println("swim!");
		}
	}

