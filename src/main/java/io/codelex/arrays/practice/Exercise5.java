package io.codelex.arrays.practice;

public class Exercise5 {

    //TODO: Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int indexOfFirstElement = 36;
        int indexOfSecondElement = 29;


//        fixme
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == indexOfFirstElement) {
                System.out.println("The element " + indexOfFirstElement + " is at index " + i);
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == indexOfSecondElement) {
                System.out.println("The element " + indexOfSecondElement + " is at index " + i);
            }
        }
    }
}
