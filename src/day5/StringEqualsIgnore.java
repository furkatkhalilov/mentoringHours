package day5;

public class StringEqualsIgnore {

    public static void main(String[] args) {

        String str = "HELLO";
        String str2 = "hello";

        boolean checkIfEquals = str.equalsIgnoreCase(str2);

        System.out.println("checkIfEquals = " + checkIfEquals);

        boolean checkIfEqual2 = str.equals(str2.toUpperCase());
        System.out.println("checkIfEqual2 = " + checkIfEqual2);


    }
}
