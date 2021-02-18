package chapter4;
import java.util.Scanner;

/*
 * (Decimal to hex) Write a program that prompts the user to enter an integer 
 * between 0 and 15 and displays its corresponding hex number. For an incorrect
 * input number, display invalid input. Here are some sample runs:
 * 
 * Enter a decimal value (0 to 15): 11
 * The hex value is B
 * 
 * Enter a decimal value (0 to 15): 5
 * The hex value is 5
 * 
 * Enter a decimal value (0 to 15): 31
 * 31 is an invalid input
 */

public class Question11 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter an integer between 0 and 15
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();
		
		// Check if correct input and display result
		if (decimal <= 15 && decimal >= 10) {
			System.out.print("The hex value is " + (char)(decimal + 'A' - 10));
		} else if (decimal < 10 && decimal >= 0) {
			System.out.print("The hex value is " + decimal);
		} else {
			System.out.print(decimal + " is an invalid input");
		}
	}
}
