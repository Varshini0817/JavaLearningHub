package Document4;

import java.util.Scanner;

/*
Q. Elevator System (Stop at Emergency Floor)
 Scenario: Elevator stops at emergency 5th floor!
 Task:
 Simulate elevator movement.
 If floor = 5 → break & display ALERT!
 Otherwise, move to the next floor
 */
public class ElevatorSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        do{
            cnt++;
            int floor = sc.nextInt();
            if(floor == 5) {
                System.out.println("ALERT!");
                break;
            }
            else {
                System.out.println("Taking to floor "+floor);
            }
        }while(cnt!=5);
    }
}
