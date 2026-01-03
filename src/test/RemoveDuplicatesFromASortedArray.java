package test;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromASortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sorted array separated by a space:");
		String input = sc.nextLine();
		String[] inputArray = input.split(" ");
		int[] intArray = new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			intArray[i] = Integer.parseInt(inputArray[i]);
		}
		int numUniqueElements = removeDuplicates(intArray);
		System.out.println(numUniqueElements);
	}

	public static int removeDuplicates(int[] nums) {
		int i = 1;
		int uniqueElements = 1;
		//int[] sortedIntArray = new int[nums.length];
		//sortedIntArray[0] = nums[0];
		//int dummyElement = nums[0] - 1;
		for (int n = 0; n < nums.length - 1; n++) {
		    if (nums[n] < nums[n + 1]) {
		        nums[i] = nums[n + 1];
		        uniqueElements++;
		        i++;
		    }
//		    else {
//		    	sortedIntArray[i] = dummyElement;
//		    	i++;
//		    }
		}
//		System.out.println(Arrays.toString(nums));
		return uniqueElements;
	}

}
