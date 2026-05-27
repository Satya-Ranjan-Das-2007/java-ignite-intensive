package javaignite_day2;
import java.util.Scanner;

public class travelexpence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        double distance, petrolPrice, mileage;
        double petrolNeeded, totalCost;

        System.out.println("Enter Travel Distance (KM):");
        distance = sc.nextDouble();

        System.out.println("Enter Petrol Price per Liter:");
        petrolPrice = sc.nextDouble();

        System.out.println("Enter Vehicle Mileage:");
        mileage = sc.nextDouble();

        petrolNeeded = distance / mileage;
        totalCost = petrolNeeded * petrolPrice;

        System.out.println("Petrol Needed: " + petrolNeeded + " liters");
        System.out.println("Total Travel Cost: " + totalCost);
	}

}
