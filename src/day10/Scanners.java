package day10;

import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        String s = scanner.nextLine();
        System.out.println("Your name is ==>" + s);

        System.out.println("Please enter your age ");

        int i = scanner.nextInt();
        System.out.println("Your age is " + i);

        System.out.println("Please enter your salary ");

        double d = scanner.nextDouble();
        System.out.println("Your salary is " + d);
        scanner.nextLine();

        System.out.println("Please enter your last name");
        String s1 = scanner.nextLine();
        System.out.println("Your last name is " + s1);

        System.out.println("===================================");

        System.out.println("Your Full name is " + s + " " + s1
                            + ". Your age is : " + i + ". Your desired salary is : " + d);







    }
}
