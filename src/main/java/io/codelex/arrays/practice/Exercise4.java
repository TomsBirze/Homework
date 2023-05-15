package io.codelex.arrays.practice;

public class Exercise4 {

    //TODO: Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };
        int numberToCheck = 1245;

//        fixme - check if contains number 1245

        boolean containsNumber = false;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numberToCheck) {
                containsNumber = true;
                break;
            }
        }
        if (containsNumber) {
            System.out.println("Contains!" + numberToCheck);
        } else {
            System.out.println("Dose not contain " + numberToCheck);
        }
    }
}

//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] == numberToCheck) {
//                System.out.println(myArray[i] + " Contains! " + numberToCheck);
//            } else {
//                System.out.println(myArray[i] + " Dose not equal " + numberToCheck);
//            }