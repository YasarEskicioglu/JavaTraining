package hw_8;

// Class name Fortress changed with Q10
public class Q10 {
	
	public void openDrawbridge() throws Exception { //p1
		try {
			throw new Exception("Circle");
		}catch (Exception e) {
			System.out.println("Opening!");
		}finally {
			System.out.print("Walls"); //p2
		}
	}
		
	public static void main(String[] args) {
		new Q10().openDrawbridge(); //p3

	}

}
