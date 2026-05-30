package JAVA_DAY_5;

import java.util.Scanner;

public class Shopping_Discount_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter original bill amount: ");
		double billAmount = sc.nextDouble();
		
		System.out.print("Enter discount percentage: ");
		double discountPercent = sc.nextDouble();
		
		double finalBill = calculateFinalBill(billAmount, discountPercent);
		System.out.println("Final Bill: " + finalBill);
		sc.close();
	}
	public static double calculateFinalBill(double amount, double percent) {
		double discountAmount = amount * (percent / 100);
		return amount - discountAmount;
	}

}
