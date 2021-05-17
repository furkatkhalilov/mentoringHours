package day18;

public class task2 {
    public static void main(String[] args) {

        // create a method with an int parameter as N.
        // print all numbers from 1 to N (N is included)
        // if number is divisible by 2, replace it by "Codility"
        // if number is divisible by 3, replace it by "Test"
        // if number is divisible by 5, replace it by "Coders"
        // if number is divisible by 2 and 3 => CodilityTest
        // if number is divisible by 2 and 5 => CodilityCoders
        // if number is divisible by 3 and 5 => TestCoders
        // if number is divisible by 2 and 3 and 5 => CodilityTestCoders

        int N = 24;
        solution2(N);

    }
    public static void solution(int N){
        for (int i = 1; i <= N; i++) {
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println("CodilityTestCoders");
            }else if(i%2==0 && i%3==0){
                System.out.println("CodilityTest");
            }else if(i%2==0 && i%5==0){
                System.out.println("CodilityCoders");
            }else if(i%3==0 && i%5==0){
                System.out.println("TestCoders");
            }else if(i%2==0){
                System.out.println("Codility");
            }else if(i%3==0){
                System.out.println("Test");
            }else if(i%5==0){
                System.out.println("Coders");
            }else {
                System.out.println(i);
            }
        }
    }

    public static void solution2(int N){
        for (int i = 1; i <= N; i++) {
           String result = "";
           if (i%2==0) {result = result.concat("Codility");}
           if (i%3==0) {result = result.concat("Test");}
           if (i%5==0) {result = result.concat("Coders");}
           if(i%2!=0 && i%3!=0 && i%5!=0){ result = result.concat(String.valueOf(i));}
            System.out.println(result);
        }
    }
}
