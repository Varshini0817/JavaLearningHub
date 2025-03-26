package Document2;

import java.util.Scanner;

/*
Hospital Emergency Room Priority System
 Scenario: A hospital assigns priority to patients.
 Input: Condition severity (Mild, Moderate, Severe).
 Output: "Low Priority", "Medium Priority", "High Priority".
 */
public class HospitalEmergencyRoomPrioritySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter condition severity: ");
        String condition = sc.next();
        String res="No issue";
        if(condition.equals("Mild")){
            res = "Low Priority";
        }
        else if(condition.equals("Moderate")){
            res = "Medium Priority";
        }
        else if(condition.equals("Severe")){
            res = "High Priority";
        }
        System.out.print(res);
    }
}
