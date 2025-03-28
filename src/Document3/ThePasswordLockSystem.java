package Document3;

import java.util.Scanner;

/*
Q: The Password Lock System
 Scenario: A security system allows 3 attempts to enter the correct password. If the user
fails, they get locked out!..
Task:
1. Use a while loop to allow up to 3 attempts.
2. If the user enters the correct password, print "Access Granted!" and exit.
3. If they fail 3 times, print "Access Denied. Try again later!"
 Challenge: Allow the user to reset the password if they remember a secret security
question!
 */
public class ThePasswordLockSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter security pin: ");
        int pin = sc.nextInt();
        int crctPin = 1234;
        int cnt = 1;
        while(cnt<3){
            if(pin == crctPin){
                System.out.println("Access Granted");
                return;
            }
            System.out.println("Incorrect pin!");
            pin = sc.nextInt();
            cnt++;

        }
        System.out.println("Access Denied. Try again later!");
        System.out.println("Do you remember secret security answer?");
    }
}
