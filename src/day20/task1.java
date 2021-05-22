package day20;

import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

        int[] arr = {10,2,3,6,4};


        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));


    }
}
