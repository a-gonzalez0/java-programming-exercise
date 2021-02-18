package chapter3;
import java.util.Scanner;

/*
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
 * a triangle and computes the perimeter if the input is valid. Otherwise, display
 * that the input is invalid. The input is valid if the sum of every pair of two edges is
 * greater than the remaining edge.
 * 
 * P = s1 + s2 + s3
 */

public class Question19 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the three edges for a triangle
		System.out.print("Enter the three edges for a triangle: ");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		
		// Compute the perimeter
		int perimeter = side1 + side2 + side3;
		
		// Check if edges are valid
		if (side1 + side2 < side3 || side1 + side3 < side2 || 
				side2 + side3 < side1) {
			System.out.print("The input is invalid");
		} else {			
			// Display the result
			System.out.print("The perimeter of the triangle is: " + perimeter);
		} 
		
	}
}
