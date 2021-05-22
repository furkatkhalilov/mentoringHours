package day21;

public class SP8 {

    public static void main(String[] args) {

        /*

   Create a method whose name is threeEvenOrOdd
   It takes an int array as parameter
   It returns a boolean

   It returns true if the argument array contains EITHER three even OR three odd values.
   It returns false otherwise.

   Sample:
   [2, 3, 10, 8] -> true
   [5, 11, 27] -> true
   [1, 2, 3, 4] -> false
   [5, 10] -> false
   [1, 2, 3, 4, 5, 6] -> true

 */

        int[] arr = {2, 3, 10, 8};
        System.out.println(threeEvenOrOdd2(arr));
    }

    public static boolean threeEvenOrOdd (int[] arr) {
        int counterForEven = 0;
        int counterForOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                counterForEven++;
            }else{
                counterForOdd++;
            }
        }
        return counterForEven==3 || counterForOdd==3;
    }

    public static boolean threeEvenOrOdd2 (int[] arr) {
        int counterForEven = 0;
        int counterForOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            counterForEven += arr[i]%2==0 ? 1 : 0;
            counterForOdd += arr[i]%2!=0 ? 1 : 0;
        }
        return counterForEven==3 || counterForOdd==3;
    }
}
