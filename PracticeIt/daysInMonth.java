/**
 * 
 */

/**
 * @author Sheheryar Ahmad
 */
public class daysInMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int days = daysInMonth(10);
		System.out.println(days);

	}

	public static int daysInMonth(int month) {
		// TODO Auto-generated method stub
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		
		if (month == 4 || month == 6 || month == 9 || month == 11 ) {
			return 30;
		}
		
		if (month == 2) {
			return 28;
		} else {
			return 0;
		}
		
	}
}
