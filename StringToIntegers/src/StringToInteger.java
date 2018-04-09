/**
 * 
 */

/**
 * @author Sheheryar Ahmad
 */
public class StringToInteger {

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Change the string inside println to test different numbers.
		System.out.println(atoi("+1233dka295"));
	}

	/**
	 * 
	 * @param str
	 * @return converted int
	 */
	public static int atoi(String str) {
		if (str.isEmpty())
			return 0;
		String trimmedInput = str.trim();
		char sign = trimmedInput.charAt(0);
		boolean positive = true;
		int i = 0;
		if (sign == '-' || sign == '+') {
			i++;
			if (sign == '-')
				positive = false;
			if (i >= trimmedInput.length()) {
				return 0;
			}
		}
		if ((trimmedInput.charAt(i) - '0') < 0
				|| (trimmedInput.charAt(i) - '0') > 9) {
			return 0;
		}
		long output = 0;
		for (; i < trimmedInput.length(); i++) {
			if ((trimmedInput.charAt(i) - '0') < 0
					|| (trimmedInput.charAt(i) - '0') > 9) {
				continue;
			}
			output = output * 10 + trimmedInput.charAt(i) - '0';
		}
		if (output > Integer.MAX_VALUE) {
			if (positive) {
				return Integer.MAX_VALUE;
			}
			return Integer.MIN_VALUE;
		}
		if (positive) {
			return (int) output;
		}
		return (int) (-1 * output);
	}

}