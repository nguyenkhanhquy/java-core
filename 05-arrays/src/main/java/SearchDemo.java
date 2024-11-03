import java.util.Arrays;
import java.util.Scanner;

public class SearchDemo {
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

        System.out.print("What number do you want to search for? ");
        int searchKey = scanner.nextInt();

        System.out.println();

        // Sort the array
        Arrays.sort(myDataArray);

        // Search for array
        int result = Arrays.binarySearch(myDataArray, searchKey);

        boolean found = (result >= 0);

        System.out.println("Found: " + found);

        if (found) {
            System.out.println("We foud the number: " + searchKey);
        } else {
            System.out.println("We did not find the number: " + searchKey);
        }

        scanner.close();
    }
}
