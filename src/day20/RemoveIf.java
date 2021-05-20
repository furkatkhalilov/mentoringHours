package day20;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {

    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(1);
        mylist.add(2);
        mylist.add(3);

        mylist.add(0,10);

        mylist.add(0,50);
        mylist.add(4,50);

        System.out.println(mylist);

//        mylist.remove(Integer.valueOf(50));



//        for (int i = 0; i < mylist.size(); i++) {
//
//            if(mylist.get(i)==50){
//                mylist.remove(mylist.get(i));
//            }
//
//        }



        mylist.removeIf(n -> n == 50 || n==10 );

                System.out.println(mylist);


        ArrayList<String> strlist = new ArrayList<>(Arrays.asList("techno", "study", "us", "nj", "ny"));

        strlist.removeIf(s -> s.contains("t") || s.startsWith("u") || s.endsWith("y"));
        System.out.println(strlist);

        ArrayList<String> newlist =  new ArrayList<>();

        newlist.addAll(strlist);
        System.out.println(newlist);





    }
}
