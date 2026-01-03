package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a combination of capital letters:");
		String input = sc.nextLine();
		System.out.println(titleToNumber(input));
		System.out.println('A' - 0);

	}
	public static int titleToNumber(String columnTitle) {
		int output = 0;
		
		for (int n = columnTitle.length() - 1; n >= 0; n--) {
//			System.out.println("column title.char at " + columnTitle.charAt(n));
			output += (columnTitle.charAt(n) - 64) * Math.pow(26, columnTitle.length() - n - 1);
		}
// --------------------------------------------------- debugging ------------------------------------------------------------------------------------------------
//			System.out.println("Column title letters: " + columnTitleLetters[n]);
//			System.out.println("result: " + letterValues.get(columnTitleLetters[n]));
//			System.out.println(letterValues.get(columnTitleLetters[n]) * Math.pow(26, columnTitle.length() - n - 1));
//			System.out.println(Arrays.toString(columnTitleLetters));
		return output;
    }
}
/* hashmap version
String[] columnTitleLetters = columnTitle.split("");
		HashMap <String, Integer> letterValues = new HashMap <String, Integer> ();
		int output = 0;
		for(char c = 'A'; c <= 'Z'; c++) {
		    letterValues.put(String.valueOf(c), c-'A'+1);
		}
// debug		
//		System.out.println("hashmap: " + letterValues);
		
		for (int n = columnTitle.length() - 1; n >= 0; n--) {
			
			output += letterValues.get(columnTitleLetters[n]) * Math.pow(26, columnTitle.length() - n - 1);
	return output;
 */


// use code above to do this but faster
/*letterValues.put("A", 1);
letterValues.put("B", 2);
letterValues.put("C", 3);
letterValues.put("D", 4);
letterValues.put("E", 5);
letterValues.put("F", 6);
letterValues.put("G", 7);
letterValues.put("H", 8);
letterValues.put("I", 9);
letterValues.put("J", 10);
letterValues.put("K", 11);
letterValues.put("L", 12);
letterValues.put("M", 13);
letterValues.put("N", 14);
letterValues.put("O", 15);
letterValues.put("P", 16);
letterValues.put("Q", 17);
letterValues.put("R", 18);
letterValues.put("S", 19);
letterValues.put("T", 20);
letterValues.put("U", 21);
letterValues.put("V", 22);
letterValues.put("W", 23);
letterValues.put("X", 24);
letterValues.put("Y", 25);
letterValues.put("Z", 26);*/