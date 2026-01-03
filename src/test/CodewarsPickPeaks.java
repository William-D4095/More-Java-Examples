package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CodewarsPickPeaks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a set of numbers separated by spaces:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(getPeaks(nums));
	}
	public static Map<String,List<Integer>> getPeaks(int[] arr) {
		Map <String,List<Integer>> output = new HashMap <String,List<Integer>>();
		List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				pos.add(i);
				peaks.add(arr[i]);
			}
			else if (arr[i] > arr[i - 1] && arr[i] == arr[i + 1]) {
				for (int j = i; j < arr.length - 1; j++) {
					if (arr[j] != arr[i]) {
						break;
					}
					if (arr[j] > arr[j + 1]) {
						pos.add(i);
						peaks.add(arr[i]);
						break;
					}
				}
			}
		}
		output.put("pos", pos);
		output.put("peaks", peaks);
		return output;
	}
}
