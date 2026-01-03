package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter in a list of numbers separated by a space:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		boolean output = containsDuplicate(nums);
		System.out.println(output);
//	TRUE if a number repeats, FALSE if all numbers are different
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		numSet.add(nums[0]);
		for (int n = 1; n < nums.length; n++) {
			if (numSet.add(nums[n]) == false) {
				return true;
			} else {
				numSet.add(nums[n]);
			}
		}
		return false;
	}
}
