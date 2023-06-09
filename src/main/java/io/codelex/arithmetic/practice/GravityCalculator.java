package io.codelex.arithmetic.practice;

public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double fallingTime = 10.0;
        double initialVelocity = 0.0;
        double initialPosition = 0.0;
//        double finalPosition = (0.5 * gravity) + (initialVelocity * fallingTime) + initialPosition;
        double finalPosition = (0.5 * gravity * fallingTime * fallingTime) + (initialVelocity * fallingTime) + initialPosition;
        System.out.printf("The object's position after %.1f seconds is %.1f m.", fallingTime, finalPosition);
    }
}
