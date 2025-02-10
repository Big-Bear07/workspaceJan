//Tripp 1/27 - Ch.3 Activity 2
import java.util.*;
public class PaintCalculator {

	public static void main(String[] args) {
		double length, width, height;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the length, width, and height of the room seaparated by spaces. ");
		length = input.nextDouble();
		width = input.nextDouble();
		height = input.nextDouble();
		double price = calcAreaAndPrice(length, width, height);
		double gallons = calcGallons(length, width, height);
		System.out.println("You will need "+gallons+" gallons to paint a "+length+"ft. by "+width+"ft. by "+height+"ft. room, and it will cost $"+price+".");

	}
	
	public static double calcAreaAndPrice(double length, double width, double height) {
		double wallArea = 2*(length * height + width * height);
		double price = calcGallonsAndPrice(wallArea);
		return price;
		
	}
	
	public static double calcGallonsAndPrice(double wallArea) {
		double gallons = wallArea / 350;
		double price = Math.ceil(gallons)* 32;
		return price;
		
	}
	
	public static double calcGallons(double length, double width, double height) {
		double wallArea = 2*(length * width + width * height);
		double gallons = (int)wallArea / 350;
		return gallons;
		
	}

}
