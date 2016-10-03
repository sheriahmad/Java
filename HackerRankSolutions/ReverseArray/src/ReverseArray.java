/*
 * HackerRank - Reverse Array
 */
import java.util.*;

/**
 * @author sahmad
 */
public class ReverseArray {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
	}
}
