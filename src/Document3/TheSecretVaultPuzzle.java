package Document3;

import java.util.Scanner;

/*
Q: The Secret Vault Puzzle
 Scenario: A secret vault unlocks only if the user enters a correct series of numbers!..
Task:
1. Use a nested for loop to ask the user for 3 correct numbers in sequence.
2. If all 3 match the vault password, unlock the vault. Otherwise, try again.
 Challenge: Give a hint if the first two numbers are correct!

 */
public class TheSecretVaultPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        a= new int[]{3, 4, 5};
        boolean flag = false;
        for(int i=0; i<3; i++){
            System.out.print("Enter number "+(i+1)+": ");
            int n = sc.nextInt();
            if(n==a[i]){
                if(i==1){
                    System.out.println("It's an odd prime number!");
                }
                else if(i==2){
                    System.out.println("Vault unlocked!");
                }
            }
            else {
                System.out.print("Enter correct number!\nTry again!");
                break;
            }
        }
    }
}
