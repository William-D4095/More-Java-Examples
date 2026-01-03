package test;

import java.util.Arrays;
import java.util.Scanner;

public class SplitStringsCodewars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter some characters:");
		String input = sc.nextLine();
		System.out.println(Arrays.toString(solution(input)));
	}
	public static String[] solution(String s) {
		String[] lettersInPairs = new String [(int) Math.ceil(s.length() / 2.0)];
		int key = 0;
		for (int i = 0; i < lettersInPairs.length; i++) {
			if (key + 2 <= s.length()) {
				lettersInPairs[i] = s.substring(key, key + 2);
				key += 2;	
			}
			else if (key + 1 <= s.length()) {
				lettersInPairs[i] = s.substring(key, key + 1) + "_";
			}
		}
		return lettersInPairs;
	}
}
