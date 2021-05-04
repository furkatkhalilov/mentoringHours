package day14;

public class task1 {
    public static void main(String[] args) {

        // create a method which will have an int as a parameter.
        // it will print all odd numbers between 0 and int parameter.
        // use for loop

        oddNumbers(20);
        System.out.println();
        oddNumbers2(20);

    }
    public static void oddNumbers(int number){

        for (int i = 0; i <= number; i+=1 ) {
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
    }

    public static void oddNumbers2(int number){

        for (int i = 1; i <= number; i+=2) {
                System.out.print(i + " ");
        }
    }
}
