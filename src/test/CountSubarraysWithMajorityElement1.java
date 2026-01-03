package test;

import java.util.Arrays;
import java.util.Scanner;

public class CountSubarraysWithMajorityElement1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an array of numbers separated by spaces:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println("Please enter a target number:");
		int input2 = sc.nextInt();
		System.out.println(countMajoritySubarrays(nums, input2));

	}

	public static int countMajoritySubarrays(int[] nums, int target) {
//		int maxScore = 0;
//		int score = 0;
		int numSubArrays = 0;

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			if (nums[i] == target) {
				sum++;
			} else {
				sum--;
			}
			if (sum > 0) {
				numSubArrays++;
			}
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target) {
					sum++;
				} else {
					sum--;
				}
				if (sum > 0) {
					numSubArrays++;
				}
			}
		}

		return numSubArrays;
	}

}
/*
public static int countMajoritySubarrays(int[] nums, int target) {
int count = 0;
for (int i = 0; i < nums.length; i++) {
	for (int j = i + 1; j <= nums.length; j++) {
		int[] nums2 = Arrays.copyOfRange(nums, i, j);
		if (checkMajority(nums2, target)) {
			count++;
		}
	}
}
return count;
}

static boolean checkMajority(int[] nums, int target) {
int targetAppearances = 0;
for (int i = 0; i < nums.length; i++) {
	if (nums[i] == target) {
		targetAppearances++;
	}
}
if (targetAppearances > nums.length / 2) {
	return true;
}
return false;
}
*/