package test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		/*
		 * Idea 1: Check that at the end number of opening and closing parenthesis are
		 * equal
		 * 
		 * Counterexample, you have closed parenthesis before you have an open one
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a bunch of parentheses of any kind: ");
		String input = sc.nextLine();
		char[] characterArray = input.toCharArray();
		boolean isValid = isValid(characterArray);
		if (isValid) {
			System.out.println("This works!");
		}
		else {
			System.out.println("This doesn't work!");
		}
	}

	public static boolean isValid(char[] characterArray) {
		char expected = 0;
		Stack<Character> st = new Stack<>();
		for (int r = 0; r < characterArray.length; r++) {
			if (characterArray[r] == '(' || characterArray[r] == '['  || characterArray[r] == '{') {
				st.add(characterArray[r]);
			}
			else {
				if (st.empty()) {
					return false;
				}
				else if (characterArray[r] == ')') {
					expected = '(';
				} else if (characterArray[r] == ']') {
					expected = '[';
				} else if (characterArray[r] == '}') {
					expected = '{';
				}
				
				Character output = st.pop();
				if (output != expected) {
					return false;
				}
			}
		}
		if (!st.empty()) {
			return false;
		}
		
		return true;
	}
}
