package Document1;

import java.util.Scanner;
/*
Online Shopping Discount Calculator
Scenario:
An e-commerce website offers discounts based on purchase amount:
• Above ₹5000 → 20% discount
• Between ₹2000 and ₹5000 → 10% discount
• Below ₹2000 → No discount
Task:
1. Take total bill amount as input.
2. Apply the discount based on conditions.
3. Print the final amount after discount.
 */

public class OnlineShoppingDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total bill amount: ");
        float bill = sc.nextFloat();
        double res =0;
        if (bill > 5000){
            res = 0.2*bill;
        }
        else if (bill >= 2000 && bill<= 5000){
            res = 0.1*bill;
        }
        System.out.print("Final amount after discount: "+(bill-res));
    }
}
