package hw_10;

interface MakesNoise {}

abstract class Instrument implements MakesNoise {
	public Instrument(int beats) {}
	public void play() {}
}

//Class name Drum changed to Q69
public class Q69 extends Instrument{
	
		// TODO Auto-generated constructor stub
	}
	public void play (int count) {}
	public void concert() {
		super.play(5);
	}
	
	public static void main(String[] beats) {
		MakesNoise mn = new Q69();
		mn.concert();
	}
}
