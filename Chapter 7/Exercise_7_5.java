/*
Author: Greg Davis
Date: 10/31/18
*/
import java.util.Scanner;

class Exercise_7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10]; 
		int numberOfDistinctValues = 0;
		
		System.out.print("Enter 10 numbers separated by a space: ");
		
		for (int i = 0; i < numbers.length; i++) {
			int value = input.nextInt();
			
			boolean isInTheArray = false;
			for (int j = 0; j < numberOfDistinctValues; j++) {
				if (value == numbers[j]) {
					isInTheArray = true;
				}
			}
			if(!isInTheArray) {
				numbers[numberOfDistinctValues] = value;
				numberOfDistinctValues++;
			}
		}
		System.out.println("The number of distinct numbers is: " + numberOfDistinctValues);
		System.out.print("List without duplicates is: ");
		for (int i = 0; i < numberOfDistinctValues; i++) {
			System.out.print(numbers[i] + " ");
		}
		//write a for loop that prints your numbers array
	}
}