package test;
import java.util.Scanner;
import java.util.Arrays;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// given a value n, print all the primes from 1-n
		int numberOfPrimes = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the prime machine. Please enter in a positive integer and we will find the primes less than that number!");
		int input = sc.nextInt();
		boolean[] isPrime = new boolean[input + 1];
		
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		
		//System.out.println(Arrays.toString(isPrime));
		// var that increases by one every time the for loops completes and 
		for (int n = 2; n < input; n++) {
			for (int replaceName = n + n; replaceName <= input; replaceName += n) { // if replaceName is not prime (has a factor), set the value equal to false
				isPrime[replaceName] = false;
			}
		}
		for (int i = 0; i < isPrime.length; i++) {
			if (isPrime[i]) {
				System.out.println(i);
				numberOfPrimes++;
			}
		}
		System.out.println("Number of primes: " + numberOfPrimes);
	}
}
