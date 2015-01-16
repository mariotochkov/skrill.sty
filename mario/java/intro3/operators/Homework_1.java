package mario.java.intro3.operators;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author mariotochkov 
 * Make a program that takes user input and says whether
 * the number is odd or even
 */
public class Homework_1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Input a number.");
		int number = Integer.MAX_VALUE;

		try {
			number = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("You didn't enter an integer.");
			return;
		}

		if (number % 2 == 0) {
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}
	}
}
