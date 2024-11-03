import java.util.Scanner;

public class ComputeGradeAverageDemo {
    public static void main(String[] args) {

        double[] studentGrades = readUserInputGrades();

        System.out.println();

        displayGrades(studentGrades);

        System.out.println();

        // Compute the average of the grades
        double gradeAverage = computeGradeAverage(studentGrades);

        // Display the average of the grades
        System.out.println("The average of the grades is: " + String.format("%.2f", gradeAverage));
    }

    private static void displayGrades(double[] studentGrades) {
        // Print out the array elements
        for (double grade : studentGrades) {
            System.out.println(grade);
        }
    }

    private static double[] readUserInputGrades() {
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

        scanner.close();

        return studentGrades;
    }

    private static double computeGradeAverage(double[] studentGrades) {
        double sum = 0.0;

        for (double grade : studentGrades) {
            sum += grade;
        }

        return sum / studentGrades.length;
    }
}
