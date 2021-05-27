package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaSetMethods {
    public static void main(String[] args) {
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

        HashSet<String> hashSet2 = new HashSet<>(Set.of("A","B","X","Y","Z"));
        hashSet.removeAll(hashSet2);

        System.out.println(hashSet);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("C","D", "X","Y"));
        hashSet.removeAll(list);

        System.out.println(hashSet);

        hashSet.remove("G");
        System.out.println(hashSet);

//        hashSet.clear();
//        System.out.println(hashSet);

        HashSet<String> hashSet3 = new HashSet<>(Set.of("A","B","X","Y","Z","E","F"));
        hashSet.retainAll(hashSet3);

        System.out.println(hashSet);

        hashSet=hashSet3;
        System.out.println(hashSet);

        hashSet3 = new HashSet<>(Set.of("A","B","X","Y","D","O","P"));
        hashSet.removeAll(hashSet3);

        System.out.println(hashSet);

        hashSet=hashSet3;
        System.out.println(hashSet);

        hashSet.removeIf(s -> s.equals("X") || s.equals("O"));
        System.out.println(hashSet);


        boolean a = hashSet.contains("O");
        System.out.println(a);


        boolean empty = hashSet.isEmpty();
        System.out.println(empty);

        int size = hashSet.size();
        System.out.println(size);

        HashSet<String> hashSet4 = new HashSet<>(hashSet);
        hashSet4.remove("P");
        hashSet4.add("L");
        System.out.println("hashSet4 " + hashSet4);
        System.out.println("hashSet " + hashSet);

        boolean b = hashSet.containsAll(hashSet4);
        System.out.println(b);

        String s = hashSet.toString();
        System.out.println(s);

    }
}
