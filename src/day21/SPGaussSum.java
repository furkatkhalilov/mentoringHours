package day21;

public class SPGaussSum {
    /*
   Create a method whose name is gaussSumOf
       Information:
          Gauss sum of a number is the sum of the all numbers from 1 to that number.
          For example:
          Gauss sum of 7 is 1+2+3+4+5+6+7 = 28
   As parameters the method takes a positive int
   The method returns an int
   The method calculates and returns the Gauss sum of the argument number.
 */

/*
    Create a method whose name is sumOfSquaresOfGaussSums
    As parameters it takes two ints
    The method returns an int
    The method calculates and returns the sum of the squares of the Gauss sum of the given arguments.

    Sample:
    first argument: 5 -> Gauss sum of 5 = 15 -> square of 15 = 225
    second argument: 10 -> -> Gauss sum of 10 = 55 -> square of 15 = 3025
    sum of the squares -> 225 + 3025 = 3250
    if the method gets 5 and 10 then it returns 3250

    HINT: Use the first method above to calculate the Gauss sums of the numbers.
 */
    public static void main(String[] args) {

    int n1 = 5;
    int n2 = 10;
        System.out.println(sumOfSquaresOfGaussSums(n1, n2));

    }

    public static int gaussSumOf (int number) {
        int total = 0;

        for (int i = 1; i <=  number; i++) {
            total += i;
        }

        return total;
    }

    public static int sumOfSquaresOfGaussSums (int n1, int n2){
        return (int)(Math.pow(gaussSumOf(1),2) + Math.pow(gaussSumOf(n2), 2));
    }
}
