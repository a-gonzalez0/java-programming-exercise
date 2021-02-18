package chapter2;
import java.util.Scanner;

/*
 * (Geometry: area of a triangle) Write a program that prompts the user to enter
 * three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
 * its area. The formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2;
 * area = sqrt(s(s - side1)(s - side2)(s - side3))
 * 
 * Here is a sample run:
 * 
 * Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: 1.5 -3.4 4.6 5 9.5 -3.4
 * The area of the triangle is 33.6
 */

public class Question19 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter three points (x1, y1), (x2, y2), and (x3, y3)
		System.out.print("Enter the coordinates of three points separated " +
				"by spaces like x1 y1 x2 y2 x3 y3: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		// Find the sides by using Pythagorean Theorem
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		
		double s = (side1 + side2 + side3) / 2;
		
		// Compute the area of a triangle
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		// Display the result
		System.out.println("The area of the triangle is " + area);
	}
}
