/*
 * ListPossibleWords.Java
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author Sheheryar Ahmad
 */
public class ListPossibleWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("Please enter the all seven letters without any space. Use space for a "
				+ "blank tile. Once done please press enter to execute: \n");
		String userInput = null;

		try {
			userInput = bufferedReader.readLine();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if (userInput.length() < 7) {
			for (int charLength = userInput
					.length(); charLength < 7; charLength++) {
				userInput += " ";
			}
		}
		userInput = userInput.substring(0, 7);

		try {
			FileInputStream fileInputStream = new FileInputStream(
					new File("dictionary.txt"));
			bufferedReader = new BufferedReader(
					new InputStreamReader(fileInputStream));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				String aString[] = line.split(" ");
				for (int i = 0; i < aString.length; i++) {
					if (aString[i].length() <= 7) {
						if (containsOnly(aString[i], userInput)) {
							wordsList(aString[i]);
						}

					}

				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param string
	 */
	private static void wordsList(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);

	}
/**
 * 
 * @param string
 * @param userInput
 * @return string
 */
	private static boolean containsOnly(String string, String userInput) {
		// TODO Auto-generated method stub
		return string.matches("[" + userInput + "]*");
	}

}