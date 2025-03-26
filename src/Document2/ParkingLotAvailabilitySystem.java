package Document2;

import java.util.Scanner;

/*
Q. Parking Lot Availability System
 Scenario: A parking system indicates availability.
 Input: Total slots & occupied slots.
 Output: If available slots > 0 → "Parking Available", Else → "Full".

 */
public class ParkingLotAvailabilitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total slots: ");
        int tSlots = sc.nextInt();
        System.out.print("Enter occupied slots: ");
        int oSlots = sc.nextInt();
        if(tSlots-oSlots>0){
            System.out.print("Parking Available");
        }
        else {
            System.out.print("Full");
        }
    }
}
