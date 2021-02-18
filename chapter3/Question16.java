package chapter3;

/*
 * (Random point) Write a program that displays a random coordinate in a rectangle. 
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 */

public class Question16 {
	public static void main(String[] args) {
		// Generate a random coordinate in a rectangle
		int width = (int)(Math.random() * 101 - 50);
		int height = (int)(Math.random() * 201 - 100);
		
		// Display a random coordinate in a rectangle
		System.out.print("A random coordinate in a rectangle centered at (0, 0) " +
				"with width 100 and height 200 is: (" + width + ", " + height + ")");
	}
}
