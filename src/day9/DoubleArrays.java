package day9;

import java.util.Arrays;

public class DoubleArrays {

    public static void main(String[] args) {



        int[] intArray1 = new int[3];
        intArray1[0]=3;
        intArray1[1]=7;
        intArray1[2]=10;

        int[]intArray2 =new int[2];
        intArray2[0]=100;
        intArray2[1]=200;

        int[]intArray3 =new int[1];
        intArray3[0]=58;

        int[] intArray4 = {28,47,75,89,55};

        int[][] int2DArray = new int[4][];
        int2DArray[0]=intArray1;
        int2DArray[1]=intArray2;
        int2DArray[2]=intArray3;
        int2DArray[3]=intArray4;

//        int2DArray[2][0]=158;

      System.out.println("int2DArray[2][1] ==> " + int2DArray[2][0]);

        System.out.println("int2DArray[3][4] ==> " + int2DArray[3][4]);

//        System.out.println("int2DArray[0][3] ==> " + int2DArray[0][3]);

        System.out.println("int2DArray[1][1] ==> " + int2DArray[1][1]);


        System.out.println("Arrays.toString == >>>>" + Arrays.toString(int2DArray));

        System.out.println("Arrays.deepToString ====>>>> " + Arrays.deepToString(int2DArray));






    }
}
