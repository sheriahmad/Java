/**
 * Write for loops to produce the following output:
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 666666
 * 7777777
 * 
 * @author Sheheryar Ahmad
 * 
 */
public class PracticeItNumberedTriangle {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print	(i);
			}
			System.out.println();
		}
	}
}
