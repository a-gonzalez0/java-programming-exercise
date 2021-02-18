package chapter2;
import java.util.Scanner;

/*
 * (Science: calculating energy) Write a program that calculates the energy needed
 * to heat water from an initial temperature to a final temperature. Your program
 * should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water. The formula to compute the energy is
 * 
 * Q = M * (finalTemperature – initialTemperature) * 4184
 * 
 * where M is the weight of water in kilograms, initial and final temperatures are in
 * degrees Celsius, and energy Q is measured in joules. Here is a sample run:
 * 
 * Enter the amount of water in kilograms: 55.5
 * Enter the initial temperature: 3.5
 * Enter the final temperature: 10.5
 * The energy needed is 1625484.0
 */
public class Question10 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter amount of water in kilograms
		System.out.print("Enter the amount of water in kilograms: ");
		double amountWater = input.nextDouble();
		
		// Prompt user to enter the initial temperature of the water
		System.out.print("Enter the initial temperature: ");
		double initialTemp = input.nextDouble();
		
		// Prompt user to enter the final temperature of the water
		System.out.print("Enter the final temperature: ");
		double finalTemp = input.nextDouble();
		
		// Compute energy needed
		double energyNeeded = amountWater * (finalTemp - initialTemp) * 4184;
		
		// Display the result
		System.out.println("The energy needed is " + energyNeeded);
	}
}
