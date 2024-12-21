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
            System.out.println("Guess a letter: ");

            // Read the user input
            String userInput = scanner.next().toUpperCase();
            char guess = userInput.charAt(0);
        }
    }

    private static String getRandomWord() {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "watermelon"};

        Random random = new Random();
        int index = random.nextInt(words.length);

        String theWord = words[index];

        return theWord.toUpperCase();
    }
}
