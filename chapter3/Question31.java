package chapter3;
import java.util.Scanner;

/*
 * (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the
 * user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
 * from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S.
 * dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. 
 * 
 * Here are the sample runs:
 * 
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 0
 * Enter the dollar amount: 100
 * $100.0 is 681.0 yuan
 * 
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 1
 * Enter the RMB amount: 10000
 * 10000.0 yuan is $1468.43
 * 
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 5
 * CIncorrect input
 */

public class Question31 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in); 
		
		// Prompt the user to enter the exchange rate from dollars to RMB
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();
		
		// Prompt the user to enter 0 to convert dollars to RMB and 1 vice versa
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int convertCurrency = input.nextInt();
		
		// if user input is entered incorrectly, display Incorrect input
		if (convertCurrency == 0) {
			// Prompt the user to enter dollar amount
			System.out.print("Enter the dollar amount: ");
			double dollar = input.nextDouble();

			// Display result
			System.out.print("$" + dollar + " is " + (dollar * exchangeRate) + " yuan");
		} else if (convertCurrency == 1){
			// Prompt the user to enter RMB amount
			System.out.print("Enter the RMB amount: ");
			double rmb = input.nextDouble();

			// Display result
			System.out.print(rmb + " yuan is $" + (rmb / exchangeRate));
		} else {
			System.out.print("Incorrect input");
		}
	}
}
