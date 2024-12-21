import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordQuestGame {
    public static void main(String[] args) {

        // Define the secret word and maximum allowed attempts
        String secretWord = getRandomWord();
        int maxAttempts = 10;

        // Create a new board with underscores to represent unrevealed letters
        char[] gameBoard = new char[secretWord.length()];

        // Initialize the game board with underscores to represent unrevealed letters
        Arrays.fill(gameBoard, '_');

        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Word Quest!");

        // Flag to check if the word has been fully revealed
        boolean wordNotRevealed = true;

        // Main game loop: runs while there are attempts left and word is not fully revealed
        while (maxAttempts > 0 && wordNotRevealed) {
            System.out.println("Current word: " + String.valueOf(gameBoard));

            System.out.println();
            System.out.print("Guess a letter: ");

            // Read the user input
            String userInput = scanner.next().toUpperCase();
            char guess = userInput.charAt(0);

            // Track if the guess is correct
            boolean isGuessCorrect = false;

            // Loop through each letter in the secret word and check if it matches the guess
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    // Reveal the correctly guessed letter on the game board
                    gameBoard[i] = guess;
                    isGuessCorrect = true;
                }
            }

            // Update game status based on the guess
            if (isGuessCorrect) {
                System.out.println("Good job! You found a letter!");

                // Check if there are any still unrevealed letters
                wordNotRevealed = containsUnderscore(gameBoard);
            } else {
                System.out.println("Oops! That letter is not in the word.");

                // Decrement attempts if the guess is incorrect
                maxAttempts--;
            }

            // Display remaining attempts after each guess
            System.out.println("Attempts remaining: " + maxAttempts);
            System.out.println();
        }

        // End of game message based on wether the word was revealed
        if (!wordNotRevealed) {
            System.out.println("Congratulations! You found the word: " + secretWord);
        } else {
            System.out.println("Game over! The word was: " + secretWord);
        }

        scanner.close();
    }

    private static boolean containsUnderscore(char[] gameBoard) {
        for (char c : gameBoard) {
            if (c == '_') {
                return true;
            }
        }
        return false;
    }

    private static String getRandomWord() {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "watermelon"};

        Random random = new Random();
        int index = random.nextInt(words.length);

        String theWord = words[index];

        return theWord.toUpperCase();
    }
}
