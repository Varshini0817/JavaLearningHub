package Document2;

import java.util.Scanner;

/*
Q. Movie Ticket Pricing System
 Scenario: A theater charges different prices based on age.
 Input: Age of the customer.
 Output: Child (₹100), Adult (₹200), Senior Citizen (₹150).
 */
public class MovieTicketPricingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        int fare ;
        if(age <18){
            fare = 100;
        }
        else if (age<60){
            fare = 200;
        }
        else{
            fare = 150;
        }
        System.out.print("Your ticket fare is : Rs."+fare);
    }
}
