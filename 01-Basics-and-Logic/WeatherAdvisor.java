import java.util.Scanner;

/**
 * Weather & Activity Advisor
 * Provides clothing and outdoor activity advice based on ambient temperature.
 */
public class WeatherAdvisor {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("=== Weather & Activity Advisor ===");
        System.out.print("Enter current temperature (°C): ");
        double temp = scn.nextDouble();

        if (temp > 40) {
            System.out.println("Advice: Extremely hot! Avoid direct sunlight and stay hydrated indoors.");
        } else if (temp >= 30) {
            System.out.println("Advice: Hot weather. Wear sunscreen, light clothes, and sunglasses.");
        } else if (temp >= 20) {
            System.out.println("Advice: Pleasant warm weather. Ideal for outdoor activities with a T-shirt.");
        } else if (temp >= 10) {
            System.out.println("Advice: Mild to cool. A light jacket or sweater is recommended.");
        } else if (temp >= 0) {
            System.out.println("Advice: Cold weather. Wear a heavy coat, scarf, and warm footwear.");
        } else {
            System.out.println("Advice: Freezing conditions! Watch out for black ice and dress warmly.");
        }

        scn.close();
    }
}
