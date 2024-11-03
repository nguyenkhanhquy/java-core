import java.util.Arrays;
import java.util.Scanner;

public class SortDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What size array do you want? ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] myDataArray = new int[size];

        // Read each number and assign it to an array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myDataArray[i] = scanner.nextInt();
        }

        System.out.println();

        System.out.println("BEFORE SORTING:");
        displayData(myDataArray);

        System.out.println();

        Arrays.sort(myDataArray);

        System.out.println("AFTER SORTING:");
        displayData(myDataArray);

        scanner.close();
    }

    private static void displayData(int[] myDataArray) {
        for (int temp: myDataArray) {
            System.out.println(temp);
        }
    }
}
