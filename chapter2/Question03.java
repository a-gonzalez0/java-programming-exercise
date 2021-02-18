package chapter2;

import java.util.Scanner;

/*
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 * 
 * 	Enter a value for feet: 16.5
 * 	16.5 feet is 5.0325 meters
 */

public class Question03 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input  = new Scanner(System.in);
		
		// Prompt user to enter a value in feet
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		// Convert feet to meters
		double meter = feet * 0.305;
				
		// Display the result
		System.out.println(feet + " feet is " + meter + " meters");
	}
}
