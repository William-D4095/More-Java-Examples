package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input how many rows of pascal's triangle you would like:");
		int input = sc.nextInt();
		System.out.println(generate(input));

	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pascalsTriangle = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			row.add(1);
			if (i == 1) {
				row.add(1);
			} else if (i > 1) {
				List<Integer> prevRow = pascalsTriangle.get(i - 1);
				for (int r = 0; r < prevRow.size() - 1; r++) {
					row.add(prevRow.get(r) + prevRow.get(r + 1));
				}
				row.add(1);
			}
			pascalsTriangle.add(row);
		}

		return pascalsTriangle;
	}
}
