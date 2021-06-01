package day25;

import java.util.HashMap;
import java.util.Map;

public class JavaMapComputeMethods {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);
        map.put(6,60);
        map.put(7,70);
        map.put(8,80);
        map.put(9,90);

        System.out.println(map);

//        int integer = map.get(19);    // You will get an error, if such a key doesnt exist
//        System.out.println("integer = " + integer);

        int orDefault = map.getOrDefault(9, 1000);
        System.out.println("orDefault = " + orDefault);

        map.putIfAbsent(8, 100);
        System.out.println("put if absent = " + map);

//        map.compute(6, (key,value) -> value *= 100);

        for(Map.Entry<Integer, Integer> obj : map.entrySet()){
            map.compute(obj.getKey(), (k,v) -> v *= 10);
        }

        System.out.println("after compute method " + map);

        map.computeIfAbsent(11, v -> v = 1100);

        System.out.println("after compute if absent method " + map);

        map.computeIfPresent(1, (key, value) -> value += 500);

        System.out.println("after compute if Present method " + map);
    }
}
