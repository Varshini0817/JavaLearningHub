package Document4;

import java.util.ArrayList;
import java.util.Scanner;
/*
 Q. Number Finder (Stop When Found)
 Scenario: Searching for a number? Stop once found!
 Task:
 Take a list of numbers & a search input.
 If number found → break & show success message!
 If not found → Keep searching!
 */
public class NumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        for(int i =0;i<n; i++){
            arr.add(sc.nextInt());
        }
        System.out.print("Enter a number to search:");
        int s = sc.nextInt();
        boolean flag = false;
        for (int i=0; i<n; i++){
            if(arr.get(i) == s) {
                flag = true;
                System.out.println("Success");
                break;
                }
        }
        if(!flag)
        System.out.println("Number not found!");
    }
}
