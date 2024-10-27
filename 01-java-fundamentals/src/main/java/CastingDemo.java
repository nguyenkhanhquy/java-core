public class CastingDemo {
    public static void main(String[] args) {
        // Convert double to int
        double theDoubleGradeAvg = 89.70;
        int theIntGradeAvg = (int) theDoubleGradeAvg;

        System.out.println("theDoubleGradeAvg=" + theDoubleGradeAvg);
        System.out.println("theIntGradeAvg=" + theIntGradeAvg);

        // Convert float to byte
        float theFloatGradeAvg = 123.60f;
        byte theByteGradeAvg = (byte) theFloatGradeAvg;

        System.out.println("theFloatGradeAvg=" + theFloatGradeAvg);
        System.out.println("theByteGradeAvg=" + theByteGradeAvg);

        // Convert int to char
        int theCharacterCode = 65;
        char theChar = (char) theCharacterCode;

        System.out.println("theCharacterCode=" + theCharacterCode);
        System.out.println("theChar=" + theChar);

        // Convert String to int
        int count = Integer.parseInt("49");

        System.out.println("count=" + count);
    }
}
