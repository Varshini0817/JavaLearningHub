package Document2;

import java.util.Scanner;

/*
Q. Online Learning Platform Progress Tracker
 Scenario: A platform tracks student progress.
 Input: % of course completed.
 Output: 0-25% → "Getting Started", 26-75% → "Keep Going", 76-99% → "Almost
There", 100% → "Course Completed".
 */
public class OnlineLearningPlatformProgressTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter % of course completed: ");
        float perc = sc.nextFloat();
        String msg;
        if(perc >=0 && perc<=25 ){
            msg = "Getting Started";
        }
        else if(perc>=26 && perc <=75){
            msg = "Keep Going";
        } else if (perc>=76 && perc<=99) {
            msg = "Almost There";
        }
        else {
            msg = "Course Completed!";
        }
        System.out.print(msg);
    }
}
