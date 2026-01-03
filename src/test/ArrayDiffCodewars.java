package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayDiffCodewars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input multiple numbers separated by a space:");
		String input = sc.nextLine();
		int[] a = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println("Please input another set of numbers separated by a space:");
		input = sc.nextLine();
		int[] b = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(arrayDiff(a, b)));
	}

	public static int[] arrayDiff(int[] a, int[] b) {
		ArrayList<Integer> numbersA = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
				numbersA.add(a[i]);
		}
		System.out.println("numbersA: " + numbersA); // debug --------------------------
		System.out.println("array of b: " + Arrays.toString(b)); // debug --------------------------
		for (int i = 0; i < b.length; i++) {
			numbersA.removeAll(Arrays.asList(b[i]));
		}
		
		System.out.println("numbersA after: " + numbersA); // debug --------------------------
		return numbersA.stream()
		        .mapToInt(Integer::intValue)
		        .toArray();
		
		//		Convert each array to a Set
		
// -------- set --------------
//		Set<Integer> setA = new HashSet<>();
//		for (int num : a) {
//			setA.add(num);
//		}
//		Set<Integer> setB = new HashSet<>();
//		for (int num : b) {
//			setB.add(num);
//		}
//
//		// do set difference
//		Set<Integer> difference = new HashSet<>(setA);
//		difference.removeAll(setB);
//
//		// convert set difference back into an array
//		Integer[] output = difference.toArray(new Integer[difference.size()]);
//		return Arrays.stream(output)
//                .mapToInt(Integer::intValue)
//                .toArray();
	}
}
