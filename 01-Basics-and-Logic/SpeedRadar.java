import java.util.Scanner;

/**
 * Traffic Speed Radar Simulator
 * Evaluates vehicle speed and determines appropriate penalties.
 */
public class SpeedRadar {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("=== Highway Speed Radar ===");
        System.out.print("Enter recorded vehicle speed (km/h): ");
        int speed = reader.nextInt();

        int speedLimit = 90;

        if (speed <= speedLimit) {
            System.out.println("Status: Normal speed. Thank you for driving safely!");
        } else if (speed < 120) {
            System.out.println("Status: Radar violation detected (Exceeded by " + (speed - speedLimit) + " km/h).");
            System.out.println("Penalty: Fine of 200 TL issued.");
        } else {
            System.out.println("Status: Severe speeding detected (Exceeded by " + (speed - speedLimit) + " km/h).");
            System.out.println("Penalty: Fine of 400 TL and penalty points issued.");
        }

        reader.close();
    }
}
