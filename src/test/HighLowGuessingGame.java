package test;

import java.util.Random;
import java.util.Scanner;

public class HighLowGuessingGame {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int r = 0;
		int i = 0;
		Random rand = new Random();
		int randomNum = rand.nextInt(101);
		// could use do while loop to say "enter your guess"
		System.out.println("I'm thinking of a number between 0 and 100.");
		do {
			System.out.println("Enter your guess: ");
			// ------- 2 step verification --------------
			int guess = 1000;
			boolean validInput = false;
			while (!validInput || guess > 100) {
//				System.out.println("The while loop is running! !");
				if (sc.hasNextInt()) {
//					System.out.println("inside the if statement");
					guess = sc.nextInt();
//					System.out.println(guess);
					if(guess <= 100 & guess >=0) {
					    validInput = true;
					} else {
//						System.out.println("your guess is out of bonds");
						System.out.println("Please enter a valid number: ");
					}
				} else {
					System.out.println("Please enter a valid number: ");
					sc.next(); // clears the queue on the scanner
				}
			}
			// -------- check how good guess was ---------
			// inside the while loop, have an if statement that checks if the input is less
			// than the number, and if so print too low
			if (guess < randomNum) {
				System.out.println("Sorry, " + guess + " is too low.");
			} else if (guess == randomNum) {
				// else if the input is equal to the number, trigger the stop of the while loop
				System.out.println("Great Job! " + randomNum + " is my answer.");
				break;
			} else {
				System.out.println("Sorry, " + guess + " is too high.");
				// else if the input is greater than the number, and if so print too high
			}
			i++;
			// have some random int that keeps adding by one when it finishes the while loop
		} while (true);

//outside the while loop, write "Great Job! <insert number here> is my number."
		System.out.println("It took you " + i + " guesses.");
//print how many times the while loop ran
	}

}