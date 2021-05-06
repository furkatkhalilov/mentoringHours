package day15;

public class task3 {
    public static void main(String[] args) {

        // Using while loop find how many 'a' are in the string.
        // Example: I love learning Java in TechnoStudy. Answer should be 3.

        countAs("I love learning Java in TechnoStudy.");
    }

    public static void countAs(String s){
        int index = 0;
        int result = 0;
        while(index<s.length()){
            if(s.charAt(index)=='a'){
                result += 1;
            }
            index++;
        }

        System.out.println(result);
    }
}
