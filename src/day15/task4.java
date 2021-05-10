package day15;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {

        // using do while loop find how many times each int repeats in the array.
        // int are between 0 and 10
        // Example: {0,1,2,3,0,1,2,3,1,2,0,3,1,2,3,4,5,6,4,5,6,8,9,8,7,3,6,1,2,6,5,4,2,9,9,10,10}
        // output should be:
        // 0 = 3
        // 1 = 5
        // 2 = 6
        // 3 = 5
        // 4 = 3
        // 5 = 3
        // 6 = 4
        // 7 = 1
        // 8 = 2
        // 9 = 3
        // 10 = 2
        int[] arr = {0,1,2,3,0,1,2,3,1,2,0,3,1,2,3,4,5,6,4,5,6,8,9,8,7,3,6,1,2,6,5,4,2,9,9,10,10};
        countOfNumber(arr);

    }

    public static void countOfNumber(int[] arr){
    int [] result = new int [11];
    int index = 0;

    do{
        result[arr[index]] +=1;
        index++;
    }while(index<arr.length);
        System.out.println(Arrays.toString(result));

    index=0;
    do{
        System.out.println(index + " = " + result[index]);
    index++;
    }while(index<result.length);

    }

}

