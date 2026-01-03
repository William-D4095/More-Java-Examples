package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a list of numbers where the number that appears the most appears more than half the time:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		int candidate = nums[0];
		int count = 1;
		for (int n = 1; n < nums.length; n++) {
			if (nums[n] == candidate) {
				count++;
			}
			else if (candidate != nums[n]) {
				count--;
			}
			if (count < 1) {
				candidate = nums[n];
				count = 1;
			}
		}
		return candidate;
	}
}
// HashMap <Integer, Integer> majorityElement = new HashMap <Integer, Integer> ();
//for (int n = 0; n < nums.length; n++) {
//	majorityElement.compute(nums[n], (key,value) -> value == null? 1: value+1);
//}
//for (HashMap.Entry<Integer, Integer> entry : majorityElement.entrySet()) {
//	if (entry.getValue() > nums.length / 2) {
//		return entry.getKey();
//	}
//}
//return -1;