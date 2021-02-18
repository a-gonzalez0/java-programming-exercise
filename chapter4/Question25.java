package chapter4;

/*
 * (Generate vehicle plate numbers) Assume that a vehicle plate number consists
 * of three uppercase letters followed by four digits. Write a program to generate a
 * plate number.
 */

public class Question25 {
	public static void main(String[] args) {
		// Generate a random letter from 0 - 26
        int letter1 = (int)(Math.random() * 26);
        int letter2 = (int)(Math.random() * 26);
        int letter3 = (int)(Math.random() * 26);
        
        // Generate random numbers from 0 - 9
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        int number4 = (int)(Math.random() * 10);
        
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		
		// Generate a plate number (three uppercase letters followed by four digits (ex: ABC1234))
        System.out.println(Character.toUpperCase(alphabet.charAt(letter1)) + "" +
        		Character.toUpperCase(alphabet.charAt(letter2)) + "" +
        		Character.toUpperCase(alphabet.charAt(letter3)) + "" +
        		numbers.charAt(number1) + "" +
        		numbers.charAt(number2) + "" +
        		numbers.charAt(number3) + "" +
        		numbers.charAt(number4));

	}
}
