package test;

import java.util.ArrayList;
import java.util.List;

public class DoublePerfectFinder {

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int answer = sumOfProperDivisors(i);
			if (answer/2 == i) {
				System.out.println(i);
			}
		}
	}
	//purpose is to find the proper divisors of 'i' and sum them
		public static int sumOfProperDivisors(int i) {
			 int n = (int) Math.pow(i, 1.0/2);
				int sumOfProperDivisors = 1;
				while (n > 1) {
					if (i % n == 0) {
						sumOfProperDivisors += n + i/n;
//						System.out.println(n);
//						sumOfProperDivisors = sumOfProperDivisors + i/n;
//						System.out.println(i/n);
						// List<Integer> numList = new ArrayList<Integer>();
					}
					n--;
				}
				return sumOfProperDivisors;
	}

}


