package day27;

import java.util.*;


public class Task4 {
    // Create a method, which returns the most repeating word.
    // If repeating word is banned one, you should skip and take the other word.

    // Hint1. convert to lowercase and split.
    // Hint2. Put everything except banned words in the map and calculate how many times it repeats.
    // Hint3. get the maximum value.
    // Hint4. using this value, return the key.

    public static void main(String[] args) {
        String str = "Bob hit a ball, the far far far  hit BALL flew flew flew the the the the the far after it was hit.";
        String [] arr = {"hit", "flew", "the", "ball"};

        String s = mostCommonWord(str, arr);
        System.out.println("s = " + s);

    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(banned));

        String[] arr = paragraph.toLowerCase().replaceAll("[\\p{Punct}]", "").split(" ");

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            if(!set.contains(arr[i]))
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        }
        System.out.println(map);

        int maximum = 0;
        String result = "";
        for(Map.Entry<String, Integer> row : map.entrySet()){
            if(row.getValue()>maximum){
                maximum = row.getValue();
                result = row.getKey();
            }


        }




        return result;
    }
}
