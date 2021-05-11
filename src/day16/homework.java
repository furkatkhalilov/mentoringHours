package day16;

public class homework {
    public static void main(String[] args) {

        // part1
        //TODO Write program that prints this using loops
        // *
        // **
        // ***
        // ****
        // *****
        System.out.println("======PART1=====");
        part1();

        // part2
        //TODO Write program that prints this using loops
        // *****
        // ****
        // ***
        // **
        // *
        System.out.println("======PART2=====");
        part2();

        // part3
        //TODO Write program that prints this using loops
        // *****
        //  ****
        //   ***
        //    **
        //     *
        System.out.println("======PART3=====");
        part3();

        // part 4
        //TODO Write program that prints this using loops
        //     *
        //    **
        //   ***
        //  ****
        // *****
        System.out.println("======PART4=====");
        part4();

        // part 5
        //TODO Write program that prints this using loops
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        System.out.println("======PART5=====");
        part5();

    }

    public static void part1(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void part2(){
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void part3(){

        for (int i = 0; i <= 4 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = 5-i; k > 0 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void part4(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void part5(){

        for (int i = 9; i >0 ; i-=2) {
            for (int j = i/2; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 9-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
