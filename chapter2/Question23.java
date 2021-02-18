package chapter2;
import java.util.Scanner;

/*
 * (Cost of driving) Write a program that prompts the user to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
 * then displays the cost of the trip. Here is a sample run:
 * 
 * Enter the driving distance: 900.5
 * Enter miles per gallon: 25.5
 * Enter price per gallon: 3.55
 * The cost of driving is $125.36
 */

public class Question23 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the driving distance
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		// Prompt the user to enter the miles per gallon
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		// Prompt the user to enter the price per gallon
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		// Compute the cost of driving
		double drivingCost = (distance / milesPerGallon) * pricePerGallon;
		
		// Display the result
		System.out.println("The cost of driving is " + drivingCost);
	}
}
