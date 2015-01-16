package mario.java.intro7.methods;

import java.util.Scanner;

/**
 * @author mariotochkov
 *  Write	a	program	that calculates	the	factorial	of	a	number	(5!	=	1*2*3*4*5	=	120)	
 */
public class Homework_2_2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n = ");
		int n = input.nextInt();
		
		if (n > 0) {
			int factorial = 1;
			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}
			System.out.println(factorial);
		} else if (n == 0) {
			System.out.println(1);
		} else {
			System.out.println(-1);
		}

	}

}
