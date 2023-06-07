package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee extends Person {

    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate currentDate = LocalDate.now();
        long years = ChronoUnit.YEARS.between(startedWorking, currentDate);
        return (int) years;
    }

    public void getInfo() {
        System.out.println(firstName + " " + lastName + " " + position + " worked for " + getWorkExperience() + " years.");
    }


}
