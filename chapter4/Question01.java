package chapter4;
import java.util.Scanner;

/*
 * (Geometry: area of a pentagon) Write a program that prompts the user to enter
 * the length from the center of a pentagon to a vertex and computes the area of the
 * pentagon, as shown in the following figure.
 * 
 * The formula for computing the area of a pentagon is 
 * Area = 5 * Math.pow(s, 2) / 4 * tan * (PI / 5), 
 * 
 * where s is the length of a side. The side can be computed using the formula 
 * s = 2 * r sin (PI / 5), where r is the length from the center of a pentagon to a vertex. 
 * Round up two digits after the decimal point. Here is a sample run:
 * 
 * Enter the length from the center to a vertex: 5.5
 * The area of the pentagon is 71.92 
 */

public class Question01 {
    public static void main(String[] args) {
        // Create a Scanner object
	    Scanner input = new Scanner(System.in);
		
	    // Prompt the user to enter the length
	    System.out.print("Enter the length from the center to a vertex: ");
	    double length = input.nextDouble();
	    length = 2 * length * Math.sin(Math.PI / 5);
		
	    // Compute the area
	    double area = (5 * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / 5));
		
	    // Display the result
	    System.out.printf("The area of the pentagon is %4.2f", area);
	}
}
