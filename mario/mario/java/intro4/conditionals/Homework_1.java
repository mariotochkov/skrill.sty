package mario.java.intro4.conditionals;

import java.util.Scanner;

/**
 * @author mariotochkov
 * Write a program that changes the values of two variables
 * only if the first number is bigger
 */
public class Homework_1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Input the first number");
		int firstNumber = input.nextInt();

		System.out.println("Input the second number");
		int secondNumber = input.nextInt();

		if (firstNumber > secondNumber) {
			int temp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
		}

		System.out.println("First number = " + firstNumber);
		System.out.println("Second number = " + secondNumber);
	}
}
