package chapter3;
import java.util.Scanner;

/*
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and
 * (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a and b.
 * The intersecting point of the two lines can be found by solving the following
 * linear equations:
 * 
 * (y1 - y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
 * (y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3
 * 
 * This linear equation can be solved using Cramer’s rule (see Programming
 * Exercise  3.3). If the equation has no solutions, the two lines are parallel (see 
 * Figure 3.8c). Write a program that prompts the user to enter four points and displays
 * the intersecting point. Here are sample runs:
 * 
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
 * The intersecting point is at (2.88889, 1.1111)
 * 
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
 * The two lines are parallel
 * 
 * --------------------------------------------------------------------------------------
 * 
 * Cramer's Rule
 * ax + by = e
 * cx + dy = f
 * x = ed - bf / ad - bc
 * y = af - ec / ad - bc
 */

public class Question25 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter four points
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		// Calculate the intersecting point
		// Get a, b, c, d, e, f
		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		double checkIfNoSolution = a * d - b * c;
		
		if (checkIfNoSolution == 0) {
			System.out.print("The two lines are parallel");
		} else {
			
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			
			System.out.print("The intersecting point is at (" + x + ", " + y + ")");
		}
	}
}
