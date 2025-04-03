package Document4;

import java.util.Scanner;
/*
Q. Exam Grading System (Exit if Invalid Input)
 Scenario: Marks MUST be between 0-100 or the system stops!
 Task:
 Take marks input.
 If marks not in range → return error & STOP execution!
 Otherwise, proceed with grading.
 */
public class ExamGradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks;
        do {
            System.out.print("Enter marks: ");
            marks = sc.nextFloat();
            if(!(marks>0 && marks<=100)) {
                System.out.println("Invalid marks");
                return;
            }
            if(marks>35) System.out.println("Pass");
            else System.out.println("Fail");
        } while (true);
    }
}
