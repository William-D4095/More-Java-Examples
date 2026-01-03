package test;

import java.util.Arrays;
import java.util.Scanner;

public class BestTimeBuySellStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the digits of an integer separated by spaces:");
		String input = sc.nextLine();
		int[] nums = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
		int output = maxProfit(nums);
		System.out.println(output);
	}

	public static int maxProfit(int[] prices) {
//	create var maxProfit
		int maxProfit = 0;
		int min = prices[0];
		for(int price: prices) {
			if (price < min) {
				min = price;
			}
			else if (price - min > maxProfit) {
				maxProfit = price - min;
			}
		}
		/*for (int n = 1; n < prices.length; n++) {
			if (prices[n] < min) {
				min = prices[n];
			}
			else if (prices[n] - min > maxProfit) {
					maxProfit = prices[n] - min;
				}
			} */
//	set min = array[0]
//	create for loop starts at n = 1 with condition less than array.length --> n++
//	    if array[n] > min
//	        set new min
//	    else
//	        check if (array[n] - min) > maxprofit
//	            if yes, set maxprofit to array[n] = min
		return maxProfit;
	}
}
