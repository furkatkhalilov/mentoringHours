package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaSet {

    public static void main(String[] args) {
        // What is the difference between Set and List
        // What are the different type of Sets? And what is the main difference between them.

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("G");
        hashSet.add("H");
        System.out.println(hashSet);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        HashSet<String> hashSet2 = new HashSet<>(list);
//        hashSet2.addAll(list);
        System.out.println(hashSet2);

        HashSet<String> hashSet3 = new HashSet<>(Set.of("1","2","3","4"));
        System.out.println(hashSet3);

        // creating your own method

        String[] arr = {"x","y","z"};
        HashSet<String> hashSet4 = fillSet(arr);
        System.out.println(hashSet4);

    }

    public static HashSet<String> fillSet(String[] arr){
        HashSet<String> set = new HashSet<>();
        for(String str : arr){
            set.add(str);
        }
        return set;
    }
}
