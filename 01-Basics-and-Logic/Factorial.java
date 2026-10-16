import java.util.Scanner;

/**
 * Factorial Calculation
 * Calculates n! using for-loop.
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Factorial Calculator ===");
        System.out.print("Enter a non-negative integer: ");
        int value = scan.nextInt();

        if (value < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= value; i++) {
                factorial *= i;
            }
            System.out.println(value + "! = " + factorial);
        }

        scan.close();
    }
}
