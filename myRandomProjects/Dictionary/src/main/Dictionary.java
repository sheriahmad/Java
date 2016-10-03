package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 */

/**
 * @author Sheheryar Ahmad
 */
public final class Dictionary {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter all seven characters without spaces. For blank tile use a space. Once you are done, press enter:");
		String userInput = null;
		try {
			userInput = br.readLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(userInput.length() < 7) {
			int ogLen = userInput.length();
			for(;ogLen<7;ogLen++) {
				userInput += " ";
			}
		}
		userInput = userInput.substring(0, 7);

		try {
			FileInputStream fis = new FileInputStream(new File("dictionary.txt"));
			br = new BufferedReader(new InputStreamReader(fis)); 

			String line = null;
			while ((line = br.readLine()) != null) { 
				String st[] = line.split(" "); 
				for(int i=0; i<st.length; i++) { 
					if (st[i].length() <= 7 ) { 
						int rightWordCount = 0;
						if(st[i].length() < 7) {
							int ogLen = st[i].length();
							for(;ogLen<7;ogLen++) {
								st[i] += " ";
							}
						}

						for (int j=0; j<7;j++) {
							if(userInput.charAt(j) == ' ' || userInput.charAt(j) == st[i].charAt(j))
								rightWordCount++;
						}
						if(rightWordCount == 7)
							printResults(st[i]);
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

	public static void printResults(String s) {
		System.out.println(s);
	}
}





