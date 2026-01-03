package test;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ask for numbers which are separated by spaces
		System.out.println("Please input numbers that are separated by a space. We will sort the numbers for you.");
		//find the smallest number in the list
		String input = sc.nextLine();
		
		System.out.println("If you would like the numbers in ascending order, please type \"true\". If you would like it in descending order, please type \"false.\"");
		boolean ascending = sc.nextBoolean();
		
		String[] convertToNumbers = input.split(" ");
		int[] numbers = new int[convertToNumbers.length];
		
		for (int i = 0; i < convertToNumbers.length; i++) {
			numbers[i] = Integer.parseInt(convertToNumbers[i]);
		}
		System.out.println("numbers: " + Arrays.toString(numbers));
		//swap the smallest number with index [0]
/*
	have the for loop check if numbers[i] is less than currentMin
	if it is, set numbers[i] as current min
	repeat
 */

//repeat until done and increase index by 1 each time
		
		// ------------ ASCENDING AND DESCENDING ---------------
		for (int n = 0; n < numbers.length; n++) {
			int currentMinMax = numbers[n];
			int currentMinMaxIndex = n;
			
			for (int i = n; i < numbers.length; i++) {
				if(ascending) {
				    if(numbers[i] < currentMinMax) {
				    	currentMinMax = numbers[i];
						currentMinMaxIndex = i;
				    }
				} else {
				    if(numbers[i] > currentMinMax) {
				    	currentMinMax = numbers[i];
						currentMinMaxIndex = i;
				    }
				}
			}
		numbers[currentMinMaxIndex] = numbers[n];
		numbers[n] = currentMinMax;
		}
		System.out.println(Arrays.toString(numbers));

	}

}
