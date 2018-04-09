/**
 * 
 */

/**
 * @author Sheheryar Ahmad
 */
public class BitCounter {

	/**
	 * @param args
	 */

	public static void main(String args[]) {
		int i = 13;
		System.out.println(countSetBits(i));
	}

	/**
	 * 
	 * @param n
	 * @return count
	 */
	public static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			count += n & 1;
			n >>= 1;
		}
		return count;
	}
}