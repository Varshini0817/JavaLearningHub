package Document1;

import java.util.Scanner;
/*
Traffic Light Controller
Scenario:
A traffic light system works based on color input:
• "Red" → Stop
• "Yellow" → Get Ready
• "Green" → Go
• Any other color → Invalid Input
Task:
1. Ask the user to enter a traffic light color.
2. Use if-else to print the correct action.
3. Handle invalid inputs.
 */
public class TrafficLightController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        String color = sc.next();
        System.out.println(color);
        if(color.equals("Red")){
            System.out.print("Stop");
        }
        else if(color.equals("Yellow")){
            System.out.print("Get Ready");
        }
        else if(color.equals("Green")){
            System.out.print("Go");
        }
        else {
            System.out.print("Invalid Input");
        }
    }
}
