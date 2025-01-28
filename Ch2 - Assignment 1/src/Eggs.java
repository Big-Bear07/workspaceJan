//Tripp 1/26 - Ch.2 Assignment 1
import java.util.*;
public class Eggs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int EGGS_IN_DOZEN = 12;
		System.out.print("How many eggs would you like? ");
		int eggs = input.nextInt();
		int dozen = eggs / EGGS_IN_DOZEN;
		int remainder = eggs % EGGS_IN_DOZEN;
		float cost = (float)(dozen*3.25+remainder*0.45);
		System.out.print("You ordered "+eggs+" eggs. "+"That’s "+dozen+" dozen at $3.25 per dozen and "+remainder+" loose eggs at 45 cents each for a total of $"+cost+".");

	}

}
