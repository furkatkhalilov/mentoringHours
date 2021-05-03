package day13;

import java.util.Random;
import java.util.Scanner;

public class JavaIfStatement {

    public static void main(String[] args) {


        // task1 create a random number btw 0 to 10.
        // The output should be the result number is even or odd.

        Random random  = new Random();

        int randomNumber = random.nextInt(10);

        if(randomNumber%2==0){
            System.out.println(randomNumber + " : is an even number");
        }else {
            System.out.println(randomNumber + " : is an odd number");
        }
    }
}
