package chapter3;
import java.util.Scanner;

/*
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange.
 * java, to display the nonzero denominations only, using singular words for single
 * units such as 1 dollar and 1 penny, and plural words for more than one unit such
 * as 2 dollars and 3 pennies.
 */

public class Question07 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		// Display results
		System.out.println("Your amount " + amount + " consists of");
		
		if (numberOfOneDollars > 0) {
			System.out.print(numberOfOneDollars);
			System.out.println((numberOfOneDollars > 1)? " dollars": " dollar");
		}
		if (numberOfQuarters > 0) {
			System.out.print(numberOfQuarters);
			System.out.println((numberOfQuarters > 1)? " quarters": " quarter");
		}
		if (numberOfDimes > 0) {
			System.out.print(numberOfDimes);
			System.out.println((numberOfDimes > 1)? " dimes": " dime");
		}
		if (numberOfNickels > 0) {
			System.out.print(numberOfNickels);
			System.out.println((numberOfNickels > 1)? " nickels": " nickel");
		}
		if (numberOfPennies > 0) {
			System.out.print(numberOfPennies);
			System.out.println((numberOfPennies > 1)? " pennies": " penny");
		}
	}
}
