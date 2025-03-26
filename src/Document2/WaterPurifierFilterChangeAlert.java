package Document2;

import java.util.Scanner;

/*
Q. Water Purifier Filter Change Alert
 Scenario: A smart purifier notifies the user when a filter needs changing.
 Input: Days since the last filter change.
 Output: Alert if > 180 days
 */
public class WaterPurifierFilterChangeAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days since the last filter change: ");
        int days = sc.nextInt();
        if(days>180) {
            System.out.print("Alert");
        }
        else {
            System.out.print("No issue");
        }
    }
}
