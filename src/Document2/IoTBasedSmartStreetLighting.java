package Document2;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/*
Q. IoT-Based Smart Street Lighting
 Scenario: Streetlights turn ON/OFF based on light intensity.
 Input: Light intensity value.
 Output: If < 50 → "Turn ON", Else → "Turn OFF".
 */
public class IoTBasedSmartStreetLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter light intensity value: ");
        float inte = sc.nextFloat();
        if(inte<50){
            System.out.print("Turn ON");
        }
        else{
            System.out.print("Turn OFF");
        }
    }
}
