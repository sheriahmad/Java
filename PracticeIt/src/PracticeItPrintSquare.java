/**
 * Write a method called printSquare that takes in two integer parameters, a min
 * and a max, and prints the numbers in the range from min to max inclusive in a
 * square pattern.
 * 
 * @author Sheheryar Ahmad
 */
public class PracticeItPrintSquare {
	public static void main(String[] args) {
		PracticeItPrintSquare(0, 3);
	}

	private static void PracticeItPrintSquare(int min, int max) {
		// TODO Auto-generated method stub
//		for(int i = min; i <= max; i++) {
//			for(int j = i; j <= max; j++) {
//				System.out.print(j);
//			}
//			for (int j = min; j < i; j++) {
//	            System.out.print(j);
//			}
//		}
//		System.out.println();
//		
//	}
		for (int i = min; i <= max; i++) {    
	        for (int j = i; j <= max; j++) {
	            System.out.print(j);
	        }
	        
	        for (int j = min; j < i; j++) {
	            System.out.print(j);
	        }
	        
	        System.out.println();
	    }
	}

}
