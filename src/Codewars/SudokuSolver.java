package Codewars;

import java.util.Arrays;
import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in the sudoku puzzle:");
//		String input = sc.next();
//		System.out.println(input);
		String input2 = "";
		int[][] nums = new int[9][9];
		StringBuilder sudoku = new StringBuilder();
		for (int j = 0; j < 9; j++) {
			int counter = 0;
			input2 = sc.nextLine();
			for (int i = 0; i < input2.length(); i++) {
				if (input2.substring(i, i + 1).matches("\\d")) {
					nums[j][counter] = Integer.parseInt(input2.substring(i, i + 1));
					counter++;
				}
			}
			if (input2.isEmpty()) {
				break;
			}
//			System.out.println(input2);
			sudoku.append(input2);
		}
		System.out.println(Arrays.deepToString(nums));
		sc.close();
		
	}
    public static int[][] sudoku(int[][] puzzle) {
        return puzzle;
    }
    
}
/*
[[5,3,0,0,7,0,0,0,0],
[6,0,0,1,9,5,0,0,0],
[0,9,8,0,0,0,0,6,0],
[8,0,0,0,6,0,0,0,3],
[4,0,0,8,0,3,0,0,1],
[7,0,0,0,2,0,0,0,6],
[0,6,0,0,0,0,2,8,0],
[0,0,0,4,1,9,0,0,5],
[0,0,0,0,8,0,0,7,9]]
*/