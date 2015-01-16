package mario.java.intro4.conditionals;

import java.util.Scanner;

/**
 * @author mariotochkov
 * Write	a	program	that	finds	the	biggest	of	five	numbers	[cannot	use	arrays].
 * Numbers	are	supplied	as	input
 * Print	only	that	number
 */
public class Homework_4 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Input numer:");
			int temp = input.nextInt();
			if (temp > max) {
				max = temp;
			}
		}
		System.out.println("The biggest is " + max);
	}
}
