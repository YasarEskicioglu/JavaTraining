package hw_10;

// Class name Indexing Changed with Q1
public class Q1 {

	public static void main(String... books) {
		
		StringBuilder sb = new StringBuilder();
		for ( String book : books)
				sb.insert(sb.indexOf("c"), book);
				System.out.println(sb);
			
	}	
}
