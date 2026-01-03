package test;

import java.util.Scanner;

public class MultiplesOf3Or5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your least favorite number:");
		int input = sc.nextInt();
		System.out.println(solution(input));
	}

	public static int solution(int number) {
		int sum = 0;
		for (int i = 3; i < number; i += 3) {
			sum += i;
		}
		for (int j = 5; j < number; j += 5) {
			sum += j;
		}
		for (int k = 15; k < number; k += 15) {
			sum -= k;
		}
		return sum;
	}
}
