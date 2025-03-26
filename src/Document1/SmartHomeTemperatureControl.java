package Document1;

import java.util.Scanner;

/*
Smart Home Temperature Control
Scenario:
A smart AC adjusts based on room temperature:
• Above 30°C → Set AC to High
• Between 20°C and 30°C → Set AC to Medium
• Below 20°C → Turn AC Off
Task:
1. Take room temperature as input.
2. Use if-else conditions to decide the AC setting.
3. Print the AC mode
 */
public class SmartHomeTemperatureControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room temperature: ");
        String res ;
        float temp = sc.nextFloat();
        if(temp >30){
            res = "Set AC to High";
        }
        else if(temp>=20 && temp<=30){
            res = "Set AC to Medium";
        }
        else {
            res = "Turn AC Off";
        }
        System.out.print(res);
    }
}
