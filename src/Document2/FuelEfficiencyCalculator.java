package Document2;

import java.util.Scanner;

/*
Q. Fuel Efficiency Calculator
 Scenario: A vehicle checks fuel efficiency.
 Input: Distance traveled & fuel used.
 Output: If mileage < 10 km/l → "Low Efficiency", 10-20 km/l → "Normal", > 20 km/l
→ "High Efficiency".
 */
public class FuelEfficiencyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance traveled and fuel used: ");
        float dist = sc.nextFloat();
        float fuel = sc.nextFloat();
        double mileage = dist/fuel;
        if(mileage<10){
            System.out.print("Low Efficiency");
        }
        else if(mileage>=10 && mileage<=20){
            System.out.print("Normal");
        }
        else {
            System.out.print("High Efficiency");
        }
    }
}
