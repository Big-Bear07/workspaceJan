//Tripp 1/27 - Ch.2 Assignment 1
import java.util.*;
public class MinutesConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double daysRound = 0;
		final int MINS_IN_HOUR = 60;
		final int HOURS_IN_DAY = 24;
		System.out.print("How many minutes are you trying to convert? ");
		int minutes = input.nextInt();
		float hours = minutes / MINS_IN_HOUR;
		float days = hours / HOURS_IN_DAY;
		
		daysRound = days * 100;
		daysRound = daysRound + 0.5;
		daysRound = (int)daysRound;
		daysRound = daysRound / 100;
		System.out.print(minutes+" minutes equals "+hours+" hours and equals "+daysRound+" days.");

	}

}
