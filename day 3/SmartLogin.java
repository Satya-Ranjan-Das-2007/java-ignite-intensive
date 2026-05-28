package day3;

import java.util.Scanner;

public class SmartLogin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter User Name : ");
		String username = sc.nextLine();

		if(username.equals("admin"))
		{
			// 1st Attempt
			System.out.print("Enter Password : ");
			String pwd1 = sc.nextLine();

			if(pwd1.equals("java@123"))
			{
				System.out.print("Enter OTP : ");
				int otp = sc.nextInt();

				if(otp >= 1000 && otp <= 9999)
				{
					System.out.println("Login Successful");
				}
				else
				{
					System.out.println("Invalid OTP");
				}
			}
			else
			{
				System.out.println("Wrong Password");
				System.out.println("Try Again");

				// 2nd Attempt
				System.out.print("Enter Password Again : ");
				String pwd2 = sc.nextLine();

				if(pwd2.equals("java@123"))
				{
					System.out.print("Enter OTP : ");
					int otp1 = sc.nextInt();

					if(otp1 >= 1000 && otp1 <= 9999)
					{
						System.out.println("Login Successful");
					}
					else
					{
						System.out.println("Invalid OTP");
					}
				}
				else
				{
					System.out.println("Wrong Password");
					System.out.println("Try Again");

					// 3rd Attempt
					System.out.print("Enter Password Again : ");
					String pwd3 = sc.nextLine();

					if(pwd3.equals("java@123"))
					{
						System.out.print("Enter OTP : ");
						int otp2 = sc.nextInt();

						if(otp2 >= 1000 && otp2 <= 9999)
						{
							System.out.println("Login Successful");
						}
						else
						{
							System.out.println("Invalid OTP");
						}
					}
					else
					{
						System.out.println("Account Blocked");
					}
				}
			}
		}
		else
		{
			System.out.println("Wrong User Name");
		}

		sc.close();
	}
}