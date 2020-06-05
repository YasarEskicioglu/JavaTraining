package hw_8;

class CastleUnderSiegeException extends Exception {}
class KnightAttackingException extends CastleUnderSiegeException {}

//Class name of Citadel changed with Q22
public class Q22  {
	public void openDrawbridge() throws RuntimeException { // q1

		try {
			throw new KnightAttackingException();
		} catch (Exception e) {
			throw new ClassCastException();
		} finally {
			throw new CastleUnderSiegeException(); // q2
		}
	}

	public static void main(String[] moat) {
		new Q22().openDrawbridge(); // q3
	}
}