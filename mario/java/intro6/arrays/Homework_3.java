package mario.java.intro6.arrays;

import java.util.Scanner;

/**
 * @author mariotochkov
 * Create	an	array	with	all	the	latin	letters	(new char[]{'a', 'b'......};)
 * hen	get some	text	as	user	input	and	for	every	leNer	in	the	input,	print	it's	index	in	the	array
 * abba	->	1221
 * Mike	->	139115	
 */
public class Homework_3 {

	public static void main(String[] args) {
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the text");
		String userInput = input.nextLine();
		
		String toCheck = userInput.toLowerCase();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < toCheck.length(); i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (toCheck.charAt(i) == alphabet[j]) {
					sb.append(j+1);
				}
			}
		}
		
		String numbers = sb.toString();
		System.out.println(numbers);
	}
}

