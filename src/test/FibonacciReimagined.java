package test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FibonacciReimagined {
	static Map<Integer, Integer> fibMap = new HashMap<Integer, Integer>();
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive integer:");
		int input = sc.nextInt();
		int fibonacci = generateFibonacci(input);
		//System.out.println(fibMap);
		fibMap.values().forEach(System.out::println);

	}
	public static int generateFibonacci(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}
		if (!fibMap.containsKey(n-1)) {
		    fibMap.put(n-1, generateFibonacci(n-1));
		}

		if (!fibMap.containsKey(n-2)) { 
		    fibMap.put(n-2, generateFibonacci(n-2));
		}

		return fibMap.get(n-1) + fibMap.get(n-2);
	}

}