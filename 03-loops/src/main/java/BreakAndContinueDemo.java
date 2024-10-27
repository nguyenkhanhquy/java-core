public class BreakAndContinueDemo {
    public static void main(String[] args) {
        // Example using break
        System.out.println("Example using break");
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Counter: " + i);
        }

        // Example using continue
        System.out.println("Example using continue");
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Counter: " + i);
        }
    }
}
