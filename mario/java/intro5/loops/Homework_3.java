package mario.java.intro5.loops;

import java.util.Scanner;

/**
 * @author mariotochkov Write a program that calculates n!/k! (factorial), take n and k as user input
 * Check if n>k>0 and print an error if not so
 */
public class Homework_3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n = ");
		int n = input.nextInt();
		
		System.out.print("Enter k = ");
		int k = input.nextInt();
		
		int result = 1;
		
		if ((n > k) && (n > 0) && (k > 0)) {
			for (int i = k; i <= n; i++) {
				result = result * i;
			}
			System.out.println(result);
		} else {
			System.out.println("Wrong input");
		}
	}
}
