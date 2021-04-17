package day4;

public class DoublePrimitiveDataTypes {

    static double defaultValue;

    public static void main(String[] args) {

        System.out.println(defaultValue); // 0.0, 0.0D, 0.0d

        double maximumDouble = Double.MAX_VALUE;
        System.out.println("maximumDouble = " + maximumDouble);
        double minimumDouble = Double.MIN_VALUE;
        System.out.println("minimumDouble = " + minimumDouble);

        double example = 1.12345678901234567890;
        System.out.println("example = " + example);

        double example2 = 2;
        System.out.println("example2 = " + example2);

        double example3 = 1234567;
        System.out.println("example3 = " + example3);


    }
}
