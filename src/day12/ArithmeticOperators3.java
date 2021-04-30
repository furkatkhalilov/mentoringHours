package day12;

public class ArithmeticOperators3 {


    public static void main(String[] args) {

        // Addition assignment (+=)

        int a = 5;
        System.out.println("a1 = " + a);

        a = a + 4;
        System.out.println("a2 = " + a);

        a+=10; // a = a + 10;
        System.out.println("a3 = " + a);

        // Subtraction assignment (-=)

        int b = 100;
        b -= 50; // b = b-50;
        System.out.println("b = " + b);


        // Multiplication assignment (*=)
        int c = 2;
        c *= 10 ; // c=c*10;
        System.out.println("c = " + c);


        // Division assignment (/=)

        int d = 200;
        d /= 100; // d = d/100;
        System.out.println("d = " + d);

        // Remainder assignment (%=)

        int e = 18;
        e %= 5; // e = e%5;
        System.out.println("e = " + e);

    }
}
