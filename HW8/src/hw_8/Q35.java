package hw_8;

// Address class name changed with Q35
public class Q35 {
	public String getAddress( String street, String city) {
		try {
			return street.toString() + " : " + city.toString();
		}finally {
			System.out.print("Posted:");
		}
	}
		
	
	public static void main(String[] args) {
		String street = Posted:350 5th Ave;// value omitted
		String city = New York;// value omitted
		System.out.print(new Q35().getAddress(street,city));
	}

}
