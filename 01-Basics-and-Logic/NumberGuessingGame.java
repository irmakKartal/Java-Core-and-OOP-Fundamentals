import java.util.Scanner;

/**
 * Number Guessing Game
 * Generates a random number between 1 and 100, providing higher/lower hints until guessed.
 */
public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess = -1;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I have chosen a random number between 1 and 100. Try to guess it!");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts!");
            } else if (guess > targetNumber) {
                System.out.println("Lower! Try a smaller number.");
            } else {
                System.out.println("Higher! Try a larger number.");
            }
        }

        scanner.close();
    }
}
