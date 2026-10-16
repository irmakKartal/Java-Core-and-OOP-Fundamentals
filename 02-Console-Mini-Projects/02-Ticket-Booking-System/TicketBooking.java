import java.util.Scanner;

/**
 * Event Ticket Booking System
 * Computes ticket prices according to event type (Cinema, Theater, Concert) and age group discounts.
 */
public class TicketBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("            Event Ticket Booking System           ");
        System.out.println("==================================================");

        System.out.println("\nSelect Event Type:");
        System.out.println("  [0] Cinema");
        System.out.println("  [1] Theater");
        System.out.println("  [2] Concert");
        System.out.print("Enter choice (0 - 2): ");
        int event = scanner.nextInt();

        System.out.print("Enter attendee age: ");
        int age = scanner.nextInt();

        String eventName;
        double price = 0.0;

        switch (event) {
            case 0:
                eventName = "Cinema";
                if (age < 12) {
                    price = 0.0; // Free for kids
                } else if (age <= 16) {
                    price = 10.0;
                } else if (age <= 22) {
                    price = 20.0;
                } else {
                    price = 30.0;
                }
                break;

            case 1:
                eventName = "Theater";
                if (age < 12) {
                    price = 0.0;
                } else if (age <= 16) {
                    price = 15.0;
                } else if (age <= 22) {
                    price = 25.0;
                } else {
                    price = 35.0;
                }
                break;

            case 2:
                eventName = "Concert";
                if (age < 12) {
                    price = 5.0;
                } else if (age <= 16) {
                    price = 25.0;
                } else if (age <= 22) {
                    price = 45.0;
                } else {
                    price = 60.0;
                }
                break;

            default:
                eventName = "Standard Event";
                price = 20.0;
                break;
        }

        System.out.println("\n==================================================");
        System.out.println("                  BOOKING SUMMARY                 ");
        System.out.println("==================================================");
        System.out.println(" Event        : " + eventName);
        System.out.println(" Attendee Age : " + age);
        System.out.println(" Ticket Price : " + (price == 0.0 ? "FREE" : price + " TL"));
        System.out.println("==================================================");

        scanner.close();
    }
}
