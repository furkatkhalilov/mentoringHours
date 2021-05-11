package day17;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        // Create a method with int [] return ,
        // the array should consist of total of inner arrays in the original.

        // {{2,4,6,8},{1,3,5,7,9},{0,1,2,3,4,5},{9,8,7,5,6,4,3},{4,5,6,7,8,9} };
        // {20, 25, 15 .. }

        int[][] array = {{2,4,6,8},{1,3,5,7,9},{0,1,2,3,4,5},{9,8,7,5,6,4,3},{4,5,6,7,8,9} };
        int[] totalOfInnerArray = getTotalOfInnerArray(array);
        System.out.println(Arrays.toString(totalOfInnerArray));

    }
    public static int[] getTotalOfInnerArray(int[][] array){
        int [] result = new int [array.length];

        for (int i = 0; i < array.length; i++) {
            int total = 0;
            for (int i1 = 0; i1 < array[i].length; i1++) {
                total += array[i][i1];
            }
            result[i] = total;
         }
        return result;
    }
}
