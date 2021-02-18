package chapter1;

/*
 * (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
 * minutes, and 35 seconds. Write a program that displays the average speed in
 * kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
 */

public class Question12 {
	public static void main(String[] args) {
		System.out.println("The average speed in kilometers is: " + 
		    (24.0 * 1.60934) / ((60.0 + 40.0 + (35.0 / 60.0)) / 60.0) + " kph");
	}
}
