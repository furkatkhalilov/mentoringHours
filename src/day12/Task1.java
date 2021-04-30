package day12;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the max number ");
        int max = scanner.nextInt();

        System.out.println("Please enter the min number");
        int min = scanner.nextInt();

//        int total = (int)(min + (Math.random()*max)); // random number btw max and min not properly working
        Random random = new Random();
        int total = random.nextInt(max -  min + 1 ) + min;

        System.out.println("**************************");
        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
        System.out.println("Random number is " + total);

    }
}
