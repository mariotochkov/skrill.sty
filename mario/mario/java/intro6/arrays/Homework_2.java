package mario.java.intro6.arrays;

import java.util.Scanner;

/**
 * @author mariotochkov
 * Write	a	program	that	reads	two	arrays	from	console	and	compares	them.	Prints	the	result	to the	console	
 * First	ask	for	array1	size,	then	read	all	numbers,	then	the	second	one	
 * true	if	equal,	false	if	not	equal
 */
public class Homework_2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the first array. n = ");
		int n = input.nextInt();
		int[] firstArr = new int[n];
		for (int i = 0; i < firstArr.length; i++) {
			System.out.println("Input a number");
			firstArr[i] = input.nextInt();
		}
		
		System.out.println("Enter the size of the second array. m = ");
		int m = input.nextInt();
		int[] secondArr = new int[m];
		for (int i = 0; i < secondArr.length; i++) {
			System.out.println("Input a number");
			secondArr[i] = input.nextInt();
		}
		
		boolean isEqual = true;
		if (n == m) {
			for (int i = 0; i < firstArr.length; i++) {
				if (firstArr[i] != secondArr[i]) {
					isEqual = false;
				}
			}
		} else {
			isEqual = false;
		}
		
		System.out.println("\n" + isEqual);
	}

}
