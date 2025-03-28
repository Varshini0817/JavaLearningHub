package Document3;

import java.util.Scanner;

/*
Q: The Magic Multiplication Table Generator
 Scenario: A magician reveals multiplication tables to amazed audiences!..
Task:
1. Ask for a number (N) from the user.
2. Use a for loop to print its multiplication table up to 10.
3. If the number is 0 or negative, print "Invalid input! Please enter a positive
number."
 Challenge: Modify the code to generate tables up to any limit set by the user.
 */
public class TheMagicMultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter limit: ");
        int lim = sc.nextInt();
        System.out.println("The multiplication table of "+n+" is: ");
        for(int i=1; i<=lim; i++ ){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
