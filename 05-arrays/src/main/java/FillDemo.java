import java.util.Arrays;
import java.util.Scanner;

public class FillDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What size array do you want? ");
        int size = scanner.nextInt();

        System.out.print("What number do you want to fill the array with? ");
        int theNum = scanner.nextInt();

        // Initialize the array
        int[] myDataArray = new int[size];

        // Fill the array
        Arrays.fill(myDataArray, theNum);

        System.out.println();

        for (int temp: myDataArray) {
            System.out.println(temp);
        }

        scanner.close();
    }
}
