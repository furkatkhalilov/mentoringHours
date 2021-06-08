package day27;

import java.util.Arrays;

public class Task1 {
    // Amazon interview question

    // you are given an int array of numbers. return new array.
    // each index should have product from initial array except the corresponding index

    //input  {1,5,6,9}
    //result {270, 54, 45, 30}

    // Step1. Get the total product of initial array. totalProduct = 270
    // Step2. in the for loop divide totalProduct to the index`s value.

    public static void main(String[] args) {
        int [] arr = {1,5,6,9};

        int[] ints = newArray(arr);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] newArray(int[] arr){
        int[] newArray = new int[arr.length];

        // Step1. Get the total product of initial array. totalProduct = 270
        int totalProduct = 1;

        for (int i = 0; i < arr.length; i++) {
            totalProduct *= arr[i];
        }

        // Step2. in the for loop divide totalProduct to the index`s value.
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = totalProduct/arr[i];
        }
        return newArray;
    }
}
