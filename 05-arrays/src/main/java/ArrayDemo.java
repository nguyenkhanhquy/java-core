public class ArrayDemo {
    public static void main(String[] args) {
        // Initialize the array
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        // Display contents of the array
        System.out.println("Contents of the array:");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);

        System.out.println();

        // Display length of the array
        System.out.println("Length of the array: " + colors.length);

        System.out.println();

        // Loop through the array - Version 1
        System.out.println("Looping through the array - Version 1:");

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println();

        // Loop through the array - Version 2
        System.out.println("Looping through the array - Version 2:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
