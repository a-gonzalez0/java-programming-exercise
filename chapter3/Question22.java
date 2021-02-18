package chapter3;
import java.util.Scanner;

/*
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 * circle, as shown in Figure 3.7a.
 * 
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 * The formula for computing the distance is Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5). 
 * Test your program to cover all cases.) Two sample runs are shown below:
 * 
 * Enter a point with two coordinates: 4 5
 * Point (4.0, 5.0) is in the circle
 * 
 * Enter a point with two coordinates: 9 9
 * Point (9.0, 9.0) is not in the circle
 */

public class Question22 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user for a point with two coordinates
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// Compute the distance
		double distance = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
		
		if (distance <= 10) {
			System.out.print("Point (" + x + ", " + y + ") is in the circle");
		} else {
			System.out.print("Point (" + x + ", " + y + ") is not in the circle");
		}
	}
}
