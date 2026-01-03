package test;

import java.util.Arrays;
import java.util.Scanner;

public class SortOddNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a list of numbers separated by spaces: ");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(sortArray(nums)));
	}
	public static int[] sortArray(int[] array) {
		int[] nums = new int[array.length];
		int currentValue;
		for (int i = 0; i < array.length; i++) {
			int minValue = array[i];
			for (int j = 0; j < array.length; j++) {
				if (array[j] % 2 != 0) {
					if (array[j] < minValue) {
						nums[i] = array[j];
						array[j] = minValue - 1;
						currentValue = array[j];
						minValue = currentValue;
					}
				}
				else {
					nums[j] = array[j];
				}
			}
		}
		System.out.println("original array: " + Arrays.toString(array));
		return nums;
	}
}
