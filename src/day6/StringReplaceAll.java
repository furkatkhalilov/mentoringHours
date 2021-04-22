package day6;

import java.util.HashMap;
import java.util.Map;

public class StringReplaceAll {

    public static void main(String[] args) {

    String price = "$     100Dol larEWWs";

    price = price.replaceAll("[$a-zA-Z ]","");
        System.out.println("price = " + price);


        String example = " ADFADFADFADlADFADFADFo123213123    12312312v$e ";
        example = example.replaceAll("[0-9A-Z$ ]","");
        System.out.println("example = " + example);

    }
}
