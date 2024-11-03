import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // Initialize the game
        int upperBound = 5;

        // Compute a random number between 1 and the upperBound
        Random random = new Random();
        int secretNumber = random.nextInt(upperBound) + 1;

        int maxAttempts = 3;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("You have " + maxAttempts + " attempts.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        boolean won = false;

        // Game loop
        for (int i = maxAttempts; i > 0; i--) {
            // Prompt the user
            System.out.print("Guess the number between 1 and " + upperBound + ": ");
            int theGuess = scanner.nextInt();

            won = (theGuess == secretNumber);

            if (won) {
                System.out.println("Congratulations!!! You guessed the secret number: " + secretNumber);
                break;
            } else {
                System.out.println("Sorry, you guessed is the incorrect.");
                System.out.println("You have " + (i - 1) + " attempt(s) left.");
                System.out.println();
            }
        }

        // End Game Check
        if (!won) {
            System.out.println("You did not win. The secret number was: " + secretNumber);
        }
    }
}
