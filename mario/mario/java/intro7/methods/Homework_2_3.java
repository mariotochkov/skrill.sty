package mario.java.intro7.methods;

import java.util.Scanner;

/**
 * @author mariotochkov
 * 	Write	a	program	that Finds	the	arithme/c	mean	of	three	numbers	(4,8,2	->	(4+8+2)/3	=	4.66667)
 */
public class Homework_2_3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a number");
			int inputNumber = input.nextInt();
			sum += inputNumber;
		}
		int arithmeticMean = sum / 3;
		System.out.println("The arithmetic mean is " + arithmeticMean);
	}
}
