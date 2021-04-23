package day8;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {

        String[] strArray = {"Hello", "World", "Be", "Happy"};
        System.out.println("strArray= " + Arrays.toString(strArray));

        Arrays.sort(strArray);
        System.out.println("strArray = " + Arrays.toString(strArray));

        int[] intArray = {5,3,12,8,10,1};
        Arrays.sort(intArray, 1,intArray.length-2);
        System.out.println("intArray = " + Arrays.toString(intArray));

        // create an array of chars. {%, f, F, @, 5, a, 7, T, #} and sort starting from char F up to char 7

        char[] charArray = {'%', 'f', 'F', '@', '5','a', '7', 'T', '#'};

//        Arrays.sort(charArray, 2, 6);

        Arrays.sort(charArray,2, charArray.length-3);
        System.out.println("charArray = " + Arrays.toString(charArray));


        // Hi Li
    }
}
