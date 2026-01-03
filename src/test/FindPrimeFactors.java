package test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class FindPrimeFactors {

	public static void main(String[] args) {
		// create scanner sc
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("Please enter a number:");
		input = sc.nextInt();
		boolean isPrime = false;
		int i = 2;
		//put a while loop that checks for factor until we reach the sqrt of the # (sc % 2 == 0)
		ArrayList<Integer> numList = new ArrayList<Integer>();
		HashMap<Integer, Integer> primeCounter = new HashMap<Integer, Integer>();
		do {
			if (Math.sqrt(input) < i) {
				primeCounter.merge(input, 1, Integer::sum);
				break;
			}
			while (input % i == 0) {
				System.out.println(input);
				numList.add(i);
				input = input / i;
				primeCounter.merge(i, 1, Integer::sum);
			}
			
			i++;
		} while (isPrime == false);
		String output = "";
		System.out.println(primeCounter);
		Iterator<Map.Entry<Integer, Integer>> iterator = primeCounter.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<Integer, Integer> entry = iterator.next();
				output += entry.getKey() + "^" + entry.getValue();
				
				if (iterator.hasNext()) {
	                output += " * ";
	            }
			}
		System.out.println(output);
		/*
String output = "";

Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            output += entry.getKey() + "^" + entry.getValue() + "*";
        }

System.out.println(output);
		 */

	}

}
