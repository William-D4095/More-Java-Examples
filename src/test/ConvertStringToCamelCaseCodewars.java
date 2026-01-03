package test;

import java.util.Scanner;

public class ConvertStringToCamelCaseCodewars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input some words:");
		String input = sc.nextLine();
		System.out.println(toCamelCase(input));
		
	}
	static String toCamelCase(String s){
		String output = "";
		boolean needsToBeUppercase = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("-") || s.substring(i, i + 1).equals("_")) {
				needsToBeUppercase = true;
			}
			else {
				if (needsToBeUppercase) {
					needsToBeUppercase = false;
					output += s.substring(i, i + 1).toUpperCase();
				}
				else {
					output += s.substring(i, i + 1);
				}
			}
		}
		return output;
	}
}
