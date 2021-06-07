package day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        // create a method to calculate how many times the integer repeats

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,3,5,5,5,4,2,2,2,3,3,3,1,1,1,2,6,5,8,8,9,7,10));

        // {key = number, value = quantity}

        HashMap<Integer, Integer> integerIntegerHashMap = countQuantity2(list);
        System.out.println("integerIntegerHashMap = " + integerIntegerHashMap);




    }

    public static HashMap<Integer, Integer> countQuantity (ArrayList<Integer> list){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.computeIfPresent(list.get(i), (k,v) -> v+=1);
            map.computeIfAbsent(list.get(i), v -> v =1);
        }

        return map;
    }

    public static HashMap<Integer, Integer> countQuantity2 (ArrayList<Integer> list){

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) +1);
        }

        return map;
    }

}
