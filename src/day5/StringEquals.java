package day5;

import java.util.Locale;

public class StringEquals {


    public static void main(String[] args) {

        String str = "HELLO WORLD";

        String str2 = "hello world";

        boolean equals = str.equals(str2.toUpperCase());
        System.out.println("equals = " + equals);
        boolean equals1 = str.toLowerCase().equals(str2);
        System.out.println("equals1 = " + equals1);



    }
}
