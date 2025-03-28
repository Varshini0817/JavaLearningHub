package Document3;


/*
Q: The Fortune Cookie Dispenser
 Scenario: A fortune cookie machine gives 3 random fortunes to customers!..
Task:
1. Use a for loop to print 3 random fortunes from a list (e.g., "Great things are
coming!").
2. Display "Hope you like your fortune!" at the end.
 Challenge: Let users choose how many fortunes they want!..
 */
import java.util.Scanner;
import java.util.Random;
public class TheFortuneCookieDispenser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[];
        a = new String[]{"Success is just around the corner!",
                "A pleasant surprise awaits you.",
                "Happiness will find you when you least expect it.",
                "Your hard work will soon pay off.",
                "New opportunities are on the horizon.",
                "A special moment is on its way.",
                "Your kindness will bring you great rewards.",
                "A dream you’ve held close will come true.",
                "Exciting changes are ahead! ",
                " Good luck is following you today."
        };
        System.out.print("Enter number of fortunes(<8): ");
        int n = sc.nextInt();
        if(n>8){
            System.out.print("Not more tha 8 fortunes!");
            return;
        }
        int randNum;
        for(int i=0; i<n; i++){
            randNum = (int)(Math.random() * (10-1)+1);
            System.out.println(a[i]);
        }
        System.out.println("\nHope you like your fortune!" );
    }
}
