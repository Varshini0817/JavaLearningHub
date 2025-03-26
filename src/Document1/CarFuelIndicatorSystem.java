package Document1;

import java.util.Scanner;

/*
Car Fuel Indicator System
Scenario:
A car dashboard shows fuel level warnings:
• More than 50% fuel → "Enough Fuel "
• Between 20% - 50% → "Refuel Soon "
• Less than 20% → "Low Fuel! "
Task:
1. Take fuel percentage as input.
2. Use conditional statements to display a warning message.
3. Test different values and see the output
 */
public class CarFuelIndicatorSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fuel percentage: ");
        float fuel = sc.nextFloat();
        String res ;
        if(fuel >50){
            res = "Enough fuel";
        }
        else if(fuel >=20 && fuel <=50){
            res = "Refuel soon";
        }
        else {
            res = "Low Fuel";
        }
        System.out.print(res);
    }
}
