/* 
Author: Dylan Bartlett
Date: sep 20, 2018
*/

import java.util.Scanner;

class Exercise_4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the langth from the center to the vertex: ");
		double r = input.nextDouble();
		
		double side = 2 * r * Math.sin(Math.PI / 5);
		double area = 5 * side * side / Math.tan(Math.PI / 5) / 4;
		
		System.out.println("Area of the pentagon is " + area);
		
	}
}