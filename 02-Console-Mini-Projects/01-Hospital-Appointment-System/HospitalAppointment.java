import java.util.Scanner;

/**
 * Hospital Appointment Booking System
 * Allows patients to select a hospital branch, medical department, and appointment time slot.
 */
public class HospitalAppointment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("   Welcome to Central Hospital Appointment System ");
        System.out.println("==================================================");

        // Hospital Selection
        System.out.println("\nSelect Hospital Branch:");
        System.out.println("  [0] West Hospital");
        System.out.println("  [1] East Hospital");
        System.out.print("Enter choice (0 or 1): ");
        int hospitalChoice = scanner.nextInt();

        String hospitalName = (hospitalChoice == 0) ? "West Hospital" : "East Hospital";

        // Department Selection
        System.out.println("\nSelect Medical Department:");
        System.out.println("  [0] Neurology");
        System.out.println("  [1] Orthopedics");
        System.out.println("  [2] Dermatology");
        System.out.print("Enter choice (0 - 2): ");
        int deptChoice = scanner.nextInt();

        String departmentName;
        switch (deptChoice) {
            case 0:
                departmentName = "Neurology";
                break;
            case 1:
                departmentName = "Orthopedics";
                break;
            case 2:
                departmentName = "Dermatology";
                break;
            default:
                departmentName = "General Medicine";
                break;
        }

        // Time Slot Selection
        System.out.println("\nAvailable Time Slots:");
        System.out.println("  [0] 08:00 AM");
        System.out.println("  [1] 03:00 PM (15:00)");
        System.out.println("  [2] 05:00 PM (17:00)");
        System.out.print("Enter choice (0 - 2): ");
        int timeChoice = scanner.nextInt();

        String timeSlot;
        switch (timeChoice) {
            case 0:
                timeSlot = "08:00 AM";
                break;
            case 1:
                timeSlot = "03:00 PM";
                break;
            case 2:
                timeSlot = "05:00 PM";
                break;
            default:
                timeSlot = "10:00 AM";
                break;
        }

        // Booking Confirmation
        System.out.println("\n==================================================");
        System.out.println("              APPOINTMENT CONFIRMED               ");
        System.out.println("==================================================");
        System.out.println(" Hospital   : " + hospitalName);
        System.out.println(" Department : " + departmentName);
        System.out.println(" Time Slot  : " + timeSlot);
        System.out.println(" Status     : Confirmed successfully.");
        System.out.println("==================================================");

        scanner.close();
    }
}
