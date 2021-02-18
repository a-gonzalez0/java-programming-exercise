package chapter3;
import java.util.Scanner;

/*
 * (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
 * Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
 * the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
 * that “The equation has no solution.”
 * 
 * Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
 * x is -2.0 and y is 3.0
 * 
 * Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
 * The equation has no solution
 * 
 * Cramer's Rule
 * ax + by = e
 * cx + dy = f
 * x = ed - bf / ad - bc
 * y = af - ec / ad - bc
 */

public class Question03 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a, b, c, d, e, and f
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double noSolution = a * d - b * c;
				
		// If ad - bc is 0, report "The equation has no solution."
		if (noSolution == 0) {
			System.out.print("The equation has no solution");
		} else {
			// Compute Cramer's Rule
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			
			// Display the result
			System.out.print("x is " + x + " and y is " + y);
		}		
	}
}
