package test;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWithAlphabetPositionCodewars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String input = sc.nextLine();
		System.out.println(alphabetPosition(input));
	}
	static String alphabetPosition(String text) {
		char[] letters = text.toCharArray();
		String output = "";
		for (int i = 0; i < letters.length; i++) {
			if (65 <= letters[i] && letters[i] <= 90) {
				output += letters[i] - 64 + " ";
			}
			else if (97 <= letters[i] && letters[i] <= 122) {
				output += letters[i] - 96 + " ";
			}
		}
//		System.out.println(Arrays.toString(letters));
		return output.trim();
	}
}
