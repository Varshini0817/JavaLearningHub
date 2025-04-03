package Document4;

import java.util.Scanner;
/*
Q. Student Exam Evaluator (Skip Invalid Marks)
 Scenario: Marks cannot be negative, so skip them!
 Task:
 Take 5 subject marks as input.
 If negative, continue (skip) and move to the next subject.
 Show total marks of valid subjects.
 */
public class StudentExamEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum=0;
        for(int i =0; i<5; i++){
            float m = sc.nextFloat();
            if(m<0) continue;
            sum+=m;
        }
        System.out.println(sum);
    }
}
