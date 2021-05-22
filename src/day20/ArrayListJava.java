package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListJava {

    public static void main(String[] args) {

        // difference btw Array and ArrayList

        // 1. Array has a fixed size, ArrayList is dynamic
        // 2. Array works with primitive data types, Arraylist works with the objects.

        // Collection class has three different subclasses. List, Set, Map


        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(1);
        mylist.add(2);
        mylist.add(3);

        mylist.add(0,10);

        mylist.add(4,50);

        System.out.println(mylist);


//        int object = mylist.get(10);
//        System.out.println(object);

        ArrayList<String> strlist = new ArrayList<>(Arrays.asList("techno", "study", "us", "nj", "ny"));

        strlist.remove("techno");

        System.out.println(strlist);



    }
}
