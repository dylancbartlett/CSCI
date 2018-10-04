/*
Author: Dylan Bartlett
Date: 10/2/18
*/

import java.util.Scanner;

class Exercise_5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value between 1 and 15: ");
		int x = input.nextInt(); 
		if (x < 1 || x > 15) {
			System.out.println("Not Valid Number");
		}
		else {
			for (int row = 1; row <= x; row++) {
				for (int space = 1; space <= x - row; space++) {
					System.out.print("   ");
				}
				
				for (int left = row; left > 0; left--) {
					System.out.print((left > 9) ? " " + left : "  " + left);
				}
				for (int right = 2; right <= row; right++) {
					System.out.print((right > 9) ? " " + right : "  " + right);
				}
				System.out.println();
			}
		}
	}
}
		