package Document2;

import java.util.Scanner;

/*
Q. Airport Baggage Weight Checker
 Scenario: Airlines impose a fine if luggage is overweight.
 Input: Baggage weight.
 Output: If > 20kg, charge ₹500 per extra kg.
 */
public class AirportBaggageWeightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight: ");
        float wt = sc.nextFloat();
        double fine = 0;
        if(wt > 20){
            fine = (wt-20)*500;
        }
        System.out.print("Your fine is Rs."+fine);
    }
}
