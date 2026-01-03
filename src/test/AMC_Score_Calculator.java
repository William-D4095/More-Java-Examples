package test;

import java.util.Scanner;

public class AMC_Score_Calculator {
/* 
 * takes the amount of AMC 10-12 questions answered and questions answered correctly to find the amount of points
 * you got from not answering the questions and answering the questions correctly. it uses these values
 * to calculate the total score you got on your AMC 10-12, as if you didn't already know it.
 * This includes error handling.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// find questions answered
		int questions_answered;
		do {
			System.out.println("How many questions did you answer? Please enter a valid number between 0 and 25.");
			questions_answered = sc.nextInt();
		} while (questions_answered < 0 || questions_answered > 25); // check for invalid numbers
		// find amount of correct answers
		int correct_answers;
		do {
			System.out.println("How many questions did you answer correctly? Please enter a valid number between 0 and 25 that is less than or equal to the amount of questions you answered.");
			correct_answers = sc.nextInt();
		} while (correct_answers > questions_answered && correct_answers < 0); // check for invalid numbers
		// calculations
		double unanswered_points = 1.5 * (25 - questions_answered);
		System.out.println("Unanswered Points: " + unanswered_points);
		int correct_points = 6 * correct_answers;
		System.out.println("Correct Points: " + correct_points);
		double total_score = unanswered_points + correct_points;
		System.out.println("Total Points: " + total_score);
	}

}

/*
 * There are two 3-digit numbers n having the property that n is divisible by 11
 * and n/11 is equal to the sum of the squares of the digits of n.
 * Find both values of n.
 */