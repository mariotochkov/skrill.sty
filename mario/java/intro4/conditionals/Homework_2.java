package mario.java.intro4.conditionals;

import java.util.Scanner;

/**
 * @author mariotochkov
 * Write	a	program	that	finds	the	biggest	of	three	numbers	[cannot	use	arrays].
 * Numbers	are	supplied	as	input	
 */
public class Homework_2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("first = ");
		int first = input.nextInt();
		
		System.out.print("second = ");
		int second = input.nextInt();
		
		System.out.print("third = ");
		int third = input.nextInt();
		
		int max = first;
		if (second > max) {
			max = second;
		} else if (third > max) {
			max = third;
		}
		
		System.out.println("The largest is: " + max);
	}

}
