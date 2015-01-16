package mario.java.intro6.arrays;

import java.util.Scanner;

/**
 * @author mariotochkov
 * Use	ints	array.	Sort	it.	Take	a	number	from	the	user	(console)	do	a	binary	search
 * if	number	exists,	print	its	index,	if	not,	write	"no	such	number"	
 */
public class Homework_5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int[] numbers = { 9, 54, 18, 99, 25, 14, 96, 105, 900, 1, 50, 60 };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		System.out.println("Enter a number to search");
		int search = input.nextInt();
		int low = 0;
		int high = numbers.length-1;
		int middle = 0;

		while (low <= high) {
			middle = low + (high - low) / 2;
			if (search < numbers[middle]) {
				high = middle - 1;
			} else if (search > numbers[middle]) {
				low = middle + 1;
			} else if (search == numbers[middle]) {
				break;
			}
		}
		
		if (search == numbers[middle]) {
			System.out.println("Index = " + middle);
		} else {
			System.out.println("No such number");
		}
	}
}
