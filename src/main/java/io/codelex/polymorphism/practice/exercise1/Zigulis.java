package io.codelex.polymorphism.practice.exercise1;

public class Zigulis implements Nitros {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 2;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 50;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrrkkkkk.....");
    }
}
