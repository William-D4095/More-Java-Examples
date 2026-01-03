package test;

////last step could have been 1 step
//or 2 steps
////add number of ways to take 9 steps
//to number of ways to take 8 steps
//return countWays(n-1) + countWays(n-2)
import java.util.Scanner;

public class WaysToClimbStairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many stairs are there?");
		int numStairs = sc.nextInt();
		//System.out.println(climbStairs(numStairs));
		long startTime = System.nanoTime();
        long result1 = climbStairsTopDown(numStairs);
        long endTime = System.nanoTime();
        double durationSeconds1 = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Top-down: " + result1 + " in " + durationSeconds1 + " seconds");
        
        long startTime2 = System.nanoTime();
        long result2 = climbStairsBottomUp(numStairs);
        long endTime2 = System.nanoTime();
        double durationSeconds2 = (endTime2 - startTime2) / 1_000_000_000.0;
        System.out.println("Bottom-up: " + result2 + " in " + durationSeconds2 + " seconds");
        
        if (durationSeconds2 < durationSeconds1) {
        	System.out.println("bottom up is better");
        }
        else {
        	System.out.println("top down got lucky");
        }
	}

	public static long climbStairsTopDown(int n) {

		// n == 1 || n == 2
		if (n <= 2) {
			return n;
		}
		// n >= 3
		return climbStairsTopDown(n - 1) + climbStairsTopDown(n - 2);
	}
	
	public static long climbStairsBottomUp(int i) {
		long[] numWays = new long [i + 1];
		numWays[0] = 1;
		numWays[1] = 1;
		for (int n = 2; n <= i; n++) {
			numWays[n] = numWays[n - 2] + numWays[n - 1];
		}
		return numWays[i];
	}
}
