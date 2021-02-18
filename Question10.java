package chapter1;

/* 
 * (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes
and 30 seconds. Write a program that displays the average speed in miles per
hour. (Note 1 mile is equal to 1.6 kilometers.)
 */
public class Question10 {
	public static void main(String[] args) {
		double kilometers = 14.0;
		double miles = kilometers / 1.60934;
		double speed = miles / ((45.0 + 30.0 / 60.0) / 60.0);
		
		System.out.println("The average speed in miles per hour is: " + speed);
	}
}
