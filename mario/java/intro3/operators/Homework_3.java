package mario.java.intro3.operators;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author mariotochkov
 * Make	a	program	that	takes	two	arguments	a	and	b.	Create	an	algorithm	that	
 * checks	whether	point	(a,	b)	is	inside	a	circle	with	center	(0,	0)	and	radius	8	
 * • Print	"yes",	"no"	or	"wrong	input:	explanation"	only	
 */
public class Homework_3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int xCoord = 0;
		int yCoord = 0;
		
		System.out.println("Enter the first number");try {
			xCoord = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		System.out.println("Enter the second number");
		try {
			yCoord = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		if (isThePointInCircle(xCoord, yCoord)) {
			System.out.println("Yes, the point is in the circle.");
		} else {
			System.out.println("No, the point is not in the circle.");
		}
	}

	static boolean isThePointInCircle(int xCoord, int yCoord) {
		double radiusVector = (Math.pow(xCoord, 2) + Math.pow(yCoord, 2));
		if (radiusVector < Math.pow(8, 2)) {
			return true;
		} else {
			return false;
		}
	}
}
