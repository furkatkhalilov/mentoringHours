package day21;

import java.util.Arrays;
import java.util.Locale;

public class SPCamelCase {

    /*

   Create a method whose name is camelCase
   It takes a String parameter
   It returns a String

   The String argument is a sentence with some words delimited by a space. The argument might be a single word too.
   The method capitalizes all the first letters of the word(s) in the argument

   Sample-1:
   my family live in united states -> My Family Live In United States

   Sample-2:
   sleeplessness -> Sleeplessness

     */

    public static void main(String[] args) {
        String str = "my family live in united states";

        System.out.println(camelCase3(str));

    }

    public static String camelCase (String str){

        String[] arr = str.split(" ");

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
            char upperCase = (char)(c-32); // using ASCII table

            result += upperCase + arr[i].substring(1) + " ";
        }

        return result.trim();
    }


    public static String camelCase2 (String str){

        String[] arr = str.split(" ");

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i].substring(0,1).toUpperCase();
            arr[i] = arr[i].substring(1);
            result += temp + arr[i] + " ";

        }

        return result.trim();
    }
    public static String camelCase3 (String str){

        String[] arr = str.split(" ");

        String result = "";

        for (int i = 0; i < arr.length; i++) {

            String lowerCase = String.valueOf(arr[i].charAt(0));

//          String upperCase = String.valueOf((char)(arr[i].charAt(0)-32)); // converting to uppercase using ASCII table.

            String upperCase = lowerCase.toUpperCase(); // converting to uppercase using .toUpperCase method

            // Both ways will work.

            arr[i] = arr[i].replaceFirst(lowerCase, upperCase);

            result = result.concat(arr[i]).concat(" ");
        }

        return result.trim();
    }

}
