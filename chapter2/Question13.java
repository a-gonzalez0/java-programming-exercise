package chapter2;
import java.util.Scanner;

/*
 * (Financial application: compound value) Suppose you save $100 each month into
 * a savings account with an annual interest rate of 5%. Thus, the monthly interest
 * rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 * 100 * (1 + 0.00417) = 100.417
 * 
 * After the second month, the value in the account becomes
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * 
 * After the third month, the value in the account becomes
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 * 
 * and so on.
 * 
 * Write a program that prompts the user to enter a monthly saving amount and displays
 * the account value after the sixth month. (In Programming Exercise 5.30, you
 * will use a loop to simplify the code and display the account value for any month.)
 * 
 * Enter the monthly saving amount: 100
 * After the sixth month, the account value is $608.81
 */

public class Question13 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a monthly saving amount
		System.out.print("Enter the monthly saving amount: ");
		double monthlySavings = input.nextDouble();
		
		double monthlyInterest = 0.05 / 12;
		
		double firstMonth = (monthlySavings * (1 + monthlyInterest));
		double secondMonth = (100 + firstMonth) * (1 + monthlyInterest);
		double thirdMonth = (100 + secondMonth) * (1 + monthlyInterest);
		double fourthMonth = (100 + thirdMonth) * (1 + monthlyInterest);
		double fifthMonth = (100 + fourthMonth) * (1 + monthlyInterest);
		double sixthMonth = (100 + fifthMonth) * (1 + monthlyInterest);
		
		// Display the result
		System.out.println("After the sixth month, the account value is " + sixthMonth);
	}
}
