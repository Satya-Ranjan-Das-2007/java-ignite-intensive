package day3;
import java.util.Scanner;
public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of working years:");
		int year = sc.nextInt();
		System.out.println("Enter the attendance (in %):");
		double attendance = sc.nextDouble();
		System.out.println("Enter performance rating (1-5):");
		int rating = sc.nextInt();
		
		if(year > 3)
		{
			if(attendance > 85.00)
			{
				System.out.println("you are eligible.");
				
				switch(rating)
				{
					case 5:
						System.out.println("Bonus amount is Rs. 50,000");
						break;
					case 4:
						System.out.println("Bonus amount is Rs. 30,000");
						break;
					case 3:
						System.out.println("Bonus amount is Rs. 10,000");
						break;
					default:
						System.out.println("your should be improve rating, there is no bonus!");
				}
			}
			else if(attendance < 60.00 )
			{
				System.out.println("your attendence is low!!!!\nnot eligible");	
			}
			else 
				System.out.println("not eligible.");	

			}
		else
			System.out.println("your working year is low \nnot eligible.");	

	}

}
