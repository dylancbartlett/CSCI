/* 
Author: Dylan Bartlett
Date: Sep 18, 2018
*/

import java.util.Scanner;

class trianglePerimeter3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of side one");
		double side1 = input.nextDouble();
		System.out.println("Enter the length of side two");
		double side2 = input.nextDouble();
		System.out.println("Enter the length of side three");
		double side3 = input.nextDouble();
		
		if (side1 + side2 > side3){
			if (side2 + side3 > side1)
				if (side3 + side1 > side2)
					System.out.println("Perimiter is " + (side1 + side2 + side3));
				}
				else { 
					System.out.println("there is no solution");
		}
	}
}