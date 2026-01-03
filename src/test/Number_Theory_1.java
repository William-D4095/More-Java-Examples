package test;

import java.util.ArrayList;
import java.util.List;

public class Number_Theory_1 {
/*
 * There are two 3-digit numbers n having the property that n is divisible by 11
 * and n/11 is equal to the sum of the squares of the digits of n.
 * Find both values of n.
 */
	//make a random variable for the answer
	public static void main(String[] args) {
		// set a variable for each digit in the number
		int hundredsDigit = 1;
		int tensDigit = 1;
		int onesDigit = 0;
		int answer;
		List<Integer> n = new ArrayList<Integer>();
		// make a while loop that keeps adding one to the variable
		while (hundredsDigit < 10) {
			// make an if statement within the while loop that checks if the first digit is 10
			if (onesDigit == 10) {
				onesDigit = 0;
				tensDigit++;
			}
			// make an if statement within the while loop that checks if the second digit is 10
			if (tensDigit == 10) {
				tensDigit = 0;
				hundredsDigit++;
			}
			answer = (hundredsDigit * 100) + (tensDigit * 10) + onesDigit;
			// create an if statement that checks if n % 11 = 0
			if (answer % 11 == 0) {
				// if this if statement is true, create another if statement inside this one that checks if n/11 = a^2 + b^2 + c^2
				if (Math.pow(onesDigit, 2) + Math.pow(tensDigit, 2) + Math.pow(hundredsDigit, 2) == answer/11) {
					// set the answer variable to this number if this is true and stop the while loop
					//System.out.println("The answer is " + answer);
					n.add(answer);
				}
			}
			// if the conditions aren't met, add 1 to the while loop variable.
			onesDigit++;
			tensDigit++;
		}
		System.out.println(n);
	}

}
