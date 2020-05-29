package hw_7;

interface Sphere {
	default String getName() {return "Unknown"; }
}

abstract class Q24 {
	abstract String getName();
}
	
	public class Mars extends Sphere implements Q24 {
		public Mars() {
			super();
		}
	
		public String getName() { return "Mars";}
		
	public static void main(final String[] probe) {
		
		System.out.print(((Planet)new Mars()).getName());
	}

}
