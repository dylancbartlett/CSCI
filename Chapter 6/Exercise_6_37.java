/*
Author: Dylan Bartlett
Date: 10/12/18
*/
import java.util.Scanner;

class Exercise_6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a whole number: ");
		int number = input.nextInt();
		System.out.print("Enter a width: ");
		int width = input.nextInt();
		
		System.out.println("The formatted number  is " + format(number, width));
	}
	public static String format(int number, int width) {
		String result = number + "";
		
		for (int i = 0; i < width - len(number); i++) {
			result = "0" + result;
		}
		return result;
	}
	public static int len(int number) {
		int size = 0;
		while (number > 0) {
			size += 1;
			number = number / 10;	
		}
		return size;
	}
}