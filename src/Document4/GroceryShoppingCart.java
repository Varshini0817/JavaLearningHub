package Document4;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
/*
Q. Grocery Shopping Cart (Skip Out-of-Stock Items)
 Scenario: Some grocery items are out of stock, so they should be skipped while adding
to the cart!
 Task:
 Store a list of groceries (some marked as out of stock).
 Use continue to skip out-of-stock items.
 Display the final cart list.

 */
public class GroceryShoppingCart {
    public static void main(String[] args) {
        HashMap<String, Boolean> groceries = new HashMap<>();
        groceries.put("Milk", true);
        groceries.put("Bread", true);
        groceries.put("Eggs", false);//Out of stock
        groceries.put("Rice", true);
        groceries.put("Sugar", false);//Out of stock
        groceries.put("Salt", true);

        ArrayList<String> cart = new ArrayList<>();

        for(String item : groceries.keySet()){
            if(!groceries.get(item)){
                continue;
            }
            cart.add(item);
        }
        System.out.println("Final cart: "+cart);
    }
}
