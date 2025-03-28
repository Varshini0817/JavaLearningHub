package Document3;

import java.util.Scanner;

/*
Q: The Robot Dance Challenge
 Scenario: A robot can repeat a dance move N times as per user input!..
Task:
1. Take N (number of dance moves) as input.
2. Use a do-while loop to print " Dancing step [Step Number]" for each step.
3. End with "Dance complete!"
 Challenge: Ensure the robot performs at least one dance move, even if N = 0.
 */
public class TheRobotDanceChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (dance steps): ");
        int n = sc.nextInt();
        do{
            System.out.println("Dancing step "+n);
            n--;
        }
        while(n>0);
        System.out.println("Dance complete!");
    }
}
