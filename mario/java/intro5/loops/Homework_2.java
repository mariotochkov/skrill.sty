package mario.java.intro5.loops;

import java.util.Scanner;

/**
 * @author mariotochkov Write a program that prints the first N (read from
 *         console) fibonacci numbers
 */
public class Homework_2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		
		long next = 0;
		long prevoius = 1;
		long current = 1;
		
		for (int i = 1; i <= n; i++) {
			System.out.print(next + ", ");
			current = next;
			next = current + prevoius;
			prevoius = current;
		}
	}
}
