package day3;
import java.util.Scanner;

public class CollegeAdmission {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Maths marks:");
			int mark1= sc.nextInt();
			System.out.println("Physics marks:");
			int mark2= sc.nextInt();
			System.out.println("Chemistry marks:");
			int mark3= sc.nextInt();
			
			double average = (mark1+mark2+mark3)/3;
			
			if(mark1<=35 || mark2<=35 || mark3<= 35)
				System.out.println("Criteria to admission not fulfilled\nrejected!");
			
			else if(mark1>=90 && mark2>=90 && mark3>=90)
				System.out.println("Admission granted\nScholarship awarded!");
			
			else if((mark1>=70 && mark2>=60 && mark3>=60)||average>=80)
				System.out.println("Admission granted");
			
	}


}
