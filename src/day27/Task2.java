package day27;

public class Task2 {
    // Bakkt interview question

    // Create a method, which will accept String as a parameter.
    // Return true or false, if the string is palindrome.

    public static void main(String[] args) {
        String str = "ABBA"; // true
        String str2 = "ABBC"; // false

        boolean palindrome1 = isPalindrome(str);
        System.out.println("palindrome1 = " + palindrome1);

        boolean palindrome2 = isPalindrome(str2);
        System.out.println("palindrome2 = " + palindrome2);


    }
    public static boolean isPalindrome(String str) {

        for(int i = 0, j = str.length()-1; i < j ; i++, j-- ){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }

        return true;
    }
}
