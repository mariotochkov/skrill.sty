package mario.java.intro3.operators;

/**
 * @author mariotochkov Make a program that changes the third bit of an int
 */
public class Homework_4 {
	public static void main(String[] args) {
		int number = 8;
		int maskNumber = 4;
		int result = 0;
		result = number ^ maskNumber;
		System.out.println(result);
	}
}
