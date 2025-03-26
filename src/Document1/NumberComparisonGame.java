package Document1;

import java.util.Scanner;

public class NumberComparisonGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        /* 10 20 30 ; 20 30 10; 30 10 20; */
        if (a > b ){
            if(a > c){
                System.out.println(a+ " is the largest");
            }
            else {
                System.out.println(c+" is the largest");
            }
        }
        else if (b > c){
            System.out.println(b+" is the largest");
        }
        else if ( c > b){
            System.out.println(c +" is the largest");
        }
        else{
            System.out.println("Three numbers are equal");
        }
    }
}
