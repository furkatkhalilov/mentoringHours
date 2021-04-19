package day5;

public class StringsStartsWith {

    static String str;

    public static void main(String[] args) {

        System.out.println("Default value of str = " + str);

        String string1 = "Hello World";

        // StartsWith
        boolean startsWith = string1.startsWith("Hello");
        System.out.println("startsWith = " + startsWith);

        boolean startsWith1 = string1.startsWith("H");
        System.out.println("startsWith = " + startsWith);

        boolean startsWith2 = string1.startsWith("W");
        System.out.println("startsWith2 = " + startsWith2);

        boolean startsWith3 = string1.startsWith("W", 6);
        System.out.println("startsWith3 = " + startsWith3);

        // Example


        String name = "Michael Jackson";
        String stringtoCheck = "Jack";

        boolean b = name.startsWith(stringtoCheck,8); // The offset is the parameter if we want to start from a specific index;
        System.out.println("b = " + b);





    }
}
