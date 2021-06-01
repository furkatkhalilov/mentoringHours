package day24;

public class SaturdayProjectTask1 {
    /*
       Create a method whose name is returnNum
       It takes an int as parameter
       It returns an int

       The method reverses the parameter int (that is, it re-forms an int by reversing the order of its digits)
       It returns the reversed int

       Example:
       The parameter int  = 1234
       The method returns 4321
    */

    /*
    Create another method whose name is palindromeNum
    It takes an int as parameter
    It returns an int

    Palindrome means a word or number reads the same backward as forward like "mom" , "refer" , "131" , "1221"

    Find the sum of parameter int and its reverse.
    Check if the sum is a palindrome number or not.
    If the sum is not a palindrome number, find the reverse of the sum.
    And add the sum and the reverse of the sum to find the new total.
    Check if the new total is a palindrome or not.
    Repeat the same steps until you reach a palindrome number in your result.
    After you reached the palindrome number, find the number of repeats(loops) in order to hit a palindrome number.
    The method returns the number of loops

     Example:
         int parameter = 349  -->
          349  + 943 = 1292    Note : since 1292 is not palindrome do the same step for this  // first loop
          1292 + 2921 = 4213   Note : 4213 is not palindrome do the same step for this // second loop
          4213 + 3124 = 7337   Note : 7337 is a palindrome number  // third loop
     The method returns 3
     */
    public static void main(String[] args) {

        int number = 1234;
        int reverseNumber = reverseInt(number);
        System.out.println("reverseNumber = " + reverseNumber);

        int number2 = 349;
        int polindrome = isPolindrome(number2);
        System.out.println("polindrome = " + polindrome);

    }

    public static int reverseInt(int num){

        int result = 0;

        while(num>0){

            result = result*10 + num%10;
            num = num/10;

        }

        return result;
    }

    public static int isPolindrome(int number){

        int count = 0;
        boolean isPolindrome = true;

        while(isPolindrome){

            number = number + reverseInt(number);

            isPolindrome = number != reverseInt(number);

            count++;

        }

        return count;
    }
}
