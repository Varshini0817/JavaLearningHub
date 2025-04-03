package Document4;

import java.util.Scanner;

/*
 Q. Bank Account Transaction System
 Scenario: A bank allows users to withdraw money, but if they try to withdraw more than
the balance, the process stops immediately.
 Task:
 Take user input for balance & withdrawal amount.
 If withdrawal > balance → break transaction & show error!
 Otherwise, deduct & print the new balance.
 */
public class BankAccountTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bal ,am;
        do {
            System.out.print("Enter balance: ");
            bal = sc.nextFloat();
            System.out.print("Enter withdrawal amount: ");
            am = sc.nextFloat();
            if(bal<am){
                System.out.println("Insufficient balance!");
                break;
            }
            else {
                System.out.println("Remaining bal :"+(bal-am));
            }
        }while (bal>am);
    }
}
