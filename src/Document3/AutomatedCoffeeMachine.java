package Document3;

import java.util.Scanner;

/*
Q: Automated Coffee Machine
 Scenario: A coffee machine serves different cups of coffee based on customer demand. A
user inputs the number of cups they need, and the machine dispenses coffee accordingly!..
Task:
1. Take the number of cups as input.
2. Use a for loop to print “Serving coffee ” for each cup.
3. After all servings, print "Enjoy your coffee!.."
4.
 Challenge: Modify the code so that if more than 5 cups are ordered, the machine prints
"Sorry, only 5 cups allowed at a time!" instead of serving.

 */
public class AutomatedCoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cups: ");
        int n= sc.nextInt();
        if(n >5){
            System.out.print("Sorry, only 5 cups allowed at a time!");
        }
        else{
            for(int i=0; i<n; i++){
                System.out.println("Serving coffee for each cup");
            }
            System.out.println("Enjoy your coffee!");
        }

    }
}
