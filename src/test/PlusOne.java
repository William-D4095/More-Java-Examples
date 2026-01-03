package test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {

	public static void main(String[] args) {
//		System.out.println(Long.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the digits of an integer separated by spaces:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
		int[] output = plusOne(nums);
		System.out.println(Arrays.toString(output));
	}

	public static int[] plusOne(int[] digits) {
		for (int n = digits.length - 1; n >= 0; n--) {
			if (digits[n] < 9) {
				digits[n]++;
				return digits;
			}
			else if (digits[n] == 9 && n == 0) {
				int[] output = new int[digits.length + 1];
				output[0] = 1;
				return output;
			}
			else if (digits[n] == 9) {
				digits[n] = 0;
			}
		}
		return digits;
	}
}
/*
//BigInteger x = new BigInteger(
		BigInteger sum = new BigInteger("1");
		BigInteger digitsPlace = new BigInteger("1");
		// BigInteger c = digitsPlace.multiply(digit[n]);
		// sum.add(c);
		for (int n = digits.length - 1; n >= 0; n--) {
			BigInteger temp = digitsPlace.multiply(BigInteger.valueOf(digits[n]));
			sum = sum.add(temp);
			digitsPlace = digitsPlace.multiply(BigInteger.TEN);
		}
		System.out.println(sum);
		int[] output = new int[(sum.toString().length())];
		for (int n = output.length - 1; n >= 0; n--) {
			output[n] = (sum.mod(BigInteger.TEN).intValue());
			sum = sum.divide(BigInteger.TEN);
		}
		return output;
*/