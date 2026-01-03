package test;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter in a list of sorted numbers separated by a space:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
		System.out.println("Please enter in a target value:");
		int target = sc.nextInt();
		int output = search(nums, target);
		System.out.println(output);
	}

	public static int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = (right + left) / 2;

			if (nums[mid] < target) {
				left = mid + 1;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				System.out.println("Left: " + left);
				System.out.println("Right: " + right);
				return mid;
			}
		}
		return left;

	}
}
