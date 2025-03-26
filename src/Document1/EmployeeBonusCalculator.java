package Document1;

import java.util.Scanner;
//Scenario:
//A company gives a bonus based on years of service:
//        • More than 10 years – 10% bonus
//• Between 5 and 10 years – 7% bonus
//• Less than 5 years – 5% bonus
//Task:
//        1. Ask the user to enter their salary and years of service.
//2. Calculate the bonus based on conditions.
//        3. Print the final salary after adding the bonus.

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary : ");
        float sal = sc.nextFloat();
        System.out.print("Enter years of service: ");
        float yr = sc.nextFloat();
        double res ;
        if( yr < 5){
            res = 0.05*sal;
        }
        else if ( yr>=5 && yr<=10){
            res = 0.07*sal;
        }
        else{
            res = 0.1*sal;
        }
        System.out.println("Salary after adding the bonus is "+(res+sal));
    }
}
