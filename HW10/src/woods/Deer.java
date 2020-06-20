package woods;

// INSERT CODE HERE

/* / A / 	import static food.Grass.getGrass;
 * 			import static food.Grass.seeds; 
 */ 


// /* B */ 	import static food.*;
// Only a type can be imported 


// /* C */ 	static import food.Grass.*;
// Static keyword redundant


// /* D */ 	import food.Grass.*;
// getGrass method unseen.


 /* E /		static import food.Grass.getGrass;
  *			static import food.Grass.seeds; 		
  */ 	
//getGrass method not a class name
  		
 /* F */ 	import static food.Grass.*; 	
// work correctly.

  		

//Class name Deer used in Q40
public class Deer {

	public void eat() {
		getGrass();
		System.out.print(seeds);
	}
	
	public static void main(String[] args) {
		getGrass();
		System.out.print(seeds);
	}

}
