package Document2;
/*
. Smart Traffic Signal Controller
 Scenario: Implement a system where traffic lights change based on vehicle density.
 Input: Number of vehicles in a lane.
 Output: Green if < 10, Yellow if 10-30, Red if > 30.
 */
import java.util.*;
public class SmartTrafficSignalController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles in a lane: ");
        int num = sc.nextInt();
        String res;
        if (num < 10 ){
            res = "Green";
        }
        else if (num>= 10 && num <= 30){
            res = "Yellow";
        }
        else{
            res = "Red";
        }
        System.out.print(res);
    }
}
