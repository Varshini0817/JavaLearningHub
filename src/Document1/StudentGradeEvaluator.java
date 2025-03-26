package Document1;

import java.util.Scanner;
/*
 Student Grade Evaluator
Scenario:
A school follows the grading system:
• Marks ≥ 90 → A+
• Marks 80 - 89 → A
• Marks 70 - 79 → B
• Marks 60 - 69 → C
• Marks < 60 → Fail
Task:
1. Take the student’s marks as input.
2. Use if-else ladder to assign a grade.
3. Display the student’s grade.
*/
public class StudentGradeEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();
        if(marks >= 90){
            System.out.println("A+");
        }
        else if(marks>=80 && marks <= 89){
            System.out.println("A");
        }
        else if(marks>=70 && marks <= 79){
            System.out.println("B");
        }
        else if(marks>=60 && marks <= 69){
            System.out.println("C");
        }
        else if (marks < 60) {
            System.out.println("Fail");
        }
    }
}
