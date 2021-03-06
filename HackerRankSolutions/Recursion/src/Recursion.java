
/*
 * recursion.java
 * HackerRank challenge Day 9 - Recursion
 */
import java.util.*;

/**
 * @author sahmad
 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int factorialInt = scan.nextInt();
		System.out.println(factorial(factorialInt));

	}

	/**
	 * @param factorialInt
	 * @return factorialInt * factorial(factorialInt - 1);
	 */
	public static int factorial(int factorialInt) {
		if (factorialInt == 0) {
			return 1;
		} else if (factorialInt < 1) {
			return -1;
		} else {

		}
		return factorialInt * factorial(factorialInt - 1);
	}
}
