/* 
Author: Dylan Bartlett
Date: Sep 19, 2018
*/

import java.util.Scanner;

class Excercise_3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your X value");
		double x = input.nextDouble();
		System.out.println("Enter your Y value");
		double y = input.nextDouble();
		
		if (x <= 5.0){
			if (x >= -5.0)
				if (y <= 2.5)
					if (y >= -2.5)
					System.out.println("(" + x + "," + y + ") is in the rectangle");
		}
		else {
			System.out.println("(" + x + "," + y + ") is not in the rectangle");
		}
	}
}