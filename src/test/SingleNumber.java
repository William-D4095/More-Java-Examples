package test;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a list of numbers separated by a space:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		int output = singleNumber(nums);
		System.out.println(output);
	}
// ^ to use XOR
	public static int singleNumber(int[] nums) {
		int output = 0;
		for (int n = 0; n < nums.length; n++) {
		    output ^= nums[n];
		}
		return output;
    }
}
