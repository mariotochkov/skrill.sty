package mario.java.intro2.lang;

import java.util.Scanner;


/**
 * @author mariotochkov
 * Declare	two	int	variables.	Take	input	from	the	user	for	their
 * values.	Initialize	them.	Switch	their	values,	print	the	result	
 */
public class Homework_3 {

	public static void main(String[] args) {
		System.out.println("Input two numbers");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("first = ");
		int first = input.nextInt();
		
		System.out.println("second = ");
		int second = input.nextInt();
		
		int temp = first;
		first = second;
		second = temp;
		
		System.out.println("first = " + first);
		System.out.println("second = " + second);
	}

}
