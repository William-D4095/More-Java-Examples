package test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SimplePigLatinCodewars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter in multiple words:");
		String input = sc.nextLine();
		System.out.println(pigIt(input));

	}
	public static String pigIt(String str) {
		String[] words = str.split(" ");
		String output = "";
		for (int i = 0; i < words.length; i++) {
			output += (words[i].substring(1) + words[i].substring(0, 1));
			Pattern pattern = Pattern.compile("^\\p{Punct}+$");
			if(!pattern.matcher(words[i]).matches()) {
				output += "ay";
			}
			if (words.length - 1 != i) {
				output += " ";
			}
		}
		return output;
	}
}
