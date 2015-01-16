package mario.java.intro7.methods;

import java.util.Scanner;

/**
 * @author mariotochkov Write a program that asks the user which of the three
 *         tasks to do •
 *         "hello,	this	program	has	3	options:\n	1)	reverse..	\n	2)	factorial...\n	3)	arithmetic.	Choose	option	1,	2	or	3"
 *         .... • Use methods for every task and sub tasks
 */
public class Homework_3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out
				.println("Hello! \nChoose 1 to reverse a number. \nChoose 2 to calculate a factorial. \nChoose 3 to find arithmetic mean.");
		int choice = input.nextInt();
		int number = 0;
		int[] aritMean = new int[3];

		switch (choice) {
		case 1:
			System.out.println("Enter the number to reverse");
			number = input.nextInt();
			System.out.println(reverseNumber(number));
			break;
		case 2:
			System.out.println("Enter the n ");
			number = input.nextInt();
			System.out.println(number + "! = " + factorial(number));
			break;
		case 3:
			System.out.println("Enter a number");
			for (int i = 0; i < aritMean.length; i++) {
				aritMean[i] = input.nextInt();
			}
			System.out.println("The aritmetic mean is "
					+ arithemticMean(aritMean));
			break;
		default:
			break;
		}
	}

	public static int reverseNumber(int number) {
		int testNumber = number;
		int reversed = testNumber % 10;
		while (testNumber > 10) {
			testNumber = testNumber / 10;
			reversed = (reversed * 10) + (testNumber % 10);
		}
		return reversed;
	}

	public static int factorial(int number) {
		if (number != 0) {
			int factorial = 1;
			for (int i = 1; i <= number; i++) {
				factorial *= i;
			}
			return factorial;
		} else {
			return 1;
		}
	}

	public static int arithemticMean(int[] arr) {
		int arithmetic = (arr[0] + arr[1] + arr[2]) / 3;
		return arithmetic;
	}
}
