package JAVA_DAY_5;

import java.util.Scanner;
public class Travel_Expense_Calculator {

	double petrol_price(double distance,double mileage,double price)
	{
		double total_petrol= distance/mileage;
		return price*total_petrol;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total distance travelled (in km):");
		double distance = sc.nextDouble();
		System.out.println("Enter the mileage:");
		double mileage = sc.nextDouble();
		System.out.println("Enter petrol price per litre:");
		double price = sc.nextDouble();
		Travel_Expense_Calculator pprice = new Travel_Expense_Calculator();
		System.out.println("Total travel cost is Rs."+pprice.petrol_price(distance, mileage, price));
		sc.close();
	}

}