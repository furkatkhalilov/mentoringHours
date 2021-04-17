package day4;

public class FloatPrimitiveDataType {

    static float number1;

    public static void main(String[] args) {

        float floatNumberMin = Float.MIN_VALUE;
        System.out.println("floatNumberMin = " + floatNumberMin);

        float floatNumberMax = Float.MAX_VALUE;
        System.out.println("floatNumberMax = " + floatNumberMax);


        float example = 1.123456789F;
        System.out.println("example = " + example);

        float example1 = 1.123456789f;
        System.out.println("example1 = " + example1);

        System.out.println(number1); // 0.0F, 0.0f
    }
}
