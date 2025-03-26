package Document1;

import java.util.Scanner;

/*
ATM Cash Withdrawal System
Scenario:
An ATM allows cash withdrawals only under certain conditions:
• User must enter the correct PIN.
• Requested amount should be a multiple of ₹100.
• User should have sufficient balance.
Task:
1. Ask the user to enter a PIN (assume correct PIN is 1234).
2. Take balance and withdrawal amount as inputs.
3. Check if the PIN is correct, the amount is a multiple of 100, and if the balance is
enough.
4. Display an appropriate message for success or failure.

 */
public class ATMCashWithdrawalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        System.out.print("Enter balance: ");
        float bal = sc.nextFloat();
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();
        boolean res;
        if(pin == 1234){
            if(amount<= bal && amount%100==0){
                res = true;
            }
            else {
                res = false;
            }
        }
        else {
            res = false;
        }
        if(res){
            System.out.print("Success");
        }
        else {
            System.out.print("Failure");
        }
    }
}
