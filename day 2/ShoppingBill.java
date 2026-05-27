package javaignite_day2;
import java.util.Scanner;

public class ShoppingBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		
		System.out.println("Enter product name :");
		String pname = sc.nextLine();
		
		System.out.println("Enter product price :");
		double price = sc.nextDouble();
		
		System.out.println("Enter quantity :");
		int quantity = sc.nextInt();
		
		double totalbill = quantity * price;
		
		System.out.println("your name     :"+ name);
		System.out.println("product name  :"+ pname);
		System.out.println("quantity      :"+ quantity);
		System.out.println("total bill    :"+ totalbill);
	}
}
	
