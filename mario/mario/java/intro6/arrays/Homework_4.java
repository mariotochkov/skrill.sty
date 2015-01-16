package mario.java.intro6.arrays;

/**
 * @author mariotochkov
 * Sort	an	array	using	bubble sort
 */
public class Homework_4 {

	public static void main(String[] args) {
		int[] numbers = {9, 54, 18, 99, 25, 14, 96, 105, 900, 1, 50};
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int i : numbers) {
			System.out.print(i + ", ");
		}
	}
}
