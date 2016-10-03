/*
 * HackerRank challenge Day 10: Binary Numbers
 */

import java.util.*;

/**
 * @author Sheheryar Ahmad
 */
public class BinaryConversion {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String binaryStr = Integer.toBinaryString(n); // Conversation to binary.
		// System.out.println(binaryStr);

		char[] newChar = binaryStr.toCharArray();
		int i = 0;
		int max = 0;
		int num = 0;
		while (i < newChar.length) {
			if (newChar[i] == '1') {
				num++;
			} else {
				num = 0;
			}

			if (max < num) {
				max = num;
			}
			i++;
		}
		System.out.println(max);
	}
}
