package test;

import java.util.Scanner;

public class IndexFirstOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a list of letters or words without spaces:");
		// haystack is the list of letters, and we're trying to find needle inside of haystack
		String haystack = sc.nextLine();
		System.out.println("Now, please enter letters or words without spaces:");
		String needle = sc.nextLine();
		int output = strStr(haystack, needle);
		System.out.println(output);
	}

	public static int strStr(String haystack, String needle) {
//		if (haystack.equals(needle)) {
//			return 0;
//		}
		for (int n = 0; n <= haystack.length() - needle.length(); n++) {
			if (haystack.substring(n, n + needle.length()).equals(needle)) {
				return n;
			}
		}
		return -1;
	}
}
