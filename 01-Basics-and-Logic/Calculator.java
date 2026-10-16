import java.util.Scanner;

/**
 * Basic Console Calculator
 * Performs basic arithmetic operations: Addition, Subtraction, Multiplication, Division.
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Basic Java Calculator ===");
        System.out.print("Enter the first number: ");
        double number1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scan.nextDouble();

        System.out.println("\nSelect Operation:");
        System.out.println("1) Addition (+)");
        System.out.println("2) Subtraction (-)");
        System.out.println("3) Multiplication (*)");
        System.out.println("4) Division (/)");
        System.out.print("Choice (1-4): ");
        int select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("Result: " + (number1 / number2));
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            default:
                System.out.println("Invalid selection. Please choose an option between 1 and 4.");
                break;
        }

        scan.close();
    }
}
