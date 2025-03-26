package Document2;

import java.util.Scanner;

/*
Q. Spam Message Detector
 Scenario: A chat app filters spam messages.
 Input: Message content.
 Output: "Spam Detected" if it contains words like "FREE", "WIN", "CLICK HERE"
 */
public class SpamMessageDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message content: ");
        String msg = sc.nextLine();
        if(msg.contains("FREE") || msg.contains("WIN") || msg.contains("CLICK HERE")){
            System.out.print("Spam Detected");
        }
        else {
            System.out.print("No spam detected");
        }
    }
}
