import java.util.Scanner;

public class MultiplicationTableDemo {
    public static void main(String[] args) {

        // Promt the user for number of rows and columns
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rows? ");
        int numRows = scanner.nextInt();

        System.out.print("How many columns? ");
        int numCols = scanner.nextInt();

        scanner.close();

        // Initialize the array
        int[][] table = new int[numRows][numCols];

        // Compute the multiplication table values
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }

        System.out.println();

        // Print the multiplication table
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
