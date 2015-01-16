package mario.java.intro7.methods;

import java.util.Scanner;

/**
 * @author mariotochkov
 * Write	a	program	that	reads	3	numbers	from	console	and	uses the getMax(int, int) method	to	print	the	biggest	one	
 */
public class Homework_1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the test number.");
		int testNumber = input.nextInt();
		
		System.out.println("Enter second number");
		int first = input.nextInt();
		
		System.out.println("Enter third number");
		int second = input.nextInt();
		
		
		int bigger = getMax(first, second);
		if (testNumber > bigger) {
			System.out.println("The biggest is " + testNumber);
		} else {
			System.out.println("The biggest is " + bigger);
		}
	}
	
	public static int getMax(int first, int second) {
		if (first > second) {
			return first;
		} else {
			return second;
		}
	}
}
