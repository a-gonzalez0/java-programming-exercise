package chapter3;
import java.util.Scanner;

/*
 * (Find the number of days in a month) Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 has 29 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 has 31 days.
 */

public class Question11 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the month and year
		System.out.print("Enter the month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		
		// Check if the year is a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
				
		switch (month) {
			case 1: 
				System.out.print("January " + year + " had 31 days"); 
				break;
			case 2: 
				System.out.print((isLeapYear) ? "February " + year + 
						" had 29 days": "February " + year + " had 28 days"); 
				break;
			case 3: 
				System.out.print("March " + year + " had 31 days"); 
				break;
			case 4: 
				System.out.print("April " + year + " had 30 days"); 
				break;
			case 5: 
				System.out.print("May " + year + " had 31 days"); 
				break;
			case 6: 
				System.out.print("June " + year + " had 30 days"); 
				break;
			case 7: 
				System.out.print("July " + year + " had 31 days"); 
				break;
			case 8: 
				System.out.print("August " + year + " had 31 days"); 
				break;
			case 9: 
				System.out.print("September " + year + " had 30 days"); 
				break;
			case 10: 
				System.out.print("October " + year + " had 31 days"); 
				break;
			case 11: 
				System.out.print("November " + year + " had 30 days"); 
				break;
			case 12: 
				System.out.print("December " + year + " had 31 days"); 
				break;
		}
	}
}
