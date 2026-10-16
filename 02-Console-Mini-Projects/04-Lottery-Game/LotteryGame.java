import java.util.Random;
import java.util.Scanner;

/**
 * 3-Stage Lottery Number Game
 * Generates lucky numbers and tests player guesses across multiple stages.
 */
public class LotteryGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate 3 random 2-digit lottery numbers (10 to 99)
        int winning1 = random.nextInt(90) + 10;
        int winning2 = random.nextInt(90) + 10;
        int winning3 = random.nextInt(90) + 10;

        System.out.println("==================================================");
        System.out.println("          Welcome to 3-Stage Lucky Lottery!       ");
        System.out.println("==================================================");
        System.out.println("Can you guess the 3 secret numbers (between 10 and 99)?");

        int correctGuesses = 0;

        System.out.print("\nEnter guess #1: ");
        int guess1 = scanner.nextInt();
        if (guess1 == winning1) {
            System.out.println(" Correct! You cleared Stage 1!");
            correctGuesses++;
        } else {
            System.out.println(" Missed Stage 1. (Secret was: " + winning1 + ")");
        }

        System.out.print("Enter guess #2: ");
        int guess2 = scanner.nextInt();
        if (guess2 == winning2) {
            System.out.println(" Correct! You cleared Stage 2!");
            correctGuesses++;
        } else {
            System.out.println(" Missed Stage 2. (Secret was: " + winning2 + ")");
        }

        System.out.print("Enter guess #3: ");
        int guess3 = scanner.nextInt();
        if (guess3 == winning3) {
            System.out.println(" Correct! You cleared Stage 3!");
            correctGuesses++;
        } else {
            System.out.println(" Missed Stage 3. (Secret was: " + winning3 + ")");
        }

        System.out.println("\n==================================================");
        System.out.println("                   GAME RESULTS                   ");
        System.out.println("==================================================");
        System.out.println(" Correct Guesses: " + correctGuesses + " / 3");
        if (correctGuesses == 3) {
            System.out.println(" JACKPOT! You won the grand lottery prize!");
        } else if (correctGuesses > 0) {
            System.out.println(" Good try! You won a partial match prize.");
        } else {
            System.out.println(" Better luck next time!");
        }
        System.out.println("==================================================");

        scanner.close();
    }
}
