package hw_10;
import java.util.Arrays;
import java.util.List;

// Class name Museums changed with Museums
public class Q41 {

	public static void main(String[] args) {
		
		String[] array = {"Natural History", "Science", "Art"};
		List<String> museums = Arrays.asList(array);
		museums.remove(2);
		System.out.println(museums);

	}

}
