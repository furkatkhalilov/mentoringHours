package day27;

import java.util.Arrays;
import java.util.HashMap;

public class Task3 {
    // Homework
    // Interview question from Leetcode

    // You are given a String array.
    // Calculate total of each values.
    // if value equals to 0, then do not show it.
    // return String


    // input {"X:-1", "Y:1", "X:-4", "B:3", "X:5", "Y:2", "Y:-1", "B:-4" };
    // output Y:2,B:-1


    public static void main(String[] args) {
        String [] arr = {"X:-1", "Y:1", "X:-4", "B:3", "X:5", "Y:2", "Y:-1", "B:-4" };
        String s = countKeys(arr);

        System.out.println(s);
    }

    public static String countKeys(String[] arr){
        HashMap<String , Integer> map = new HashMap<>();

        String[][] dbarray = new String[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            String[] split = arr[i].split(":");
            dbarray[i] = split;
        }

        for (int i = 0; i < dbarray.length; i++) {
            String key = dbarray[i][0];
            Integer value = Integer.valueOf(dbarray[i][1]);
            map.put(key, map.getOrDefault(key , 0) + value);
        }
        System.out.println(Arrays.deepToString(dbarray));
        System.out.println(map);

        map.values().removeIf(value -> value == 0);

        System.out.println(map);


        return map.toString().replaceAll("[{} ]","").replaceAll("=",":");
    }
}
