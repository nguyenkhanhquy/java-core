import java.util.Arrays;
import java.util.Random;

public class WordQuestGame {
    public static void main(String[] args) {

        // Define the secret word and maximum allowed attempts
        String secretWord = getRandomWord();
        int maxAttempts = 10;

        // Create a new board with underscores to represent unrevealed letters
        char[] gameBoard = new char[secretWord.length()];

        // Initialize the game board with underscores to represent unrevealed letters
        Arrays.fill(gameBoard, '_');
    }

    private static String getRandomWord() {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "watermelon"};

        Random random = new Random();
        int index = random.nextInt(words.length);

        String theWord = words[index];

        return theWord.toUpperCase();
    }
}
