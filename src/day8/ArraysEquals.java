package day8;

import java.util.Arrays;

public class ArraysEquals {

    public static void main(String[] anyName) {

        int[] intArray3 = {0,1,2};
        System.out.println("intArray3 = " + intArray3);

        int[] intArray = {0,1,2};
        System.out.println("intArray = " + intArray);

        int[] intArray2 = new int[3];
        System.out.println("intArray2 = " + intArray2);
        intArray2[0] = 0;
        intArray2[1] = 1;
        intArray2[2] = 2;

        boolean equals1 = intArray.equals(intArray2);
        System.out.println("equals1 = " + equals1);  // false because the hashcode is different.

        boolean equals = intArray.equals(intArray3);
        System.out.println("equals = " + equals); // false

        intArray2=intArray;
        System.out.println("intArray2 = " + intArray2);

        boolean equals2 = intArray.equals(intArray2);
        System.out.println("equals2 = " + equals2); // true

        boolean equalsBody = Arrays.equals(intArray, intArray3); //verifies arrays body are the same
        System.out.println("equals = " + equals);

        String[] str = {"hello"};
        String[] str2 = {"hello"};

        boolean equals3 = Arrays.equals(str, str2);
        System.out.println("equals3 = " + equals3);


    }

}
