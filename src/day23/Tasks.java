package day23;

import java.util.Arrays;
import java.util.HashSet;

public class Tasks {

    public static void main(String[] args) {
        String[] mathClass = {"Michael", "Debi",  "John", "Steven", "Adam", "Nia", "Gerard", "Lucas", "Leeann", "Griffin", "Rebekah", "Sunshine", "Smith"};

        String[] chemistClass = {"Lara", "Nia", "Griffin", "Rebekah", "Reggie", "Steward", "Gresham", "Sunshine", "Steven", "John", "Rebekah", "Andrew", "Douglas"};


        // Create a void method to initialize the Set. This method should have two parameters: HashSet and String array

        // Create a method, to get all names of students in the school? it should return Hashset, and two string arrays as parameter.
        HashSet<String> allStudentInTheSchool = totalStudents(mathClass, chemistClass);
        System.out.println("allStudentInTheSchool = " + allStudentInTheSchool);

        int totalStudents = allStudentInTheSchool.size();
        System.out.println("totalStudents = " + totalStudents);

        // Create a method to find how many students take ONLY Math classes? it should return Hashset, and two string arrays as parameter.

        HashSet<String> onlyMathStudents = onlyOneClassStudents(mathClass, chemistClass);
        System.out.println("onlyMathStudents = " + onlyMathStudents);

        HashSet<String> onlyChemistStudents = onlyOneClassStudents(chemistClass, mathClass);
        System.out.println("onlyChemistStudents = " + onlyChemistStudents);

        // Create a method to find how many students take both classes. it should return Hashset, and two string arrays as parameter.

        HashSet<String> multiClassStudents = multiClassStudents(mathClass, chemistClass);
        System.out.println("multiClassStudents = " + multiClassStudents);

        // Create a method to find how many students join only 1 class (it can be Math or Chemist)? it should return Hashset, and two string arrays as parameter.

        HashSet<String> singleClassStudents = singleClassStudents(mathClass, chemistClass);
        System.out.println("singleClassStudents = " + singleClassStudents);

        // Create a method to get the list of all students, whose name doesn`t start with "S", and doesn`t contain any "e", and if the name has not more than 5 letters.  it should return Hashset, and two string arrays as parameter.

        HashSet<String> listOfSomeStudents = removeSomeStudents(mathClass, chemistClass);
        System.out.println("listOfSomeStudents = " + listOfSomeStudents);
    }

    public static void initSet(HashSet<String> set, String[] arr){
        set.addAll(Arrays.asList(arr));
    }

    public static HashSet<String> totalStudents(String[] class1, String[] class2){
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        initSet(set1, class1);
        initSet(set2, class2);

        set1.addAll(set2);

        return set1;
    }

    public static HashSet<String> onlyOneClassStudents(String[] class1, String[] class2){
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        initSet(set1, class1);
        initSet(set2, class2);

        set1.removeAll(set2);

        return set1;
    }

    public static HashSet<String> multiClassStudents(String[] class1, String[] class2){
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        initSet(set1, class1);
        initSet(set2, class2);

        set1.retainAll(set2);

        return set1;
    }

    public static HashSet<String> singleClassStudents(String[] class1, String[] class2){
        HashSet<String> totalStudents = totalStudents(class1, class2);
        HashSet<String> multiClassStudents = multiClassStudents(class1, class2);

        totalStudents.removeAll(multiClassStudents);

        return totalStudents;
    }

    public static HashSet<String> removeSomeStudents(String[] class1, String[] class2){
        HashSet<String> totalStudents = totalStudents(class1, class2);

        totalStudents.removeIf(student -> student.startsWith("S") || student.contains("e") || student.length()>5);

        return totalStudents;
    }



}






































