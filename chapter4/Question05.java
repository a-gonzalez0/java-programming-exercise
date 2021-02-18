package chapter4;
import java.util.Scanner;

/*
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 * in which all sides are of the same length and all angles have the same degree (i.e.,
 * the polygon is both equilateral and equiangular). The formula for computing the
 * area of a regular polygon is
 * 
 * Area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n))
 * 
 * Here, s is the length of a side. Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area. Here
 * is a sample run:
 * 
 * Enter the number of sides: 5
 * Enter the side: 6.5
 * The area of the polygon is 72.69017017488385
 */
public class Question05 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
		
        // Prompt the user to enter the number of sides
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
		
        // Prompt the user to enter the side:
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
		
        // Compute the area
        double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
		
        // Display the result
        System.out.print("The area of the polygon is " + area);
	}
}
