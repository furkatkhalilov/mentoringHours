package day22;

public class TernaryOperator {
    // Ternary operator structure
    // (condition ==  boolean) ? "Output if condition is TRUE" : "Output if condition is FALSE" ;

    public static void main(String[] args) {
        // task
        // check if number is bigger than 5
        // check if number is smaller than 12
        int number = 13;
        String str = (number>5) ? (number<12) ? "This number is bigger than 5 but smaller than 12" : "This number is bigger than 5 but not smaller than 12" : "This number is not bigger than five";

        System.out.println(str);


        int[] arr = {1,2,3,4,5,6};
        // task to print all odd numbers
        // if number is even, then replace to -1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]%2!=0 ? arr[i] : -1 );
        }


        // String str = "USA";
        // if str contains T = print "A" if doesn`t contain T but str contains U = print "B"; if doesn`t contain U than print "BB"

        String str1 = "Canada";

        String result = str1.contains("T") ? "A" : str1.contains("U") ?  "B" : "BB";
        System.out.println(result);




    }

}
