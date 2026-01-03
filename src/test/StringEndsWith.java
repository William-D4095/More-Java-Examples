package test;

import java.util.Scanner;

public class StringEndsWith {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a combination of letters:");
		String str = sc.nextLine();
		System.out.println("Please enter another combination of letters:");
		String ending = sc.nextLine();
		System.out.println(solution(str, ending));

	}

	public static boolean solution(String str, String ending) {
		return str.endsWith(ending);
	}
//	str.endsWith(ending)
}
