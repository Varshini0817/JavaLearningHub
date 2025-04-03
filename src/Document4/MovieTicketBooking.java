package Document4;

import java.util.Scanner;

/*
Q. Movie Ticket Booking (Skip Bookings for Minors in A-rated Movies)
 Scenario: Minors (under 18) cannot book A-rated movies!
 Task:
 Take age & movie type as input.
 If minor tries A-rated movie → continue & show warning.
 Otherwise, confirm booking.
 */
public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter movie type: ");
            String type = sc.next();
            if(age <18 && type.equals("A")){
                System.out.println("Can't book!");
                continue;
            }
            System.out.println("Booking confirmed");
        }
    }
}
