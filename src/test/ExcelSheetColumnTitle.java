package test;

import java.util.HashMap;
import java.util.Scanner;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int input = sc.nextInt();
		System.out.println(convertToTitle(input));

	}

	public static String convertToTitle(int columnNumber) {
//    	char lastLetter = (char) ('A' + columnNumber % 26);
		String output = "";
		while (columnNumber > 0) {
			int lastDigit = (columnNumber % 26);
			if (lastDigit == 0) {
				output = "Z" + output;
				columnNumber -= 26;
			} else if (lastDigit >= 1 && lastDigit <= 25) {
				output = String.valueOf((char) ('A' + lastDigit - 1)) + output;
			} else {
				throw new IllegalArgumentException("Number must be between 0 and 25");
			}
			columnNumber = (columnNumber - lastDigit) / 26;

		}
		return output;

	}
}
