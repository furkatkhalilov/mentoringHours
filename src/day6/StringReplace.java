package day6;

public class StringReplace {

    public static void main(String[] args) {

        int price = 100;
        String price2 = "$100";
        price2 = price2.replace("$","");
        int price3 = Integer.parseInt(price2);

        boolean checkIfPricesAreEqual = (price==price3);
        System.out.println("checkIfPricesAreEqual = " + checkIfPricesAreEqual);

        // Given a String which is 100% and int which is 200; Verify that this two numbers are not equal.

        String percentage = "100%";
        int percentage2 = 200;
        int convertedPercentage = Integer.parseInt(percentage.replace("%",""));

        boolean verifyPercentageAreNotEqual = percentage2 == convertedPercentage;
        System.out.println("verifyPercentageAreNotEqual = " + verifyPercentageAreNotEqual);







    }
}
