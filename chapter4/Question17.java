package chapter4;
import java.util.Scanner;

/*
 * (Days of a month) Write a program that prompts the user to enter the year and the
 * first three letters of a month name (with the first letter in uppercase) and displays
 * the number of days in the month. If the input for month is incorrect, display a
 * message as presented in the following sample runs:
 * 
 * Enter a year: 2001
 * Enter a month: Jan
 * Jan 2001 has 31 days
 * 
 * Enter a year: 2016
 * Enter a month: jan
 * jan is not a correct month name
 */

public class Question17 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter year and first three letters of month name
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month: ");
		String month = input.next();
		
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) ||
				(year % 400 == 0);
		
		switch (month) {
		case "Jan": 
		case "Mar": 
		case "May": 
		case "Jul":
		case "Aug":
		case "Oct": 
		case "Dec": System.out.print(month + " " + year + " has 31 days"); break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov": System.out.print(month + " " + year + " has 30 days"); break;
		case "Feb": System.out.print(month + " " + year + 
				((leapYear)? " has 29 days": " has 28 days")); break;
		default: System.out.print(month + " is not a correct month name"); break;
		}
	}
}
