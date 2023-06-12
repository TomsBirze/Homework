package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        Random randomInt = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomInt.nextInt(100) + 1;
        }
        int[] myArrayCopy = Arrays.copyOf(myArray, myArray.length);
        myArray[9] = -7;
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArrayCopy));
    }
}
