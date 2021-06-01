package day25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaMaps {
    public static void main(String[] args) {
        // what type of maps do we have?
        // what is the difference between them?
        // What is the difference between map and set?

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 10);
        map.put(2,20);
        map.put(3,30);

        System.out.println(map);

        map.replace(1, 1000);

        System.out.println(map);

        int integer = map.get(1); // in get method you have to specify the key. return will be the value of that key

        System.out.println(integer);

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        for(Map.Entry<Integer, Integer> row : map.entrySet()){
            System.out.println("key = " + row.getKey() + " : " + " value = " + row.getValue() );
        }

        map.remove(1);

        System.out.println("remove 1 " + map);

        boolean b = map.containsValue(1000);
        System.out.println("b = " + b);

        boolean b1 = map.containsKey(2);
        System.out.println("b1 = " + b1);



    }
}
