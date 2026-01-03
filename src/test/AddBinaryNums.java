package test;

import java.math.BigInteger;
import java.util.Scanner;

public class AddBinaryNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a binary number:");
		String a = sc.nextLine();
		System.out.println("Please enter another binary number:");
		String b = sc.nextLine();
		String output = addBinary(a, b);
		System.out.println(output);
		
	}
	public static String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2); 
        BigInteger y = new BigInteger(b, 2);
        // return the sum of the binary numbers as a string
        BigInteger z = x.add(y);
        return z.toString(2);
    }
}
