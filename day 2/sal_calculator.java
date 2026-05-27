package javaignite_day2;
import java.util.Scanner;

public class sal_calculator {
	
	    public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();
	        
	        System.out.print("Enter Basic Salary: ");
	        double basicSalary = sc.nextDouble();
	        
	        double da = 0.30 * basicSalary;   
	        double hra = 0.125 * basicSalary; 
	        double pf = 0.10 * basicSalary;   

	        double grossSalary = basicSalary + da + hra;
	        double netSalary = grossSalary - pf;
	        
	        System.out.println("\n--- " + name + "'s Salary Breakdown ---");
	        System.out.printf("Basic Salary      : %.2f\n", basicSalary);
	        System.out.printf("DA                : %.2f\n", da);
	        System.out.printf("HRA               : %.2f\n", hra);
	        System.out.println("---------------------------------");
	        System.out.printf("Gross Salary      : %.2f\n", grossSalary);
	        System.out.printf("PF Deduction (-)  : %.2f\n", pf);
	        System.out.println("---------------------------------");
	        System.out.printf("Net (Take-Home)   : %.2f\n", netSalary);
	        

	    }
	}

