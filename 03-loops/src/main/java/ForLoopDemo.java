public class ForLoopDemo {
    public static void main(String[] args) {
        // Loop 100 times
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World!");
        }

        // Count form 1 to 5
        System.out.println("Count form 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Counter: " + i);
        }

        // Count from 0 to 20 in increments of 5
        System.out.println("Count from 0 to 20 in increments of 5");
        for (int i = 0; i < 20; i += 5) {
            System.out.println("Counter: " + i);
        }

        // Count down 5 to 0
        System.out.println("Count down 5 to 0");
        for (int i = 5; i >= 0; i--) {
            System.out.println("Counter: " + i);
        }
    }
}
