
/*
 * TwoDArray.java
 */
import java.util.Scanner;

/**
 * @author Sheheryar Ahmad
 */
public class TwoDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int rows = 6; // Number of rows
		int cols = 6; // Number of columns in the matrix
		int minValueInArray = -9; // Minimum value of an element
		int elementsInHourGlass = 7; // Number of elements in an hourglass
		// Set max to the minimum hourglass sum possible
		int maxHourGlassSum = minValueInArray * elementsInHourGlass;
		// Declaring matrix
		int matrix[][] = new int[rows][cols];
		int hourGlassSum; // Sum of the elements in the hourglass

		/* Read the values for the matrix looping thru the rows */
		for (int i = 0; i < rows; i++) {
			/* Loop thru the columns for each row, reading the matrix */
			for (int j = 0; j < cols; j++) {
				/* Read the next value from standard input */
				matrix[i][j] = scanner.nextInt();
			}
		}
		/* For debugging, print out the matrix */
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// System.out.print(matrix[i][j] + " ");
			}
		}
		/* Loop thru the possible starting points of the hourglass */
		for (int i = 0; i < (rows - 2); i++) {
			for (int j = 0; j < (cols - 2); j++) {
				/* Print the hourglass starting position */
				/* Print out the hourglass elements */
				/* Compute the sum of the elements in the hourglass */
				hourGlassSum = matrix[i][j] + matrix[i][j + 1]
						+ matrix[i][j + 2] + matrix[i + 1][j + 1]
								+ matrix[i + 2][j] + matrix[i + 2][j + 1]
										+ matrix[i + 2][j + 2];
				/* Print out the sum of the elements in this hourglass */
				/* Is the new hourglass sum greater than the max found so far */
				if (hourGlassSum > maxHourGlassSum) {
					/*
					 * If so, then replace the max hour glass sum, with the
					 * current sum
					 */
					maxHourGlassSum = hourGlassSum;
				}
			}
		}
		/* Print out the maximum hour glass sum */
		System.out.println(maxHourGlassSum);

	}
}