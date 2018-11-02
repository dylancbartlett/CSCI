/*
Author: Dylan Bartlett
Date: 10/20/18
*/
import java.util.Scanner;

class Exercise_7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		
		System.out.print("Enter 10 numbers with spaces in between ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		System.out.println("The minimum value in the array is: " + min(numbers));
	}
	public static double min(double[] list) {
		double minDouble = list[0];
		
		for (int i = 1; i < list.length; i++) {
			if (minDouble > list[i]) {
				minDouble = list[i];
			}
		}
		return minDouble;
	}	
}