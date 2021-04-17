package day2;

public class LongPrimitiveDataTypes {
    static long defaultValue;

    public static void main(String[] args) {


        // min value for long

        long minLongValue = Long.MIN_VALUE;
        System.out.println("minLongValue = " + minLongValue);


        // max value for long

        long maxLongValue = Long.MAX_VALUE;
        System.out.println("maxLongValue = " + maxLongValue);

        // what is the default value for long?
        //
        System.out.println(defaultValue);


        long number1 = 1500000000;
        long number2 = 1000000000;

        long res = number1 + number2;

        System.out.println("res = " + res);

    }
}
