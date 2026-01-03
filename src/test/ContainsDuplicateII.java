//package test;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class ContainsDuplicateII {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a set of numbers separated by spaces:");
//		String input = sc.nextLine();
//		int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
//		System.out.println("Please enter a number:");
//		int input2 = sc.nextInt();
//		System.out.println(containsNearbyDuplicate(nums, input2));
//	}
//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//    	HashMap <Integer, Integer> map = new HashMap <Integer, Integer> ();
//    	map.put(nums[0], 0);
//    	for (int n = 1; n < nums.length; n++) {
//    		if ()
//    	}
//    	return false;
//    }
//}
/*
for (int n = 0; n < nums.length - 1; n++) {
	int firstElement = nums[n];
	for (int i = n + 1; i <= Math.min(n + k, nums.length - 1); i++) {
		if (firstElement == nums[i]) {
			return true;
		}
	}
}
return false;
*/