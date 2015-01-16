package mario.java.intro5.loops;

import java.util.Scanner;

/**
 * @author mariotochkov Write a program that reads N from the console and prints
 *         all the numbers 1..N which are not divisible by 3 or 7 (separated by
 *         space)
 */
public class Homework_1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			if ((i % 3 != 0) && (i % 7 != 0)) {
				System.out.print(i + " ");
			}
		}
	}
}
