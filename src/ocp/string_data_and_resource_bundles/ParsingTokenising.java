package ocp.string_data_and_resource_bundles;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingTokenising {
	
	public static void main(String[] args) {
		regexMatching();
		usingScanner();
		tokenizingWithString();
		tokenizingWithScanner();
		tokenizingWithStringTokenizer();
	}
	
	private static void regexMatching() {
		
		Pattern pattern = Pattern.compile("ab"); // Set the patter we want to look for.
		Matcher matcher = pattern.matcher("abaaaba");
		
		while (matcher.find()) {
			System.out.println("Match: " + matcher.start());	
		}
		
		/* REGEX
		 *  * = zero or more occurrences
		 *  ? = zero or one occurrence
		 *  ^ = negation (not)
		 *  . = anything
		 *  \d = a digit (0-9)
		 *  \D = a non-digit (anything but 0-9)
		 *  \s = a whitespace character ('\t', '\n', '\f', '\r')
		 *  \S = a non-whitespace character
		 *  \w = a word character (letters (a-z and A-Z), digits, or '_' (underscore))
		 *  \W = a non-word character (everything else)
		 *  \b = a word "boundary" (ends of the String and between '\w' and not '\w')
		 *  \B = a non-word "boundary" (between two '\W's or two non-'\w's)
		 *  [a-fA-F] = range ('a' to 'f' and 'A' to 'F', in this case)
		 *  
		 *  ? is greedy, ?? is reluctance, for zero or once
		 *  * is greedy, *? is reluctant for zero or more
		 *  + is greedy, +? is reluctant, for one or more
		 *  ['greedy' reads the entire sources data and then it works backwards (from the right)
		 *  until it finds the rightmost match, then it will include everything from earlier.]
		 *  */
	}
	
	private static void usingScanner() {
		System.out.println("Input: ");
		System.out.flush();
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			String token;
			do {
				token = scanner.findInLine("\\d\\d");
				System.out.println("found " + token);
			} while (token != null);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		} finally {
			if (scanner != null) { scanner.close(); }
		}
	}
	
	private static void tokenizingWithString() {
		String[] tokens = "ab5 ccc 45 @".split("\\d");
		System.out.println("Number of tokens: " + tokens.length);
		for (String token : tokens) {
			System.out.println(">" + token + "<");
		}
	}
	
	private static void tokenizingWithScanner() {
		// Very powerful, and the goto for tokenizing.
		String input = "1 true 34 hi";
		Scanner scanner = new Scanner(input);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				System.out.println("Int discovered: " + scanner.nextInt());
			} else if(scanner.hasNextBoolean()) {
				System.out.println("Boolean discovered: " + scanner.nextBoolean());
			} else {
				scanner.next(); // to continue it along.
			}
		}
		scanner.close();
	}
	
	private static void tokenizingWithStringTokenizer() {
		// An older way of tokenizing, not really used.
		String input = "1 true 34 hi";
		StringTokenizer tokenizer = new StringTokenizer(input);
		System.out.println("Number of tokens: " + tokenizer.countTokens());
		while (tokenizer.hasMoreElements()) {
			System.out.println(">" + tokenizer.nextToken() + "<");
		}
		System.out.println("Number of tokens: " + tokenizer.countTokens()); // Should be zero.
	}
}
