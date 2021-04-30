package day11;

public class ArithmeticOperators2 {
    public static void main(String[] args) {


        // remainders (%)
        //32 / 10 === 10*3 + (2)===>>> in this case 2 is a reminder
        // 19 / 5 === 5*3 + 4 ===>>> 4 is a reminder

        int a = 19;
        int b = 5;
        int c = a%b;
        System.out.println("c = " + c);

        // post-increment and pre-increment (++)

        int x = 0;

        int y = ++x; // (on the value of x it automatically adds +1) // other way ==> int y = (x=x+1)
        int z = ++y; // (on the value of y it automatically adds +1) // other way ==> int z = (y=y+1)
        System.out.println(" y = " + y);
        System.out.println(" z = " + z);

        int x1 = 0;
        int y1 = x1++;
        System.out.println(y1);
        System.out.println(x1);
        System.out.println(y1);

        int b1 = 10;
        b1++; // 10 (1)
        b1++; // 10+1 (1)
        System.out.println(b1++); // 10+1+1 (1)



        // post-decrement and pre-decrement (--)
        int x2 = 10;

        int y2 = --x2;
        int z2 = --y2;
        System.out.println(" y2 = " + y2);
        System.out.println(" z2 = " + z2);


        int b3 = 10;
        b3--;
        b3--;
        System.out.println(" b3 = " + b3--);

    }
}
