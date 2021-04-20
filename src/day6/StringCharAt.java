package day6;

public class StringCharAt {


    public static void main(String[] args) {

    String str = "Mersys Campus Education Batch 4";

        char c = str.charAt(0);
        System.out.println("c = " + c);


        char c1 = str.charAt(7);
        System.out.println("c1 = " + c1);


        // by using charAt function and using length method get the last character which is 4

        int length = str.length();     // total count of character in the string. and length starts counting from 1
        System.out.println("length = " + length);
        int lastIndex = length-1;     // the first index is always 0. and the last char`s index is length -1;
        System.out.println("lastIndex = " + lastIndex);
        char c2 = str.charAt(lastIndex);
        System.out.println("c2 = " + c2);

        char c3 = str.charAt(str.length() - 1);
        System.out.println("c3 = " + c3);


    }
}
