/* 
Author: Dylan Bartlett
Date: 9/24/18
*/

import java.util.Scanner;

class Exercise_4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the employee's name: ");
		String name = input.next();
		
		System.out.print("Enter the number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter the hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double fedTaxWithholdingRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxWithholdingRate = input.nextDouble();
		
		double grosspay = hours * payRate;
		double fedTaxWithholding = grosspay * fedTaxWithholdingRate;
		double stateTaxWithholding = grosspay * stateTaxWithholdingRate;
		double totalDeduction = fedTaxWithholding + stateTaxWithholding;
		double netpay = grosspay - totalDeduction;
		
		String out = "Employee Name: " + name + "\n";
		out += "Hours Worked " + hours + "\n";
		out += "Pay Rate: $" + payRate + "\n";
		out += "Gross Pay: $" + grosspay + "\n";
		out += "Deductions:\n";
		out += "  Federal Withholding (" + fedTaxWithholdingRate * 100 + "%): $" + (int)(fedTaxWithholding * 100) / 100.0 + "\n";
		out += "  State Withholding (" + stateTaxWithholdingRate * 100 + "%): $" + (int)(stateTaxWithholding * 100) / 100.0 + "\n";
		out += "  Total Deduction: " + fedTaxWithholding + stateTaxWithholding + "\n";
		out += "Net Pay: " + (grosspay - fedTaxWithholding - stateTaxWithholding);
		System.out.print(out);
	}
}