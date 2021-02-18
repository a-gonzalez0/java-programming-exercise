package chapter3;
import java.util.Scanner;

/*
 * (Cost of shipping) A shipping company uses the following function to calculate
 * the cost (in dollars) of shipping based on the weight of the package (in pounds).
 * c(w) = 
 * 3.5, if 0 < w <= 1
 * 5.5, if 1 < w <= 3
 * 8.5, if 3 < w <= 10
 * 10.5, if 10 < w <= 20
 * 
 * Write a program that prompts the user to enter the weight of the package and
 * displays the shipping cost. If the weight is negative or zero, display a message
 * “Invalid input.” If the weight is greater than 20, display a message “The package
 * cannot be shipped.”
 */

public class Question18 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter weight of the package
		System.out.print("Enter the weight of the package (in pounds): ");
		double weight = input.nextDouble();
		
		// Display the shipping cost
		if (weight <= 0) {
			System.out.print("Invalid input.");
		} else if (weight > 20) {
			System.out.print("The package cannot be shipped.");
		} else {
			if (weight > 0 && weight <= 1) {
				System.out.print("The cost of shipping is $3.50");
			}
			if (weight > 1 && weight <= 3) {
				System.out.print("The cost of shipping is $5.50");
			}
			if (weight > 3 && weight <= 10) {
				System.out.print("The cost of shipping is $8.50");
			}
			if (weight > 10 && weight <= 20) {
				System.out.print("The cost of shipping is $10.50");
			}
		}
	}
}
