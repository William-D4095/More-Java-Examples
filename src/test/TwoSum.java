package test;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		/*
		 * create a for loop that increases by one every time we test a new number
		 * 
		 * create an if statement within the for loop that checks if adding the term
		 * after the number we're testing will get us the target sum
		 * 
		 * inside the if statement, set the two numbers' indices equal to a variable
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an array of numbers separated by a space:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

		System.out.println("Please enter the number that you want the numbers to sum to: ");
		int target = sc.nextInt();

		int[] twoNums = twoSum(nums, target);

		System.out.println(Arrays.toString(twoNums));
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int n = 0; n < nums.length; n++) {
			for (int i = n + 1; i < nums.length; i++) {
				if (nums[n] + nums[i] == target) {
					return new int[] {n, i};
				}
			}
		}
		return nums;
	}

}
