package day3;


public class BooleanPrimitiveDataType {

    public static void main(String[] args) {

        boolean True = true;
        System.out.println("True = " + True);

        boolean False = false;
        System.out.println("False = " + False);

        String text = "I am from America";

        boolean isEmpty = text.isEmpty();
        System.out.println("isEmpty = " + isEmpty);

        char first = text.charAt(0);

        boolean firstLetterIsEqualToI = (first == 'I');
        System.out.println("firstLetterIsEqualToI = " + firstLetterIsEqualToI);

        int num1 = 100;
        int num2 = 1500;

         // == this expression stands for checking if the integer values are equal
        //  != this expression stands for checking if the integer values are not equal

        boolean NumbersAreEqual = num1!=num2;
        System.out.println("NumbersAreEqual = " + NumbersAreEqual);

        int [] arr = new int[2]; // in this line i am creating a int array. assigning the size by giving 2;
                                // by default, when you create any arrays, the value is going to be the default value of primitive type.

        int length = arr.length;
        System.out.println("length = " + length);

        boolean checkIfArrIsEmpty = length==0;
        System.out.println("checkIfArrIsEmpty = " + checkIfArrIsEmpty);

        //Hi Rahima
    }
}
