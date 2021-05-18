package day19;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

        /*
Create a method, which will return the biggest total of subArray.

Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
Example 3:

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17*/

        // 1. Way
        // nested loop
        // int variable. to store the maximum value (method variable)
        // int variable. to store local total
        // if statement to compare the method int variable to local variable.
        // return method int variable

        //2. Way
        // create a new int array with the same size. it will be single array
        // assign in the relevant indexes the totals.
        // then sort it.
        // return the last index

        int[][] doubleArray = {{-1,-5}, {-7,-3}, {-3,-5}};



        System.out.println(maximumTotal(doubleArray));
        System.out.println(maximumTotal2(doubleArray));

    }

    public static int maximumTotal(int[][] doubleArray ){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < doubleArray.length; i++) {

            int localTotal = 0;

            for (int j = 0; j < doubleArray[i].length; j++) {
                localTotal += doubleArray[i][j];
            }
            max = Math.max(localTotal, max);
        }
        return max;
    }

    public static int maximumTotal2(int[][] doubleArray){
        int[] result = new int [doubleArray.length];

        for (int i = 0; i < doubleArray.length; i++) {
            int localTotal = 0;

            for (int j = 0; j < doubleArray[i].length; j++) {
             localTotal += doubleArray[i][j];
            }
            result[i] = localTotal;
        }

        Arrays.sort(result);

        return result[result.length-1];
    }
}
