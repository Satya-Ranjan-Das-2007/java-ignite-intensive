package day11;

import java.util.Scanner;
class InvalidMarksException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidMarksException(String message) {
        super(message);
    }
}

public class STUDENT_MARK_VALIDATIOR {

    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
        System.out.println("Valid Marks");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            checkMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println("InvalidMarksException handled");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input: Please enter an integer.");
        } finally {
            sc.close();
        }
    }
}