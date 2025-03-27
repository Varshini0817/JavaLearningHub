package Document2;

import java.util.Scanner;

/*
Q. Smart Door Lock System
 Scenario: A digital lock verifies the correct PIN.
 Input: Entered PIN vs Stored PIN.
 Output: "Access Granted" if correct, "Incorrect PIN" if wrong, "Account Locked" after 3
wrong attempts.
 */
public class SmartDoorLockSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        System.out.print("Enter stored PIN: ");
        int stPin = sc.nextInt();
        int cnt = 1;
        String msg ;
        while(cnt<3){
            cnt++;
            if(pin == stPin){
                System.out.print("Access Granted");
                return;
            }
            else{
                System.out.println("Incorrect PIN");
                System.out.print("Enter PIN: ");
                pin = sc.nextInt();
            }
        }
        System.out.print("Account locked");
    }
}
