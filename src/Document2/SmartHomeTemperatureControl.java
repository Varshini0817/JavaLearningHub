package Document2;

import java.util.Scanner;

/*
Q. Smart Home Temperature Control
 Scenario: An AC turns ON/OFF based on room temperature.
 Input: Current room temperature.
 Output: AC ON (> 28°C), AC OFF (< 22°C), Maintain (22-28°C).
 */
public class SmartHomeTemperatureControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current room temperature: ");
        float temp = sc.nextFloat();
        String res;
        if(temp>28){
            res = "AC ON";
        }
        else if (temp >=22 && temp <=28 ){
            res = "Maintain";
        }
        else {
            res = "AC OFF";
        }
        System.out.print(res);
    }
}
