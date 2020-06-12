package hw_9;

public class Q20 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("radical ");
		
//		/* A */	sb = new StringBuilder("radical ").append("robots") ;
		/* radical robots */
		
// 		/* B */	sb = new StringBuilder("radical ").delete(1,100)
//										  .append("obots")
//										  .insert(1, "adical r") ; 
 		/* radical robots */
 		
 		/* C */	sb = new StringBuilder("radical ").insert(7, "robots") ;
		/* radicalrobots */
 
//		/* D */	sb = new StringBuilder("radical ").insert(sb.length(), "robots") ;
		
		System.out.print(sb);
		/* radical robots */
	}
	}

}
