import java.util.Scanner;
public class Student_Grade_Evaluator {

	String evaluator(double marks)
	{
		if(marks>=90)
		{
			return "Grade A";
		}
		else if(marks>=70)
		{
			return "Grade B";
		}
		else if(marks>=50)
		{
			return "Grade C";
		}
		else
		{
			return "failing grades";
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student_Grade_Evaluator result = new Student_Grade_Evaluator();
		System.out.println("Enter the marks:");
		double marks = sc.nextDouble();
		System.out.println("The student has got "+result.evaluator(marks));
		sc.close();
	}

}