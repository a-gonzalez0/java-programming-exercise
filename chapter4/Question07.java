package chapter4;
import java.util.Scanner;

/*
 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use
 * console format to display two digits after the decimal point. Here is a sample run:
 * 
 * Enter the radius of the bounding circle: 100.52
 * The coordinates of five points on the pentagon are
 * (95.60, 31.06)
 * (0.00, 100.52)
 * (-95.60, 31.06)
 * (-58.08, -81.32)
 * (59.08, -81.32)
 */

public class Question07 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the radius
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		// Generate 5 coordinates based on the radius
		double p1x = radius * Math.cos(Math.PI / 10);
		double p1y = radius * Math.sin(Math.PI / 10);
		double p2x = radius * Math.cos(Math.PI / 2);
		double p2y = radius * Math.sin(Math.PI / 2);
		double p3x = radius * Math.cos((Math.PI / 2) + (2 * Math.PI / 5));
		double p3y = radius * Math.sin((Math.PI / 2) + (2 * Math.PI / 5));
		double p4x = radius * Math.cos((Math.PI / 2) + (4 * Math.PI / 5));
		double p4y = radius * Math.sin((Math.PI / 2) + (4 * Math.PI / 5));
		double p5x = radius * Math.cos((Math.PI / 2) + (6 * Math.PI / 5));
		double p5y = radius * Math.sin((Math.PI / 2) + (6 * Math.PI / 5));
		
		// Display the result
		System.out.println("The coordinates of five points on the pentagon are");
		System.out.printf("(%4.2f, %4.2f)\n", p1x, p1y);
		System.out.printf("(%4.2f, %4.2f)\n", p2x, p2y);
		System.out.printf("(%4.2f, %4.2f)\n", p3x, p3y);
		System.out.printf("(%4.2f, %4.2f)\n", p4x, p4y);
		System.out.printf("(%4.2f, %4.2f)", p5x, p5y);
	}
}
