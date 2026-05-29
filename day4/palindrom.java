package day4;
import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a no. :");
		int no=sc.nextInt();
		
		int temp=no;
		int rev=0,rem;
		while(temp != 0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		
		
		if(rev==no)
			System.out.println(no +" is a palindrom.");
		else
			System.out.println(no +" is not a palindrom.");
		
	sc.close();
	}

}
