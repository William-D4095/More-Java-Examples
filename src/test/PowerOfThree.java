package test;

import java.util.Scanner;

public class PowerOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your favorite number:");
		int input = sc.nextInt();
		System.out.println(isPowerOfThree(input));
	}
    public static boolean isPowerOfThree(int n) {
    	if (n <= 0) {
    		return false;
    	}
    	double sqrt3 = (Math.log(n) / Math.log(3));
    	System.out.println(sqrt3);
    	if (Math.abs(Math.round(sqrt3) - sqrt3) < 1e-14) {
    		return true;
    	}
    	return false;
    }
}
