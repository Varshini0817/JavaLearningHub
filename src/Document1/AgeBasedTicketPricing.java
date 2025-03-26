package Document1;
import  java.util.*;

public class AgeBasedTicketPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Your ticket price is : ");
        if(age < 5) System.out.print("Free");
        else if (age >=5 && age <= 12) System.out.print("Rs. 100");
        else if (age >=13 && age <= 60) System.out.print("Rs. 200");
        else  System.out.println("Rs. 150");
    }
}
