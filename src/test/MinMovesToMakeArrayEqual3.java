package test;

import java.util.Arrays;
import java.util.Scanner;

public class MinMovesToMakeArrayEqual3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an array of numbers separated by spaces:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(minMoves(nums));
	}
    public static int minMoves(int[] nums) {
        int steps = 0;
        
        for (int n = 0; n < nums.length - 1; n++) {
        	int currentNum = nums[n];
        	if (nums[n + 1] > currentNum) {
        		steps += (n + 1) * Math.abs(nums[n + 1] - currentNum);
        	}
        	if (nums[n + 1] < currentNum) {
        		steps += Math.abs(nums[n + 1] - currentNum);
        		nums[n + 1] = nums[n];
        	}
        }
        
    	return steps;
    }
/*
int currentNum
int currentIndex
int steps

set first value to currentNum
set currentIndex to 1
for loop (currentIndex++)
check if the current index value is greater than current num
if it is, add currentIndex * (current index value - current number) to steps
 */
}
