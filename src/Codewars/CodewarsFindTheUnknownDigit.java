//package test;
package Codewars;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class CodewarsFindTheUnknownDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input an equation:");
		String input = sc.nextLine();
		System.out.println(solveExpression(input));
	}

	public static int solveExpression(final String expression) {
		if (expression.isEmpty() || expression == null) {
			return -1;
		}
		
		String operator = "";
		
		Set<Character> knownDigits = new HashSet<>();
		boolean foundOperator = false;
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (Character.isDigit(c)) {
				knownDigits.add(c);
			}
			if(i != 0 && !foundOperator) {
			    //check operator
			    if (c == '*' || c =='-' || c == '+') {
			        operator = String.valueOf(c);
			        foundOperator = true;;
			    }
			}
		}
//		char prevChar = 'a';
//		
//		String[] digits = expression.split("");
//		for (char c : expression.toCharArray()) {
//			if (Character.isDigit(c)) {
//				knownDigits.add(c);
//			}
//			if (c == '-' && prev)
//			if (c == ('+') || c == ('-') || c == ('*')) {
//				operator = String.valueOf(c);
//			}
//		}

		for (int i = 0; i <= 9; i++) {
			if (!knownDigits.contains((char) (i + '0'))) {
				char digitChar = (char) (i + '0');
				String expressionWithDigit = expression.replace('?', digitChar);
				if (expressionWithDigit.matches(".*(?<!\\d)00(?!\\d).*") || expressionWithDigit.matches(".*\\b-?0[0-9]+\\b.*")) {
					continue;
				}
				String[] equationWithoutEquals = expressionWithDigit.split("=");
				if (equationWithoutEquals.length != 2 || equationWithoutEquals[0].isEmpty() || equationWithoutEquals[1].isEmpty()) {
					continue;
				}
				String[] firstAndSecondNumber = new String[2];
				if (equationWithoutEquals[0].contains("--")) {
					firstAndSecondNumber = equationWithoutEquals[0].split(Pattern.quote("--"));
					firstAndSecondNumber[1] = "-" + firstAndSecondNumber[1];
				}
				else if(operator.equals("-") && equationWithoutEquals[0].startsWith("-")) {
			        firstAndSecondNumber = equationWithoutEquals[0].substring(1).split(Pattern.quote(operator));
			        firstAndSecondNumber [0] = "-" + firstAndSecondNumber [0];
			    }
				else {
				        firstAndSecondNumber = equationWithoutEquals[0].split(Pattern.quote(operator));
				}
				if (firstAndSecondNumber.length != 2 || firstAndSecondNumber[0].isEmpty() || firstAndSecondNumber[1].isEmpty()) {
					continue;
				}
				switch (operator) {
				case "+":
					if (Integer.parseInt(firstAndSecondNumber[0]) + Integer.parseInt(firstAndSecondNumber[1]) == Integer
							.parseInt(equationWithoutEquals[1])) {
						return i;
					}
					break;
				case "-":
					if (Integer.parseInt(firstAndSecondNumber[0]) - Integer.parseInt(firstAndSecondNumber[1]) == Integer
							.parseInt(equationWithoutEquals[1])) {
						return i;
					}
					break;
				case "*":
					if (Integer.parseInt(firstAndSecondNumber[0]) * Integer.parseInt(firstAndSecondNumber[1]) == Integer
							.parseInt(equationWithoutEquals[1])) {
						return i;
					}
					break;
				}
			}
		}
		return -1;
	}
}
