package test;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number:");
		int input = sc.nextInt();
		System.out.println(isPowerOfTwo(input));

	}

	public static boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}
		if ((n & (n - 1)) == 0) {
			return true;
		}
		return false;
	}

}
/* exp code
		double exp = Math.log(n) / Math.log(2);
//		System.out.println(exp);
//		System.out.println(exp % 1);
		if (exp % 1 == 0 || exp % 1 < 1e-14) {
			return true;
		}
		return false;
	}

}
 */


/* divide by 2 code
		while (n > 1) {
			if (n % 2 != 0) {
				return false;
			}
			n /= 2;
		}
//		} else if (n < 1 && n > 0) {
//			while (n < 1) {
//				n *= 2;
//			}
//		}
		if (n == 1) {
			return true;
		}
		return false;
	}

}
*/
