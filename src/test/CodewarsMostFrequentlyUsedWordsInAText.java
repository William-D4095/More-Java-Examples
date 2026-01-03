package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodewarsMostFrequentlyUsedWordsInAText {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter in some interesting text:");
		String interestingText = sc.nextLine();
		System.out.println(top3(interestingText));
	}
	public static List<String> top3(String s) {
		List<String> mostCommonWords = new ArrayList<>();
//		String[] words = s.split(" ");
		Pattern pattern = Pattern.compile("'?[a-z]+('[a-z]+)*'?");
		Matcher matcher = pattern.matcher(s.toLowerCase());
		        
		Map<String, Integer> wordsHM = new HashMap<>();
		        
		while (matcher.find()) {
		    String word = matcher.group();
//		    System.out.println(word);
		    wordsHM.put(word, wordsHM.getOrDefault(word, 0) + 1);
		}

//		System.out.println(wordsHM);
		
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordsHM.entrySet());

//		System.out.println("Before sorting: " + entries);
		
		entries.sort((a,b) -> {
		    int compareResult = b.getValue().compareTo(a.getValue());
		    if(compareResult != 0) {
		        return compareResult;
		    } else {
		        return a.getKey().compareTo(b.getKey());
		    }
		});

//		System.out.println("After sorting: " + entries);
		List<String> top3Words = new ArrayList<>();
		for (int i = 0; i < Math.min(3, entries.size()); i++) {
			top3Words.add(entries.get(i).getKey());
		}
		return top3Words;
	}
}
