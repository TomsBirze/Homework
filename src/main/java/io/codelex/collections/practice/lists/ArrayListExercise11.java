package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> array = new ArrayList<>();
        //TODO: Add 10 values to list
        array.add("First");
        array.add("Second");
        array.add("Third");
        array.add("Forth");
        array.add("Fifth");
        array.add("Sixth");
        array.add("Seventh");
        array.add("Eight");
        array.add("Ninth");
        array.add("Tenth");
        System.out.println(array);

        //TODO: Add new value at 5th position
        array.set(4, "New Fifth");
        System.out.println(array);

        //TODO: Change value at last position (Calculate last position programmatically)
        array.set(array.size() - 1, "New Tenth");
        System.out.println(array);

        //TODO: Sort your list in alphabetical order
        Collections.sort(array);
        System.out.println(array);

        //TODO: Check if your list contains "Foobar" element
        if (array.contains("Foobar")) {
            System.out.println(array + " contains 'Foobar'!");
        } else {
            System.out.println(array + " didn't find 'Foobar'!");
        }

        //TODO: Print each element of list using loop
        for (String element : array) {
            System.out.println(element);
        }
    }
}
