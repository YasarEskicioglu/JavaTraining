package hw_8;

// Class name Stranger changed with Q28
public class Q28 {

	public static String getFullName(String firstName, String lastName) {
		try {
			return firstName.toString() + " " + lastName.toString();
			
		} finally {
			System.out.print("Finished!");
		} catch(NullPointerException npe) {
			System.out.print("Problem?");
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.print(getFullName("Joyce","Hopper"));
	}

}
