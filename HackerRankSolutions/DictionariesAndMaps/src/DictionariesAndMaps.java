
/*
 * HackerRank challenge - Dictionaries and Maps. 
 */
import java.util.*;

/**
 * @author sheriahmad
 * 
 */
public class DictionariesAndMaps {

	/**
	 * 
	 * @param argh
	 */
	public static void main(String[] argh) {
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			phoneBook.put(name, phone);

		}
		while (in.hasNext()) {
			String name = in.next();
			if (phoneBook.containsKey(name) == true) {
				System.out.println(name + "=" + phoneBook.get(name));
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
