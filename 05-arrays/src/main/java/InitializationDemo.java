import java.util.Scanner;

public class InitializationDemo {
    public static void main(String[] args) {
        // Initialization the array
        double[] grades = new double[3];

        // Assign student grades
        grades[0] = 90.0;
        grades[1] = 85.0;
        grades[2] = 95.0;

        // Display the student grades
        for (double grade : grades) {
            System.out.println(grade);
        }

        // Prompt the user for how many grades
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many grades will you enter? ");
        int numGrades = scanner.nextInt();

        System.out.println();

        // Initialize the array based on the number of grades
        double[] studentGrades = new double[numGrades];

        // Read each grade and assign to an array element
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.print("Enter grade number " + (i + 1) + ": ");
            studentGrades[i] = scanner.nextDouble();
        }

        System.out.println();

        // Print out the array elements
        for (double grade : studentGrades) {
            System.out.println(grade);
        }

        scanner.close();
    }
}
