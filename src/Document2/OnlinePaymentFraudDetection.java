package Document2;

import java.util.Scanner;

/*
Online Payment Fraud Detection
 Scenario: A banking system detects fraudulent transactions.
 Input: Amount & location.
 Output: Flag as suspicious if the amount > ₹50,000 & location differs from the last 5
transactions.
 */
public class OnlinePaymentFraudDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount and location: ");
        float amount = sc.nextFloat();
        String loc = sc.next();
        boolean flag= false;
        if(amount > 50000){
            flag= true;
        }
        if(flag){
            System.out.print("Suspicious");
        }
        else{
            System.out.print("Genuine");
        }
    }
}
