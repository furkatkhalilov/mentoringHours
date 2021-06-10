package day24;

import java.util.*;

public class SaturdayProjectTask2 {

    /*
       Create a method whose name is sort
       It takes a HashSet of Integers as parameter
       It returns an ArrayList of Integers

        The method sorts the given HashSet (in ascending order)
        It changes the sorted HashSet to an ArrayList
        It returns the ArrayList

        NOTE : DO NOT USE COLLECTIONS CLASS WHILE SOLVING THE QUESTION USE FOR LOOP OR DIFFERENT SET TYPES
     */


    public static void main(String[] args) {

        HashSet <Integer>  set = new HashSet<>((Arrays.asList(3,5,2,4,9)));

        ArrayList<Integer> integers = sortList3(set);
        System.out.println(integers);

    }

    public static ArrayList<Integer> sortList3(HashSet<Integer> set){
        ArrayList<Integer> list = new ArrayList<>(set);
        boolean isNotSorted = false;

        while(isNotSorted){
            for (int i = 0; i < list.size()-1; i++) {
                int number1 = list.get(i);
                int number2 = list.get(i + 1);

                if(number1>number2){
                    list.set(i, number2);
                    list.set(i+1, number1);

                    isNotSorted = true;
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> sortedList (HashSet<Integer> set){
        TreeSet<Integer> sortedSet = new TreeSet<>(set);
        ArrayList<Integer> sortedlist = new ArrayList<>(sortedSet);
        return sortedlist;

    }


}
