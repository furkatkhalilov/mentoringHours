package day5;

public class StringsEndWith {

    public static void main(String[] args) {

        String str = "Hello World";

        boolean b = str.endsWith("d");
        System.out.println("b = " + b);

        boolean b1 = str.endsWith("World");
        System.out.println("b1 = " + b1);

        boolean hello = str.endsWith("Hello");
        System.out.println("hello = " + hello);


    }
}
