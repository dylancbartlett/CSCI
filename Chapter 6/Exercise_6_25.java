/*
Author: Dylan Bartlett
Date: 10/12/18
*/
import java.util.Scanner;

class Exercise_6_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time in milliseconds: ");
		long totalMilliseconds = input.nextLong();
		
		System.out.println(convertMillis(totalMilliseconds));
		System.out.println("Hours:Minutes:seconds");
	}
	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;
		
		int seconds = (int)(totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;
		
		int minutes = (int)(totalMinutes % 60);
		
		long hours = totalMinutes / 60;
		
		return hours + ":" + minutes + ":" + seconds;
	}
}