package day9;

import java.util.Arrays;

public class DoubleArrays2 {
    public static void main(String[] args) {

        int[][] int2DArray = new int[4][5];

        int2DArray[0][0] = 3;
        int2DArray[0][1] = 7;
        int2DArray[0][2] = 10;

        int2DArray[1][0] = 100;
        int2DArray[1][1] = 200;

        int2DArray[2][0] = 58;

        int2DArray[3][0] = 28;
        int2DArray[3][1] = 47;
        int2DArray[3][2] = 75;
        int2DArray[3][3] = 89;
        int2DArray[3][4] = 55;

        System.out.println("int2DArray[2][1] ==> " + int2DArray[2][0]);

        System.out.println("int2DArray[3][4] ==> " + int2DArray[3][4]);

        System.out.println("int2DArray[0][3] ==> " + int2DArray[0][3]);

        System.out.println("int2DArray[1][1] ==> " + int2DArray[1][1]);


        System.out.println(Arrays.deepToString(int2DArray));

    }
}
