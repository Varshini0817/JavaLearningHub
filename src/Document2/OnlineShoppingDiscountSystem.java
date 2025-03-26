package Document2;
/*
Q. Online Shopping Discount System
 Scenario: A website gives discounts based on order amount.
 Input: Total purchase amount.
 Output: ₹500-₹1000 → 5% off, ₹1001-₹5000 → 10% off, >₹5000 → 20% off.
 */
import java.util.Scanner;
public class OnlineShoppingDiscountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        float am = sc.nextFloat();
        double res;
        if(am>=500 && am<=1000){
            res = am*0.05;
        }
        else if(am>=1001 && am<=5000){
            res = am*0.1;
        }
        else {
            res = am*0.2;
        }
        System.out.print("Final amount to be paid: Rs."+(am-res));
    }
}
