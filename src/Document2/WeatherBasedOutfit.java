package Document2;

import java.util.Scanner;

/*
Weather-Based Outfit Recommender
 Scenario: Suggest clothes based on temperature.
 Input: Temperature.
 Output: Cold (< 15°C) - "Wear Jacket", Normal (15-30°C) - "T-shirt", Hot (>30°C) -
"Wear light clothes".
 */
public class WeatherBasedOutfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        float temp = sc.nextFloat();
        String outfit;
        if(temp<15){
            outfit = "It's cold! Wear Jacket";
        }
        else if (temp>=15 && temp<=30){
            outfit="It's normal! Wear T-shirt";
        }
        else{
            outfit="It's Hot! Wear light clothes";
        }
        System.out.print(outfit);
    }
}
