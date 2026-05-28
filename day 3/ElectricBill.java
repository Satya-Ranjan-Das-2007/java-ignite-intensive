package day3;
import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter type of household ('d'-domestic/'c'-commercial/'i'-industrial):");
		String household = sc.nextLine();
		System.out.println("Enter no. of units consumed:");
		int units = sc.nextInt();
		int res_unit;
		int left_unit;
		switch(household)
		{
			case "d":
				if(units>101 && units<300)
				{
					res_unit=units-100;
					System.out.println("Total amount to be paid Rs."+(5*res_unit));
				}
				else if(units<=100)
				{
					System.out.println("Free to use");
				}
				else
				{
					res_unit=units-100;
					left_unit=res_unit-200;
					System.out.println("Total amount to be paid Rs."+((5*res_unit)+(8*left_unit)));
				}
			break;
			
			case "c":
				if(units<200)
				{
					System.out.println("Total amount to be paid Rs."+(10*units));
				}
				else if(units>=200)
				{
					res_unit=units-200;
					System.out.println("Total amount to be paid Rs."+((15*res_unit)+(10*units)));
				}
			break;
			case "i":
				
				if(units>500)
				{
					System.out.println("Enter power factor ('g' - good/'b' - bad):");
					String powerFactor = sc2.nextLine();
					switch(powerFactor)
					{
					case "g":
						double discount= ((20*units)-(0.1*(20*units)));
						System.out.println("Total amount to be paid Rs."+discount);
					break;
					case "b":
						System.out.println("Total amount to be paid Rs."+(20*units));
						break;
					
					default:
						System.out.println("wrong choice");
					}
					
				}
				else
				{
					System.out.println("Total amount to be paid Rs."+(20*units));
				}
			break;
			
			default:
				System.out.println("Invalid choice");
		}
	}

}
