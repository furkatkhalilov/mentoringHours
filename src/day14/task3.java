package day14;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {

        // create a method that will print an updated array with the same size as original.
        // the output of index`s value will be total of all previous indexes values.

        // Example:
        // Input: nums = [1,2,3,4]
        // Output: [1,3,6,10]

        int[] arr = {1,2,3,4};

        getNewArray(arr);

    }

    public static void getNewArray(int[] array){


        int[] newArray = new int[array.length];

        int temp = 0;

        for (int i = 0; i < array.length; i++) {

            temp += array[i];

            newArray[i] = temp;
        }

        System.out.println(Arrays.toString(newArray));

    }
}
