/* 
Author: Dylan Bartlett
Date: 11/20/18
*/
import java.util.Scanner;

class Exercise_8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] array = {
			{"Alabama", "Montgomery"},
			{"Hawaii", "Honolulu"},
			{"Idaho", "Boise"},
			{"Indiana", "Indianapolis"},
			{"Mississippi", "Jackson"},
			{"Kentucky", "Frankfort"},
			{"Maine", "Augusta"},
			{"Ohio", "Columbus"},
			{"Pennsylvanie", "Harrisburg"},
			{"Wyoming", "Cheyenne"}
		};
		
		int s = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("What is the capital of " + (array[i][0]) + "? ");
			String city = input.next();
			
			if (city.equalsIgnoreCase(array[i][1])) {
			System.out.println("Correct!");
			s++;
			}
			
			else {
				System.out.println("you done messed up...");
			}
		} 
		System.out.println("your score was " + s + " out of 10.");
	}
}