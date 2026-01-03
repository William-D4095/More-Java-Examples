package test;
import java.util.Scanner;
public class FindFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean validInput = false;
		while(!validInput) {
			System.out.println("Please input a non-negative integer:");
			if(sc.hasNextInt()) {
			    n = sc.nextInt();
			    if(n >= 0) {
			        validInput = true;
			    }
			}
			else {
				sc.next();
			}
		}
		
//		do {
//			System.out.println("Please input a non-negative integer:");
//			if (n - Math.floor(n) == 0) {
//				sc.nextInt();
//			}
//		} while (Math.floor(n) != 0 && n < 0);
		int output = factorial(n);
		sc.close();
		System.out.println(output);
	}
	
	public static int factorial(int n) {
	    if(n == 1) {
	        return 1;
	    }

	    return n * factorial(n-1);
	}
}
//	public static int factorial(int n) {
//	    // add a variable (output) and set it = to 1
//		int output = 1;
//	    // create while loop so that when n > 0 multiply by output
//		while (n > 0) {
//			output *= n;
//			n -= 1;
//		}
//		return output;
//		// return n!
//	}
//}
