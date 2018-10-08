/*
Author: Dylan Bartlett
Date: 10/8/18
*/

import java.util.Scanner;
class Exercise_5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		int v = 0;
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			char temp = Character.toUpperCase(s.charAt(i));
			if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') {
				v++;
			}
			else if (Character.isLetter(temp)) {
				c++;
			}
		}
		System.out.println("The number of vowles is " + v);
		System.out.println("The numner of consonants is " + c);
	}
}