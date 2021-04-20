package day5;

import java.util.Locale;

public class StringEquals {


    public static void main(String[] args) {

        String str = "HELLO WORLD"; // Object ==> String , anObject ==> str

        String str2 = "hello world";

        boolean equals1 = str.equals(str2.toUpperCase());
        System.out.println("equals = " + equals1);
        boolean equals2 = str.toLowerCase().equals(str2);
        System.out.println("equals1 = " + equals2);


    }
}
