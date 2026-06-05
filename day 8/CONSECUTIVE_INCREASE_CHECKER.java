package day8;
import java.util.Scanner;

public class CONSECUTIVE_INCREASE_CHECKER {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int[] arr = new int[5];
			System.out.println("Enter 5 numbers:");
			for(int i =0;i<arr.length;i++)
			{
				arr[i]= sc.nextInt();
			}
			
			for(int i =0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					System.out.println("Array is not in increasing order!");
					return;
				}
			}
			System.out.println("Array is in increasing order!");
			sc.close();
		}
	}

}

