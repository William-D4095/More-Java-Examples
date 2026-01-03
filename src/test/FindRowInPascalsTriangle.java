package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindRowInPascalsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input which row of Pascal's triangle you would like:");
		int input = sc.nextInt();
		System.out.println(getRow(input));

	}
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> output = new ArrayList<Integer>();
		if (rowIndex == 0) {
			output.add(1);
			return output;
		}
		
		output.add(1);
		for (int i = 0; i < rowIndex - 1; i++) {
			long temp = (((long) output.get(i) * (rowIndex - i) ) / (i + 1));
			output.add((int) temp);
		}
		output.add(1);
		return output;
    }
}