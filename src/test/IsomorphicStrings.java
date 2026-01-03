package test;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String input = sc.nextLine();
		System.out.println("Please enter another word:");
		String input2 = sc.nextLine();
		System.out.println(isIsomorphic(input, input2));
	}
    public static boolean isIsomorphic(String s, String t) {
    	String[] s2 = s.split("");
    	String[] t2 = t.split("");
    	HashMap <String, String> map = new HashMap <String, String> ();
    	map.put(s2[0], t2[0]);
    	for (int n = 1; n < s.length(); n++) {
    		if (map.containsKey(s2[n])) {
    			if (!map.get(s2[n]).equals(t2[n])) {
    				return false;
    			}
    		}
    		else if (map.containsValue(t2[n])) {
    			return false;
    		}
    		else {
    			map.put(s2[n], t2[n]);
    		}
    	}
    	return true;
    }
}
