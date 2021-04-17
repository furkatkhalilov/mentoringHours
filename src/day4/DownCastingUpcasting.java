package day4;

public class DownCastingUpcasting {

    public static void main(String[] args) {

//        1) Implicit Casting - Widening Casting - Upcasting
//        2) Explicit Casting - Narrowing Casting - DownCasting

        // byte - short - int - long

        byte byteNumber1 = 127;
        byte byteNumber2 = 100;

        short result = (short)(byteNumber1+byteNumber2);
        System.out.println("result = " + result);

        short shortNumber1 = 1000;
        short shortNumber2 = 800;

        int res = shortNumber1-shortNumber2;
        System.out.println("res = " + res);

        float fl1 = 1.25F;

        double db1 = fl1;
        System.out.println("db1 = " + db1);

        double db2 = 0.28;
        float fl2 = (float)db2;

        System.out.println("fl2 = " + fl2);

        byte bt1 = 100; short sh1 = bt1; int in1 = bt1; long lg1 = bt1;

        short sh2 = 100; byte bt2 = (byte)sh2; int in2 = sh2; long lg2 =sh2;

        int int3 = 100; byte bt3 = (byte)int3; short sh3 = (short)int3; long lg3 = int3;

        long lg4 =100; byte bt4 = (byte) lg4; short sh4 = (short) lg4; int in4 = (int)lg4;

        float f1 = 0.2F; double double1 = f1;

        double double2 = 0.2; float f2 = (float) double2;


        //Task: You have two integer numbers 10 and 3. Divide this two numbers and get the output with the decimals.






    }
}
