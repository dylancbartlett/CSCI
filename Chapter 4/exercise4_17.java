/* 
Author: Dylan Bartlett
Date: 9/21/18
*/

import java.util.Scanner;

class exercise4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the month");
		String month = input.nextLine();
		System.out.println("Enter the year");
		int year = input.nextInt();
		
		int Jan = 31;
		int Feb = 28;
		int Mar = 31;
		int Apr = 30;
		int May = 31;
		int Jun = 30;
		int Jul = 31;
		int Aug = 31;
		int Sep = 30;
		int Oct = 31;
		int Nov = 30;
		int Dec = 31;
	
		
		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
		{
			System.out.println(month + " " + year + " has 31 days");
			if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov"))
				System.out.println(month + " " + year + " has 30 days");
				
		}
		else if ((month.equals("Feb")) && (year % 4 == 0)) {
			System.out.println( "Feb" + " " + year + " Has 29 days");
		}
		else
		{
		System.out.println("Invalid month");
		}
	}
}

