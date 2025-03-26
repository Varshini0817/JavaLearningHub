package Document1;

import java.util.Scanner;
/*
. Odd or Even with Extra Conditions
Scenario:
A program determines whether a number is:
• Even
• Odd
• Odd and greater than 50
• Even and a multiple of 10
Task:
1. Take an integer input.
2. Use nested if-else to check multiple conditions.
3. Print the appropriate category
 */
public class OddorEvenwithExtraConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String res ;
        if(number %2 == 0){
            if(number%10 ==0){
                res = "Even and a multiple of 10";
            }
            else{
                res = "Even";
            }
        }
        else {
            if(number>50){
                res = "Odd and greater than 50";
            }
            else {
                res = "Odd";
            }
        }
        System.out.println(res);
    }
}
