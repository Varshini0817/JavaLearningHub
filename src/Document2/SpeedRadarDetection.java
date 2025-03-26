package Document2;

import java.util.Scanner;

/*
. Speed Radar Detection
 Scenario: A smart camera detects overspeeding vehicles.
 Input: Speed of vehicle.
 Output: "Normal" (<= 60 km/h), "Warning" (61-80 km/h), "Fine Issued" (> 80 km/h).
 */
public class SpeedRadarDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed of the vehicle: ");
        float speed = sc.nextFloat();
        String res;
        if(speed <=60 ){
            res = "Normal";
        } else if (speed>=61 && speed<= 80) {
            res = "Warning";
        }
        else {
            res="Fine Issued";
        }
        System.out.print(res);
    }
}
