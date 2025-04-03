package Document4;

import java.util.Scanner;

/*
 Q. Password Authentication (Return on Wrong Attempt)
 Scenario: Wrong password? ACCESS DENIED!
 Task:
 Take password input.
 If incorrect → return error message & EXIT.
 If correct → Access Granted!
 */
public class PasswordAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        int n = sc.nextInt();
        int crct_pwd = 1234;
        if(n!=crct_pwd) {
            System.out.println("Access Denied!");
            return;
        }
        System.out.println("Access Granted!");
    }
}
