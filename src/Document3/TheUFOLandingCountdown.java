package Document3;

import java.util.Scanner;

/*
Q: The UFO Landing Countdown
 Scenario: A UFO is about to land! The countdown begins, and an emergency system
checks if landing conditions are safe!..
Task:
1. Start a countdown from 15 to 1 using a while loop.
2. If the countdown reaches 5, print "Check fuel levels!"
3. At 1, print "UFO has landed safely!"
 Challenge: If the user inputs a faulty countdown (e.g., 20 instead of 15), restart the
countdown.
 */
public class TheUFOLandingCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown: ");
        int n = sc.nextInt();
        if(n!=15){
            System.out.println("Input should be 15");
            return;
        }
        while (n>1){
            System.out.println(n);
            if(n==5){
                System.out.println("Check fuel levels!");
            }
            n--;
        }
        if(n==1){
            System.out.print("UFO has landed safely!");
        }
    }
}
