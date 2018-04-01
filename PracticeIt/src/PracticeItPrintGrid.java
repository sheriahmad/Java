/**
 * Write a method named printGrid that accepts two integer parameters rows and
 * cols. The output is a comma-separated grid of numbers where the first
 * parameter (rows) represents the number of rows of the grid and the second
 * parameter (cols) represents the number of columns. The numbers count up from
 * 1 to (rows x cols). The output are displayed in column-major order, meaning
 * that the numbers shown increase sequentially down each column and wrap to the
 * top of the next column to the right once the bottom of the current column is
 * reached. Assume that rows and cols are greater than 0.
 */

public class PracticeItPrintGrid {
	public static void main(String[] args) {
		printGrid(3, 6);
		printGrid(5, 3);	
		printGrid(4, 1);	
		printGrid(1, 3);
	}

	private static void printGrid(int rows, int cols) {
		// TODO Auto-generated method stub
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				if (j > 1) {
					sBuilder.append(", ");
				}
				sBuilder.append((rows * (j - 1)) + i);
				
			}
			sBuilder.append("\n");
		}
		System.out.println(sBuilder.toString());

	}

}
