/*Have the user enter 5 numbers
Store the 5 numbers in a list (ArrayList)
Print the sum of all numbers
Print the sum of the square of all numbers
*/
package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum5Numbers {
	public static void main(String[] args) {
//		Creating an array list called numList
		ArrayList<Long> numList = new ArrayList<Long>();
//		For loop asks the user to input a number, and scanner reads the input and stores it in a variable
		for (int x = 0; x < 5; x++) {
			System.out.println("Please enter a number:");
			Scanner sc = new Scanner(System.in);
			long a = Long.parseLong(sc.nextLine());
			numList.add(a);
		}
//		Finds the sum of all of the numbers
		long sum = 0;
		for (long num : numList) {
			sum += num;
		}
		System.out.println("Here are all of the numbers that you have input: " + numList);
		System.out.println("Here is the sum of all of the numbers: " + sum);
		long sum1 = 0;
		for (long num : numList) {
			sum1 += num * num;
		}
		System.out.println("Here is the sum of all of the numbers squared: " + sum1);
		System.out.println("Here is the square of the sum of all of the numbers: " + sum * sum);
	}
}
