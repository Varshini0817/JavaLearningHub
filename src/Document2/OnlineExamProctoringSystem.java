package Document2;

import java.util.Scanner;

/*
Q. Online Exam Proctoring System
 Scenario: A system detects if a student switches tabs during an exam.
 Input: Tab switches count.
 Output: Warning at 3 switches, Auto-submit at 5 switches.

 */
public class OnlineExamProctoringSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tab switches count: ");
        int cnt = sc.nextInt();
        String res = "All set to submit";
        if(cnt >= 5){
            res = "Auto-submit";
        } else if (cnt >= 3 && cnt <5) {
            res = "Warning";
        }
        System.out.print(res);
    }
}
