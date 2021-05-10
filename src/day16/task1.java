package day16;

public class task1 {
    public static void main(String[] args) {
        //using nested loop, print multiplication table of 1,2,3,4,5,6,7,8,9,10
        //example:
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("----------------");

        }


    }
}
