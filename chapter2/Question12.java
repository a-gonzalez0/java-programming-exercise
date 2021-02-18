package chapter2;
import java.util.Scanner;

/*
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 * 
 * length = v^2 / 2a
 * 
 * Write a program that prompts the user to enter v in meters/second (m/s) and
 * the acceleration a in meters/second squared (m/s^2), then, displays the minimum
 * runway length.
 * 
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286
 */

public class Question12 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter v in meters/second and the acceleration a in meters/second squared
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		// Compute the acceleration
		double length = (speed * speed) / (2 * acceleration);
		
		// Display the result
		System.out.println("The minimum runway length for this airplane is " + length);
	}
}
