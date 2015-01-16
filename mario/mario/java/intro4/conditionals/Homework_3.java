package mario.java.intro4.conditionals;

import java.util.Scanner;

/**
 * @author mariotochkov
 * Write	a	program	that	for	a	given	number	less	than	10		writes	it's name
 */
public class Homework_3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = input.nextInt();

		switch (number) {
		case 0:
			System.out.println("Zero");
			break;
			
		case 1:
			System.out.println("One");
			break;
			
		case 2:
			System.out.println("Two");
			break;
			
		case 3:
			System.out.println("Three");
			break;
			
		case 4:
			System.out.println("Four");
			break;
			
		case 5:
			System.out.println("Five");
			break;
			
		case 6:
			System.out.println("Six");
			break;
			
		case 7:
			System.out.println("Seven");
			break;
			
		case 8:
			System.out.println("Eight");
			break;
			
		case 9:
			System.out.println("Nine");
			break;
			

		default:
			System.out.println("This is other number");
			break;
		}
	}
}
