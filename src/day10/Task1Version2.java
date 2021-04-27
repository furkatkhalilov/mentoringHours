package day10;

import java.util.Scanner;

public class Task1Version2 {
    public static void main(String[] args) {


        // Using scanner class create two products with the prices.
        // ex: s1 = "Bread" s2 = "Price for bread", s3 = "Milk", s4 = "Price for Milk"
        // the output should be total = 1.5 + 2.5 = 4.0

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your product");
        String product1 = scanner.nextLine();

        System.out.println("Please enter product`s price");
        String product1Price = scanner.nextLine(); // $1.50


        System.out.println("Please enter your second product");
        String product2 = scanner. nextLine();

        System.out.println("Please enter product2`s price");
        String product2Price = scanner.nextLine(); // $2.50

        String s = product1Price.replaceAll("[^\\d.]", "");
        String s1 = product2Price.replaceAll("[^\\d.]", "");

        double total = Double.parseDouble(s) + Double.parseDouble(s1);

        System.out.println("Your purchased " + product1 + " $ " + product2);
        System.out.println("Your total is = " + total);
    }
}
