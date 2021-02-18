package chapter2;
import java.util.Scanner;

/*
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the maximum number of years and remaining 
 * days for the minutes. For simplicity, assume that a year has 365 days. Here is
 * a sample run:
 * 
 * Enter the number of minutes: 1000000000
 * 1000000000 minutes is approximately 1902 years and 214 days
 */

public class Question07 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the minutes
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		int numOfYears = minutes / 60 / 24 / 365;
		int numOfDays = minutes / 60 / 24 % 365;
		
		// Display the result
		System.out.println(minutes + " minutes is approximately " + numOfYears +
				" years and " + numOfDays + " days");
	}
}
