/*
Author: Dylan Bartlett
Date: 10/11/18
*/

import java.util.Scanner;

class Exercise_6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		if (n < 1){
			System.out.println("There is no matrix for 0.");
		}
		
		printMatrix(n);
		
	}
	public static void printMatrix(int n) {
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print((int)(Math.random() * 2) + " " );
			}
			System.out.println();
		}
	}
}