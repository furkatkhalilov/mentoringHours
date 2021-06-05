package day26;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        HashMap<Integer, String> cities = new HashMap<>();
        cities.put(501, "Holtsville"); // Holtsville City
        cities.put(6390, "Fishers Island"); // Fishers Island City
        cities.put(10001, "New York");
        cities.put(10305, "Staten Island");
        cities.put(10451, "Bronx");
        cities.put(10501, "Amawalk");
        cities.put(10502, "Ardsley");
        cities.put(10504, "Armonk");
        cities.put(10505, "Baldwin Place");
        cities.put(10506, "Bedford");

        for (Map.Entry<Integer, String> city : cities.entrySet()) {
            System.out.println("Postcode : " + city.getKey() + " City : " + city.getValue());
        }

        // Task2

        ArrayList<String> listToDelete = new ArrayList<>(Arrays.asList( "New York", "Staten Island", "Bronx"));

        int [] keysToDelete = new int[3];
        int index = 0;

        for (Map.Entry<Integer, String> city : cities.entrySet()) {
            if(listToDelete.contains(city.getValue())){
                keysToDelete[index++] = city.getKey();
            }
        }

        for (int i = 0; i < keysToDelete.length; i++) {
            cities.remove(keysToDelete[i]);
        }

        System.out.println("cities = " + cities);

        // Task 3

        for (Map.Entry<Integer, String> city : cities.entrySet()) {
            // cities.replace(city.getKey(), city.getValue().concat(" City")); // First Way
           cities.compute(city.getKey(), (key, value) -> value.concat(" City")); // Second Way
        }

        System.out.println(cities);

    }


}   // TASK 1
//  Create a HashMap to handle the PostCode as key and Name of City as value
//  initialize map with following data.

//  501,	Holtsville
//  6390,	Fishers Island
//  10001,	New York
//  10305,	Staten Island
//  10451,	Bronx
//  10501,	Amawalk
//  10502,	Ardsley
//  10504,	Armonk
//  10505,	Baldwin Place
//  10506,	Bedford
//  print all keys and values one by one. Example: Postcode: 501, City: Holtsville

//TASK2
// remove the data where the value is New York, Staten Island, Bronx

// TASK 3
// Update all Values by adding " City"

// Task 4
// Add more datas as follow:
//int[] key = {14894,10506,14893,10451};
//String[] values = {"Wellsburg City", "Bedford Hills City", "Wayne City", "Bronx City"} ;

//14894	Wellsburg City
//10506	Bedford Hills City
//14893	Wayne City
//10451	Bronx City
//Note: if the zipcode exists, dont update it, if it doesnt exist, then add

// Task5
// print the values for the postcodes as follow:
// 501, 1001, 10305, 11230, 07652. If the postcode doesnot exist, then print "Postcode you entered is not in the list"


// Task6
// Create a String array as follow: "Apple", "Banana", "Apple", "Banana", "Apricot", "Orange","Apple", "Banana", "Apricot", "Orange","Apple", "Banana", "Apricot", "Grapes"
// Create a Method to calculate how many times each fruit has been repeated.











