package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the 1st word: ");
        String firstWord = in.next();

        System.out.print("Input the 2nd word: ");
        String secondWord = in.next();

        int dotsAmount = 30 - (firstWord.length() + secondWord.length());

        System.out.print(firstWord);
        for (int i = 0; i < dotsAmount; i++) {
            System.out.print(".");
        }
        System.out.print(secondWord);
    }
}
