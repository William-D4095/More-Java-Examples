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
		sudoku(nums);
//		System.out.println(sudoku(nums));
		sc.close();
		
	}
    public static int[][] sudoku(int[][] puzzle) {
        // write logic to check valid numbers and store them
    	solve(puzzle);
    	System.out.println(Arrays.deepToString(puzzle));
    	return puzzle;
    }
    public static boolean solve(int[][] puzzle) {
    	for (int i = 0; i < 9; i++) { // row
    		for (int j = 0; j < 9; j++) { // column
    			if (puzzle[i][j] == 0) {
	    			for (int num = 1; num <= 9; num++) {
	    				if (isValid(puzzle, i, j, num)) {
	    					puzzle[i][j] = num;
	    					if (solve(puzzle)) {
	    						return true;
	    					}
	    					puzzle[i][j] = 0;
	    				}
	    			}
	    			return false;
    			}
    		}
    	}
    	return true;
    }
    public static boolean isValid(int nums[][], int row, int column, int num) {
    	// check for duplicates in row/column
		
    	for (int i = 0; i < 9; i++) {
			if (nums[row][i] == num) { // checks if there's a duplicate in the row
				return false;
			}
			if (nums[i][column] == num) { // checks if there's a duplicate in the column
				return false;
			}	
		}
		
		// check for duplicates in sub-square
		
		int backtrackRow = row % 3;
		int backtrackColumn = column % 3;
		
		for (int i = 0; i < 3; i++) { // row
			for (int j = 0; j < 3; j++) { // check column within row i
				if (nums[row - backtrackRow + i][column - backtrackColumn + j] == num) {
					return false;
				}
			}
		}
    	return true;
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