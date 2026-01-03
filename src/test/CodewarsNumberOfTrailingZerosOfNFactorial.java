package test;

import java.util.Scanner;

public class CodewarsNumberOfTrailingZerosOfNFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int input = sc.nextInt();
		System.out.println(zeros(input));
	}
	public static int zeros(int n) {
		int output = 0;
		for (int i = 5; i < n; i *= 5) {
			output += n / i;
		}
		return output;
	}
}
