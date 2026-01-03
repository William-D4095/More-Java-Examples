package test;

import java.util.Arrays;
import java.util.Scanner;

public class CodewarsMeanSquareError {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a set of numbers separated by spaces:");
		String input = sc.nextLine();
		int[] nums1 = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println("Please enter another set of numbers separated by spaces:");
		input = sc.nextLine();
		int[] nums2 = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(solution(nums1, nums2));
	}
	public static double solution(int[] arr1, int[] arr2) {
		double arrSquaredSum = 0;
		for (int i = 0; i < arr1.length; i++) {
			arrSquaredSum += Math.pow(arr2[i] - arr1[i], 2);
		}
		return arrSquaredSum / arr1.length;
	}
}
