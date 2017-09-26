import java.util.Scanner;

/**
 * CS 2003 - Lab 5 Code to detect whether input is a palindrome
 *
 * @author David Magar
 * @version 1.0
 * @since 09-26-2017
 */

public class palindrome {

	public static boolean isaPalindrome(String x)
	{
		x = x.toLowerCase();
		int length = x.length();
		if(x.equals("") || x.length()==1) return true;
		if(x.length() > 0) 
		{
			if(x.charAt(0) == x.charAt(length-1))
			{
				if(x.length() == 3) {
					if(x.charAt(0) == x.charAt(length-1)) {
						return true;
					}
					else
						return false;
					
				}
				isaPalindrome(x.substring((1), (length-1)));
				return true;
			}
			if(x.charAt(0) != x.charAt(length-1)) {
				return false;
			}
					
		}
		return false;
		}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean checker;
		String check;
		int quit = 1;
		System.out.println("Welcome to the Super Awesome Palindrome Checker 3000!");
		while (quit != 0) {
			System.out.println("Please enter test string");
			check = keyboard.nextLine();
			checker = isaPalindrome(check);			
					
			

			if (checker == true) {
				System.out.println("Is a palindrome");
			}
			if (checker == false) {
				System.out.println("Is not a palindrome");
			}
			System.out.println("Press 0 to quit, or 1 to keep going");
			
			quit = keyboard.nextInt();
			keyboard.nextLine();
			
		}
		keyboard.close();
	}


}
