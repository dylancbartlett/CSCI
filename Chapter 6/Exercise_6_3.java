/*
Author: Dylan Bartlett
10/10/18
*/

import java.util.Scanner;

class Exercise_6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integar");
		int number = input.nextInt();
		
		if (ispalindrome(number)) {
			System.out.println(number + " is a palindrome");
		}
		else {
			System.out.println(number + " is not a palindrome");
		}
	}
	public static boolean ispalindrome(int number) {
		return number == reverse(number);
	}
	public static int reverse(int number) {
		int result = 0;
		while(number != 0) {
			int remainder = number % 10;
			result = result * 10 + remainder;
			
			number = number / 10;
		}
		return result;
	}
}