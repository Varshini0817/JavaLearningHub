package Document3;

import java.util.Scanner;

/*
Q: Marathon Runner Energy Tracker
 Scenario: A fitness tracker records a marathon runner’s energy level every 2 kilometers
until they reach the finish line.
Task:
1. Assume the race is 10 km long.
2. Use a for loop to print energy status at every 2 km (Example: "At 2km: Energy
90%").
3. At the end, print "Congratulations! You finished the marathon!"
 Challenge: Modify the loop so that if the energy drops below 40%, the tracker warns
"Drink water! Energy low!"

 */
public class MarathonRunnerEnergyTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.print("Enter energy levels: ");
        for(int i=0; i<5; i++){
            a[i]= sc.nextInt();
        }
        int km=2;
        for(int i=0; i<5; i++){
            System.out.println("At "+(km)+"km: Energy "+a[i]+"%");
            km+=2;
            if(a[i] <40){
                System.out.println("Drink water! Energy low!");
            }
        }
        System.out.print("Congratulations! You finished the marathon!");
    }
}
