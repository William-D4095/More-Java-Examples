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
		ArrayList<Long> numList = new ArrayList<Long>();
		for (int x = 0; x < 5; x++) {
			System.out.println("Please enter a number:");
			Scanner sc = new Scanner(System.in);
			long a = Long.parseLong(sc.nextLine());
			numList.add(a);

		}
		long sum = 0;
		for(long num : numList) {
		//num - 10,20,30,40
			sum += num;
		}

		System.out.println("Here are all of the numbers that you have input: " + numList);
		System.out.println("Here is the sum of all of the numbers: " + sum);

//		long b = numList.get(0) + numList.get(1) + numList.get(2) + numList.get(3) + numList.get(4);
//		System.out.println(b);
		long sum1 = 0;
		for(long num : numList) {
		//num1 - 10,20,30,40
			sum1 += num * num;
		}
		System.out.println("Here is the sum of all of the numbers squared: " + sum1);
		System.out.println("Here is the square of the sum of all of the numbers: " + sum*sum);
		}
	}

