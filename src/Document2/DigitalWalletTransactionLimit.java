package Document2;

import java.util.Scanner;

/*
Q. Digital Wallet Transaction Limit
 Scenario: A wallet app limits daily transactions.
 Input: Amount spent today.
 Output: If > ₹50,000, "Daily Limit Reached".
 */
public class DigitalWalletTransactionLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount spent today: ");
        float am = sc.nextFloat();
        String res = "You can proceed!";
        if(am>50000){
            res = "Daily Limit Reached";
        }
        System.out.print(res);
    }

}
