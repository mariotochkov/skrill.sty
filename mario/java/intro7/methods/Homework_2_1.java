package mario.java.intro7.methods;

import java.util.Scanner;

/**
 * @author mariotochkov
 * 	Write	a	program	that reverses	the	digits	of	a	number	(543->345)
 */
public class Homework_2_1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		int testNumber = number;
		int reversed = testNumber % 10;
		while (testNumber > 10) {
			testNumber = testNumber / 10 ;
			reversed = (reversed*10) + (testNumber%10);
		}
		System.out.println(reversed);
	}
}
