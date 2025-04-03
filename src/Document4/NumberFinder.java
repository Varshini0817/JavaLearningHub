package Document4;

import java.util.ArrayList;
import java.util.Scanner;

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
