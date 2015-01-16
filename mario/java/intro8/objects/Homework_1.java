package mario.java.intro8.objects;

import java.util.Calendar;

/**
 * @author mariotochkov Write a class with one sta/c method that prints out how
 *         many days, hours, minutes, seconds have passed since Jan 1, 1970
 */

public class Homework_1 {
	
	public static final int A_SECOND = 1000; // milliseconds
	public static final int A_MINUTE = 60000;
	public static final int AN_HOUR = 3600000;
	public static final int A_DAY = 86400000;

	public static void main(String[] args) {
		Calendar then = Calendar.getInstance();
		then.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
		printPassedTime(then);
	}

	/**
	 * @author mariotochkov
	 * @param calendar instance (passed time to calculate)
	 */
	private static void printPassedTime(Calendar calendar) {
		Calendar today = Calendar.getInstance();

		long timeDifference = today.getTimeInMillis() - calendar.getTimeInMillis();

		long timeDiff = timeDifference;

		long dayDifference = timeDiff / A_DAY;
		timeDiff = timeDiff % A_DAY;

		long hourDifference = timeDiff / AN_HOUR;
		timeDiff %= AN_HOUR;

		long minuteDifference = timeDiff / A_MINUTE;
		timeDiff %= A_MINUTE;

		long secondDiff = timeDiff / A_SECOND;

		System.out.println("Since Jan 1, 1970 have past " + dayDifference
				+ " days, " + hourDifference + " hours, " + minuteDifference
				+ " minutes, " + secondDiff + " seconds.");
	}
	
}

