package Document3;

import java.util.Scanner;

/*
Q: The Grocery Billing System
 Scenario: A grocery store prints a bill for purchased items!..
Task:
1. Ask the user how many items they bought.
2. Use a for loop to take input for each item’s price.
3. At the end, display the total bill amount.
4.
 Challenge: Apply a 10% discount if the total bill is above ₹2000.

 */
public class TheGroceryBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items bought: ");
        int n = sc.nextInt();
        double totalBill = 0;
        float price;
        for(int i=0; i<n; i++){
            System.out.print("Enter price for item "+(i+1)+": ");
            price = sc.nextFloat();
            totalBill +=price;
        }

        if(totalBill>2000){
            totalBill=totalBill-(0.1*totalBill);
        }
        System.out.println("Your total bill amount is Rs."+totalBill);
    }
}
