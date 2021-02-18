package chapter4;
import java.util.Scanner;

/*
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
 * java, to fix the possible loss of accuracy when converting a float value to an int
 * value. Read the input as a string such as "11.56". Your program should extract the 
 * dollar amount before the decimal point, and the cents after the decimal
 * amount using the indexOf and substring methods.
 */

public class Question26 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
		System.out.print("Enter an amount, for example 11.56: ");
		String amount = input.nextLine();
		
		int numberOfOneDollars = Integer.parseInt(amount.substring(0, amount.indexOf(".")));
		int cents = Integer.parseInt(amount.substring(amount.indexOf(".") + 1));
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = cents / 25;
		cents = cents % 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = cents / 10;
		cents = cents % 10;
		
		// Find the number of nickels in the remaining amount
		int numberOfNickels = cents / 5;
		cents = cents % 5;
		
		// Find the number of pennies in the remaining amount
		int numberOfPennies = cents;
		
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
