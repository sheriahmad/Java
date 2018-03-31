/**
 * Write a piece of code that uses a for loop to compute and print the first 12
 * Fibonacci numbers. (You may include other code, such as declaring variables
 * before the loop, if you like.)
 * 
 * @author Sheheryar Ahmad
 * 
 */
public class PracticeItFibonacci {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int first = 1;
		int second = 1;
		System.out.print(first + " " + second + " ");
		for (int i = 0; i <= 9; i++) {
			int next = first + second;
			first = second;
			second = next;
			System.out.print(next + " ");
		}
	}
}
