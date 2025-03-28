package Document3;

import java.util.Scanner;

/*
Q: The Fortune Cookie Dispenser
 Scenario: A fortune cookie machine gives 3 random fortunes to customers!..
Task:
1. Use a for loop to print 3 random fortunes from a list (e.g., "Great things are
coming!").
2. Display "Hope you like your fortune!" at the end.
 Challenge: Let users choose how many fortunes they want!..
 */
public class TheFortuneCookieDispenser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = new String[8];
        for(int i=0; i<8; i++){
            a[i]= "Great things are coming!";
        }
        System.out.print("Enter number of fortunes(<5): ");
        int n = sc.nextInt();
        if(n>5){
            System.out.print("Not more tha 5 fortunes!");
            return;
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
        System.out.println("Hope you like your fortune!" );
    }
}
