package mario.java.intro1.eclipse;

import java.util.Scanner;

/**
 * Write a simple console app, that asks the user for their age, and then says
 * "Your age is XX"
 */
public class Homework_2 {

	public static void main(String[] args) {
		System.out.println("Enter your age: ");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();

		if ((age < 0) && (age > 125)) {
			System.out.println("Your age is " + age);
		} else {
			System.out.println("Not a valid age.");
		}
	}
}
