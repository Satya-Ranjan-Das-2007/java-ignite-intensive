package day4;
import java.util.Scanner;

public class SumUntilNavative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int ans=0;
		Scanner sc=new Scanner(System.in);
		
		while(ans>=0)
		{
			System.out.println("Enter a no. :-");
			ans=sc.nextInt();
			
			if (ans >=0)
				sum=sum+ans;
			else
				System.out.println("sum of entered no is : "+ sum);

		
		}
		sc.close();

	}

}
