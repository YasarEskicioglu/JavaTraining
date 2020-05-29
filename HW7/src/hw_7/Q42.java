package hw_7;

public class Q42 {

	public static void main(String[] furryFriends) {
		newZoologist().setAnimal(new Dog());

	}
	
	
	

	public class Dog extends Q42 {
	}

	public class Wolf extends Q42 {
	}

	public final class Husky extends Dog {
	}

	public class Zoologist {
		Q42 animal;

		public final void setAnimal(Dog animal) {
			this.animal = animal;
		}

	

	}
}
