//Tripp 1/27 - Ch.3 Activity 1
import java.util.*;
public class InchConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double inches;
		System.out.print("Enter a number of inches. ");
		inches = input.nextDouble();
		inchesToFeet(inches);
		inchesToYards(inches);

	}
	
	public static void inchesToFeet(double inches) {
		double feet = inches / 12;
		System.out.println(inches+" inches is equal to "+feet+" feet.");
	}
	
	public static void inchesToYards(double inches) {
		double yards = inches / 36;
		System.out.println(inches+" inches is equal to "+yards+" yards.");
	}
}
