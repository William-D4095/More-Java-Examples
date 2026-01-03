package test;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers separated by spaces: ");
		String input = sc.nextLine();
		String[] parts = input.split(" ");
		System.out.println(Arrays.toString(parts));
		int[] numbers = new int[parts.length];

		for (int i = 0; i < parts.length; i++) {
		    numbers[i] = Integer.parseInt(parts[i]);
		}
		
		System.out.println("Would you like these numbers to be ordered ascending or descending? Enter \"true\" if you want it to ascend, or \"false\" if you want it to descend.");
		boolean ascending = sc.nextBoolean();
		
		
		// ------------------- ASCENDING ---------
		if (ascending) {
			for (int n = 0; n < numbers.length; n++) {
				for (int i = 0; i + 1 < numbers.length; i++) {
					if (numbers[i] > numbers[i + 1]) {
						int temp = numbers[i + 1];
						numbers[i + 1] = numbers[i];
						numbers[i] = temp;
						System.out.println(Arrays.toString(numbers));
					}
				}
			}
		}
		// ------------------- DESCENDING --------------
		if (!ascending) {
			for (int n = 0; n < numbers.length; n++) {
				for (int i = numbers.length - 1; i > 0; i--) {
					if (numbers[i] > numbers[i - 1]) {
						int temp = numbers[i - 1];
						numbers[i - 1] = numbers[i];
						numbers[i] = temp;
						System.out.println(Arrays.toString(numbers));
					}
				}
			}
		}
	}
}
