package chapter2;
import java.util.Scanner;

/*
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. The formula for computing the area of a
 * hexagon is Area = (3 * sqrt(3) / 2) * s^2, where s is the length of a side. 
 * Here is a sample run:
 * 
 * Enter the length of the side: 5.5
 * The area of the hexagon is 78.5918
 */

public class Question16 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the side of a hexagon
		System.out.print("Enter the length of the side: ");
		double side = input.nextDouble();
		
		// Compute the area of a hexagon
		double area = ((3 * Math.pow(3, 0.5)) / 2) * (side * side);
		
		// Display the result
		System.out.println("The area of the hexagon is " + area);
	}
}
