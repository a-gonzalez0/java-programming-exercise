package chapter3;
import java.util.Scanner;

/*
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock. Here is a sample run:
 * 
 * Enter the time zone offset to GMT: -5
 * The current time is 4:50:34 AM
 */

public class Question30 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a time zone offset to GMT
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();

		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = (totalMilliseconds / 1000);

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = (totalHours + offset) % 24;

		// Display results
		System.out.println("The current time is " + 
				((currentHour < 12)? currentHour: currentHour - 12) + ":" + 
				currentMinute + ":" + currentSecond + ((currentHour < 12)? " AM": " PM"));
	}
}
