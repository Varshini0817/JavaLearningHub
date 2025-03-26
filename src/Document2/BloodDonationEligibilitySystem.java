package Document2;

import java.util.Scanner;

/*
Q. Blood Donation Eligibility System
 Scenario: Checks if a person is eligible to donate blood.
 Input: Age & weight.
 Output: Age > 18 & weight > 50kg → "Eligible", Else → "Not Eligible".
 */
public class BloodDonationEligibilitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter weight: ");
        float weight = sc.nextFloat();
        String msg;
        if(age> 18 && weight>50){
            msg = "Eligible";
        }
        else {
            msg ="Not Eligible";
        }
        System.out.print(msg+" for Blood donation");
    }
}
