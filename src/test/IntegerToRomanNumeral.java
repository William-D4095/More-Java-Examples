package test;

import java.util.Scanner;

public class IntegerToRomanNumeral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input an integer:");
		int input = sc.nextInt();
		String output = intToRoman(input);
		System.out.println(output);
	}

	public static String intToRoman(int num) {
		int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		String output = "";
		for (int n = 0; n < 13; n++) {
			int key = nums[n];
			while (num >= key) {
				num -= key;
				output += romans[n];
			}
		}
		return output;
	}
}
