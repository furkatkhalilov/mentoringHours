package day14;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {

        //Given an integer array of numbers. Create a method, which will return an integer array.
        //Each index in the new array will have the sum of all integers of the first array,
        // except the similar index of the first array.

        //Example: {10,20,30,40}
        //Output: {90,80,70,60}

        //Hint1. Get the total.
        //Hint2. Extract index value from total and assign in the new array.

        int[] arr = {10,20,30,40};
        getUpdatedArray(arr);

    }
    public static void getUpdatedArray(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }


        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = total - array[i];
        }

        System.out.println(Arrays.toString(newArray));

    }
}
