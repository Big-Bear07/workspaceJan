//Tripp 1/26 - Ch.2 Activity 2
import java.util.*;
public class InchesToFeet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inches = 86;		
		final int INCHES_TO_FEET = 12;
		System.out.print("Enter your height in inches ");
		inches = input.nextInt();
		
		int feet = inches / INCHES_TO_FEET;
		int remainder = inches % INCHES_TO_FEET;
		System.out.println(inches+" inches equals "+feet+" feet plus "+remainder+" inches.");
		
		

	}

}
