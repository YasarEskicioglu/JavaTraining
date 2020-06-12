package hw_9;

public class Q33 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("red");
		sb.deleteCharAt(0);
		sb.delete(1,2);
		System.out.println(sb);

	}

}
