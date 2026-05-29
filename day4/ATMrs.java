package day4;
import java.util.Scanner;

public class ATMrs {

	public static void main(String[] args) {
		
		int pin=9999;
		int ans=0;
		Scanner sc=new Scanner(System.in);
		
		while(ans != pin)
		{
			System.out.println("Enter your pin :-");
			ans=sc.nextInt();
			
			if (ans != 9999)
				System.out.println("your enter wrongr pin.");
			else
				System.out.println("Log in sucsessfully.");
		
		}
		sc.close();
	}
}
