package day15;

public class task2 {
    public static void main(String[] args) {

        // using while loop create a method which will have two parameters. ex: int number, int power
        // using while loop create a method, which will replace method Math.pow(number, power);

        mathPow(5,3);


    }
    public static void mathPow (int number, int power){
        int result = 1;
        int counter = 1;

        while(counter<=power){

            result *= number;
            counter++;
        }

        System.out.println(result);
    }

}
