package Document4;

import java.util.Scanner;

/*
Q. Toll Booth Collection System (Skip VIP Vehicles)
 Scenario: VIP vehicles don’t pay toll!
 Task:
 Take vehicle numbers as input.
 If VIP → continue (skip toll).
 Otherwise, add toll fee & calculate total.
 */
public class TollBoothCollectionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vip = 1234;
        int[] arr = new  int[n];
        float toll_fee = 0;
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == vip) continue;
            toll_fee+=100;
        }
        System.out.println(toll_fee);
    }
}
