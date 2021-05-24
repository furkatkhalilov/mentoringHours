package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("I");
        list.add("love");
        list.add("to");
        list.add("study");
        list.add("in");
        list.add("TechnoStudy");




        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str.contains("T") ? str + " ==> This String contains T " : str + " ==> This String doesnt contain T");
        }


    }
}
