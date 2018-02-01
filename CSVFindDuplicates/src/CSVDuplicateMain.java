
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author sahmad
 */
public class CSVDuplicateMain {

	public static String[][] to2DArray(List<List<String>> list) {
		String[][] array = new String[list.size()][];

		int i = 0;
		for (List<String> nestedList : list) {
			array[i++] = nestedList.toArray(new String[nestedList.size()]);
		}

		return array;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// csvToArray(testFilePath);
		boolean probem = true;
		while (probem) {
			String filePath = getInput("Please enter the name of the file: ");
			String columnName = getInput("Please indicate header for filter i.e column1 or column2");

			try {
				File file = new File(filePath);
				String absolutePath = file.getParent();
				List<List<String>> dataList = csvToArray(file);
				int columnIndex = dataList.get(0).indexOf(columnName);
				if (columnIndex < 0) {
					System.out.println("Please enter valid data\n");
					continue;
				}

				List<String> columnValues = new ArrayList<>();

				String[][] array = to2DArray(dataList);
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[0].length; j++) {
						if (j == columnIndex) {
							columnValues.add(array[i][j]);
						}
					}
				}

				List<String[]> duplicates = new ArrayList<>();
				duplicates.add(array[0]);

				for (int i = 0; i < columnValues.size(); i++) {

					for (int j = 0; j < columnValues.size(); j++) {
						if (j != i && columnValues.get(i).equals(columnValues.get(j))) {
							if (!duplicates.contains(array[i])) {
								duplicates.add(array[i]);
							}
						}
					}
				}

				for (int i = 0; i < duplicates.size(); i++) {
					for (int j = 0; j < duplicates.get(i).length; j++) {
						System.out.print(duplicates.get(i)[j] + "\t");
					}
					System.out.println();
				}

				writeToCSV(duplicates, absolutePath + "\\" + columnIndex + "-duplicates.csv");
			} 
			
			catch (Exception e) {
				System.out.println("Please enter valid data\n");
				continue;
			}

			probem = false;

		}

	}

	/**
	 * 
	 * @param list
	 * @param path
	 * @throws IOException
	 */
	static void writeToCSV(List<String[]> list, String path) throws IOException {

		StringBuilder builder = new StringBuilder();
		for (String[] row : list) { // for each row
		
			for (int j = 0; j < row.length; j++) { // for each column

				builder.append(row[j] + ",");

			}
			
			builder.append("\n");// append new line at the end of the row
		}
		BufferedWriter writer;

		writer = new BufferedWriter(new FileWriter(path));
		writer.write(builder.toString());// save the string representation of the board
		writer.close();
	}
	
	/**
	 * 
	 * @param inputName
	 * @return input
	 */
	static String getInput(String inputName) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter " + inputName + ": ");
			String input = sc.nextLine().trim();

			if (input != null && !input.isEmpty()) {
				return input;
			}

			System.out.println("you didn't enter any value\n");

		}

	}

	/**
	 * 
	 * @param file
	 * @return lines
	 * @throws Exception
	 */
	static List<List<String>> csvToArray(File file) throws Exception {

		// this gives you a 2-dimensional array of strings
		List<List<String>> lines = new ArrayList<>();
		Scanner inputStream;

		inputStream = new Scanner(file);

		while (inputStream.hasNext()) {
			String line = inputStream.next();
			String[] values = line.split(",");
			// this adds the currently parsed line to the 2-dimensional string array
			lines.add(Arrays.asList(values));
		}

		inputStream.close();

		return lines;

	}

}
