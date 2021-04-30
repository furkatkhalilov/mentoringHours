package day12;

import java.util.Random;

public class JavaMathRandom {
    public static void main(String[] args) {

       Random random = new Random();
        int i = random.nextInt(100 - 50+1)+50;
        System.out.println("i = " + i);

        int a = 20;
        int b = 10;
        // (max - min) + min;
        int rnd = random.nextInt(a-b+1)+b;
        System.out.println("rnd = " + rnd);

        int v = (int)(Math.random() * 100);
        System.out.println("v = " + v);

        // Task1 Using scanner class enter two numbers and get the random number btw them.

    }


}
