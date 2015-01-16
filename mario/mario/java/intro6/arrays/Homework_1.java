package mario.java.intro6.arrays;

/**
 * @author mariotochkov
 * Create	a	program	that	creates	an	array	with	10	elements
 * Every	element	is	equal	to	itsindex	mul/plied	by	3	(do	it	with	a	for	loop)
 */
public class Homework_1 {

	public static void main(String[] args) {
		int[] intsArray = new int[10];
		for (int i = 0; i < intsArray.length; i++) {
			intsArray[i] = i * 3;
		}
		
		for (int i : intsArray) {
			System.out.print(i + " ");
		}
	}

}
