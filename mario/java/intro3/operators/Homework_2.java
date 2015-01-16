package mario.java.intro3.operators;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author mariotochkov
 * Make	a	program	that	checks	whether	the	user	input	is	a	number	and	has	6 for a third digit
 * Print	"yes",	"no"	or	"not	a	number"	only
 */
public class Homework_2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Input a number.");
		int number = Integer.MAX_VALUE;

		try {
			number = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Not a number");
			return;
		}

		if (number < 100) {
			System.out.println("The number does not have a third digit.");
			return;
		}

		int testNumber = number;

		while (testNumber > 1000) {
			testNumber = testNumber / 10;
		}

		if (testNumber % 10 == 6) {
			System.out.println("Yes, the third digit is 6.");
		} else {
			System.out.println("No, the third digit is not 6.");
		}
	}
}
