package test;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		String x = sc.nextLine();
		int[] nums = Arrays.stream(x.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		boolean isPalindrome = isPalindrome(x);
		System.out.println(isPalindrome);
	}

	public static boolean isPalindrome(String x) {
		String numStr = String.valueOf(x);
		
		for (int n = 0; n < 0.5 * numStr.length(); n++) {
			int firstDigit = Character.getNumericValue(numStr.charAt(n));
			int lastDigit = Character.getNumericValue(numStr.charAt(numStr.length() - 1 - n));
			
			if (firstDigit != lastDigit) {
				return false;
			}
		}
		return true;
	}
}
