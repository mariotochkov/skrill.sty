package mario.java.intro5.loops;

import java.util.Scanner;

/**
 * @author mariotochkov Write a program that takes a decimal number and prints
 *         it in binary form
 */
public class Homework_4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a number");
		int decimal = input.nextInt();
		int decimalNumber = decimal;
		StringBuilder sb = new StringBuilder();

		while (decimalNumber != 0) {
			sb.append(decimalNumber % 2);
			decimalNumber = decimalNumber / 2;
		}
		String binary = sb.reverse().toString();
		
		System.out.println("0b" + binary);
	}

}
