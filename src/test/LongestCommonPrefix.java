package test;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String input = sc.nextLine();
		String[] inputArray = input.split(" ");
		String longestCommonPrefix = longestCommonPrefix(inputArray);
		System.out.println(longestCommonPrefix);
		// take user input
		// convert to string array

	}

	public static String longestCommonPrefix(String[] strs) {
		boolean isPrefix = true;
		String commonPrefix = "";
		outerLoop:
		for (int i = 0; i < strs[0].length(); i++) {
			for (int n = 1; n < strs.length; n++) {
				if (strs[n].length() <= i) {
					break outerLoop;
				}
				if (strs[0].charAt(i) != strs[n].charAt(i)) {
					// this means the first letter of first word == the first letter of second word
					isPrefix = false;
				}
				
			}
			if (isPrefix) {
				commonPrefix += strs[0].charAt(i);
			}
		}
		return commonPrefix;
	}
	// run a for loop that checks if the nth letter in the array matches the other
	// words
	/*
	 * for(int i = 0; i < inputArray.length;) { otherWord = inputArray[i]; if
	 * (firstWordLetter == otherWord.toCharArray[j]) }
	 */
}
