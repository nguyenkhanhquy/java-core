import java.util.Scanner;

public class StringInputDemo {
    public static void main(String[] args) {

        // Create a scanner for reading input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.println("What is your favorite color?");

        // Read the input from the user
        String theColor = scanner.nextLine();

        // Prompt the user
        System.out.println("What is your hobby?");

        // Read the input from the user
        String theHobby = scanner.nextLine();

        System.out.println("My favorite color is " + theColor);
        System.out.println("My hobby is " + theHobby);

        // Close to release resources and prevent resource/memory leaks
        scanner.close();
    }
}
