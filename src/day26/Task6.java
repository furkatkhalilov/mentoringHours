package day26;

import java.util.HashMap;

public class Task6 {
    public static void main(String[] args) {

        // Task6
// Create a String array as follow: "Apple", "Banana", "Apple", "Banana", "Apricot", "Orange","Apple", "Banana", "Apricot", "Orange","Apple", "Banana", "Apricot", "Grapes"
// Create a Method to calculate how many times each fruit has been repeated.
        String[] fruits = {"Apple", "Banana", "Apple", "Banana", "Apricot", "Orange","Apple", "Banana", "Apricot", "Orange","Apple", "Banana", "Apricot", "Grapes"};

        HashMap<String, Integer> countFruits = countFruits(fruits);

        System.out.println(countFruits);

        HashMap<String, Integer> countFruits2 = countFruits2(fruits);

        System.out.println("countFruits2 = " + countFruits2);

        HashMap<String, Integer> countFruits3 = countFruits3(fruits);
        System.out.println("countFruits3 = " + countFruits3);

        countFruits3.forEach((fruit, quantity) -> System.out.println("key : " + fruit + " =  value  :" + quantity));

        countFruits3.forEach((k, v) -> countFruits3.compute(k, (key, value) -> value +=1000));
        System.out.println("countFruits3 = " + countFruits3);




    }

    public static HashMap<String, Integer> countFruits (String[] arr){
        HashMap<String, Integer> map =  new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        return map;
    }

    public static HashMap<String, Integer> countFruits2 (String[] arr){
        HashMap<String, Integer> map =  new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.computeIfPresent(arr[i], (k,v) -> v += 1 );
            map.computeIfAbsent(arr[i], value -> 1);

        }
        return map;
    }

    public static HashMap<String, Integer> countFruits3 (String[] arr){
        HashMap<String, Integer> map =  new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        return map;
    }
}
