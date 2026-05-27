package javaignite_day2;
import java.util.Scanner;

public class studentresult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String name;
        int m1, m2, m3, total;
        double average;

        System.out.println("Enter Student Name:");
        name = sc.nextLine();

        System.out.println("Enter Marks of Subject 1:");
        m1 = sc.nextInt();

        System.out.println("Enter Marks of Subject 2:");
        m2 = sc.nextInt();

        System.out.println("Enter Marks of Subject 3:");
        m3 = sc.nextInt();

        total = m1 + m2 + m3;
        average = total / 3.0;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        System.out.println("Average > 50 : " + (average > 50));
    }
}
