package test;

public class temp {

	public static void main(String[] args) {
	    String str1 = "11111";
	    String str2 = "11112";
	    String str3 = "11111111111111";
	    String str4 = "1111111_111111";
	    String str5 = "1";
	    String str7 = "333333";
	    String str6 = "1000";

	    System.out.println(sameDigits(str1));
	    System.out.println(sameDigits(str2));
	    System.out.println(sameDigits(str3));
	    System.out.println(sameDigits(str4));
	    System.out.println(sameDigits(str5));
	    System.out.println(sameDigits(str7));
	    System.out.println(sameDigits(str6));
		/*
		int a = 0b1; 
		int b = 0b11;

		System.out.println(a+b);
		
		System.out.println('c');
*/
//		int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
	}
	public static boolean sameDigits(String str) {
	    return str.matches("^(\\d)\\1*$");
//		return str.matches("^\\d0+$");
	}
}
