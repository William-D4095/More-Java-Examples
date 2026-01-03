package test;

import java.util.Scanner;

public class FindBinarySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number:");
		int a = sc.nextInt();
		System.out.println("Please input another number:");
		int b = sc.nextInt();
		System.out.println(binaryAddition(a, b));

	}

	public static String binaryAddition(int a, int b) {
		int sum = a + b;
		String binarySum = "";
		while (sum > 0) {
			binarySum = String.valueOf((sum % 2)) + binarySum;
			System.out.println((sum % 2));
			sum /= 2;
		}
		return binarySum;
	}
}
