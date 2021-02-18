package chapter3;
import java.util.Scanner;

/*
 * (Find future dates) Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display 
 * the future day of the week. Here is a sample run:
 * 
 * Enter today’s day: 1
 * Enter the number of days elapsed since today: 3
 * Today is Monday and the future day is Thursday
 * 
 * Enter today’s day: 0
 * Enter the number of days elapsed since today: 31
 * Today is Sunday and the future day is Wednesday
 */

public class Question05 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter an integer for today's day of the week
		System.out.print("Enter today's day: ");
		int todaysDay = input.nextInt();
		todaysDay %= 7;
		
		// Prompt the user to enter the number of days after today for a future day
		System.out.print("Enter the number of days elapsed since today: ");
		int futureDay = input.nextInt();
		futureDay = (futureDay + todaysDay) % 7; 
		
		// Display the result
		System.out.print("Today is ");
		
		switch (todaysDay) {
			case 0: 
				System.out.print("Sunday");
				break;
			case 1:
				System.out.print("Monday");
				break;
			case 2:
				System.out.print("Tuesday");
				break;
			case 3:
				System.out.print("Wednesday");
				break;
			case 4: 
				System.out.print("Thursday");
				break;
			case 5:
				System.out.print("Friday");
				break;
			case 6:
				System.out.print("Saturday");
				break;
		}
		
		System.out.print(" and the future day is ");
		
		switch (futureDay) {
			case 0: 
				System.out.print("Sunday");
				break;
			case 1:
				System.out.print("Monday");
				break;
			case 2:
				System.out.print("Tuesday");
				break;
			case 3:
				System.out.print("Wednesday");
				break;
			case 4: 
				System.out.print("Thursday");
				break;
			case 5:
				System.out.print("Friday");
				break;
			case 6:
				System.out.print("Saturday");
				break;
		}
	}
}
