package io.codelex.oop.runners;

public class StopWatch {
    public static void main(String[] args) {

        int firstRunner = 10;
        int secondRunner = 11;
        int thirdRunner = 13;
        int forthRunner = 15;
        int fifthRunner = 16;

        Runner first = Runner.getFitness(firstRunner);
        Runner second = Runner.getFitness(secondRunner);
        Runner third = Runner.getFitness(thirdRunner);
        Runner forth = Runner.getFitness(forthRunner);
        Runner fifth = Runner.getFitness(fifthRunner);

        System.out.println("Fitness levels by place: 1st: " + first);
        System.out.println("Fitness levels by place: 2nd: " + second);
        System.out.println("Fitness levels by place: 3rd: " + third);
        System.out.println("Fitness levels by place: 4th: " + forth);
        System.out.println("Fitness levels by place: 5th: " + fifth);
    }
}
