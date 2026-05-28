package day3;
import java.util.Scanner;

public class ResturantBill {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter main menu ('v'-veg/'nv'-non-veg):");
		String main_menu= sc.nextLine();
		
		switch(main_menu)
		{
		case "v":
			System.out.println("Item selection:\n1.Fried Rice (Rs.200)\n2.Noodles (Rs.100)");
			int menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("Quantity:");
				int qty = sc.nextInt();
				System.out.println("Memeber:\n1.Gold\n2.Silver\n3.Normal");
				int member = sc.nextInt();
				int total = 200*qty;
				switch(member)
				{
				case 1:
					double discount= 0.2*total;
					double bill=total-discount;
					if(bill>2000) {
					System.out.println("Amount to be paid is Rs."+bill+"\nFree desert as well!");
					}
					else
					{
						System.out.println("Amount to be paid is Rs."+bill);
					}
				break;
				
				case 2:
					discount= 0.1*total;
					bill=total-discount;
					System.out.println("Amount to be paid is Rs."+bill);
				break;
				
				case 3:
					System.out.println("Amount to be paid is Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			case 2:
				System.out.println("Quantity:");
				 qty = sc.nextInt();
				System.out.println("Memeber:\n1.Gold\n2.Silver\n3.Normal");
				member = sc.nextInt();
				 total = 100*qty;
				switch(member)
				{
				case 1:
					double discount= 0.2*total;
					double bill=total-discount;
					if(bill>2000) {
					System.out.println("Amount to be paid is Rs."+bill+"\nFree desert as well!");
					}
					else
					{
						System.out.println("Amount to be paid is Rs."+bill);
					}
				break;
				
				case 2:
					discount= 0.1*total;
					bill=total-discount;
					System.out.println("Amount to be paid is Rs."+bill);
				break;
				
				case 3:
					System.out.println("Amount to be paid is Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			default:
				System.out.println("Invalid menu");
			}
		break;
		
		case "nv":
			System.out.println("Item selection:\n1.Chicken Biryani (Rs.200)\n2.Grill Chicken (Rs.100)");
			 menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("Quantity:");
				int qty = sc.nextInt();
				System.out.println("Memeber:\n1.Gold\n2.Silver\n3.Normal");
				int member = sc.nextInt();
				int total = 200*qty;
				switch(member)
				{
				case 1:
					double discount= 0.2*total;
					double bill=total-discount;
					if(bill>2000) {
					System.out.println("Amount to be paid is Rs."+bill+"\nFree desert as well!");
					}
					else
					{
						System.out.println("Amount to be paid is Rs."+bill);
					}
				break;
				
				case 2:
					discount= 0.1*total;
					bill=total-discount;
					System.out.println("Amount to be paid is Rs."+bill);
				break;
				
				case 3:
					System.out.println("Amount to be paid is Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			case 2:
				System.out.println("Quantity:");
				 qty = sc.nextInt();
				System.out.println("Memeber:\n1.Gold\n2.Silver\n3.Normal");
				 member = sc.nextInt();
				 total = 100*qty;
				switch(member)
				{
				case 1:
					double discount= 0.2*total;
					double bill=total-discount;
					if(bill>2000) {
					System.out.println("Amount to be paid is Rs."+bill+"\nFree desert as well!");
					}
					else
					{
						System.out.println("Amount to be paid is Rs."+bill);
					}
				break;
				
				case 2:
					discount= 0.1*total;
					bill=total-discount;
					System.out.println("Amount to be paid is Rs."+bill);
				break;
				
				case 3:
					System.out.println("Amount to be paid is Rs."+total);
					break;
				default:
					System.out.println("Invalid membership");
				}
			break;
			
			default:
				System.out.println("Invalid menu");
			}
		break;
			
		}
	}

	

}
