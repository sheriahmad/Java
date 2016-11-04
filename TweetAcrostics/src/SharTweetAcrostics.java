/*
 * SharTweetArcostics.java
 * Prepared for AdColony
 * Nov 3rd, 2016
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 * @author Sheheryar Ahmad
 */
public class SharTweetAcrostics {

	public static final String TWEETS_TXT_URL = "https://s3.amazonaws.com/tools-storage/interview/tweets.txt";
	public static final String WORDS_TXT_URL = "https://s3.amazonaws.com/tools-storage/interview/words-lowercase.txt";

	/**
	 * Reads and get the words from URL. 
	 * @return words
	 * @throws IOException
	 */
	private static HashSet<String> getWords() throws IOException {
		URL wordsUrl = new URL(WORDS_TXT_URL);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(wordsUrl.openStream()));
		HashSet<String> words = new HashSet<String>();
		String word;

		while ((word = bufferedReader.readLine()) != null) {
			words.add(word);
		}

		bufferedReader.close();
		return words;
	}

	/**
	 * Get all the first letters of the words and convert them to lower case. 
	 * @param tweet
	 * @return
	 */
	private static String getFirstLetters(String tweet) {
		StringBuilder stringBuilder = new StringBuilder();
		StringTokenizer stringTokenizer = new StringTokenizer(tweet, " ");

		while (stringTokenizer.hasMoreTokens()) {
			String word = stringTokenizer.nextToken();
			char ch = word.charAt(0);
			stringBuilder.append(ch);
		}
		return stringBuilder.toString().toLowerCase();
	}

	/**
	 * 
	 * @param tweet
	 * @return
	 */
	private static boolean isStartsWithSymbol(String tweet) {
		StringTokenizer stringTokenizer = new StringTokenizer(tweet, " ");
		while (stringTokenizer.hasMoreTokens()) {
			String word = stringTokenizer.nextToken();
			char ch = word.charAt(0);
			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) || (ch == ' ')) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks if a words has four or more letters, splits at each white space. 
	 * @param tweet
	 * @return
	 */
	private static boolean hasFourOrMoreWords(String tweet) {
		String input = tweet.trim();


		int count = input.isEmpty() ? 0 : input.split("\\s+").length;

		if (count < 4) {
			return false;
		}
		return true;
	}

	/**
	 * Reads the tweets from URL, checks if tweet contains four or more words. 
	 * @return
	 * @throws IOException
	 */
	private static HashMap<String, String> getTweets() throws IOException {
		URL tweetsUrl = new URL(TWEETS_TXT_URL);
		BufferedReader in = new BufferedReader(new InputStreamReader(tweetsUrl.openStream()));
		HashMap<String, String> tweets = new HashMap<String, String>();
		String tweet;
		String acrostics;

		while ((tweet = in.readLine()) != null) {
			if (hasFourOrMoreWords(tweet)) {
				if (!isStartsWithSymbol(tweet)) {
					acrostics = getFirstLetters(tweet);
					tweets.put(acrostics, tweet);
				}
			}
		}

		in.close();
		return tweets;
	}
		
	/**
	 * Main method. 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		HashMap<String, String> tweets;
		HashSet<String> words;

		tweets = getTweets();
		words = getWords();
		
	
		System.out.println("Acrostic \t" + "Tweet");
		for (String acrostics : tweets.keySet()) {
			if (words.contains(acrostics)) {
				System.out.println(acrostics + " \t\t" + tweets.get(acrostics));
			}
		}
	}
}