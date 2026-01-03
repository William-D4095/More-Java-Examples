package test;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNumeralConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a set of roman numerals:");
		String input = sc.nextLine();
		int output = romanToInt(input);
		System.out.println(output);
	}
/*
create hashmap
convert numbers to an int array
write for loop to compare the current number to the next number
    for loop logic - if the next number is equal, check next number and compare to current.
    if the next number is less than current, add the current number
    if the next number is greater than current, subtract the current number
return result
 */
	
	public static int romanToInt(String s) {
		int numericValue = 0;
		// create hashmap
		HashMap <String, Integer> romanValues = new HashMap <String, Integer> ();
		romanValues.put("I", 1);
		romanValues.put("V", 5);
		romanValues.put("X", 10);
		romanValues.put("L", 50);
		romanValues.put("C", 100);
		romanValues.put("D", 500);
		romanValues.put("M", 1000);
		// n > s.length doesn't get last value
		for (int n = 0; n < s.length() - 1; n++) {
			int valueOfn = romanValues.get(String.valueOf(s.charAt(n)));
			int valueOfnAndOne = romanValues.get(String.valueOf(s.charAt(n + 1)));
			if (valueOfn >= valueOfnAndOne) {
				numericValue += valueOfn;
			} else if (valueOfn < valueOfnAndOne) {
				numericValue -= valueOfn;
			}
		}
		numericValue += romanValues.get(String.valueOf(s.charAt(s.length() - 1)));
		return numericValue;
	}
}