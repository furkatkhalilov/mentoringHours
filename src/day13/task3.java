package day13;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        /*
        create scanner and output should be how many points you will get.
        Speed limit = 25 MPH
        Speeding 1-10 MPH over limit	3 points
        Speeding 11- 20 MPH over limit	4 points
        Speeding 21- 30 MPH over limit	6 points
        Speeding 31-40 MPH over limit	8 points
        Speeding 41+ MPH over limit	11 points
                */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the speed");

        int speed = scanner.nextInt();

        int speedLimit = 25;

        if(speed<=speedLimit){
            System.out.println("Your speed is " + speed + "MPH. You have no points");
        }else if(speed>speedLimit && speed<= (speedLimit+10)){
            System.out.println("Your speed is " + speed + "MPH. You have 3 points");
        }else if((speed>speedLimit+10) && speed<= (speedLimit+20)){
            System.out.println("Your speed is " + speed + "MPH. You have 4 points");
        }else if((speed>speedLimit+20) && speed<= (speedLimit+30)){
            System.out.println("Your speed is " + speed + "MPH. You have 6 points");
        }else if((speed>speedLimit+30) && speed<= (speedLimit+40)){
            System.out.println("Your speed is " + speed + "MPH. You have 8 points");
        }else {
            System.out.println("Your speed is " + speed + "MPH. You have 11 points");
        }

    }
}

