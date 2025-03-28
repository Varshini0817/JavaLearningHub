package Document3;

import java.util.Scanner;

/*
Q: The Haunted House Countdown!..
 Scenario: A haunted house tour has a countdown before the spooky experience begins.
The countdown starts from 10 to 1 and then displays "BOO! Welcome to the haunted
house!..”
Task:
1. Use a while loop to print the countdown from 10 to 1.
2. Display “BOO! Welcome to the haunted house!” at the end.
 Challenge: Make sure the countdown only accepts numbers ≥ 1 (i.e., no negative
numbers).
 */
public class TheHauntedHouseCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i<1) {
            System.out.print("Numbers should be greater than 1");
            return;
        }
        while(i>0){
            System.out.println(i);
            i--;
        }
        System.out.print("“BOO! Welcome to the haunted house!");
    }
}
