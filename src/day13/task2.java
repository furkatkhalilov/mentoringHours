package day13;

public class task2 {

    public static void main(String[] args) {

        int [] arr = {10, 2, 3, 5, 9, 11, 13, 14, 78, 109, 200};

        // get the total of all odd numbers;
        // you may use while, do while, enhanced for loop or for loop...

        int total = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%2 != 0){
                total += arr[i];
            }

        }

        System.out.println("total = " + total);



    }
}
