package Document4;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Q. Restaurant Order System (Stop Taking Orders When Kitchen Closes)
 Scenario: Orders stop after 10 PM!
 Task:
 Continuously take orders.
 If time hits 10 PM → break & stop orders.
 Display final order list.
 */
public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> orders = new ArrayList<>();
        LocalTime closingTime = LocalTime.of(22,0);//10 PM
        System.out.println("Welcome to the Restaurant!\nStart placing your orders!");

        while(true){
            LocalTime currentTime = LocalTime.now();
            if(currentTime.isAfter(closingTime) || currentTime.equals(closingTime)){
                System.out.println("Kitchen is closed!No more orders");
                break;
            }
            System.out.println("Enter your order(type 'exit' or stop):");
            String order = sc.next();
            if(order.equalsIgnoreCase("exit") || order.equalsIgnoreCase("stop")){
                break;
            }
            orders.add(order);
        }
        System.out.println("Final order list:");
        if(orders.isEmpty()){
            System.out.println("No orders were placed!");
        }
        else {
            for(String item: orders){
                System.out.println("- "+item);
            }
        }
    }
}


