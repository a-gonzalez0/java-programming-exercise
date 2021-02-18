package chapter2;
import java.util.Scanner;

/*
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as given by the following formula:
 * 
 * a = v1 - v0 / t
 * 
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * then displays the average acceleration. Here is a sample run:
 * 
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 */

public class Question09 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the starting velocity v0, the ending velocity v1, and the time span t
		System.out.print("Enter v0, v1, and t: ");
		
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double average = (v1 - v0) / t;
		
		// Display the result
		System.out.println("The average acceleration is " + average);
	}
}
