package test;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a list of numbers separated by a space:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println("Please enter numbers that you want to remove from the list:");
		int val = sc.nextInt();
		int output = removeElement(nums, val);
		System.out.println(output);
	}

	public static int removeElement(int[] nums, int val) {
		// for loop that runs through the array, checks if its equal to val, and then
		// sets it equal to the first term
		int key = 0;
		for (int n = 0; n < nums.length; n++) {
			if (nums[n] != val) {
				nums[key] = nums[n];
				key++;
			}
		}
		return key;
	}
}
