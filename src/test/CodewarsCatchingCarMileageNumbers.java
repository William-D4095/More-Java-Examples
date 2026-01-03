package test;

import java.util.Arrays;
import java.util.Scanner;

public class CodewarsCatchingCarMileageNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter in your car mileage:");
		int carMileage = sc.nextInt();
		sc.nextLine();
		System.out.println(carMileage);
		System.out.println("Now please enter in your awesome numbers list, separated by spaces:");
		String input = sc.nextLine();
		int[] awesomePhrases = {};
		if (!input.isEmpty()) {
			awesomePhrases = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		}
		System.out.println(isInteresting(carMileage, awesomePhrases));
	}
	// ------------------- code logic --------------------------------
	public static int isInteresting(int number, int[] awesomePhrases) {
		int key = 2;
		for (int i = 0; i <= 2; i++) {
			if (number >= 100) {
				String strNumber = String.valueOf(number);
				if (digitFollowedByZeros(strNumber) == true) {
					return key;
				}
				else if (allDigitsAreTheSame(strNumber) == true) {
					return key;
				}
				else if (isSequentialIncrementing(strNumber) == true) {
					return key;
				}
				else if (isSequentialDecrementing(strNumber) == true) {
					return key;
				}
				else if (isPalindrome(strNumber) == true) {
					return key;
				}
				else if (matchesAwesomePhrases(number, awesomePhrases) == true) {
					return key;
				}
			}
			key = 1;
			number++;
		}
		return 0;
	}
	
	
	static boolean digitFollowedByZeros(String strNumber) {
		if (strNumber.matches("^\\d0+$")) {
			return true;
		}
		return false;
	}
	static boolean allDigitsAreTheSame(String strNumber) {
		if (strNumber.matches("^(\\d)\\1*$")) {
			return true;
		}
		return false;
	}
	static boolean isSequentialIncrementing(String strNumber) {
		char[] numberArray = strNumber.toCharArray();
		for (int i = 0; i < strNumber.length() - 1; i++) {
			if (numberArray[i] == '9') {
				if (numberArray[i + 1] != '0') {
					return false;
				}
			}
			else if (numberArray[i] == 0 || (numberArray[i] + 1 != numberArray[i + 1])) {
				return false;
			}
		}
		return true;
	}
	static boolean isSequentialDecrementing(String strNumber) {
		char[] numberArray = strNumber.toCharArray();
		for (int i = numberArray.length - 1; i >= 1; i--) {
//			if (numberArray[i] == '9') {
//				if (numberArray[i - 1] != '0') {
//					return false;
//				}
//			}
			if (numberArray[i] + 1 != numberArray[i - 1]) {
				return false;
			}
		}
		return true;
	}
	static boolean isPalindrome(String strNumber) {
		char[] numberArray = strNumber.toCharArray();
		int leftIndex = 0;
		int rightIndex = numberArray.length - 1;
		for (int i = 0; i < numberArray.length / 2; i++) {
			if (numberArray[leftIndex] != numberArray[rightIndex]) {
				return false;
			}
			leftIndex++;
			rightIndex--;
		}
		return true;
	}
	static boolean matchesAwesomePhrases(int number, int[] awesomePhrases) {
		for (int i = 0; i < awesomePhrases.length; i++) {
			if (number == awesomePhrases[i]) {
				return true;
			}
		}
		return false;
	}
}
