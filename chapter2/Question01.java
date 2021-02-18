package chapter2;

import java.util.Scanner;

/*
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
 * double value from the console, then converts it to Fahrenheit, and displays the
 * result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * 
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 * 
 * Here is a sample run:
 * 	Enter a degree in Celsius: 43.5
 * 	43.5 Celsius is 110.3 Fahrenheit
 */

public class Question01 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter Celsius degree
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		// Convert Celsius to Fahrenheit
		double fahrenheit = (9.0 / 5) * celsius + 32;
				
		// Display the result in Fahrenheit
		System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	}
}
