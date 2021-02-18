package chapter4;
import java.util.Scanner;

/*
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 * following formula (s is the length of a side):
 * Area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6))
 * 
 * Write a program that prompts the user to enter the side of a hexagon and displays
 * its area. Here is a sample run:
 * 
 * Enter the side: 5.5
 * The area of the hexagon is 78.59
 */
public class Question04 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the side of a hexagon
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		// Compute the area
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
		
		// Display the result
		System.out.printf("The area of the hexagon is %4.2f", area);
	}
}
