package chapter4;
import java.util.Scanner;

/*
 * (Geography: estimate areas) Use the GPS locations for
 * 
 * 	Atlanta, Georgia: (33.7489954, -84.3879824)
 * 	Orlando, Florida: (28.5383355, -81.3792365)
 * 	Savannah, Georgia: (32.0835407, -81.0998342)
 * 	Charlotte, North Carolina: (35.2270869, -80.8431267)
 * 
 * in the figure in Section 4.1 to compute the estimated area enclosed by these four cities.
 * (Hint: Use the formula in Programming Exercise 4.2:
 * 
 * d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * 
 * to compute the distance between two cities. Divide the polygon into two triangles 
 * and use the formula in Programming Exercise 2.19 to compute the area of a triangle.)
 * 
 */

public class Question03 {
	public static void main(String[] args) {
		final double RADIUS = 6371.01;
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Atlanta, Georgia
		double x1 = Math.toRadians(33.7489954);
		double y1 = Math.toRadians(-84.3879824);
		
		// Orlando, Florida
	    double x2 = Math.toRadians(28.5383355);
	    double y2 = Math.toRadians(-81.3792365);
	    
	    // Savannah, Georgia
	    double x3 = Math.toRadians(32.0835407);
	    double y3 = Math.toRadians(-81.0998342);
	    
	    // Charlotte, North Carolina
	    double x4 = Math.toRadians(35.2270869);
	    double y4 = Math.toRadians(-80.8431267);
	    
	    // Prompt the user to enter 
				
		double distance1 = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) +
				Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		double distance2 = RADIUS * Math.acos(Math.sin(x2) * Math.sin(x3) +
				Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
		
		double distance3 = RADIUS * Math.acos(Math.sin(x3) * Math.sin(x4) +
				Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));
		
		double distance4 = RADIUS * Math.acos(Math.sin(x4) * Math.sin(x1) +
				Math.cos(x4) * Math.cos(x1) * Math.cos(y4 - y1));
		
		// Display the result
		System.out.println("The distance between Atlanta, Georgia and Orlando, Florida is " + 
				distance1 + " km");
		
		System.out.println("The distance between Orlando, Florida and Savannah, Georgia is " + 
				distance2 + " km");
		
		System.out.println("The distance between Savannah, Georgia and Charlotte, North Carolina is " + 
				distance3 + " km");
		
		System.out.println("The distance between Charlotte, North Carolina and Atlanta, Georgia is " + 
				distance4 + " km");
	}
}
