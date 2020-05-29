package hw_7;

interface SpeakDialogue {
	default int talk() { return 7; }
}

interface SingMonologue {
	default int talk() { return 5; }
}
public class Performance implements SpeakDialogue, SingMonologue
{
	public int Q37(String... x) {
		return x.length;
	}
		
	public static void main(String[] notes) {
		System.out.print(new Performance().Q37(notes));
	}	
}


