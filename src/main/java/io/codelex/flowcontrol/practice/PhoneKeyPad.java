package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        String input = in.next().toLowerCase();
//        ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
        switch (input) {
            case "a", "b", "c" -> System.out.print(2);
            case "d", "e", "f" -> System.out.print(3);
            case "g", "h", "i" -> System.out.print(4);
            case "j", "k", "l" -> System.out.print(5);
            case "m", "n", "o" -> System.out.print(6);
            case "p", "q", "r", "s" -> System.out.print(7);
            case "t", "u", "v" -> System.out.print(8);
            case "w", "x", "y", "z" -> System.out.print(9);
            default -> System.out.println("Wrong input!");
        }
    }
}
