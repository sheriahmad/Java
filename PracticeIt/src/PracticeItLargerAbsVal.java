/**
 * Write a method called largerAbsVal that takes two integers as parameters and
 * returns the larger of the two absolute values. A call of largerAbsVal(11, 2)
 * would return 11, and a call of largerAbsVal(4, -5) would return 5.
 * 
 * @author Sheheryar Ahmad
 */
public class PracticeItLargerAbsVal {
	public static void main(String[] args) {
		largerAbsVal(5, 3);

	}

	private static int largerAbsVal(int i, int j) {
		// TODO Auto-generated method stub
		int a = Math.abs(i);
		int b = Math.abs(j);
		int largerValue = Math.max(a, b);
		return largerValue;
	}

}
