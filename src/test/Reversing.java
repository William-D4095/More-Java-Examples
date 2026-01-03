package test;
import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Reversing {

	public static void main(String[] args) {
// TODO - Let the user enter however many numbers they want
// When they are done, have them type 'Done'
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		System.out.println("Begin by entering a number each time you are prompted.");
		int i = 0;
		boolean keepAsking = true;
		while (keepAsking == true) {
			System.out.println("You are prompted. You may type \"x\" if you wish to continue with your current set of numbers.");
			
			if (sc.hasNextInt()) {
				int input = sc.nextInt();
				numList.add(input);
				i++;
			}
			else {
				String s = sc.next();
				System.out.println(s.length());
				System.out.println(s.toLowerCase().equals("x"));
				System.out.println(s);
				sc.next();
				if (s.toLowerCase().equals("x")) {
					System.out.println(s);
					keepAsking = false;
				}
				else {
					System.out.println("Please enter an integer. Your previous number was not an integer.");
					sc.next();
				}
			}
		}
		
		System.out.println(numList);

		//- Store all numbers in a list

		//- Reverse the list and print it
		
	}
}
