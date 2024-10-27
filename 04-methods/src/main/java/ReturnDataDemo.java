public class ReturnDataDemo {
    public static void main(String[] args) {
        int val = 5;
        int output = summation(val);
        System.out.println("Summation of val " + val + " is " + output);
    }

    // Define the method
    // Version 1
    /*
    static int summation(int num) {
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result += i;
        }

        return result;
    }
     */

    // Define the method
    // Version 2
    public static int summation(int num) {
        return (num * (num + 1)) / 2;
    }
}
