package hw_3;

public class Q4 {

	public static void main(String[] input) {
		int plan = 1;
		plan = plan++ + --plan; // end of this statement plan gets two 

		//  plan++ +   plan   ----> plan gets 3
		//  plan   + ++plan   ----> plan gets 3
		//  plan-- +   plan	  ----> plan gets 1
		//  plan++ + ++plan   ----> plan gets 4 
		//  plan-- + --plan   ----> plan gets 0
		//  plan-- + ++plan   ----> plan gets 2
		//  plan   + --plan	  ----> plan gets 1
		
		if(plan==1) {
			System.out.println("Plan A"); 
		}else { if (plan==2) System.out.println("Plan B");	 
		else { System.out.println("Plan C");}
	}
	}

}
