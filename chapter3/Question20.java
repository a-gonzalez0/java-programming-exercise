package chapter3;
import java.util.Scanner;

/*
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to
 * compute the wind-chill temperature. The formula is valid for temperatures in the
 * range between -58�F and 41�F and wind speed greater than or equal to 2. Write
 * a program that prompts the user to enter a temperature and a wind speed. The
 * program displays the wind-chill temperature if the input is valid; otherwise, 
 * it displays a message indicating whether the temperature and/or wind speed is invalid.
 */

public class Question20 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user for temperature in Fahrenheit between -58�F and 41�F
		System.out.print("Enter the temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();

		// Prompt user to enter the wind speed in miles per hour
		System.out.print("Enter the wind speed in miles per hour: ");
		double windSpeed = input.nextDouble();

		// Check if temperature/wind speed is valid
		if (fahrenheit >= -58 && fahrenheit <= 41 && windSpeed >= 2) {
			// Compute the formula
			double windChill = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16) + 
					0.4275 * fahrenheit * Math.pow(windSpeed, 0.16);
			
			// Display the result
			System.out.println("The wind chill index is " + windChill);
		} else {
			System.out.print("The temperature and/or wind speed is invalid");
		}
	}
}
