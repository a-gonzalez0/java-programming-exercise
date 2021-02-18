package chapter2;
import java.util.Scanner;

/*
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and display the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. Here is a sample
 * run of the program:
 * 
 * Enter the number of years: 5
 * The population in 5 years is 325932969
 */

public class Question11 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the number of years
		System.out.print("Enter the number of years: ");
		
		int numOfYears = input.nextInt();
		
		// Find seconds in years
		double secondsInYears = 60 * 60 * 24 * 365;
						
		// Convert birth per second to birth per year
		double birthPerYear = secondsInYears / 7.0;
				
		// Convert death per second to death per year
		double deathPerYear = secondsInYears / 13.0;
				
		// Convert new immigrant per second to new immigrant per year
		double immigrantPerYear = secondsInYears / 45.0;
				
		double totalProjectionPerYear = birthPerYear + immigrantPerYear - deathPerYear;
		
		int currentPopulation = 312032486;
		
		// Display the result
		System.out.println("The population in " + numOfYears + " years is " + 
				(int)(currentPopulation + (numOfYears * totalProjectionPerYear)));
	}
}
