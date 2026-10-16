import java.util.Scanner;

/**
 * Common Number Operations
 * Demonstrates conditionals, parity check (odd/even), sign check (positive/negative), and comparisons.
 */
public class NumberOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Number Operations Demo ===");
        System.out.print("Enter an integer to check (parity & sign): ");
        int num = scanner.nextInt();

        // Check Odd / Even
        if (num % 2 == 0) {
            System.out.println("-> " + num + " is EVEN.");
        } else {
            System.out.println("-> " + num + " is ODD.");
        }

        // Check Positive / Negative / Zero
        if (num > 0) {
            System.out.println("-> " + num + " is POSITIVE.");
        } else if (num < 0) {
            System.out.println("-> " + num + " is NEGATIVE.");
        } else {
            System.out.println("-> The number is ZERO.");
        }

        // Comparison Demo
        System.out.print("\nEnter a second integer to compare: ");
        int second = scanner.nextInt();

        if (num > second) {
            System.out.println("-> " + num + " is greater than " + second);
        } else if (num < second) {
            System.out.println("-> " + num + " is less than " + second);
        } else {
            System.out.println("-> Both numbers are equal.");
        }

        scanner.close();
    }
}
