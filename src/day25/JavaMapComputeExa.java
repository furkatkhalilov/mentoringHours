package day25;

import java.util.HashMap;
import java.util.Map;

public class JavaMapComputeExa {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(07652, "Paramus");
        map.put(11230, "Brooklyn");

        for(Map.Entry<Integer, String> obj : map.entrySet()){

            map.compute(obj.getKey(), (key, value) -> value = value.concat(" Borough"));
        }

        map.computeIfAbsent(10002, v -> "Manhattan Borough");

        System.out.println(map);
    }
}
