public class ParametersAndOverloadingDemo {
    public static void main(String[] args) {
        // Call the method
        displayGreetings(3);
    }

    // Define the method
    static void displayGreetings(int count) {
        for (int i = 1; i <= count; i++) {
            displayGreetings();
            System.out.println();
        }
    }

    // Define the method
    static void displayGreetings() {
        System.out.println("Hello World!");
        System.out.println("Welcome, welcome.");
    }
}
