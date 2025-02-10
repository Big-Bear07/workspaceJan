//Tripp 1/27 - Ch.3 Assignment 1
import java.util.*;

public class HomeRepair {

	public static void main(String[] args) {
		String jobName = "name";
		double materialCost, hoursWork, hoursTravel;
		Scanner job = new Scanner(System.in);
		System.out.print("Input the job name, replacing spaces with underscores: ");
		jobName = job.next();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input the material cost, hours worked, and hours traveled separated by spaces: ");
		materialCost = input.nextDouble();
		hoursWork = input.nextDouble();
		hoursTravel = input.nextDouble();

		double totalCost = calcTotalCost(materialCost, hoursWork, hoursTravel);
		System.out.print("The total cost of "+jobName+" is: $"+totalCost);
	}
	
	public static double calcTotalCost(double materialCost, double hoursWork, double hoursTravel) {
		double totalCost = materialCost + hoursWork*35 + hoursTravel*12;
		return totalCost;
		
	}
	
}
