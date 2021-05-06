package day15;

public class task1 {
    public static void main(String[] args) {

        // using while loop create a method which will have an int parameter as maxNumber
        // the method will print all odd numbers

        //Example: int maxNumber = 10 output should 1 3 5 7 9

        getOddNumber(10);

    }

    public static void getOddNumber (int maxNumber){

        int number = 1;
        while(number<maxNumber){
            System.out.print(number);
            number +=2;
            System.out.print(" ");
        }

    }
}
