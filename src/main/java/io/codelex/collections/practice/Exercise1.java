package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
//        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results

        List<String> array = new ArrayList<>();
        array.add("Audi");
        array.add("BMW");
        array.add("Honda");
        array.add("Mercedes");
        array.add("VolksWagen");
        array.add("Mercedes");
        array.add("Tesla");

        System.out.println(array);


        //todo - replace array with a HashSet and print out the results

        Set<String> arrayHashSet = new HashSet<>();
        arrayHashSet.add("Audi");
        arrayHashSet.add("BMW");
        arrayHashSet.add("Honda");
        arrayHashSet.add("Mercedes");
        arrayHashSet.add("VolksWagen");
        arrayHashSet.add("Mercedes");
        arrayHashSet.add("Tesla");

        System.out.println(arrayHashSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results

        HashMap<String, String> arrayHashMap = new HashMap<>();
        arrayHashMap.put("Audi", "Germany");
        arrayHashMap.put("BMW", "Germany");
        arrayHashMap.put("Honda", "Japan");
        arrayHashMap.put("Mercedes", "Germany");
        arrayHashMap.put("VolksWagen", "Germany");
        arrayHashMap.put("Tesla", "USA");

        System.out.println(arrayHashMap);
    }
}
