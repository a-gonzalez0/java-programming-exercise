package chapter1;

/*
 * (Population projection) The U.S. Census Bureau projects population based on
 * the following assumptions:
 * 
 * - One birth every 7 seconds
 * - One death every 13 seconds
 * - One new immigrant every 45 seconds
 * 
 * Write a program to display the population for each of the next five years. Assume
 * that the current population is 312,032,486, and one year has 365 days. Hint: In Java,
 * if two integers perform division, the result is an integer. The fractional part is truncated. 
 * For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with 
 * the fractional part, one of the values involved in the division must be a number with a decimal
 * point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class Question11 {
	public static void main(String[] args) {
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
		
		System.out.println("Population projection for year one: " + (int)(currentPopulation + (1 * totalProjectionPerYear)));
    	System.out.println("Population projection for year two: " + (int)(currentPopulation + (2 * totalProjectionPerYear)));
		System.out.println("Population projection for year three: " + (int)(currentPopulation + (3 * totalProjectionPerYear)));
		System.out.println("Population projection for year four: " + (int)(currentPopulation + (4 * totalProjectionPerYear)));
		System.out.println("Population projection for year five: " + (int)(currentPopulation + (5 * totalProjectionPerYear)));
	}
}
