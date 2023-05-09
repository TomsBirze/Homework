package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
//        todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        int powerOf = in.nextInt();

        System.out.print("Input the base number : ");
        int baseNumber = in.nextInt();


        int result = 1;
        for (int i = 1; i < powerOf; i++) {
            result *= baseNumber;
        }
        System.out.println(baseNumber + " raised to the power of " + powerOf + " is " + result);
    }

}


