package chapter2;

import java.util.Scanner;

/*
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas:
 * 	area = radius * radius * pi
 * 	volume = area * length
 * 
 * Here is a sample run:
 * Enter the radius and length of a cylinder: 5.5 12
 * 	The area is 95.0331
 * 	The volume is 1140.4
 */

public class Question02 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the radius and length of a cylinder
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		// Display the result
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}
