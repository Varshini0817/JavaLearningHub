package Document2;

import java.util.Scanner;

/*
Elevator System Control
 Scenario: An elevator decides whether to move up or down based on floor requests.
 Input: Current floor, Requested floor.
 Output: "Move Up", "Move Down", "Stay".
 */
public class ElevatorSystemControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current floor : ");
        int c = sc.nextInt();
        System.out.print("Enter requested floor : ");
        int r = sc.nextInt();
        String res;
        if(c>r){
            res= "Move Down";
        }
        else if(c<r){
            res = "Move Up";
        }
        else {
            res = "Stay";
        }
        System.out.print(res);
    }
}
