package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise1 {

    //TODO: Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {

        int[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };
        int[] mySortedArray1 = Arrays.stream(myArray1).sorted().toArray();

        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        Arrays.sort(myArray2);

//        fixme
        System.out.print("Original numeric array : ");
        for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i] + " ");
        }
        System.out.println();
        System.out.print("Sorted numeric array : ");
        for (int i = 0; i < mySortedArray1.length; i++) {
            System.out.print(mySortedArray1[i] + " ");
        }
        System.out.println();
        System.out.print("Original string array : ");
        for (int j = 0; j < myArray2.length; j++) {
            System.out.print(myArray2[j] + " ");
        }
        System.out.println();
        System.out.println("Sorted string array : " + Arrays.toString(myArray2));
//
    }
}

