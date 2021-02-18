package chapter4;
import java.util.Scanner;

/*
 * (Financial application: payroll) Write a program that reads the following 
 * information and prints a payroll statement:
 * 
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 * 
 * A sample run is as follows:
 * 
 * Enter employee’s name: Smith
 * Enter number of hours worked in a week: 10
 * Enter hourly pay rate: 9.75
 * Enter federal tax withholding rate: 0.20
 * Enter state tax withholding rate: 0.09
 * 
 * Employee Name: Smith
 * Hours Worked: 10.0
 * Pay Rate: $9.75
 * Gross Pay: $97.50
 * Deductions:
 * 	Federal Withholding (20.0%): $19.50
 * 	State Withholding (9.0%): $8.77
 * 	Total Deduction: $28.27
 * Net Pay: $69.22
 */

public class Question23 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the following info
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter the number of hours worked in a week: ");
		double hoursPerWeek = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double fedTaxRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		// Compute grossPay, total deductions, and NetPay
		double grossPay = hoursPerWeek * payRate;		
		double fedWithholding = fedTaxRate * grossPay;
		double stateWithholding = stateTaxRate * grossPay;
		double totalDeductions = fedWithholding + stateWithholding;
		double netPay = grossPay - totalDeductions;
		
		System.out.println("");
		
		// Display result
		System.out.print("Employee Name: " + name);
		System.out.print("\nHours worked: " + hoursPerWeek);
		System.out.printf("\nPay Rate: $%4.2f", payRate);
		System.out.printf("\nGross Pay: $%4.2f", grossPay);
		System.out.print("\nDeductions:");
		System.out.printf("\n  Federal Withholding: $%4.2f", fedWithholding);
		System.out.printf("\n  State Withholding: $%4.2f", stateWithholding);
		System.out.printf("\n  Total Deduction: $%4.2f", totalDeductions);
		System.out.printf("\nNet Pay: $%4.2f", netPay);
	}
}
